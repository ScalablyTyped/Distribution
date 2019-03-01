package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyRectangularNode[Datum] extends HierarchyNode[Datum] {
  /**
    * The left edge of the rectangle.
    */
  var x0: scala.Double
  /**
    * The right edge of the rectangle.
    */
  var x1: scala.Double
  /**
    * The top edge of the rectangle
    */
  var y0: scala.Double
  /**
    * The bottom edge of the rectangle.
    */
  var y1: scala.Double
}

object HierarchyRectangularNode {
  @scala.inline
  def apply[Datum](
    ancestors: js.Function0[js.Array[HierarchyRectangularNode[Datum]]],
    copy: js.Function0[HierarchyRectangularNode[Datum]],
    count: js.Function0[HierarchyRectangularNode[Datum]],
    data: Datum,
    depth: scala.Double,
    descendants: js.Function0[js.Array[HierarchyRectangularNode[Datum]]],
    each: js.Function1[
      js.Function1[HierarchyRectangularNode[Datum], scala.Unit], 
      HierarchyRectangularNode[Datum]
    ],
    eachAfter: js.Function1[
      js.Function1[HierarchyRectangularNode[Datum], scala.Unit], 
      HierarchyRectangularNode[Datum]
    ],
    eachBefore: js.Function1[
      js.Function1[HierarchyRectangularNode[Datum], scala.Unit], 
      HierarchyRectangularNode[Datum]
    ],
    height: scala.Double,
    leaves: js.Function0[js.Array[HierarchyRectangularNode[Datum]]],
    links: js.Function0[js.Array[HierarchyRectangularLink[Datum]]],
    path: js.Function1[HierarchyRectangularNode[Datum], js.Array[HierarchyRectangularNode[Datum]]],
    sort: js.Function1[
      js.Function2[HierarchyRectangularNode[Datum], HierarchyRectangularNode[Datum], scala.Double], 
      HierarchyRectangularNode[Datum]
    ],
    sum: js.Function1[js.Function1[Datum, scala.Double], HierarchyRectangularNode[Datum]],
    x0: scala.Double,
    x1: scala.Double,
    y0: scala.Double,
    y1: scala.Double,
    children: js.Array[HierarchyRectangularNode[Datum]] = null,
    id: java.lang.String = null,
    parent: HierarchyRectangularNode[Datum] = null,
    value: scala.Int | scala.Double = null
  ): HierarchyRectangularNode[Datum] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ancestors")(ancestors)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("descendants")(descendants)
    __obj.updateDynamic("each")(each)
    __obj.updateDynamic("eachAfter")(eachAfter)
    __obj.updateDynamic("eachBefore")(eachBefore)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("leaves")(leaves)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("sort")(sort)
    __obj.updateDynamic("sum")(sum)
    __obj.updateDynamic("x0")(x0)
    __obj.updateDynamic("x1")(x1)
    __obj.updateDynamic("y0")(y0)
    __obj.updateDynamic("y1")(y1)
    if (children != null) __obj.updateDynamic("children")(children)
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyRectangularNode[Datum]]
  }
}

