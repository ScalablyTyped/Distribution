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
    ancestors: js.Function0[js.Array[HierarchyPointNode[Datum]]],
    copy: js.Function0[HierarchyPointNode[Datum]],
    count: js.Function0[HierarchyPointNode[Datum]],
    data: Datum,
    depth: scala.Double,
    descendants: js.Function0[js.Array[HierarchyPointNode[Datum]]],
    each: js.Function1[js.Function1[HierarchyPointNode[Datum], scala.Unit], HierarchyPointNode[Datum]],
    eachAfter: js.Function1[js.Function1[HierarchyPointNode[Datum], scala.Unit], HierarchyPointNode[Datum]],
    eachBefore: js.Function1[js.Function1[HierarchyPointNode[Datum], scala.Unit], HierarchyPointNode[Datum]],
    height: scala.Double,
    leaves: js.Function0[js.Array[HierarchyPointNode[Datum]]],
    links: js.Function0[js.Array[HierarchyPointLink[Datum]]],
    path: js.Function1[HierarchyPointNode[Datum], js.Array[HierarchyPointNode[Datum]]],
    sort: js.Function1[
      js.Function2[HierarchyPointNode[Datum], HierarchyPointNode[Datum], scala.Double], 
      HierarchyPointNode[Datum]
    ],
    sum: js.Function1[js.Function1[Datum, scala.Double], HierarchyPointNode[Datum]],
    x: scala.Double,
    y: scala.Double,
    children: js.Array[HierarchyPointNode[Datum]] = null,
    id: java.lang.String = null,
    parent: HierarchyPointNode[Datum] = null,
    value: scala.Int | scala.Double = null
  ): HierarchyPointNode[Datum] = {
    val __obj = js.Dynamic.literal(ancestors = ancestors, copy = copy, count = count, data = data.asInstanceOf[js.Any], depth = depth, descendants = descendants, each = each, eachAfter = eachAfter, eachBefore = eachBefore, height = height, leaves = leaves, links = links, path = path, sort = sort, sum = sum, x = x, y = y)
    if (children != null) __obj.updateDynamic("children")(children)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyPointNode[Datum]]
  }
}

