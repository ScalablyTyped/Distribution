package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImagePipelineResponse extends js.Object {
  /**
    *  The image pipeline object. 
    */
  var imagePipeline: js.UndefOr[ImagePipeline] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object GetImagePipelineResponse {
  @scala.inline
  def apply(imagePipeline: ImagePipeline = null, requestId: NonEmptyString = null): GetImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    if (imagePipeline != null) __obj.updateDynamic("imagePipeline")(imagePipeline.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImagePipelineResponse]
  }
}

