package typings.baseui.progressStepsMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var isActive: js.UndefOr[Boolean] = js.native
  
  var isCompleted: js.UndefOr[Boolean] = js.native
  
  var isLast: js.UndefOr[Boolean] = js.native
  
  var overrides: js.UndefOr[StepOverrides] = js.native
  
  var title: js.UndefOr[ReactNode] = js.native
}
object StepProps {
  
  @scala.inline
  def apply(): StepProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepProps]
  }
  
  @scala.inline
  implicit class StepPropsOps[Self <: StepProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setIsCompleted(value: Boolean): Self = this.set("isCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCompleted: Self = this.set("isCompleted", js.undefined)
    
    @scala.inline
    def setIsLast(value: Boolean): Self = this.set("isLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLast: Self = this.set("isLast", js.undefined)
    
    @scala.inline
    def setOverrides(value: StepOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
