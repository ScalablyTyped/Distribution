package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSetOptions extends StObject {
  
  /**
    * A value that indicates how a field of DECIMAL type is represented in the response. The value of STRING, the default, specifies that it is converted to a String value. The value of DOUBLE_OR_LONG specifies that it is converted to a Long value if its scale is 0, or to a Double value otherwise.  Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting to String, especially when working with currency values. 
    */
  var decimalReturnType: js.UndefOr[DecimalReturnType] = js.undefined
}
object ResultSetOptions {
  
  @scala.inline
  def apply(): ResultSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetOptions]
  }
  
  @scala.inline
  implicit class ResultSetOptionsMutableBuilder[Self <: ResultSetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimalReturnType(value: DecimalReturnType): Self = StObject.set(x, "decimalReturnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalReturnTypeUndefined: Self = StObject.set(x, "decimalReturnType", js.undefined)
  }
}
