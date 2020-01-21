package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelImageCreationResponse extends js.Object {
  /**
    * The idempotency token used to make this request idempotent.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the image whose creation has been cancelled.
    */
  var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.native
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object CancelImageCreationResponse {
  @scala.inline
  def apply(
    clientToken: ClientToken = null,
    imageBuildVersionArn: ImageBuildVersionArn = null,
    requestId: NonEmptyString = null
  ): CancelImageCreationResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (imageBuildVersionArn != null) __obj.updateDynamic("imageBuildVersionArn")(imageBuildVersionArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelImageCreationResponse]
  }
}

