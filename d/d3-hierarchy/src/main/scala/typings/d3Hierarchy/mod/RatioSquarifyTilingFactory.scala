package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RatioSquarifyTilingFactory extends js.Object {
  def apply(node: HierarchyRectangularNode[_], x0: Double, y0: Double, x1: Double, y1: Double): Unit = js.native
  /**
    * Specifies the desired aspect ratio of the generated rectangles.
    * Note that the orientation of the generated rectangles (tall or wide) is not implied by the ratio.
    * Furthermore, the rectangles ratio are not guaranteed to have the exact specified aspect ratio.
    * If not specified, the aspect ratio defaults to the golden ratio, φ = (1 + sqrt(5)) / 2, per Kong et al.
    *
    * @param ratio The specified ratio value greater than or equal to one.
    */
  def ratio(ratio: Double): RatioSquarifyTilingFactory = js.native
}

