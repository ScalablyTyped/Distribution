package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImagePipelineResponse extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image pipeline that was created by this request. 
    */
  var imagePipelineArn: js.UndefOr[ImagePipelineArn] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object CreateImagePipelineResponse {
  @scala.inline
  def apply(): CreateImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImagePipelineResponse]
  }
  @scala.inline
  implicit class CreateImagePipelineResponseOps[Self <: CreateImagePipelineResponse] (val x: Self) extends AnyVal {
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
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setImagePipelineArn(value: ImagePipelineArn): Self = this.set("imagePipelineArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePipelineArn: Self = this.set("imagePipelineArn", js.undefined)
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

