package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyCircularLink[Datum] extends js.Object {
  /**
    * The source of the link.
    */
  var source: HierarchyCircularNode[Datum]
  /**
    * The target of the link.
    */
  var target: HierarchyCircularNode[Datum]
}

object HierarchyCircularLink {
  @scala.inline
  def apply[Datum](source: HierarchyCircularNode[Datum], target: HierarchyCircularNode[Datum]): HierarchyCircularLink[Datum] = {
    val __obj = js.Dynamic.literal(source = source, target = target)
  
    __obj.asInstanceOf[HierarchyCircularLink[Datum]]
  }
}

