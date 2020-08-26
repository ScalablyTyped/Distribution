package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyRectangularNode[Datum] extends HierarchyNode[Datum] {
  /**
    * The left edge of the rectangle.
    */
  var x0: Double = js.native
  /**
    * The right edge of the rectangle.
    */
  var x1: Double = js.native
  /**
    * The top edge of the rectangle
    */
  var y0: Double = js.native
  /**
    * The bottom edge of the rectangle.
    */
  var y1: Double = js.native
}

object HierarchyRectangularNode {
  @scala.inline
  def apply[Datum](
    ancestors: () => js.Array[HierarchyRectangularNode[Datum]],
    copy: () => HierarchyRectangularNode[Datum],
    count: () => HierarchyRectangularNode[Datum],
    data: Datum,
    depth: Double,
    descendants: () => js.Array[HierarchyRectangularNode[Datum]],
    each: js.Function1[HierarchyRectangularNode[Datum], Unit] => HierarchyRectangularNode[Datum],
    eachAfter: js.Function1[HierarchyRectangularNode[Datum], Unit] => HierarchyRectangularNode[Datum],
    eachBefore: js.Function1[HierarchyRectangularNode[Datum], Unit] => HierarchyRectangularNode[Datum],
    height: Double,
    leaves: () => js.Array[HierarchyRectangularNode[Datum]],
    links: () => js.Array[HierarchyLink[Datum]],
    path: HierarchyRectangularNode[Datum] => js.Array[HierarchyRectangularNode[Datum]],
    sort: js.Function2[HierarchyRectangularNode[Datum], HierarchyRectangularNode[Datum], Double] => HierarchyRectangularNode[Datum],
    sum: js.Function1[Datum, Double] => HierarchyRectangularNode[Datum],
    x0: Double,
    x1: Double,
    y0: Double,
    y1: Double
  ): HierarchyRectangularNode[Datum] = {
    val __obj = js.Dynamic.literal(ancestors = js.Any.fromFunction0(ancestors), copy = js.Any.fromFunction0(copy), count = js.Any.fromFunction0(count), data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], descendants = js.Any.fromFunction0(descendants), each = js.Any.fromFunction1(each), eachAfter = js.Any.fromFunction1(eachAfter), eachBefore = js.Any.fromFunction1(eachBefore), height = height.asInstanceOf[js.Any], leaves = js.Any.fromFunction0(leaves), links = js.Any.fromFunction0(links), path = js.Any.fromFunction1(path), sort = js.Any.fromFunction1(sort), sum = js.Any.fromFunction1(sum), x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyRectangularNode[Datum]]
  }
  @scala.inline
  implicit class HierarchyRectangularNodeOps[Self <: HierarchyRectangularNode[_], Datum] (val x: Self with HierarchyRectangularNode[Datum]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setX0(value: Double): Self = this.set("x0", value.asInstanceOf[js.Any])
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def setY0(value: Double): Self = this.set("y0", value.asInstanceOf[js.Any])
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
  }
  
}

