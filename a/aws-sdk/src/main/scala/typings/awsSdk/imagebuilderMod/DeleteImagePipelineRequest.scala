package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImagePipelineRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image pipeline to delete. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
}

object DeleteImagePipelineRequest {
  @scala.inline
  def apply(imagePipelineArn: ImagePipelineArn): DeleteImagePipelineRequest = {
    val __obj = js.Dynamic.literal(imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImagePipelineRequest]
  }
}

