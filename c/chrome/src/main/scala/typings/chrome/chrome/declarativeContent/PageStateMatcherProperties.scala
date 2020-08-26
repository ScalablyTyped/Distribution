package typings.chrome.chrome.declarativeContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageStateMatcherProperties extends js.Object {
  /** Optional. Matches if all of the CSS selectors in the array match displayed elements in a frame with the same origin as the page's main frame. All selectors in this array must be compound selectors to speed up matching. Note that listing hundreds of CSS selectors or CSS selectors that match hundreds of times per page can still slow down web sites.  */
  var css: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.
    * Since Chrome 45. Warning: this is the current Beta channel. More information available on the API documentation pages.
    * Matches if the bookmarked state of the page is equal to the specified value. Requres the bookmarks permission.
    */
  var isBookmarked: js.UndefOr[Boolean] = js.native
  /** Optional. Filters URLs for various criteria. See event filtering. All criteria are case sensitive.  */
  var pageUrl: js.UndefOr[PageStateUrlDetails] = js.native
}

object PageStateMatcherProperties {
  @scala.inline
  def apply(): PageStateMatcherProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageStateMatcherProperties]
  }
  @scala.inline
  implicit class PageStateMatcherPropertiesOps[Self <: PageStateMatcherProperties] (val x: Self) extends AnyVal {
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
    def setCssVarargs(value: String*): Self = this.set("css", js.Array(value :_*))
    @scala.inline
    def setCss(value: js.Array[String]): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setIsBookmarked(value: Boolean): Self = this.set("isBookmarked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBookmarked: Self = this.set("isBookmarked", js.undefined)
    @scala.inline
    def setPageUrl(value: PageStateUrlDetails): Self = this.set("pageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageUrl: Self = this.set("pageUrl", js.undefined)
  }
  
}

