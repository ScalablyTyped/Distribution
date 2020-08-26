package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageState extends js.Object {
  /**
    * The reason for the image's status. 
    */
  var reason: js.UndefOr[NonEmptyString] = js.native
  /**
    * The status of the image. 
    */
  var status: js.UndefOr[ImageStatus] = js.native
}

object ImageState {
  @scala.inline
  def apply(): ImageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageState]
  }
  @scala.inline
  implicit class ImageStateOps[Self <: ImageState] (val x: Self) extends AnyVal {
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
    def setReason(value: NonEmptyString): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setStatus(value: ImageStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

