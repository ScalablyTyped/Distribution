package typings.awsSdk2Types.clientsRdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSetOptions extends StObject {
  
  /**
    * A value that indicates how a field of DECIMAL type is represented in the response. The value of STRING, the default, specifies that it is converted to a String value. The value of DOUBLE_OR_LONG specifies that it is converted to a Long value if its scale is 0, or to a Double value otherwise.  Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting to String, especially when working with currency values. 
    */
  var decimalReturnType: js.UndefOr[DecimalReturnType] = js.undefined
  
  /**
    * A value that indicates how a field of LONG type is represented. Allowed values are LONG and STRING. The default is LONG. Specify STRING if the length or precision of numeric values might cause truncation or rounding errors. 
    */
  var longReturnType: js.UndefOr[LongReturnType] = js.undefined
}
object ResultSetOptions {
  
  inline def apply(): ResultSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultSetOptions] (val x: Self) extends AnyVal {
    
    inline def setDecimalReturnType(value: DecimalReturnType): Self = StObject.set(x, "decimalReturnType", value.asInstanceOf[js.Any])
    
    inline def setDecimalReturnTypeUndefined: Self = StObject.set(x, "decimalReturnType", js.undefined)
    
    inline def setLongReturnType(value: LongReturnType): Self = StObject.set(x, "longReturnType", value.asInstanceOf[js.Any])
    
    inline def setLongReturnTypeUndefined: Self = StObject.set(x, "longReturnType", js.undefined)
  }
}
