package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDiameter extends js.Object {
  var color: babylonjsLib.BABYLONNs.Color3
  var diameter: scala.Double
  var segments: scala.Double
}

object Anon_ColorDiameter {
  @scala.inline
  def apply(color: babylonjsLib.BABYLONNs.Color3, diameter: scala.Double, segments: scala.Double): Anon_ColorDiameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("diameter")(diameter)
    __obj.updateDynamic("segments")(segments)
    __obj.asInstanceOf[Anon_ColorDiameter]
  }
}

