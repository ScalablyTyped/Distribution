package typings
package cordovaDashPluginDashCameraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iOS-only parameters that specify the anchor element location and arrow direction
  * of the popover when selecting images from an iPad's library or album.
  */
trait CameraPopoverOptions extends js.Object {
  /**
    * Direction the arrow on the popover should point. Defined in Camera.PopoverArrowDirection
    * Matches iOS UIPopoverArrowDirection constants.
    *      ARROW_UP : 1,        
    *      ARROW_DOWN : 2,
    *      ARROW_LEFT : 4,
    *      ARROW_RIGHT : 8,
    *      ARROW_ANY : 15
    */
  var arrowDir: scala.Double
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object CameraPopoverOptions {
  @scala.inline
  def apply(
    arrowDir: scala.Double,
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): CameraPopoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrowDir")(arrowDir)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[CameraPopoverOptions]
  }
}

