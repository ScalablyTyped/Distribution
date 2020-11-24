package typings.cssSelectorParser.anon

import typings.cssSelectorParser.cssSelectorParserStrings.selector
import typings.cssSelectorParser.selectorMod.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends js.Object {
  
  var value: Selector = js.native
  
  var valueType: selector = js.native
}
object Value {
  
  @scala.inline
  def apply(value: Selector, valueType: selector): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    
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
    def setValue(value: Selector): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueType(value: selector): Self = this.set("valueType", value.asInstanceOf[js.Any])
  }
}
