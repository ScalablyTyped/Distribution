package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpcEndpointConnectionNotificationRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * One or more endpoint events for which to receive notifications. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: ValueStringList = js.native
  
  /**
    * The ARN of the SNS topic for the notifications.
    */
  var ConnectionNotificationArn: String = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: js.UndefOr[VpcEndpointServiceId] = js.native
  
  /**
    * The ID of the endpoint.
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.ec2Mod.VpcEndpointId] = js.native
}
object CreateVpcEndpointConnectionNotificationRequest {
  
  @scala.inline
  def apply(ConnectionEvents: ValueStringList, ConnectionNotificationArn: String): CreateVpcEndpointConnectionNotificationRequest = {
    val __obj = js.Dynamic.literal(ConnectionEvents = ConnectionEvents.asInstanceOf[js.Any], ConnectionNotificationArn = ConnectionNotificationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointConnectionNotificationRequest]
  }
  
  @scala.inline
  implicit class CreateVpcEndpointConnectionNotificationRequestMutableBuilder[Self <: CreateVpcEndpointConnectionNotificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setConnectionEvents(value: ValueStringList): Self = StObject.set(x, "ConnectionEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionEventsVarargs(value: String*): Self = StObject.set(x, "ConnectionEvents", js.Array(value :_*))
    
    @scala.inline
    def setConnectionNotificationArn(value: String): Self = StObject.set(x, "ConnectionNotificationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setServiceId(value: VpcEndpointServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "ServiceId", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
  }
}
