package typings.cssSelectorParser.anon

import typings.cssSelectorParser.cssSelectorParserStrings.numeric
import typings.cssSelectorParser.cssSelectorParserStrings.string
import typings.cssSelectorParser.cssSelectorParserStrings.substitute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueType extends js.Object {
  
  var value: String = js.native
  
  var valueType: string | substitute | numeric = js.native
}
object ValueType {
  
  @scala.inline
  def apply(value: String, valueType: string | substitute | numeric): ValueType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueType]
  }
  
  @scala.inline
  implicit class ValueTypeOps[Self <: ValueType] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueType(value: string | substitute | numeric): Self = this.set("valueType", value.asInstanceOf[js.Any])
  }
}
