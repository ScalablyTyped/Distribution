package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutComponentPolicyRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the component that this policy should be applied to. 
    */
  var componentArn: ComponentBuildVersionArn = js.native
  /**
    *  The policy to apply. 
    */
  var policy: NonEmptyString = js.native
}

object PutComponentPolicyRequest {
  @scala.inline
  def apply(componentArn: ComponentBuildVersionArn, policy: NonEmptyString): PutComponentPolicyRequest = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutComponentPolicyRequest]
  }
}

