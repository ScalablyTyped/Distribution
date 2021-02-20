package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStackPolicyOutput extends StObject {
  
  /**
    * Structure containing the stack policy body. (For more information, go to  Prevent Updates to Stack Resources in the AWS CloudFormation User Guide.)
    */
  var StackPolicyBody: js.UndefOr[typings.awsSdk.cloudformationMod.StackPolicyBody] = js.native
}
object GetStackPolicyOutput {
  
  @scala.inline
  def apply(): GetStackPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStackPolicyOutput]
  }
  
  @scala.inline
  implicit class GetStackPolicyOutputMutableBuilder[Self <: GetStackPolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackPolicyBody(value: StackPolicyBody): Self = StObject.set(x, "StackPolicyBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackPolicyBodyUndefined: Self = StObject.set(x, "StackPolicyBody", js.undefined)
  }
}
