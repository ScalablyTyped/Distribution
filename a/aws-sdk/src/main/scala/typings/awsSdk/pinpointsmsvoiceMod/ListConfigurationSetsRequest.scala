package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationSetsRequest extends js.Object {
  /**
    * A token returned from a previous call to the API that indicates the position in the list of results.
    */
  var NextToken: js.UndefOr[_String] = js.native
  /**
    * Used to specify the number of items that should be returned in the response.
    */
  var PageSize: js.UndefOr[_String] = js.native
}

object ListConfigurationSetsRequest {
  @scala.inline
  def apply(NextToken: _String = null, PageSize: _String = null): ListConfigurationSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationSetsRequest]
  }
}

