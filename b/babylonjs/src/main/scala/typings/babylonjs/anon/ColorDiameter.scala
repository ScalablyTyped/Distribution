package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorDiameter extends js.Object {
  var color: Color3
  var diameter: Double
  var segments: Double
}

object ColorDiameter {
  @scala.inline
  def apply(color: Color3, diameter: Double, segments: Double): ColorDiameter = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorDiameter]
  }
}

