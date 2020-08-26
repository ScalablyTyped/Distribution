package typings.chrome.anon

import typings.chrome.chrome.runtime.SearchProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Homepage extends js.Object {
  var homepage: js.UndefOr[String] = js.native
  var search_provider: js.UndefOr[SearchProvider] = js.native
  var startup_pages: js.UndefOr[js.Array[String]] = js.native
}

object Homepage {
  @scala.inline
  def apply(): Homepage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Homepage]
  }
  @scala.inline
  implicit class HomepageOps[Self <: Homepage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    @scala.inline
    def setSearch_provider(value: SearchProvider): Self = this.set("search_provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch_provider: Self = this.set("search_provider", js.undefined)
    @scala.inline
    def setStartup_pagesVarargs(value: String*): Self = this.set("startup_pages", js.Array(value :_*))
    @scala.inline
    def setStartup_pages(value: js.Array[String]): Self = this.set("startup_pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartup_pages: Self = this.set("startup_pages", js.undefined)
  }
  
}

