package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  /**
    * The token of the next page.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * A structure that contains values in multiple encoding formats.
    */
  var Values: js.UndefOr[ValueHolders] = js.native
}

object Page {
  @scala.inline
  def apply(NextPageToken: PageToken = null, Values: ValueHolders = null): Page = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

