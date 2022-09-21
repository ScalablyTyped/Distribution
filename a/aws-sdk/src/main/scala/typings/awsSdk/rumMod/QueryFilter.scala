package typings.awsSdk.rumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFilter extends StObject {
  
  /**
    * The name of a key to search for. The filter returns only the events that match the Name and Values that you specify.  Valid values for Name are Browser | Device | Country | Page | OS | EventType | Invert 
    */
  var Name: js.UndefOr[QueryFilterKey] = js.undefined
  
  /**
    * The values of the Name that are to be be included in the returned results.
    */
  var Values: js.UndefOr[QueryFilterValueList] = js.undefined
}
object QueryFilter {
  
  inline def apply(): QueryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFilter]
  }
  
  extension [Self <: QueryFilter](x: Self) {
    
    inline def setName(value: QueryFilterKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValues(value: QueryFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: QueryFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
