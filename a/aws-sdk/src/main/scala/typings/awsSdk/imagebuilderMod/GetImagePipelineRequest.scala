package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImagePipelineRequest extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the image pipeline that you wish to retrieve. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
}

object GetImagePipelineRequest {
  @scala.inline
  def apply(imagePipelineArn: ImagePipelineArn): GetImagePipelineRequest = {
    val __obj = js.Dynamic.literal(imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetImagePipelineRequest]
  }
}

