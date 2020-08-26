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
  def apply(): DeleteImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteImageResponse]
  }
  @scala.inline
  implicit class DeleteImageResponseOps[Self <: DeleteImageResponse] (val x: Self) extends AnyVal {
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
    def setImageBuildVersionArn(value: ImageBuildVersionArn): Self = this.set("imageBuildVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageBuildVersionArn: Self = this.set("imageBuildVersionArn", js.undefined)
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

