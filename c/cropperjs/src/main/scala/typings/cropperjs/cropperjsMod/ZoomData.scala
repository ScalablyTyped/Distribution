package typings.cropperjs.cropperjsMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomData extends js.Object {
  /**
    * The old (current) ratio of the canvas
    */
  var oldRatio: Double
  /**
    * The original event that was triggered
    * Options: wheel, touchmove
    */
  var originalEvent: Event
  /**
    * The new (next) ratio of the canvas (canvasData.width / canvasData.naturalWidth)
    */
  var ratio: Double
}

object ZoomData {
  @scala.inline
  def apply(oldRatio: Double, originalEvent: Event, ratio: Double): ZoomData = {
    val __obj = js.Dynamic.literal(oldRatio = oldRatio, originalEvent = originalEvent, ratio = ratio)
  
    __obj.asInstanceOf[ZoomData]
  }
}

