package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImagePipelineRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that you want to retrieve. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
}

object GetImagePipelineRequest {
  @scala.inline
  def apply(imagePipelineArn: ImagePipelineArn): GetImagePipelineRequest = {
    val __obj = js.Dynamic.literal(imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImagePipelineRequest]
  }
  @scala.inline
  implicit class GetImagePipelineRequestOps[Self <: GetImagePipelineRequest] (val x: Self) extends AnyVal {
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
    def setImagePipelineArn(value: ImagePipelineArn): Self = this.set("imagePipelineArn", value.asInstanceOf[js.Any])
  }
  
}

