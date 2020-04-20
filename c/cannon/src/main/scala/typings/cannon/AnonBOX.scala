package typings.cannon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBOX extends js.Object {
  var BOX: Double
  var COMPOUND: Double
  var CONVEXPOLYHEDRON: Double
  var CYLINDER: Double
  var HEIGHTFIELD: Double
  var PARTICLE: Double
  var PLANE: Double
  var SPHERE: Double
}

object AnonBOX {
  @scala.inline
  def apply(
    BOX: Double,
    COMPOUND: Double,
    CONVEXPOLYHEDRON: Double,
    CYLINDER: Double,
    HEIGHTFIELD: Double,
    PARTICLE: Double,
    PLANE: Double,
    SPHERE: Double
  ): AnonBOX = {
    val __obj = js.Dynamic.literal(BOX = BOX.asInstanceOf[js.Any], COMPOUND = COMPOUND.asInstanceOf[js.Any], CONVEXPOLYHEDRON = CONVEXPOLYHEDRON.asInstanceOf[js.Any], CYLINDER = CYLINDER.asInstanceOf[js.Any], HEIGHTFIELD = HEIGHTFIELD.asInstanceOf[js.Any], PARTICLE = PARTICLE.asInstanceOf[js.Any], PLANE = PLANE.asInstanceOf[js.Any], SPHERE = SPHERE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBOX]
  }
}

