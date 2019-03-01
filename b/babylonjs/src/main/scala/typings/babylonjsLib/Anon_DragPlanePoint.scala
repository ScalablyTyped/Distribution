package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DragPlanePoint extends js.Object {
  var dragPlanePoint: babylonjsLib.BABYLONNs.Vector3
  var pointerId: scala.Double
}

object Anon_DragPlanePoint {
  @scala.inline
  def apply(dragPlanePoint: babylonjsLib.BABYLONNs.Vector3, pointerId: scala.Double): Anon_DragPlanePoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dragPlanePoint")(dragPlanePoint)
    __obj.updateDynamic("pointerId")(pointerId)
    __obj.asInstanceOf[Anon_DragPlanePoint]
  }
}

