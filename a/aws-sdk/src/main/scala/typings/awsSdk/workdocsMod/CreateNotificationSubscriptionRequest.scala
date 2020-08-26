package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNotificationSubscriptionRequest extends js.Object {
  /**
    * The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins with https.
    */
  var Endpoint: SubscriptionEndPointType = js.native
  /**
    * The ID of the organization.
    */
  var OrganizationId: IdType = js.native
  /**
    * The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
    */
  var Protocol: SubscriptionProtocolType = js.native
  /**
    * The notification type.
    */
  var SubscriptionType: typings.awsSdk.workdocsMod.SubscriptionType = js.native
}

object CreateNotificationSubscriptionRequest {
  @scala.inline
  def apply(
    Endpoint: SubscriptionEndPointType,
    OrganizationId: IdType,
    Protocol: SubscriptionProtocolType,
    SubscriptionType: SubscriptionType
  ): CreateNotificationSubscriptionRequest = {
    val __obj = js.Dynamic.literal(Endpoint = Endpoint.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationSubscriptionRequest]
  }
  @scala.inline
  implicit class CreateNotificationSubscriptionRequestOps[Self <: CreateNotificationSubscriptionRequest] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: SubscriptionEndPointType): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: IdType): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: SubscriptionProtocolType): Self = this.set("Protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionType(value: SubscriptionType): Self = this.set("SubscriptionType", value.asInstanceOf[js.Any])
  }
  
}

