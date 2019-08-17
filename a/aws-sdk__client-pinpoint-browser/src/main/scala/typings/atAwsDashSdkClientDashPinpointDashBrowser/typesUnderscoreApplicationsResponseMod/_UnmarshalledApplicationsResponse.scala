package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationsResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreApplicationResponseMod._UnmarshalledApplicationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledApplicationsResponse extends _ApplicationsResponse {
  /**
    * List of applications returned in this page.
    */
  @JSName("Item")
  var Item__UnmarshalledApplicationsResponse: js.UndefOr[js.Array[_UnmarshalledApplicationResponse]] = js.undefined
}

object _UnmarshalledApplicationsResponse {
  @scala.inline
  def apply(Item: js.Array[_UnmarshalledApplicationResponse] = null, NextToken: String = null): _UnmarshalledApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[_UnmarshalledApplicationsResponse]
  }
}

