package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutComponentPolicyRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the component that this policy should be applied to. 
    */
  var componentArn: ComponentBuildVersionArn = js.native
  
  /**
    * The policy to apply. 
    */
  var policy: ResourcePolicyDocument = js.native
}
object PutComponentPolicyRequest {
  
  @scala.inline
  def apply(componentArn: ComponentBuildVersionArn, policy: ResourcePolicyDocument): PutComponentPolicyRequest = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutComponentPolicyRequest]
  }
  
  @scala.inline
  implicit class PutComponentPolicyRequestOps[Self <: PutComponentPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setComponentArn(value: ComponentBuildVersionArn): Self = this.set("componentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: ResourcePolicyDocument): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
}
