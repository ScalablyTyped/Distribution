package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttribContainedCheckboxDisabled extends js.Object {
  
  var attribContainedCheckboxDisabled: String = js.native
  
  var attribContainedCheckboxState: String = js.native
  
  var classLabel: String = js.native
  
  var classLabelFocused: String = js.native
  
  var selectorContainedCheckboxDisabled: String = js.native
  
  var selectorContainedCheckboxState: String = js.native
  
  var selectorInit: String = js.native
}
object AttribContainedCheckboxDisabled {
  
  @scala.inline
  def apply(
    attribContainedCheckboxDisabled: String,
    attribContainedCheckboxState: String,
    classLabel: String,
    classLabelFocused: String,
    selectorContainedCheckboxDisabled: String,
    selectorContainedCheckboxState: String,
    selectorInit: String
  ): AttribContainedCheckboxDisabled = {
    val __obj = js.Dynamic.literal(attribContainedCheckboxDisabled = attribContainedCheckboxDisabled.asInstanceOf[js.Any], attribContainedCheckboxState = attribContainedCheckboxState.asInstanceOf[js.Any], classLabel = classLabel.asInstanceOf[js.Any], classLabelFocused = classLabelFocused.asInstanceOf[js.Any], selectorContainedCheckboxDisabled = selectorContainedCheckboxDisabled.asInstanceOf[js.Any], selectorContainedCheckboxState = selectorContainedCheckboxState.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttribContainedCheckboxDisabled]
  }
  
  @scala.inline
  implicit class AttribContainedCheckboxDisabledOps[Self <: AttribContainedCheckboxDisabled] (val x: Self) extends AnyVal {
    
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
    def setAttribContainedCheckboxDisabled(value: String): Self = this.set("attribContainedCheckboxDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribContainedCheckboxState(value: String): Self = this.set("attribContainedCheckboxState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassLabel(value: String): Self = this.set("classLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassLabelFocused(value: String): Self = this.set("classLabelFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorContainedCheckboxDisabled(value: String): Self = this.set("selectorContainedCheckboxDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorContainedCheckboxState(value: String): Self = this.set("selectorContainedCheckboxState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
  }
}
