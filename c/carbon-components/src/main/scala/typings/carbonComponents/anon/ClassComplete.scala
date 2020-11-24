package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassComplete extends js.Object {
  
  var classComplete: String = js.native
  
  var classCurrent: String = js.native
  
  var classIncomplete: String = js.native
  
  var classOverflowLabel: String = js.native
  
  var classStep: String = js.native
  
  var classTooltipMulti: String = js.native
  
  var maxWidth: Double = js.native
  
  var selectorComplete: String = js.native
  
  var selectorCurrent: String = js.native
  
  var selectorIncomplete: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorLabel: String = js.native
  
  var selectorStepElement: String = js.native
  
  var selectorTooltip: String = js.native
  
  var selectorTooltipText: String = js.native
  
  var tooltipMaxHeight: Double = js.native
}
object ClassComplete {
  
  @scala.inline
  def apply(
    classComplete: String,
    classCurrent: String,
    classIncomplete: String,
    classOverflowLabel: String,
    classStep: String,
    classTooltipMulti: String,
    maxWidth: Double,
    selectorComplete: String,
    selectorCurrent: String,
    selectorIncomplete: String,
    selectorInit: String,
    selectorLabel: String,
    selectorStepElement: String,
    selectorTooltip: String,
    selectorTooltipText: String,
    tooltipMaxHeight: Double
  ): ClassComplete = {
    val __obj = js.Dynamic.literal(classComplete = classComplete.asInstanceOf[js.Any], classCurrent = classCurrent.asInstanceOf[js.Any], classIncomplete = classIncomplete.asInstanceOf[js.Any], classOverflowLabel = classOverflowLabel.asInstanceOf[js.Any], classStep = classStep.asInstanceOf[js.Any], classTooltipMulti = classTooltipMulti.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], selectorComplete = selectorComplete.asInstanceOf[js.Any], selectorCurrent = selectorCurrent.asInstanceOf[js.Any], selectorIncomplete = selectorIncomplete.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorLabel = selectorLabel.asInstanceOf[js.Any], selectorStepElement = selectorStepElement.asInstanceOf[js.Any], selectorTooltip = selectorTooltip.asInstanceOf[js.Any], selectorTooltipText = selectorTooltipText.asInstanceOf[js.Any], tooltipMaxHeight = tooltipMaxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassComplete]
  }
  
  @scala.inline
  implicit class ClassCompleteOps[Self <: ClassComplete] (val x: Self) extends AnyVal {
    
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
    def setClassComplete(value: String): Self = this.set("classComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassCurrent(value: String): Self = this.set("classCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassIncomplete(value: String): Self = this.set("classIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassOverflowLabel(value: String): Self = this.set("classOverflowLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassStep(value: String): Self = this.set("classStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassTooltipMulti(value: String): Self = this.set("classTooltipMulti", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorComplete(value: String): Self = this.set("selectorComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorCurrent(value: String): Self = this.set("selectorCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorIncomplete(value: String): Self = this.set("selectorIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorLabel(value: String): Self = this.set("selectorLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorStepElement(value: String): Self = this.set("selectorStepElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTooltip(value: String): Self = this.set("selectorTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTooltipText(value: String): Self = this.set("selectorTooltipText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipMaxHeight(value: Double): Self = this.set("tooltipMaxHeight", value.asInstanceOf[js.Any])
  }
}
