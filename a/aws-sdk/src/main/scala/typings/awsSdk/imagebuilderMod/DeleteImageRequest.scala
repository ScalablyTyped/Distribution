package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteImageRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image to delete. 
    */
  var imageBuildVersionArn: ImageBuildVersionArn = js.native
}

object DeleteImageRequest {
  @scala.inline
  def apply(imageBuildVersionArn: ImageBuildVersionArn): DeleteImageRequest = {
    val __obj = js.Dynamic.literal(imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageRequest]
  }
}

