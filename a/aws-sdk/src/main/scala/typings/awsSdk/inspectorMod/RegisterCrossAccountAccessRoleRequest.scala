package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterCrossAccountAccessRoleRequest extends StObject {
  
  /**
    * The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments. 
    */
  var roleArn: Arn = js.native
}
object RegisterCrossAccountAccessRoleRequest {
  
  @scala.inline
  def apply(roleArn: Arn): RegisterCrossAccountAccessRoleRequest = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCrossAccountAccessRoleRequest]
  }
  
  @scala.inline
  implicit class RegisterCrossAccountAccessRoleRequestMutableBuilder[Self <: RegisterCrossAccountAccessRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
