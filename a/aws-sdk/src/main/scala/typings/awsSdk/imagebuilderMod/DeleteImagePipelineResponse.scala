package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImagePipelineResponse extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image pipeline that was deleted. 
    */
  var imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object DeleteImagePipelineResponse {
  @scala.inline
  def apply(imagePipelineArn: ImagePipelineArn = null, requestId: NonEmptyString = null): DeleteImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    if (imagePipelineArn != null) __obj.updateDynamic("imagePipelineArn")(imagePipelineArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImagePipelineResponse]
  }
}

