package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticValue extends js.Object {
  
  /**
    * A list of values. For example, the ARN of the assumed role. 
    */
  var Values: StaticParameterValues = js.native
}
object StaticValue {
  
  @scala.inline
  def apply(Values: StaticParameterValues): StaticValue = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticValue]
  }
  
  @scala.inline
  implicit class StaticValueOps[Self <: StaticValue] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: StringWithCharLimit256*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: StaticParameterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
}
