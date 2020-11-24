package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotDefaultValueSpec extends js.Object {
  
  /**
    * The default values for a slot. You can specify more than one default. For example, you can specify a default value to use from a matching context variable, a session attribute, or a fixed value. The default value chosen is selected based on the order that you specify them in the list. For example, if you specify a context variable and a fixed value in that order, Amazon Lex uses the context variable if it is available, else it uses the fixed value.
    */
  var defaultValueList: SlotDefaultValueList = js.native
}
object SlotDefaultValueSpec {
  
  @scala.inline
  def apply(defaultValueList: SlotDefaultValueList): SlotDefaultValueSpec = {
    val __obj = js.Dynamic.literal(defaultValueList = defaultValueList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDefaultValueSpec]
  }
  
  @scala.inline
  implicit class SlotDefaultValueSpecOps[Self <: SlotDefaultValueSpec] (val x: Self) extends AnyVal {
    
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
    def setDefaultValueListVarargs(value: SlotDefaultValue*): Self = this.set("defaultValueList", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValueList(value: SlotDefaultValueList): Self = this.set("defaultValueList", value.asInstanceOf[js.Any])
  }
}
