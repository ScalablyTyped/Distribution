package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAttributesRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    *  The type of attribute or attributes to remove. Valid values are: endpoint-custom-attributes - Custom attributes that describe endpoints, such as the date when an associated user opted in or out of receiving communications from you through a specific type of channel. endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints, such as the number of app sessions or the number of items left in a cart. endpoint-user-attributes - Custom attributes that describe users, such as first name, last name, and age.
    */
  var AttributeType: string = js.native
  var UpdateAttributesRequest: typings.awsSdk.pinpointMod.UpdateAttributesRequest = js.native
}

object RemoveAttributesRequest {
  @scala.inline
  def apply(ApplicationId: string, AttributeType: string, UpdateAttributesRequest: UpdateAttributesRequest): RemoveAttributesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any], UpdateAttributesRequest = UpdateAttributesRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveAttributesRequest]
  }
}

