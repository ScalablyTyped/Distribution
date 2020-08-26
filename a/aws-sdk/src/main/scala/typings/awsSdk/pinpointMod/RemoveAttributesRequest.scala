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
  @scala.inline
  implicit class RemoveAttributesRequestOps[Self <: RemoveAttributesRequest] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeType(value: string): Self = this.set("AttributeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateAttributesRequest(value: UpdateAttributesRequest): Self = this.set("UpdateAttributesRequest", value.asInstanceOf[js.Any])
  }
  
}

