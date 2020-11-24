package typings.cathoQuantum.gridMod

import typings.cathoQuantum.anon.BreakpointsComponents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerProps extends js.Object {
  
  var fluid: js.UndefOr[Boolean] = js.native
  
  var hide: js.UndefOr[BreakpointsType | js.Array[String]] = js.native
  
  var `no-gutters`: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[BreakpointsComponents] = js.native
  
  var withBreakpoints: js.UndefOr[Boolean] = js.native
}
object ContainerProps {
  
  @scala.inline
  def apply(): ContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProps]
  }
  
  @scala.inline
  implicit class ContainerPropsOps[Self <: ContainerProps] (val x: Self) extends AnyVal {
    
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
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    
    @scala.inline
    def setHideVarargs(value: String*): Self = this.set("hide", js.Array(value :_*))
    
    @scala.inline
    def setHide(value: BreakpointsType | js.Array[String]): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def `setNo-gutters`(value: Boolean): Self = this.set("no-gutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNo-gutters`: Self = this.set("no-gutters", js.undefined)
    
    @scala.inline
    def setTheme(value: BreakpointsComponents): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setWithBreakpoints(value: Boolean): Self = this.set("withBreakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithBreakpoints: Self = this.set("withBreakpoints", js.undefined)
  }
}
