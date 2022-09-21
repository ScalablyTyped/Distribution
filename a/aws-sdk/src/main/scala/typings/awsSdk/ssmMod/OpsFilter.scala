package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsFilter extends StObject {
  
  /**
    * The name of the filter.
    */
  var Key: OpsFilterKey
  
  /**
    * The type of filter.
    */
  var Type: js.UndefOr[OpsFilterOperatorType] = js.undefined
  
  /**
    * The filter value.
    */
  var Values: OpsFilterValueList
}
object OpsFilter {
  
  inline def apply(Key: OpsFilterKey, Values: OpsFilterValueList): OpsFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsFilter]
  }
  
  extension [Self <: OpsFilter](x: Self) {
    
    inline def setKey(value: OpsFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setType(value: OpsFilterOperatorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValues(value: OpsFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: OpsFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
