package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImagePolicyResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image that this policy was applied to. 
    */
  var imageArn: js.UndefOr[ImageBuildVersionArn] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object PutImagePolicyResponse {
  @scala.inline
  def apply(imageArn: ImageBuildVersionArn = null, requestId: NonEmptyString = null): PutImagePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (imageArn != null) __obj.updateDynamic("imageArn")(imageArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImagePolicyResponse]
  }
}

