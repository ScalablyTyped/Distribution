package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyLink[Datum] extends js.Object {
  /**
    * The source of the link.
    */
  var source: HierarchyNode[Datum]
  /**
    * The target of the link.
    */
  var target: HierarchyNode[Datum]
}

object HierarchyLink {
  @scala.inline
  def apply[Datum](source: HierarchyNode[Datum], target: HierarchyNode[Datum]): HierarchyLink[Datum] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[HierarchyLink[Datum]]
  }
}

