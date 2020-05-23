package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiameterSegments extends js.Object {
  var diameter: Double
  var segments: Double
}

object DiameterSegments {
  @scala.inline
  def apply(diameter: Double, segments: Double): DiameterSegments = {
    val __obj = js.Dynamic.literal(diameter = diameter.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiameterSegments]
  }
}

