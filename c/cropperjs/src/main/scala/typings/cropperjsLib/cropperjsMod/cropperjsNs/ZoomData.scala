package typings
package cropperjsLib.cropperjsMod.cropperjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomData extends js.Object {
  /**
    * The old (current) ratio of the canvas
    */
  var oldRatio: scala.Double
  /**
    * The original event that was triggered
    * Options: wheel, touchmove
    */
  var originalEvent: stdLib.Event
  /**
    * The new (next) ratio of the canvas (canvasData.width / canvasData.naturalWidth)
    */
  var ratio: scala.Double
}

