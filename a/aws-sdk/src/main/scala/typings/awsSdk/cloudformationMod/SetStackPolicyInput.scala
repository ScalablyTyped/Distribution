package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetStackPolicyInput extends js.Object {
  
  /**
    * The name or unique stack ID that you want to associate a policy with.
    */
  var StackName: typings.awsSdk.cloudformationMod.StackName = js.native
  
  /**
    * Structure containing the stack policy body. For more information, go to  Prevent Updates to Stack Resources in the AWS CloudFormation User Guide. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
    */
  var StackPolicyBody: js.UndefOr[typings.awsSdk.cloudformationMod.StackPolicyBody] = js.native
  
  /**
    * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in an S3 bucket in the same Region as the stack. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
    */
  var StackPolicyURL: js.UndefOr[typings.awsSdk.cloudformationMod.StackPolicyURL] = js.native
}
object SetStackPolicyInput {
  
  @scala.inline
  def apply(StackName: StackName): SetStackPolicyInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStackPolicyInput]
  }
  
  @scala.inline
  implicit class SetStackPolicyInputOps[Self <: SetStackPolicyInput] (val x: Self) extends AnyVal {
    
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
    def setStackName(value: StackName): Self = this.set("StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackPolicyBody(value: StackPolicyBody): Self = this.set("StackPolicyBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackPolicyBody: Self = this.set("StackPolicyBody", js.undefined)
    
    @scala.inline
    def setStackPolicyURL(value: StackPolicyURL): Self = this.set("StackPolicyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackPolicyURL: Self = this.set("StackPolicyURL", js.undefined)
  }
}
