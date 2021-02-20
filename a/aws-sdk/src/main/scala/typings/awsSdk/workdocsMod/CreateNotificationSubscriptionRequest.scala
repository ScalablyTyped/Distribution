package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNotificationSubscriptionRequest extends StObject {
  
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
  implicit class CreateNotificationSubscriptionRequestMutableBuilder[Self <: CreateNotificationSubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: SubscriptionEndPointType): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: SubscriptionProtocolType): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionType(value: SubscriptionType): Self = StObject.set(x, "SubscriptionType", value.asInstanceOf[js.Any])
  }
}
