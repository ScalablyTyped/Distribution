package typings.babylonjs

import typings.babylonjs.mathColorMod.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorDiameter extends js.Object {
  var color: Color3
  var diameter: Double
  var segments: Double
}

object AnonColorDiameter {
  @scala.inline
  def apply(color: Color3, diameter: Double, segments: Double): AnonColorDiameter = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorDiameter]
  }
}

