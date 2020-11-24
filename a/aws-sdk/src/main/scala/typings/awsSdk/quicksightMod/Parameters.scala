package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters extends js.Object {
  
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
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDateTimeParametersVarargs(value: DateTimeParameter*): Self = this.set("DateTimeParameters", js.Array(value :_*))
    
    @scala.inline
    def setDateTimeParameters(value: DateTimeParameterList): Self = this.set("DateTimeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateTimeParameters: Self = this.set("DateTimeParameters", js.undefined)
    
    @scala.inline
    def setDecimalParametersVarargs(value: DecimalParameter*): Self = this.set("DecimalParameters", js.Array(value :_*))
    
    @scala.inline
    def setDecimalParameters(value: DecimalParameterList): Self = this.set("DecimalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalParameters: Self = this.set("DecimalParameters", js.undefined)
    
    @scala.inline
    def setIntegerParametersVarargs(value: IntegerParameter*): Self = this.set("IntegerParameters", js.Array(value :_*))
    
    @scala.inline
    def setIntegerParameters(value: IntegerParameterList): Self = this.set("IntegerParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerParameters: Self = this.set("IntegerParameters", js.undefined)
    
    @scala.inline
    def setStringParametersVarargs(value: StringParameter*): Self = this.set("StringParameters", js.Array(value :_*))
    
    @scala.inline
    def setStringParameters(value: StringParameterList): Self = this.set("StringParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringParameters: Self = this.set("StringParameters", js.undefined)
  }
}
