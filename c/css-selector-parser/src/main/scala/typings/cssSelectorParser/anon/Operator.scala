package typings.cssSelectorParser.anon

import typings.cssSelectorParser.selectorMod.AttrValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operator extends js.Object {
  
  var operator: String = js.native
  
  var value: String = js.native
  
  var valueType: AttrValueType = js.native
}
object Operator {
  
  @scala.inline
  def apply(operator: String, value: String, valueType: AttrValueType): Operator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator]
  }
  
  @scala.inline
  implicit class OperatorOps[Self <: Operator] (val x: Self) extends AnyVal {
    
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
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueType(value: AttrValueType): Self = this.set("valueType", value.asInstanceOf[js.Any])
  }
}
