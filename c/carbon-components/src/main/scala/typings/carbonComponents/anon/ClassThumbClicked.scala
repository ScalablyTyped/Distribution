package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassThumbClicked extends js.Object {
  
  var classDisabled: String = js.native
  
  var classThumbClicked: String = js.native
  
  var eventAfterSliderValueChange: String = js.native
  
  var eventBeforeSliderValueChange: String = js.native
  
  var selectorFilledTrack: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorInput: String = js.native
  
  var selectorThumb: String = js.native
  
  var selectorTrack: String = js.native
  
  var stepMultiplier: Double = js.native
}
object ClassThumbClicked {
  
  @scala.inline
  def apply(
    classDisabled: String,
    classThumbClicked: String,
    eventAfterSliderValueChange: String,
    eventBeforeSliderValueChange: String,
    selectorFilledTrack: String,
    selectorInit: String,
    selectorInput: String,
    selectorThumb: String,
    selectorTrack: String,
    stepMultiplier: Double
  ): ClassThumbClicked = {
    val __obj = js.Dynamic.literal(classDisabled = classDisabled.asInstanceOf[js.Any], classThumbClicked = classThumbClicked.asInstanceOf[js.Any], eventAfterSliderValueChange = eventAfterSliderValueChange.asInstanceOf[js.Any], eventBeforeSliderValueChange = eventBeforeSliderValueChange.asInstanceOf[js.Any], selectorFilledTrack = selectorFilledTrack.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorInput = selectorInput.asInstanceOf[js.Any], selectorThumb = selectorThumb.asInstanceOf[js.Any], selectorTrack = selectorTrack.asInstanceOf[js.Any], stepMultiplier = stepMultiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassThumbClicked]
  }
  
  @scala.inline
  implicit class ClassThumbClickedOps[Self <: ClassThumbClicked] (val x: Self) extends AnyVal {
    
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
    def setClassDisabled(value: String): Self = this.set("classDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassThumbClicked(value: String): Self = this.set("classThumbClicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventAfterSliderValueChange(value: String): Self = this.set("eventAfterSliderValueChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBeforeSliderValueChange(value: String): Self = this.set("eventBeforeSliderValueChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorFilledTrack(value: String): Self = this.set("selectorFilledTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInput(value: String): Self = this.set("selectorInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorThumb(value: String): Self = this.set("selectorThumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorTrack(value: String): Self = this.set("selectorTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMultiplier(value: Double): Self = this.set("stepMultiplier", value.asInstanceOf[js.Any])
  }
}
