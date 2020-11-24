package typings.baseui.layoutGridMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellProps extends js.Object {
  
  var align: js.UndefOr[Responsive[ALIGNMENT]] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var order: js.UndefOr[Responsive[Double]] = js.native
  
  var overrides: js.UndefOr[CellOverrides] = js.native
  
  var skip: js.UndefOr[Responsive[Double]] = js.native
  
  var span: js.UndefOr[Responsive[Double]] = js.native
}
object CellProps {
  
  @scala.inline
  def apply(): CellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellProps]
  }
  
  @scala.inline
  implicit class CellPropsOps[Self <: CellProps] (val x: Self) extends AnyVal {
    
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
    def setAlignVarargs(value: ALIGNMENT*): Self = this.set("align", js.Array(value :_*))
    
    @scala.inline
    def setAlign(value: Responsive[ALIGNMENT]): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: Double*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: Responsive[Double]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOverrides(value: CellOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setSkipVarargs(value: Double*): Self = this.set("skip", js.Array(value :_*))
    
    @scala.inline
    def setSkip(value: Responsive[Double]): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setSpanVarargs(value: Double*): Self = this.set("span", js.Array(value :_*))
    
    @scala.inline
    def setSpan(value: Responsive[Double]): Self = this.set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
  }
}
