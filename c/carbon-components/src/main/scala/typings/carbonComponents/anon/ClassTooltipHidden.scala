package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassTooltipHidden extends js.Object {
  
  var classTooltipHidden: String = js.native
  
  var classTooltipVisible: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorTriggerButton: String = js.native
}
object ClassTooltipHidden {
  
  @scala.inline
  def apply(
    classTooltipHidden: String,
    classTooltipVisible: String,
    selectorInit: String,
    selectorTriggerButton: String
  ): ClassTooltipHidden = {
    val __obj = js.Dynamic.literal(classTooltipHidden = classTooltipHidden.asInstanceOf[js.Any], classTooltipVisible = classTooltipVisible.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorTriggerButton = selectorTriggerButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassTooltipHidden]
  }
  
  @scala.inline
  implicit class ClassTooltipHiddenOps[Self <: ClassTooltipHidden] (val x: Self) extends AnyVal {
    
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
    def setClassTooltipHidden(value: String): Self = this.set("classTooltipHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassTooltipVisible(value: String): Self = this.set("classTooltipVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTriggerButton(value: String): Self = this.set("selectorTriggerButton", value.asInstanceOf[js.Any])
  }
}
