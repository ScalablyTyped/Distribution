package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyCircularNode[Datum] extends HierarchyNode[Datum] {
  /**
    * The radius of the circle.
    */
  var r: Double = js.native
  /**
    * The x-coordinate of the circle’s center.
    */
  var x: Double = js.native
  /**
    * The y-coordinate of the circle’s center.
    */
  var y: Double = js.native
}

object HierarchyCircularNode {
  @scala.inline
  def apply[Datum](
    ancestors: () => js.Array[HierarchyCircularNode[Datum]],
    copy: () => HierarchyCircularNode[Datum],
    count: () => HierarchyCircularNode[Datum],
    data: Datum,
    depth: Double,
    descendants: () => js.Array[HierarchyCircularNode[Datum]],
    each: js.Function1[HierarchyCircularNode[Datum], Unit] => HierarchyCircularNode[Datum],
    eachAfter: js.Function1[HierarchyCircularNode[Datum], Unit] => HierarchyCircularNode[Datum],
    eachBefore: js.Function1[HierarchyCircularNode[Datum], Unit] => HierarchyCircularNode[Datum],
    height: Double,
    leaves: () => js.Array[HierarchyCircularNode[Datum]],
    links: () => js.Array[HierarchyLink[Datum]],
    path: HierarchyCircularNode[Datum] => js.Array[HierarchyCircularNode[Datum]],
    r: Double,
    sort: js.Function2[HierarchyCircularNode[Datum], HierarchyCircularNode[Datum], Double] => HierarchyCircularNode[Datum],
    sum: js.Function1[Datum, Double] => HierarchyCircularNode[Datum],
    x: Double,
    y: Double
  ): HierarchyCircularNode[Datum] = {
    val __obj = js.Dynamic.literal(ancestors = js.Any.fromFunction0(ancestors), copy = js.Any.fromFunction0(copy), count = js.Any.fromFunction0(count), data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], descendants = js.Any.fromFunction0(descendants), each = js.Any.fromFunction1(each), eachAfter = js.Any.fromFunction1(eachAfter), eachBefore = js.Any.fromFunction1(eachBefore), height = height.asInstanceOf[js.Any], leaves = js.Any.fromFunction0(leaves), links = js.Any.fromFunction0(links), path = js.Any.fromFunction1(path), r = r.asInstanceOf[js.Any], sort = js.Any.fromFunction1(sort), sum = js.Any.fromFunction1(sum), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyCircularNode[Datum]]
  }
  @scala.inline
  implicit class HierarchyCircularNodeOps[Self <: HierarchyCircularNode[_], Datum] (val x: Self with HierarchyCircularNode[Datum]) extends AnyVal {
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
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

