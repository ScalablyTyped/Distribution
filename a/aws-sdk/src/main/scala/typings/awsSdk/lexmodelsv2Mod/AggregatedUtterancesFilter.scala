package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedUtterancesFilter extends StObject {
  
  /**
    * The name of the field to filter the utterance list.
    */
  var name: AggregatedUtterancesFilterName
  
  /**
    * The operator to use for the filter. Specify EQ when the ListAggregatedUtterances operation should return only utterances that equal the specified value. Specify CO when the ListAggregatedUtterances operation should return utterances that contain the specified value.
    */
  var operator: AggregatedUtterancesFilterOperator
  
  /**
    * The value to use for filtering the list of bots.
    */
  var values: FilterValues
}
object AggregatedUtterancesFilter {
  
  inline def apply(
    name: AggregatedUtterancesFilterName,
    operator: AggregatedUtterancesFilterOperator,
    values: FilterValues
  ): AggregatedUtterancesFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedUtterancesFilter]
  }
  
  extension [Self <: AggregatedUtterancesFilter](x: Self) {
    
    inline def setName(value: AggregatedUtterancesFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: AggregatedUtterancesFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
