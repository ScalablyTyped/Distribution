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
  
  inline def apply(Values: ParameterValues): CategoricalParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalParameterRangeSpecification]
  }
  
  extension [Self <: CategoricalParameterRangeSpecification](x: Self) {
    
    inline def setValues(value: ParameterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
