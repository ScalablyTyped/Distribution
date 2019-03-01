package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DistanceMax extends js.Object {
  var distance: scala.Double
  var max: babylonjsLib.BABYLONNs.Vector3
  var min: babylonjsLib.BABYLONNs.Vector3
}

object Anon_DistanceMax {
  @scala.inline
  def apply(distance: scala.Double, max: babylonjsLib.BABYLONNs.Vector3, min: babylonjsLib.BABYLONNs.Vector3): Anon_DistanceMax = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[Anon_DistanceMax]
  }
}

