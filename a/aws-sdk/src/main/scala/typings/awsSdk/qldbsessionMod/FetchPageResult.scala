package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchPageResult extends js.Object {
  /**
    * Contains details of the fetched page.
    */
  var Page: js.UndefOr[typings.awsSdk.qldbsessionMod.Page] = js.native
}

object FetchPageResult {
  @scala.inline
  def apply(Page: Page = null): FetchPageResult = {
    val __obj = js.Dynamic.literal()
    if (Page != null) __obj.updateDynamic("Page")(Page.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchPageResult]
  }
}

