package typings.cannon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BOX extends js.Object {
  var BOX: Double
  var COMPOUND: Double
  var CONVEXPOLYHEDRON: Double
  var CYLINDER: Double
  var HEIGHTFIELD: Double
  var PARTICLE: Double
  var PLANE: Double
  var SPHERE: Double
}

object Anon_BOX {
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
  ): Anon_BOX = {
    val __obj = js.Dynamic.literal(BOX = BOX, COMPOUND = COMPOUND, CONVEXPOLYHEDRON = CONVEXPOLYHEDRON, CYLINDER = CYLINDER, HEIGHTFIELD = HEIGHTFIELD, PARTICLE = PARTICLE, PLANE = PLANE, SPHERE = SPHERE)
  
    __obj.asInstanceOf[Anon_BOX]
  }
}

