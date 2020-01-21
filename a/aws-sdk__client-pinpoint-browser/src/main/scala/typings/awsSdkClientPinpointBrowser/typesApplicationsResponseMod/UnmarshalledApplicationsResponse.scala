package typings.awsSdkClientPinpointBrowser.typesApplicationsResponseMod

import typings.awsSdkClientPinpointBrowser.typesApplicationResponseMod.UnmarshalledApplicationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledApplicationsResponse extends ApplicationsResponse {
  /**
    * List of applications returned in this page.
    */
  @JSName("Item")
  var Item_UnmarshalledApplicationsResponse: js.UndefOr[js.Array[UnmarshalledApplicationResponse]] = js.undefined
}

object UnmarshalledApplicationsResponse {
  @scala.inline
  def apply(Item: js.Array[UnmarshalledApplicationResponse] = null, NextToken: String = null): UnmarshalledApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledApplicationsResponse]
  }
}

