package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyPointNode[Datum] extends HierarchyNode[Datum] {
  /**
    * The x-coordinate of the node.
    */
  var x: Double
  /**
    * The y-coordinate of the node.
    */
  var y: Double
}

object HierarchyPointNode {
  @scala.inline
  def apply[Datum](
    ancestors: () => js.Array[HierarchyPointNode[Datum]],
    copy: () => HierarchyPointNode[Datum],
    count: () => HierarchyPointNode[Datum],
    data: Datum,
    depth: Double,
    descendants: () => js.Array[HierarchyPointNode[Datum]],
    each: js.Function1[HierarchyPointNode[Datum], Unit] => HierarchyPointNode[Datum],
    eachAfter: js.Function1[HierarchyPointNode[Datum], Unit] => HierarchyPointNode[Datum],
    eachBefore: js.Function1[HierarchyPointNode[Datum], Unit] => HierarchyPointNode[Datum],
    height: Double,
    leaves: () => js.Array[HierarchyPointNode[Datum]],
    links: () => js.Array[HierarchyLink[Datum]],
    path: HierarchyPointNode[Datum] => js.Array[HierarchyPointNode[Datum]],
    sort: js.Function2[HierarchyPointNode[Datum], HierarchyPointNode[Datum], Double] => HierarchyPointNode[Datum],
    sum: js.Function1[Datum, Double] => HierarchyPointNode[Datum],
    x: Double,
    y: Double,
    children: js.Array[HierarchyPointNode[Datum]] = null,
    id: String = null,
    parent: HierarchyPointNode[Datum] = null,
    value: Int | Double = null
  ): HierarchyPointNode[Datum] = {
    val __obj = js.Dynamic.literal(ancestors = js.Any.fromFunction0(ancestors), copy = js.Any.fromFunction0(copy), count = js.Any.fromFunction0(count), data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], descendants = js.Any.fromFunction0(descendants), each = js.Any.fromFunction1(each), eachAfter = js.Any.fromFunction1(eachAfter), eachBefore = js.Any.fromFunction1(eachBefore), height = height.asInstanceOf[js.Any], leaves = js.Any.fromFunction0(leaves), links = js.Any.fromFunction0(links), path = js.Any.fromFunction1(path), sort = js.Any.fromFunction1(sort), sum = js.Any.fromFunction1(sum), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyPointNode[Datum]]
  }
}

