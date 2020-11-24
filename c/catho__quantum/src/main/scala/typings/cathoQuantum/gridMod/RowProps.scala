package typings.cathoQuantum.gridMod

import typings.cathoQuantum.anon.`11`
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowProps extends js.Object {
  
  var children: js.Array[ReactNode] | ReactNode = js.native
  
  var hide: js.UndefOr[BreakpointsType | js.Array[BreakpointsType]] = js.native
  
  var `no-gutters`: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[`11`] = js.native
}
object RowProps {
  
  @scala.inline
  def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  
  @scala.inline
  implicit class RowPropsOps[Self <: RowProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactNode] | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHideVarargs(value: BreakpointsType*): Self = this.set("hide", js.Array(value :_*))
    
    @scala.inline
    def setHide(value: BreakpointsType | js.Array[BreakpointsType]): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def `setNo-gutters`(value: Boolean): Self = this.set("no-gutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNo-gutters`: Self = this.set("no-gutters", js.undefined)
    
    @scala.inline
    def setTheme(value: `11`): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
