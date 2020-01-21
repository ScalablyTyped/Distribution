package typings.cordovaPluginCamera

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
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double, arrowDir: Double) = this()
  /**
    * Direction the arrow on the popover should point. Defined in Camera.PopoverArrowDirection
    * Matches iOS UIPopoverArrowDirection constants.
    *      ARROW_UP : 1,        
    *      ARROW_DOWN : 2,
    *      ARROW_LEFT : 4,
    *      ARROW_RIGHT : 8,
    *      ARROW_ANY : 15
    */
  var arrowDir: Double = js.native
  var height: Double = js.native
  var popoverHeight: Double = js.native
  var popoverWidth: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

