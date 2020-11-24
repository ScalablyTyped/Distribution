package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotDefaultValue extends js.Object {
  
  /**
    * The default value for the slot. You can specify one of the following:    #context-name.slot-name - The slot value "slot-name" in the context "context-name."    {attribute} - The slot value of the session attribute "attribute."    'value' - The discrete value "value."  
    */
  var defaultValue: SlotDefaultValueString = js.native
}
object SlotDefaultValue {
  
  @scala.inline
  def apply(defaultValue: SlotDefaultValueString): SlotDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDefaultValue]
  }
  
  @scala.inline
  implicit class SlotDefaultValueOps[Self <: SlotDefaultValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultValue(value: SlotDefaultValueString): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
  }
}
