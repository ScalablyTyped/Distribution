package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticValue extends StObject {
  
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
  implicit class StaticValueMutableBuilder[Self <: StaticValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: StaticParameterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
