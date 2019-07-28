package typings.d3DashHierarchy.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyPointLink[Datum] extends js.Object {
  /**
    * The source of the link.
    */
  var source: HierarchyPointNode[Datum]
  /**
    * The target of the link.
    */
  var target: HierarchyPointNode[Datum]
}

object HierarchyPointLink {
  @scala.inline
  def apply[Datum](source: HierarchyPointNode[Datum], target: HierarchyPointNode[Datum]): HierarchyPointLink[Datum] = {
    val __obj = js.Dynamic.literal(source = source, target = target)
  
    __obj.asInstanceOf[HierarchyPointLink[Datum]]
  }
}

