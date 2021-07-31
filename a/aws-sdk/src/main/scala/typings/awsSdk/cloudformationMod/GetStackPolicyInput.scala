package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStackPolicyInput extends StObject {
  
  /**
    * The name or unique stack ID that is associated with the stack whose policy you want to get.
    */
  var StackName: typings.awsSdk.cloudformationMod.StackName
}
object GetStackPolicyInput {
  
  @scala.inline
  def apply(StackName: StackName): GetStackPolicyInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackPolicyInput]
  }
  
  @scala.inline
  implicit class GetStackPolicyInputMutableBuilder[Self <: GetStackPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
