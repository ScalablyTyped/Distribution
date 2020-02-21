package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImagePolicyRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image whose policy you want to retrieve. 
    */
  var imageArn: ImageBuildVersionArn = js.native
}

object GetImagePolicyRequest {
  @scala.inline
  def apply(imageArn: ImageBuildVersionArn): GetImagePolicyRequest = {
    val __obj = js.Dynamic.literal(imageArn = imageArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetImagePolicyRequest]
  }
}

