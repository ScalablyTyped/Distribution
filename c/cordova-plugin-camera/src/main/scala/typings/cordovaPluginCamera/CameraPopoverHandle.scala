package typings.cordovaPluginCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A handle to the popover dialog created by navigator.camera.getPicture. Used on iOS only.
  */
@js.native
trait CameraPopoverHandle extends js.Object {
  /**
    * Set the position of the popover.
    * @param popoverOptions the CameraPopoverOptions that specify the new position.
    */
  def setPosition(popoverOptions: CameraPopoverOptions): Unit = js.native
}

object CameraPopoverHandle {
  @scala.inline
  def apply(setPosition: CameraPopoverOptions => Unit): CameraPopoverHandle = {
    val __obj = js.Dynamic.literal(setPosition = js.Any.fromFunction1(setPosition))
    __obj.asInstanceOf[CameraPopoverHandle]
  }
  @scala.inline
  implicit class CameraPopoverHandleOps[Self <: CameraPopoverHandle] (val x: Self) extends AnyVal {
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
    def setSetPosition(value: CameraPopoverOptions => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
  }
  
}

