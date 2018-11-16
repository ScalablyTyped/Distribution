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

