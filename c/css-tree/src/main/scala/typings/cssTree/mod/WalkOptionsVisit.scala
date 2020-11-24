package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalkOptionsVisit[NodeType /* <: CssNode */] extends js.Object {
  
  var enter: js.UndefOr[EnterOrLeaveFn[NodeType]] = js.native
  
  var leave: js.UndefOr[EnterOrLeaveFn[NodeType]] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var visit: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any = js.native
}
object WalkOptionsVisit {
  
  @scala.inline
  def apply[NodeType /* <: CssNode */](
    visit: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any
  ): WalkOptionsVisit[NodeType] = {
    val __obj = js.Dynamic.literal(visit = visit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkOptionsVisit[NodeType]]
  }
  
  @scala.inline
  implicit class WalkOptionsVisitOps[Self <: WalkOptionsVisit[_], NodeType /* <: CssNode */] (val x: Self with WalkOptionsVisit[NodeType]) extends AnyVal {
    
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
    def setVisit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any
    ): Self = this.set("visit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnter(value: EnterOrLeaveFn[NodeType]): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setLeave(value: EnterOrLeaveFn[NodeType]): Self = this.set("leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
  }
}
