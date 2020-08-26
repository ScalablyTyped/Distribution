package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageFailure extends js.Object {
  /**
    * The code associated with the failure.
    */
  var failureCode: js.UndefOr[ImageFailureCode] = js.native
  /**
    * The reason for the failure.
    */
  var failureReason: js.UndefOr[ImageFailureReason] = js.native
  /**
    * The image ID associated with the failure.
    */
  var imageId: js.UndefOr[ImageIdentifier] = js.native
}

object ImageFailure {
  @scala.inline
  def apply(): ImageFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageFailure]
  }
  @scala.inline
  implicit class ImageFailureOps[Self <: ImageFailure] (val x: Self) extends AnyVal {
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
    def setFailureCode(value: ImageFailureCode): Self = this.set("failureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCode: Self = this.set("failureCode", js.undefined)
    @scala.inline
    def setFailureReason(value: ImageFailureReason): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setImageId(value: ImageIdentifier): Self = this.set("imageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
  }
  
}

