package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyCircularNode[Datum] extends HierarchyNode[Datum] {
  /**
    * The radius of the circle.
    */
  var r: scala.Double
  /**
    * The x-coordinate of the circle’s center.
    */
  var x: scala.Double
  /**
    * The y-coordinate of the circle’s center.
    */
  var y: scala.Double
}

object HierarchyCircularNode {
  @scala.inline
  def apply[Datum](
    ancestors: () => js.Array[HierarchyCircularNode[Datum]],
    copy: () => HierarchyCircularNode[Datum],
    count: () => HierarchyCircularNode[Datum],
    data: Datum,
    depth: scala.Double,
    descendants: () => js.Array[HierarchyCircularNode[Datum]],
    each: js.Function1[HierarchyCircularNode[Datum], scala.Unit] => HierarchyCircularNode[Datum],
    eachAfter: js.Function1[HierarchyCircularNode[Datum], scala.Unit] => HierarchyCircularNode[Datum],
    eachBefore: js.Function1[HierarchyCircularNode[Datum], scala.Unit] => HierarchyCircularNode[Datum],
    height: scala.Double,
    leaves: () => js.Array[HierarchyCircularNode[Datum]],
    links: () => js.Array[HierarchyCircularLink[Datum]],
    path: HierarchyCircularNode[Datum] => js.Array[HierarchyCircularNode[Datum]],
    r: scala.Double,
    sort: js.Function2[HierarchyCircularNode[Datum], HierarchyCircularNode[Datum], scala.Double] => HierarchyCircularNode[Datum],
    sum: js.Function1[Datum, scala.Double] => HierarchyCircularNode[Datum],
    x: scala.Double,
    y: scala.Double,
    children: js.Array[HierarchyCircularNode[Datum]] = null,
    id: java.lang.String = null,
    parent: HierarchyCircularNode[Datum] = null,
    value: scala.Int | scala.Double = null
  ): HierarchyCircularNode[Datum] = {
    val __obj = js.Dynamic.literal(ancestors = js.Any.fromFunction0(ancestors), copy = js.Any.fromFunction0(copy), count = js.Any.fromFunction0(count), data = data.asInstanceOf[js.Any], depth = depth, descendants = js.Any.fromFunction0(descendants), each = js.Any.fromFunction1(each), eachAfter = js.Any.fromFunction1(eachAfter), eachBefore = js.Any.fromFunction1(eachBefore), height = height, leaves = js.Any.fromFunction0(leaves), links = js.Any.fromFunction0(links), path = js.Any.fromFunction1(path), r = r, sort = js.Any.fromFunction1(sort), sum = js.Any.fromFunction1(sum), x = x, y = y)
    if (children != null) __obj.updateDynamic("children")(children)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyCircularNode[Datum]]
  }
}

