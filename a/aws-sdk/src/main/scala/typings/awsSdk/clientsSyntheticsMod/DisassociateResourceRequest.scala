package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResourceRequest extends StObject {
  
  /**
    * Specifies the group. You can specify the group name, the ARN, or the group ID as the GroupIdentifier.
    */
  var GroupIdentifier: typings.awsSdk.clientsSyntheticsMod.GroupIdentifier
  
  /**
    * The ARN of the canary that you want to remove from the specified group.
    */
  var ResourceArn: CanaryArn
}
object DisassociateResourceRequest {
  
  inline def apply(GroupIdentifier: GroupIdentifier, ResourceArn: CanaryArn): DisassociateResourceRequest = {
    val __obj = js.Dynamic.literal(GroupIdentifier = GroupIdentifier.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResourceRequest]
  }
  
  extension [Self <: DisassociateResourceRequest](x: Self) {
    
    inline def setGroupIdentifier(value: GroupIdentifier): Self = StObject.set(x, "GroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: CanaryArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
