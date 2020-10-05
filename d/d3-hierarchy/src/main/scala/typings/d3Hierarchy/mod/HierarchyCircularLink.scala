package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyCircularLink[Datum] extends js.Object {
  /**
    * The source of the link.
    */
  var source: HierarchyCircularNode[Datum] = js.native
  /**
    * The target of the link.
    */
  var target: HierarchyCircularNode[Datum] = js.native
}

object HierarchyCircularLink {
  @scala.inline
  def apply[Datum](source: HierarchyCircularNode[Datum], target: HierarchyCircularNode[Datum]): HierarchyCircularLink[Datum] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyCircularLink[Datum]]
  }
  @scala.inline
  implicit class HierarchyCircularLinkOps[Self <: HierarchyCircularLink[_], Datum] (val x: Self with HierarchyCircularLink[Datum]) extends AnyVal {
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
    def setSource(value: HierarchyCircularNode[Datum]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: HierarchyCircularNode[Datum]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

