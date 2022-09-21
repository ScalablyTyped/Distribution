package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTaskFilter extends StObject {
  
  /**
    * The name, status, or import task ID for a specific import task.
    */
  var name: js.UndefOr[ImportTaskFilterName] = js.undefined
  
  /**
    * An array of strings that you can provide to match against a specific name, status, or import task ID to filter the results for your import task queries.
    */
  var values: js.UndefOr[ImportTaskFilterValueList] = js.undefined
}
object ImportTaskFilter {
  
  inline def apply(): ImportTaskFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTaskFilter]
  }
  
  extension [Self <: ImportTaskFilter](x: Self) {
    
    inline def setName(value: ImportTaskFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: ImportTaskFilterValueList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: ImportTaskFilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
