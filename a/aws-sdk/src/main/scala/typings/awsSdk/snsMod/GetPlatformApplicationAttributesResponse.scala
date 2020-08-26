package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlatformApplicationAttributesResponse extends js.Object {
  /**
    * Attributes include the following:    EventEndpointCreated – Topic ARN to which EndpointCreated event notifications should be sent.    EventEndpointDeleted – Topic ARN to which EndpointDeleted event notifications should be sent.    EventEndpointUpdated – Topic ARN to which EndpointUpdate event notifications should be sent.    EventDeliveryFailure – Topic ARN to which DeliveryFailure event notifications should be sent upon Direct Publish delivery failure (permanent) to one of the application's endpoints.  
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
}

object GetPlatformApplicationAttributesResponse {
  @scala.inline
  def apply(): GetPlatformApplicationAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlatformApplicationAttributesResponse]
  }
  @scala.inline
  implicit class GetPlatformApplicationAttributesResponseOps[Self <: GetPlatformApplicationAttributesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributes(value: MapStringToString): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
  
}

