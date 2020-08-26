package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImagePolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image that this policy should be applied to. 
    */
  var imageArn: ImageBuildVersionArn = js.native
  /**
    * The policy to apply. 
    */
  var policy: ResourcePolicyDocument = js.native
}

object PutImagePolicyRequest {
  @scala.inline
  def apply(imageArn: ImageBuildVersionArn, policy: ResourcePolicyDocument): PutImagePolicyRequest = {
    val __obj = js.Dynamic.literal(imageArn = imageArn.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImagePolicyRequest]
  }
  @scala.inline
  implicit class PutImagePolicyRequestOps[Self <: PutImagePolicyRequest] (val x: Self) extends AnyVal {
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
    def setImageArn(value: ImageBuildVersionArn): Self = this.set("imageArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: ResourcePolicyDocument): Self = this.set("policy", value.asInstanceOf[js.Any])
  }
  
}

