package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiameterSegments extends js.Object {
  var diameter: Double
  var segments: Double
}

object AnonDiameterSegments {
  @scala.inline
  def apply(diameter: Double, segments: Double): AnonDiameterSegments = {
    val __obj = js.Dynamic.literal(diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDiameterSegments]
  }
}

