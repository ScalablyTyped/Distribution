package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrialComponentParameterValue extends js.Object {
  
  /**
    * The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't specify the StringValue parameter.
    */
  var NumberValue: js.UndefOr[DoubleParameterValue] = js.native
  
  /**
    * The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't specify the NumberValue parameter.
    */
  var StringValue: js.UndefOr[StringParameterValue] = js.native
}
object TrialComponentParameterValue {
  
  @scala.inline
  def apply(): TrialComponentParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentParameterValue]
  }
  
  @scala.inline
  implicit class TrialComponentParameterValueOps[Self <: TrialComponentParameterValue] (val x: Self) extends AnyVal {
    
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
    def setNumberValue(value: DoubleParameterValue): Self = this.set("NumberValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberValue: Self = this.set("NumberValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: StringParameterValue): Self = this.set("StringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("StringValue", js.undefined)
  }
}
