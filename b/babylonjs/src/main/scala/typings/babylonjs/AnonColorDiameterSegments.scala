package typings.babylonjs

import typings.babylonjs.BABYLON.Color3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorDiameterSegments extends js.Object {
  var color: Color3
  var diameter: Double
  var segments: Double
}

object AnonColorDiameterSegments {
  @scala.inline
  def apply(color: Color3, diameter: Double, segments: Double): AnonColorDiameterSegments = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColorDiameterSegments]
  }
}

