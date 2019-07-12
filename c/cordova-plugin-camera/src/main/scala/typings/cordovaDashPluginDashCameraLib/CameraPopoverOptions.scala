package typings
package cordovaDashPluginDashCameraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iOS-only parameters that specify the anchor element location and arrow direction
  * of the popover when selecting images from an iPad's library or album.
  */
@JSGlobal("CameraPopoverOptions")
@js.native
class CameraPopoverOptions () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, arrowDir: scala.Double) = this()
  /**
    * Direction the arrow on the popover should point. Defined in Camera.PopoverArrowDirection
    * Matches iOS UIPopoverArrowDirection constants.
    *      ARROW_UP : 1,        
    *      ARROW_DOWN : 2,
    *      ARROW_LEFT : 4,
    *      ARROW_RIGHT : 8,
    *      ARROW_ANY : 15
    */
  var arrowDir: scala.Double = js.native
  var height: scala.Double = js.native
  var popoverHeight: scala.Double = js.native
  var popoverWidth: scala.Double = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
}

