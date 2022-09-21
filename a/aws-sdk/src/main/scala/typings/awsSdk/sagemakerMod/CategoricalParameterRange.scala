package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalParameterRange extends StObject {
  
  /**
    * The name of the categorical hyperparameter to tune.
    */
  var Name: ParameterKey
  
  /**
    * A list of the categories for the hyperparameter.
    */
  var Values: ParameterValues
}
object CategoricalParameterRange {
  
  inline def apply(Name: ParameterKey, Values: ParameterValues): CategoricalParameterRange = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalParameterRange]
  }
  
  extension [Self <: CategoricalParameterRange](x: Self) {
    
    inline def setName(value: ParameterKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: ParameterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
