package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePolicyInput extends StObject {
  
  /**
    *  The ARN of the resource that is associated with the resource policy. 
    */
  var resourceArn: NonEmptyString
}
object GetResourcePolicyInput {
  
  @scala.inline
  def apply(resourceArn: NonEmptyString): GetResourcePolicyInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyInput]
  }
  
  @scala.inline
  implicit class GetResourcePolicyInputMutableBuilder[Self <: GetResourcePolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: NonEmptyString): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
