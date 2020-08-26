package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImagePipelineResponse extends js.Object {
  /**
    * The image pipeline object. 
    */
  var imagePipeline: js.UndefOr[ImagePipeline] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object GetImagePipelineResponse {
  @scala.inline
  def apply(): GetImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImagePipelineResponse]
  }
  @scala.inline
  implicit class GetImagePipelineResponseOps[Self <: GetImagePipelineResponse] (val x: Self) extends AnyVal {
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
    def setImagePipeline(value: ImagePipeline): Self = this.set("imagePipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePipeline: Self = this.set("imagePipeline", js.undefined)
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

