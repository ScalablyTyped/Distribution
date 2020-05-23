package typings.cordovaPluginCamera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iOS-only parameters that specify the anchor element location and arrow direction
  * of the popover when selecting images from an iPad's library or album.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CameraPopoverOptions * / any */ trait CameraPopoverOptions extends js.Object {
  /**
    * Direction the arrow on the popover should point. Defined in Camera.PopoverArrowDirection
    * Matches iOS UIPopoverArrowDirection constants.
    *      ARROW_UP : 1,        
    *      ARROW_DOWN : 2,
    *      ARROW_LEFT : 4,
    *      ARROW_RIGHT : 8,
    *      ARROW_ANY : 15
    */
  var arrowDir: Double
  var height: Double
  var popoverHeight: Double
  var popoverWidth: Double
  var width: Double
  var x: Double
  var y: Double
}

object CameraPopoverOptions {
  @scala.inline
  def apply(
    arrowDir: Double,
    height: Double,
    popoverHeight: Double,
    popoverWidth: Double,
    width: Double,
    x: Double,
    y: Double
  ): CameraPopoverOptions = {
    val __obj = js.Dynamic.literal(arrowDir = arrowDir.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], popoverHeight = popoverHeight.asInstanceOf[js.Any], popoverWidth = popoverWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraPopoverOptions]
  }
}

