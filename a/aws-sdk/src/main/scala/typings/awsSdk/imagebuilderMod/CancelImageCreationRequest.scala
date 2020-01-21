package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelImageCreationRequest extends js.Object {
  /**
    * The idempotency token used to make this request idempotent.
    */
  var clientToken: ClientToken = js.native
  /**
    * The Amazon Resource Name (ARN) of the image whose creation you wish to cancel.
    */
  var imageBuildVersionArn: ImageBuildVersionArn = js.native
}

object CancelImageCreationRequest {
  @scala.inline
  def apply(clientToken: ClientToken, imageBuildVersionArn: ImageBuildVersionArn): CancelImageCreationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelImageCreationRequest]
  }
}

