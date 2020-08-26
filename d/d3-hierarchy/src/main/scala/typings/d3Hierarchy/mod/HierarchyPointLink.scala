package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyPointLink[Datum] extends js.Object {
  /**
    * The source of the link.
    */
  var source: HierarchyPointNode[Datum] = js.native
  /**
    * The target of the link.
    */
  var target: HierarchyPointNode[Datum] = js.native
}

object HierarchyPointLink {
  @scala.inline
  def apply[Datum](source: HierarchyPointNode[Datum], target: HierarchyPointNode[Datum]): HierarchyPointLink[Datum] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyPointLink[Datum]]
  }
  @scala.inline
  implicit class HierarchyPointLinkOps[Self <: HierarchyPointLink[_], Datum] (val x: Self with HierarchyPointLink[Datum]) extends AnyVal {
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
    def setSource(value: HierarchyPointNode[Datum]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: HierarchyPointNode[Datum]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

