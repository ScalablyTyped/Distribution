package typings.d3DashShape.d3DashShapeMod

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
  var source: js.Tuple2[Double, Double]
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
  var target: js.Tuple2[Double, Double]
}

object DefaultLinkObject {
  @scala.inline
  def apply(source: js.Tuple2[Double, Double], target: js.Tuple2[Double, Double]): DefaultLinkObject = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultLinkObject]
  }
}

