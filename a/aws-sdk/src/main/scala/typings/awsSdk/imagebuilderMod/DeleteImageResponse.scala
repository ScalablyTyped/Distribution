package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImageResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image that was deleted. 
    */
  var imageBuildVersionArn: js.UndefOr[ImageBuildVersionArn] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object DeleteImageResponse {
  @scala.inline
  def apply(imageBuildVersionArn: ImageBuildVersionArn = null, requestId: NonEmptyString = null): DeleteImageResponse = {
    val __obj = js.Dynamic.literal()
    if (imageBuildVersionArn != null) __obj.updateDynamic("imageBuildVersionArn")(imageBuildVersionArn.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageResponse]
  }
}

