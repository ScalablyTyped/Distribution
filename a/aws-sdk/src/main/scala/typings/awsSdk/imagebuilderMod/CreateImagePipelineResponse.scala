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
  def apply(
    clientToken: ClientToken = null,
    imagePipelineArn: ImagePipelineArn = null,
    requestId: NonEmptyString = null
  ): CreateImagePipelineResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (imagePipelineArn != null) __obj.updateDynamic("imagePipelineArn")(imagePipelineArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImagePipelineResponse]
  }
}

