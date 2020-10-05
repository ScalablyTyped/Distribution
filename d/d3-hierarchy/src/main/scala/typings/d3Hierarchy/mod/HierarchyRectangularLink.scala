package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyRectangularLink[Datum] extends js.Object {
  /**
    * The source of the link.
    */
  var source: HierarchyRectangularNode[Datum] = js.native
  /**
    * The target of the link.
    */
  var target: HierarchyRectangularNode[Datum] = js.native
}

object HierarchyRectangularLink {
  @scala.inline
  def apply[Datum](source: HierarchyRectangularNode[Datum], target: HierarchyRectangularNode[Datum]): HierarchyRectangularLink[Datum] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyRectangularLink[Datum]]
  }
  @scala.inline
  implicit class HierarchyRectangularLinkOps[Self <: HierarchyRectangularLink[_], Datum] (val x: Self with HierarchyRectangularLink[Datum]) extends AnyVal {
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
    def setSource(value: HierarchyRectangularNode[Datum]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: HierarchyRectangularNode[Datum]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

