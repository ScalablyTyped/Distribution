package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStackPolicyOutput extends js.Object {
  
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
  implicit class GetStackPolicyOutputOps[Self <: GetStackPolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStackPolicyBody(value: StackPolicyBody): Self = this.set("StackPolicyBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackPolicyBody: Self = this.set("StackPolicyBody", js.undefined)
  }
}
