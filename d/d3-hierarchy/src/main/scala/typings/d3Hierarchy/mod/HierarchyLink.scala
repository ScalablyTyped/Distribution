package typings.d3Hierarchy.mod

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
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HierarchyLink[Datum]]
  }
}

