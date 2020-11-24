package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoricalParameterRangeSpecification extends js.Object {
  
  /**
    * The allowed categories for the hyperparameter.
    */
  var Values: ParameterValues = js.native
}
object CategoricalParameterRangeSpecification {
  
  @scala.inline
  def apply(Values: ParameterValues): CategoricalParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalParameterRangeSpecification]
  }
  
  @scala.inline
  implicit class CategoricalParameterRangeSpecificationOps[Self <: CategoricalParameterRangeSpecification] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: ParameterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: ParameterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
}
