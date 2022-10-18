package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceRequest extends StObject {
  
  /**
    * Specifies the group. You can specify the group name, the ARN, or the group ID as the GroupIdentifier.
    */
  var GroupIdentifier: typings.awsSdk.clientsSyntheticsMod.GroupIdentifier
  
  /**
    * The ARN of the canary that you want to associate with the specified group.
    */
  var ResourceArn: CanaryArn
}
object AssociateResourceRequest {
  
  inline def apply(GroupIdentifier: GroupIdentifier, ResourceArn: CanaryArn): AssociateResourceRequest = {
    val __obj = js.Dynamic.literal(GroupIdentifier = GroupIdentifier.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceRequest]
  }
  
  extension [Self <: AssociateResourceRequest](x: Self) {
    
    inline def setGroupIdentifier(value: GroupIdentifier): Self = StObject.set(x, "GroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: CanaryArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
