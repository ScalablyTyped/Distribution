package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalParameterRangeSpecification extends StObject {
  
  /**
    * The allowed categories for the hyperparameter.
    */
  var Values: ParameterValues
}
object CategoricalParameterRangeSpecification {
  
  @scala.inline
  def apply(Values: ParameterValues): CategoricalParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalParameterRangeSpecification]
  }
  
  @scala.inline
  implicit class CategoricalParameterRangeSpecificationMutableBuilder[Self <: CategoricalParameterRangeSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: ParameterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
