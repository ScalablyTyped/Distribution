package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * Specifies a filter expression.
    */
  var Filters: FilterExpressions
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: OneInput
  
  /**
    * The operator used to filter rows by comparing the key value to a specified value.
    */
  var LogicalOperator: FilterLogicalOperator
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
}
object Filter {
  
  inline def apply(
    Filters: FilterExpressions,
    Inputs: OneInput,
    LogicalOperator: FilterLogicalOperator,
    Name: NodeName
  ): Filter = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], LogicalOperator = LogicalOperator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setFilters(value: FilterExpressions): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: FilterExpression*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setLogicalOperator(value: FilterLogicalOperator): Self = StObject.set(x, "LogicalOperator", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
