package typings.chrome.chrome.declarativeContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageStateMatcherProperties extends js.Object {
  /** Optional. Matches if all of the CSS selectors in the array match displayed elements in a frame with the same origin as the page's main frame. All selectors in this array must be compound selectors to speed up matching. Note that listing hundreds of CSS selectors or CSS selectors that match hundreds of times per page can still slow down web sites.  */
  var css: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional.
    * Since Chrome 45. Warning: this is the current Beta channel. More information available on the API documentation pages.
    * Matches if the bookmarked state of the page is equal to the specified value. Requres the bookmarks permission.
    */
  var isBookmarked: js.UndefOr[Boolean] = js.undefined
  /** Optional. Filters URLs for various criteria. See event filtering. All criteria are case sensitive.  */
  var pageUrl: js.UndefOr[PageStateUrlDetails] = js.undefined
}

object PageStateMatcherProperties {
  @scala.inline
  def apply(
    css: js.Array[String] = null,
    isBookmarked: js.UndefOr[Boolean] = js.undefined,
    pageUrl: PageStateUrlDetails = null
  ): PageStateMatcherProperties = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(isBookmarked)) __obj.updateDynamic("isBookmarked")(isBookmarked.get.asInstanceOf[js.Any])
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(pageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageStateMatcherProperties]
  }
}

