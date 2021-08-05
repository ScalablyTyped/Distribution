package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule group or firewall policy whose resource policy you want to delete. 
    */
  var ResourceArn: typings.awsSdk.networkfirewallMod.ResourceArn
}
object DeleteResourcePolicyRequest {
  
  inline def apply(ResourceArn: ResourceArn): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  extension [Self <: DeleteResourcePolicyRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
