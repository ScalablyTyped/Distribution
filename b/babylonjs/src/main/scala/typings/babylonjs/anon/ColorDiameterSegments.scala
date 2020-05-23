package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorDiameterSegments extends js.Object {
  var color: Color3
  var diameter: Double
  var segments: Double
}

object ColorDiameterSegments {
  @scala.inline
  def apply(color: Color3, diameter: Double, segments: Double): ColorDiameterSegments = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorDiameterSegments]
  }
}

