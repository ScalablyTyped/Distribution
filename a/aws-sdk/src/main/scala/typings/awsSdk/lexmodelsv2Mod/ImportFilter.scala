package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportFilter extends StObject {
  
  /**
    * The name of the field to use for filtering.
    */
  var name: ImportFilterName
  
  /**
    * The operator to use for the filter. Specify EQ when the ListImports operation should return only resource types that equal the specified value. Specify CO when the ListImports operation should return resource types that contain the specified value.
    */
  var operator: ImportFilterOperator
  
  /**
    * The values to use to filter the response. The values must be Bot, BotLocale, or CustomVocabulary.
    */
  var values: FilterValues
}
object ImportFilter {
  
  inline def apply(name: ImportFilterName, operator: ImportFilterOperator, values: FilterValues): ImportFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportFilter]
  }
  
  extension [Self <: ImportFilter](x: Self) {
    
    inline def setName(value: ImportFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: ImportFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
