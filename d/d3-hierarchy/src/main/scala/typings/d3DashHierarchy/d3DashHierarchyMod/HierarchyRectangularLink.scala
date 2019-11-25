package typings.d3DashHierarchy.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyRectangularLink[Datum] extends js.Object {
  /**
    * The source of the link.
    */
  var source: HierarchyRectangularNode[Datum]
  /**
    * The target of the link.
    */
  var target: HierarchyRectangularNode[Datum]
}

object HierarchyRectangularLink {
  @scala.inline
  def apply[Datum](source: HierarchyRectangularNode[Datum], target: HierarchyRectangularNode[Datum]): HierarchyRectangularLink[Datum] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HierarchyRectangularLink[Datum]]
  }
}

