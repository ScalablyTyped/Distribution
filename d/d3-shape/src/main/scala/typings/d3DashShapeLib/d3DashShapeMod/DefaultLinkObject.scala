package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLinkObject extends js.Object {
  /**
    * Source node of the link.
    *
    * For a link in a Cartesian coordinate system, the two element array contains
    * the coordinates [x, y].
    *
    * For a radial link, the two element array contains
    * the coordinates [angle, radius]. The angle is stated in radians, with 0 at -y (12 o’clock).
    * The radius measures the distance from the origin ⟨0,0⟩.
    */
  var source: js.Tuple2[scala.Double, scala.Double]
  /**
    * Target node of the link.
    *
    * For a link in a Cartesian coordinate system, the two element array contains
    * the coordinates [x, y].
    *
    * For a radial link, the two element array contains
    * the coordinates [angle, radius]. The angle is stated in radians, with 0 at -y (12 o’clock).
    * The radius measures the distance from the origin ⟨0,0⟩.
    */
  var target: js.Tuple2[scala.Double, scala.Double]
}

