package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutComponentPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component that this policy should be applied to. 
    */
  var componentArn: ComponentBuildVersionArn
  
  /**
    * The policy to apply. 
    */
  var policy: ResourcePolicyDocument
}
object PutComponentPolicyRequest {
  
  @scala.inline
  def apply(componentArn: ComponentBuildVersionArn, policy: ResourcePolicyDocument): PutComponentPolicyRequest = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutComponentPolicyRequest]
  }
  
  @scala.inline
  implicit class PutComponentPolicyRequestMutableBuilder[Self <: PutComponentPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: ResourcePolicyDocument): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
