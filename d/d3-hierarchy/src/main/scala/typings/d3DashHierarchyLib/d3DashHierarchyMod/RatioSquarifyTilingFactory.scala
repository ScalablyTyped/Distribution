package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RatioSquarifyTilingFactory extends js.Object {
  def apply(
    node: HierarchyRectangularNode[_],
    x0: scala.Double,
    y0: scala.Double,
    x1: scala.Double,
    y1: scala.Double
  ): scala.Unit = js.native
  /**
    * Specifies the desired aspect ratio of the generated rectangles.
    * Note that the orientation of the generated rectangles (tall or wide) is not implied by the ratio.
    * Furthermore, the rectangles ratio are not guaranteed to have the exact specified aspect ratio.
    * If not specified, the aspect ratio defaults to the golden ratio, φ = (1 + sqrt(5)) / 2, per Kong et al.
    *
    * @param ratio The specified ratio value greater than or equal to one.
    */
  def ratio(ratio: scala.Double): RatioSquarifyTilingFactory = js.native
}

