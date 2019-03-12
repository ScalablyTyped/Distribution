package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyPointNode[Datum] extends HierarchyNode[Datum] {
  /**
    * The x-coordinate of the node.
    */
  var x: scala.Double
  /**
    * The y-coordinate of the node.
    */
  var y: scala.Double
}

object HierarchyPointNode {
  @scala.inline
  def apply[Datum](
    ancestors: () => js.Array[HierarchyPointNode[Datum]],
    copy: () => HierarchyPointNode[Datum],
    count: () => HierarchyPointNode[Datum],
    data: Datum,
    depth: scala.Double,
    descendants: () => js.Array[HierarchyPointNode[Datum]],
    each: js.Function1[HierarchyPointNode[Datum], scala.Unit] => HierarchyPointNode[Datum],
    eachAfter: js.Function1[HierarchyPointNode[Datum], scala.Unit] => HierarchyPointNode[Datum],
    eachBefore: js.Function1[HierarchyPointNode[Datum], scala.Unit] => HierarchyPointNode[Datum],
    height: scala.Double,
    leaves: () => js.Array[HierarchyPointNode[Datum]],
    links: () => js.Array[HierarchyPointLink[Datum]],
    path: HierarchyPointNode[Datum] => js.Array[HierarchyPointNode[Datum]],
    sort: js.Function2[HierarchyPointNode[Datum], HierarchyPointNode[Datum], scala.Double] => HierarchyPointNode[Datum],
    sum: js.Function1[Datum, scala.Double] => HierarchyPointNode[Datum],
    x: scala.Double,
    y: scala.Double,
    children: js.Array[HierarchyPointNode[Datum]] = null,
    id: java.lang.String = null,
    parent: HierarchyPointNode[Datum] = null,
    value: scala.Int | scala.Double = null
  ): HierarchyPointNode[Datum] = {
    val __obj = js.Dynamic.literal(ancestors = js.Any.fromFunction0(ancestors), copy = js.Any.fromFunction0(copy), count = js.Any.fromFunction0(count), data = data.asInstanceOf[js.Any], depth = depth, descendants = js.Any.fromFunction0(descendants), each = js.Any.fromFunction1(each), eachAfter = js.Any.fromFunction1(eachAfter), eachBefore = js.Any.fromFunction1(eachBefore), height = height, leaves = js.Any.fromFunction0(leaves), links = js.Any.fromFunction0(links), path = js.Any.fromFunction1(path), sort = js.Any.fromFunction1(sort), sum = js.Any.fromFunction1(sum), x = x, y = y)
    if (children != null) __obj.updateDynamic("children")(children)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyPointNode[Datum]]
  }
}

