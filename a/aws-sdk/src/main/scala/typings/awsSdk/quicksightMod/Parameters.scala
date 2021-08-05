package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  /**
    * Date-time parameters.
    */
  var DateTimeParameters: js.UndefOr[DateTimeParameterList] = js.undefined
  
  /**
    * Decimal parameters.
    */
  var DecimalParameters: js.UndefOr[DecimalParameterList] = js.undefined
  
  /**
    * Integer parameters.
    */
  var IntegerParameters: js.UndefOr[IntegerParameterList] = js.undefined
  
  /**
    * String parameters.
    */
  var StringParameters: js.UndefOr[StringParameterList] = js.undefined
}
object Parameters {
  
  inline def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setDateTimeParameters(value: DateTimeParameterList): Self = StObject.set(x, "DateTimeParameters", value.asInstanceOf[js.Any])
    
    inline def setDateTimeParametersUndefined: Self = StObject.set(x, "DateTimeParameters", js.undefined)
    
    inline def setDateTimeParametersVarargs(value: DateTimeParameter*): Self = StObject.set(x, "DateTimeParameters", js.Array(value :_*))
    
    inline def setDecimalParameters(value: DecimalParameterList): Self = StObject.set(x, "DecimalParameters", value.asInstanceOf[js.Any])
    
    inline def setDecimalParametersUndefined: Self = StObject.set(x, "DecimalParameters", js.undefined)
    
    inline def setDecimalParametersVarargs(value: DecimalParameter*): Self = StObject.set(x, "DecimalParameters", js.Array(value :_*))
    
    inline def setIntegerParameters(value: IntegerParameterList): Self = StObject.set(x, "IntegerParameters", value.asInstanceOf[js.Any])
    
    inline def setIntegerParametersUndefined: Self = StObject.set(x, "IntegerParameters", js.undefined)
    
    inline def setIntegerParametersVarargs(value: IntegerParameter*): Self = StObject.set(x, "IntegerParameters", js.Array(value :_*))
    
    inline def setStringParameters(value: StringParameterList): Self = StObject.set(x, "StringParameters", value.asInstanceOf[js.Any])
    
    inline def setStringParametersUndefined: Self = StObject.set(x, "StringParameters", js.undefined)
    
    inline def setStringParametersVarargs(value: StringParameter*): Self = StObject.set(x, "StringParameters", js.Array(value :_*))
  }
}
