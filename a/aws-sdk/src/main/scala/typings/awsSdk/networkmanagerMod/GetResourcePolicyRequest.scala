package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePolicyRequest extends StObject {
  
  /**
    * The ARN of the resource.
    */
  var ResourceArn: typings.awsSdk.networkmanagerMod.ResourceArn
}
object GetResourcePolicyRequest {
  
  inline def apply(ResourceArn: ResourceArn): GetResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyRequest]
  }
  
  extension [Self <: GetResourcePolicyRequest](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
