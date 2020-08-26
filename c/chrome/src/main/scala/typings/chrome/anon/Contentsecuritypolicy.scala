package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contentsecuritypolicy extends js.Object {
  var content_security_policy: js.UndefOr[String] = js.native
  var pages: js.Array[String] = js.native
}

object Contentsecuritypolicy {
  @scala.inline
  def apply(pages: js.Array[String]): Contentsecuritypolicy = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contentsecuritypolicy]
  }
  @scala.inline
  implicit class ContentsecuritypolicyOps[Self <: Contentsecuritypolicy] (val x: Self) extends AnyVal {
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
    def setPagesVarargs(value: String*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[String]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent_security_policy(value: String): Self = this.set("content_security_policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent_security_policy: Self = this.set("content_security_policy", js.undefined)
  }
  
}

