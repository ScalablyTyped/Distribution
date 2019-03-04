package typings
package cordovaDashPluginDashCameraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A handle to the popover dialog created by navigator.camera.getPicture. Used on iOS only.
  */
trait CameraPopoverHandle extends js.Object {
  /**
    * Set the position of the popover.
    * @param popoverOptions the CameraPopoverOptions that specify the new position.
    */
  def setPosition(popoverOptions: CameraPopoverOptions): scala.Unit
}

object CameraPopoverHandle {
  @scala.inline
  def apply(setPosition: js.Function1[CameraPopoverOptions, scala.Unit]): CameraPopoverHandle = {
    val __obj = js.Dynamic.literal(setPosition = setPosition)
  
    __obj.asInstanceOf[CameraPopoverHandle]
  }
}

