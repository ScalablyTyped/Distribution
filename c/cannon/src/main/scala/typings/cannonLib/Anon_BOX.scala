package typings
package cannonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BOX extends js.Object {
  var BOX: scala.Double
  var COMPOUND: scala.Double
  var CONVEXPOLYHEDRON: scala.Double
  var CYLINDER: scala.Double
  var HEIGHTFIELD: scala.Double
  var PARTICLE: scala.Double
  var PLANE: scala.Double
  var SPHERE: scala.Double
}

object Anon_BOX {
  @scala.inline
  def apply(
    BOX: scala.Double,
    COMPOUND: scala.Double,
    CONVEXPOLYHEDRON: scala.Double,
    CYLINDER: scala.Double,
    HEIGHTFIELD: scala.Double,
    PARTICLE: scala.Double,
    PLANE: scala.Double,
    SPHERE: scala.Double
  ): Anon_BOX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BOX")(BOX)
    __obj.updateDynamic("COMPOUND")(COMPOUND)
    __obj.updateDynamic("CONVEXPOLYHEDRON")(CONVEXPOLYHEDRON)
    __obj.updateDynamic("CYLINDER")(CYLINDER)
    __obj.updateDynamic("HEIGHTFIELD")(HEIGHTFIELD)
    __obj.updateDynamic("PARTICLE")(PARTICLE)
    __obj.updateDynamic("PLANE")(PLANE)
    __obj.updateDynamic("SPHERE")(SPHERE)
    __obj.asInstanceOf[Anon_BOX]
  }
}

