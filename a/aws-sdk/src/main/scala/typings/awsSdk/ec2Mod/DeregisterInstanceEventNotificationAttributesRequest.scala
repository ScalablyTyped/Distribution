package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterInstanceEventNotificationAttributesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the tag keys to deregister.
    */
  var InstanceTagAttribute: js.UndefOr[DeregisterInstanceTagAttributeRequest] = js.undefined
}
object DeregisterInstanceEventNotificationAttributesRequest {
  
  @scala.inline
  def apply(): DeregisterInstanceEventNotificationAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterInstanceEventNotificationAttributesRequest]
  }
  
  @scala.inline
  implicit class DeregisterInstanceEventNotificationAttributesRequestMutableBuilder[Self <: DeregisterInstanceEventNotificationAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceTagAttribute(value: DeregisterInstanceTagAttributeRequest): Self = StObject.set(x, "InstanceTagAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTagAttributeUndefined: Self = StObject.set(x, "InstanceTagAttribute", js.undefined)
  }
}
