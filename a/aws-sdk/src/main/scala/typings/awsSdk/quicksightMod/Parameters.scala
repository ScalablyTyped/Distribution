package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters extends StObject {
  
  /**
    * Date-time parameters.
    */
  var DateTimeParameters: js.UndefOr[DateTimeParameterList] = js.native
  
  /**
    * Decimal parameters.
    */
  var DecimalParameters: js.UndefOr[DecimalParameterList] = js.native
  
  /**
    * Integer parameters.
    */
  var IntegerParameters: js.UndefOr[IntegerParameterList] = js.native
  
  /**
    * String parameters.
    */
  var StringParameters: js.UndefOr[StringParameterList] = js.native
}
object Parameters {
  
  @scala.inline
  def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateTimeParameters(value: DateTimeParameterList): Self = StObject.set(x, "DateTimeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeParametersUndefined: Self = StObject.set(x, "DateTimeParameters", js.undefined)
    
    @scala.inline
    def setDateTimeParametersVarargs(value: DateTimeParameter*): Self = StObject.set(x, "DateTimeParameters", js.Array(value :_*))
    
    @scala.inline
    def setDecimalParameters(value: DecimalParameterList): Self = StObject.set(x, "DecimalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalParametersUndefined: Self = StObject.set(x, "DecimalParameters", js.undefined)
    
    @scala.inline
    def setDecimalParametersVarargs(value: DecimalParameter*): Self = StObject.set(x, "DecimalParameters", js.Array(value :_*))
    
    @scala.inline
    def setIntegerParameters(value: IntegerParameterList): Self = StObject.set(x, "IntegerParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerParametersUndefined: Self = StObject.set(x, "IntegerParameters", js.undefined)
    
    @scala.inline
    def setIntegerParametersVarargs(value: IntegerParameter*): Self = StObject.set(x, "IntegerParameters", js.Array(value :_*))
    
    @scala.inline
    def setStringParameters(value: StringParameterList): Self = StObject.set(x, "StringParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringParametersUndefined: Self = StObject.set(x, "StringParameters", js.undefined)
    
    @scala.inline
    def setStringParametersVarargs(value: StringParameter*): Self = StObject.set(x, "StringParameters", js.Array(value :_*))
  }
}
