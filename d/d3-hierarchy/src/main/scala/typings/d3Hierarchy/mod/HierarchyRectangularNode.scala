package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyRectangularNode[Datum] extends HierarchyNode[Datum] {
  /**
    * The left edge of the rectangle.
    */
  var x0: Double
  /**
    * The right edge of the rectangle.
    */
  var x1: Double
  /**
    * The top edge of the rectangle
    */
  var y0: Double
  /**
    * The bottom edge of the rectangle.
    */
  var y1: Double
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
    y1: Double,
    children: js.Array[HierarchyRectangularNode[Datum]] = null,
    id: String = null,
    parent: HierarchyRectangularNode[Datum] = null,
    value: js.UndefOr[Double] = js.undefined
  ): HierarchyRectangularNode[Datum] = {
    val __obj = js.Dynamic.literal(ancestors = js.Any.fromFunction0(ancestors), copy = js.Any.fromFunction0(copy), count = js.Any.fromFunction0(count), data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], descendants = js.Any.fromFunction0(descendants), each = js.Any.fromFunction1(each), eachAfter = js.Any.fromFunction1(eachAfter), eachBefore = js.Any.fromFunction1(eachBefore), height = height.asInstanceOf[js.Any], leaves = js.Any.fromFunction0(leaves), links = js.Any.fromFunction0(links), path = js.Any.fromFunction1(path), sort = js.Any.fromFunction1(sort), sum = js.Any.fromFunction1(sum), x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyRectangularNode[Datum]]
  }
}

