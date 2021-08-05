package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItemFilter extends StObject {
  
  /**
    * The name of the filter.
    */
  var Key: OpsItemFilterKey
  
  /**
    * The operator used by the filter call.
    */
  var Operator: OpsItemFilterOperator
  
  /**
    * The filter value.
    */
  var Values: OpsItemFilterValues
}
object OpsItemFilter {
  
  inline def apply(Key: OpsItemFilterKey, Operator: OpsItemFilterOperator, Values: OpsItemFilterValues): OpsItemFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsItemFilter]
  }
  
  extension [Self <: OpsItemFilter](x: Self) {
    
    inline def setKey(value: OpsItemFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: OpsItemFilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: OpsItemFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: OpsItemFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
