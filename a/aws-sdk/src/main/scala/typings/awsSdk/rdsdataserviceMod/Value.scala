package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends StObject {
  
  /**
    * An array of column values.
    */
  var arrayValues: js.UndefOr[ArrayValueList] = js.native
  
  /**
    * A value for a column of big integer data type.
    */
  var bigIntValue: js.UndefOr[BoxedLong] = js.native
  
  /**
    * A value for a column of BIT data type.
    */
  var bitValue: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * A value for a column of BLOB data type.
    */
  var blobValue: js.UndefOr[_Blob] = js.native
  
  /**
    * A value for a column of double data type.
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.native
  
  /**
    * A value for a column of integer data type.
    */
  var intValue: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * A NULL value.
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.native
  
  /**
    * A value for a column of real data type.
    */
  var realValue: js.UndefOr[BoxedFloat] = js.native
  
  /**
    * A value for a column of string data type.
    */
  var stringValue: js.UndefOr[String] = js.native
  
  /**
    * A value for a column of STRUCT data type.
    */
  var structValue: js.UndefOr[StructValue] = js.native
}
object Value {
  
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayValues(value: ArrayValueList): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
    
    @scala.inline
    def setArrayValuesVarargs(value: Value*): Self = StObject.set(x, "arrayValues", js.Array(value :_*))
    
    @scala.inline
    def setBigIntValue(value: BoxedLong): Self = StObject.set(x, "bigIntValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIntValueUndefined: Self = StObject.set(x, "bigIntValue", js.undefined)
    
    @scala.inline
    def setBitValue(value: BoxedBoolean): Self = StObject.set(x, "bitValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitValueUndefined: Self = StObject.set(x, "bitValue", js.undefined)
    
    @scala.inline
    def setBlobValue(value: _Blob): Self = StObject.set(x, "blobValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobValueUndefined: Self = StObject.set(x, "blobValue", js.undefined)
    
    @scala.inline
    def setDoubleValue(value: BoxedDouble): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    @scala.inline
    def setIntValue(value: BoxedInteger): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    @scala.inline
    def setIsNull(value: BoxedBoolean): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNullUndefined: Self = StObject.set(x, "isNull", js.undefined)
    
    @scala.inline
    def setRealValue(value: BoxedFloat): Self = StObject.set(x, "realValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealValueUndefined: Self = StObject.set(x, "realValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    @scala.inline
    def setStructValue(value: StructValue): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructValueUndefined: Self = StObject.set(x, "structValue", js.undefined)
  }
}
