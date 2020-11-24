package typings.cathoQuantum.gridMod

import typings.cathoQuantum.anon.BreakpointsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HideProps extends js.Object {
  
  var large: js.UndefOr[Boolean] = js.native
  
  var medium: js.UndefOr[Boolean] = js.native
  
  var small: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[BreakpointsObject] = js.native
  
  var xlarge: js.UndefOr[Boolean] = js.native
  
  var xsmall: js.UndefOr[Boolean] = js.native
}
object HideProps {
  
  @scala.inline
  def apply(): HideProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideProps]
  }
  
  @scala.inline
  implicit class HidePropsOps[Self <: HideProps] (val x: Self) extends AnyVal {
    
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
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setMedium(value: Boolean): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setTheme(value: BreakpointsObject): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setXlarge(value: Boolean): Self = this.set("xlarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlarge: Self = this.set("xlarge", js.undefined)
    
    @scala.inline
    def setXsmall(value: Boolean): Self = this.set("xsmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXsmall: Self = this.set("xsmall", js.undefined)
  }
}
