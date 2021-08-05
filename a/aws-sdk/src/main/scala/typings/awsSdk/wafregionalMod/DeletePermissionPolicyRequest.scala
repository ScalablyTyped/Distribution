package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePermissionPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the RuleGroup from which you want to delete the policy. The user making the request must be the owner of the RuleGroup.
    */
  var ResourceArn: typings.awsSdk.wafregionalMod.ResourceArn
}
object DeletePermissionPolicyRequest {
  
  inline def apply(ResourceArn: ResourceArn): DeletePermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePermissionPolicyRequest]
  }
  
  extension [Self <: DeletePermissionPolicyRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
