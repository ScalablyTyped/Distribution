package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageRecipeResponse extends js.Object {
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the image recipe that was created by this request. 
    */
  var imageRecipeArn: js.UndefOr[ImageRecipeArn] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object CreateImageRecipeResponse {
  @scala.inline
  def apply(
    clientToken: ClientToken = null,
    imageRecipeArn: ImageRecipeArn = null,
    requestId: NonEmptyString = null
  ): CreateImageRecipeResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (imageRecipeArn != null) __obj.updateDynamic("imageRecipeArn")(imageRecipeArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRecipeResponse]
  }
}

