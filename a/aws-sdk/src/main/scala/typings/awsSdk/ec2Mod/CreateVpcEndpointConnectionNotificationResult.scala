package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcEndpointConnectionNotificationResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the notification.
    */
  var ConnectionNotification: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionNotification] = js.undefined
}
object CreateVpcEndpointConnectionNotificationResult {
  
  @scala.inline
  def apply(): CreateVpcEndpointConnectionNotificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointConnectionNotificationResult]
  }
  
  @scala.inline
  implicit class CreateVpcEndpointConnectionNotificationResultMutableBuilder[Self <: CreateVpcEndpointConnectionNotificationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setConnectionNotification(value: ConnectionNotification): Self = StObject.set(x, "ConnectionNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNotificationUndefined: Self = StObject.set(x, "ConnectionNotification", js.undefined)
  }
}
