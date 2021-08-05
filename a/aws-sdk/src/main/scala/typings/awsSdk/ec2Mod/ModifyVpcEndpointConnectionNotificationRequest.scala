package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcEndpointConnectionNotificationRequest extends StObject {
  
  /**
    * One or more events for the endpoint. Valid values are Accept, Connect, Delete, and Reject.
    */
  var ConnectionEvents: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The ARN for the SNS topic for the notification.
    */
  var ConnectionNotificationArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the notification.
    */
  var ConnectionNotificationId: typings.awsSdk.ec2Mod.ConnectionNotificationId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object ModifyVpcEndpointConnectionNotificationRequest {
  
  inline def apply(ConnectionNotificationId: ConnectionNotificationId): ModifyVpcEndpointConnectionNotificationRequest = {
    val __obj = js.Dynamic.literal(ConnectionNotificationId = ConnectionNotificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointConnectionNotificationRequest]
  }
  
  extension [Self <: ModifyVpcEndpointConnectionNotificationRequest](x: Self) {
    
    inline def setConnectionEvents(value: ValueStringList): Self = StObject.set(x, "ConnectionEvents", value.asInstanceOf[js.Any])
    
    inline def setConnectionEventsUndefined: Self = StObject.set(x, "ConnectionEvents", js.undefined)
    
    inline def setConnectionEventsVarargs(value: String*): Self = StObject.set(x, "ConnectionEvents", js.Array(value :_*))
    
    inline def setConnectionNotificationArn(value: String): Self = StObject.set(x, "ConnectionNotificationArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionNotificationArnUndefined: Self = StObject.set(x, "ConnectionNotificationArn", js.undefined)
    
    inline def setConnectionNotificationId(value: ConnectionNotificationId): Self = StObject.set(x, "ConnectionNotificationId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
