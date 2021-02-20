package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteResourcePolicyInput extends StObject {
  
  /**
    *  The ARN of the resource that is associated with the resource policy. 
    */
  var resourceArn: NonEmptyString = js.native
}
object DeleteResourcePolicyInput {
  
  @scala.inline
  def apply(resourceArn: NonEmptyString): DeleteResourcePolicyInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyInput]
  }
  
  @scala.inline
  implicit class DeleteResourcePolicyInputMutableBuilder[Self <: DeleteResourcePolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: NonEmptyString): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
