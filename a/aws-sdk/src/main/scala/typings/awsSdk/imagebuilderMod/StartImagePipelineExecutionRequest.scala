package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImagePipelineExecutionRequest extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image pipeline that you want to manually invoke. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
}

object StartImagePipelineExecutionRequest {
  @scala.inline
  def apply(clientToken: ClientToken, imagePipelineArn: ImagePipelineArn): StartImagePipelineExecutionRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartImagePipelineExecutionRequest]
  }
}

