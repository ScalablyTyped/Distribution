package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedValue extends StObject {
  
  /**
    * The value of the date, written as Year-Month-DayTHour:Minute:Second.
    */
  var Value: js.UndefOr[String] = js.undefined
  
  /**
    * The normalized type of the value detected. In this case, DATE.
    */
  var ValueType: js.UndefOr[typings.awsSdk.clientsTextractMod.ValueType] = js.undefined
}
object NormalizedValue {
  
  inline def apply(): NormalizedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizedValue] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: ValueType): Self = StObject.set(x, "ValueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "ValueType", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
