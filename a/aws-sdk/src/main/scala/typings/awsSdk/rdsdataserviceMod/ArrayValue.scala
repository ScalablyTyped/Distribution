package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayValue extends StObject {
  
  /**
    * An array of arrays.
    */
  var arrayValues: js.UndefOr[ArrayOfArray] = js.undefined
  
  /**
    * An array of Boolean values.
    */
  var booleanValues: js.UndefOr[BooleanArray] = js.undefined
  
  /**
    * An array of floating-point numbers.
    */
  var doubleValues: js.UndefOr[DoubleArray] = js.undefined
  
  /**
    * An array of integers.
    */
  var longValues: js.UndefOr[LongArray] = js.undefined
  
  /**
    * An array of strings.
    */
  var stringValues: js.UndefOr[StringArray] = js.undefined
}
object ArrayValue {
  
  inline def apply(): ArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayValue]
  }
  
  extension [Self <: ArrayValue](x: Self) {
    
    inline def setArrayValues(value: ArrayOfArray): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
    
    inline def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
    
    inline def setArrayValuesVarargs(value: ArrayValue*): Self = StObject.set(x, "arrayValues", js.Array(value*))
    
    inline def setBooleanValues(value: BooleanArray): Self = StObject.set(x, "booleanValues", value.asInstanceOf[js.Any])
    
    inline def setBooleanValuesUndefined: Self = StObject.set(x, "booleanValues", js.undefined)
    
    inline def setBooleanValuesVarargs(value: BoxedBoolean*): Self = StObject.set(x, "booleanValues", js.Array(value*))
    
    inline def setDoubleValues(value: DoubleArray): Self = StObject.set(x, "doubleValues", value.asInstanceOf[js.Any])
    
    inline def setDoubleValuesUndefined: Self = StObject.set(x, "doubleValues", js.undefined)
    
    inline def setDoubleValuesVarargs(value: BoxedDouble*): Self = StObject.set(x, "doubleValues", js.Array(value*))
    
    inline def setLongValues(value: LongArray): Self = StObject.set(x, "longValues", value.asInstanceOf[js.Any])
    
    inline def setLongValuesUndefined: Self = StObject.set(x, "longValues", js.undefined)
    
    inline def setLongValuesVarargs(value: BoxedLong*): Self = StObject.set(x, "longValues", js.Array(value*))
    
    inline def setStringValues(value: StringArray): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    inline def setStringValuesUndefined: Self = StObject.set(x, "stringValues", js.undefined)
    
    inline def setStringValuesVarargs(value: String*): Self = StObject.set(x, "stringValues", js.Array(value*))
  }
}
