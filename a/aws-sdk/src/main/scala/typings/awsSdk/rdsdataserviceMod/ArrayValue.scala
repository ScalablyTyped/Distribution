package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayValue extends StObject {
  
  /**
    * An array of arrays.
    */
  var arrayValues: js.UndefOr[ArrayOfArray] = js.native
  
  /**
    * An array of Boolean values.
    */
  var booleanValues: js.UndefOr[BooleanArray] = js.native
  
  /**
    * An array of integers.
    */
  var doubleValues: js.UndefOr[DoubleArray] = js.native
  
  /**
    * An array of floating point numbers.
    */
  var longValues: js.UndefOr[LongArray] = js.native
  
  /**
    * An array of strings.
    */
  var stringValues: js.UndefOr[StringArray] = js.native
}
object ArrayValue {
  
  @scala.inline
  def apply(): ArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayValue]
  }
  
  @scala.inline
  implicit class ArrayValueMutableBuilder[Self <: ArrayValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayValues(value: ArrayOfArray): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
    
    @scala.inline
    def setArrayValuesVarargs(value: ArrayValue*): Self = StObject.set(x, "arrayValues", js.Array(value :_*))
    
    @scala.inline
    def setBooleanValues(value: BooleanArray): Self = StObject.set(x, "booleanValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValuesUndefined: Self = StObject.set(x, "booleanValues", js.undefined)
    
    @scala.inline
    def setBooleanValuesVarargs(value: BoxedBoolean*): Self = StObject.set(x, "booleanValues", js.Array(value :_*))
    
    @scala.inline
    def setDoubleValues(value: DoubleArray): Self = StObject.set(x, "doubleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValuesUndefined: Self = StObject.set(x, "doubleValues", js.undefined)
    
    @scala.inline
    def setDoubleValuesVarargs(value: BoxedDouble*): Self = StObject.set(x, "doubleValues", js.Array(value :_*))
    
    @scala.inline
    def setLongValues(value: LongArray): Self = StObject.set(x, "longValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValuesUndefined: Self = StObject.set(x, "longValues", js.undefined)
    
    @scala.inline
    def setLongValuesVarargs(value: BoxedLong*): Self = StObject.set(x, "longValues", js.Array(value :_*))
    
    @scala.inline
    def setStringValues(value: StringArray): Self = StObject.set(x, "stringValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValuesUndefined: Self = StObject.set(x, "stringValues", js.undefined)
    
    @scala.inline
    def setStringValuesVarargs(value: String*): Self = StObject.set(x, "stringValues", js.Array(value :_*))
  }
}
