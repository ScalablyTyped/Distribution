package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotFilter extends StObject {
  
  /**
    * The name of the field to filter the list of bots.
    */
  var name: BotFilterName
  
  /**
    * The operator to use for the filter. Specify EQ when the ListBots operation should return only aliases that equal the specified value. Specify CO when the ListBots operation should return aliases that contain the specified value.
    */
  var operator: BotFilterOperator
  
  /**
    * The value to use for filtering the list of bots.
    */
  var values: FilterValues
}
object BotFilter {
  
  inline def apply(name: BotFilterName, operator: BotFilterOperator, values: FilterValues): BotFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotFilter]
  }
  
  extension [Self <: BotFilter](x: Self) {
    
    inline def setName(value: BotFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: BotFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
