package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableValue extends StObject {
  
  /**
    * If this feature uses the Boolean variation type, this field contains the Boolean value of this variation.
    */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If this feature uses the double integer variation type, this field contains the double integer value of this variation.
    */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /**
    * If this feature uses the long variation type, this field contains the long value of this variation.
    */
  var longValue: js.UndefOr[VariableValueLongValueLong] = js.undefined
  
  /**
    * If this feature uses the string variation type, this field contains the string value of this variation.
    */
  var stringValue: js.UndefOr[VariableValueStringValueString] = js.undefined
}
object VariableValue {
  
  inline def apply(): VariableValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableValue]
  }
  
  extension [Self <: VariableValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setLongValue(value: VariableValueLongValueLong): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    inline def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    inline def setStringValue(value: VariableValueStringValueString): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
