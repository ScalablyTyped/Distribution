package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCrossAccountAccessRoleRequest extends StObject {
  
  /**
    * The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments. 
    */
  var roleArn: Arn
}
object RegisterCrossAccountAccessRoleRequest {
  
  inline def apply(roleArn: Arn): RegisterCrossAccountAccessRoleRequest = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCrossAccountAccessRoleRequest]
  }
  
  extension [Self <: RegisterCrossAccountAccessRoleRequest](x: Self) {
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
