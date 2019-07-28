package typings.cropperjs.cropperjsMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropStepData extends js.Object {
  /**
    * Options:
    *   'crop': create a new crop box
    *   'move': move the canvas (image wrapper)
    *   'zoom': zoom in / out the canvas (image wrapper) by touch
    *   'e': resize the east side of the crop box
    *   'w': resize the west side of the crop box
    *   's': resize the south side of the crop box
    *   'n': resize the north side of the crop box
    *   'se': resize the southeast side of the crop box
    *   'sw': resize the southwest side of the crop box
    *   'ne': resize the northeast side of the crop box
    *   'nw': resize the northwest side of the crop box
    *   'all': move the crop box (all directions)
    */
  var action: String
  /**
    * The original event that was triggered
    * Options:
    *   `cropstart`: mousedown, touchstart and pointerdown
    *   `cropmove`: mousemove, touchmove and pointermove
    *   `cropend`: mouseup, touchend, touchcancel, pointerup and pointercancel
    */
  var originalEvent: Event
}

object CropStepData {
  @scala.inline
  def apply(action: String, originalEvent: Event): CropStepData = {
    val __obj = js.Dynamic.literal(action = action, originalEvent = originalEvent)
  
    __obj.asInstanceOf[CropStepData]
  }
}

