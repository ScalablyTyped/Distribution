package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyLink[Datum] extends js.Object {
  /**
    * The source of the link.
    */
  var source: HierarchyNode[Datum] = js.native
  /**
    * The target of the link.
    */
  var target: HierarchyNode[Datum] = js.native
}

object HierarchyLink {
  @scala.inline
  def apply[Datum](source: HierarchyNode[Datum], target: HierarchyNode[Datum]): HierarchyLink[Datum] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyLink[Datum]]
  }
  @scala.inline
  implicit class HierarchyLinkOps[Self <: HierarchyLink[_], Datum] (val x: Self with HierarchyLink[Datum]) extends AnyVal {
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
    def setSource(value: HierarchyNode[Datum]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: HierarchyNode[Datum]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

