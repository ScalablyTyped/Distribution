package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryFilter extends StObject {
  
  /**
    * The name of the filter key.
    */
  var Key: InventoryFilterKey
  
  /**
    * The type of filter.  The Exists filter must be used with aggregators. For more information, see Aggregating inventory data in the Amazon Web Services Systems Manager User Guide. 
    */
  var Type: js.UndefOr[InventoryQueryOperatorType] = js.undefined
  
  /**
    * Inventory filter values. Example: inventory filter where managed node IDs are specified as values Key=AWS:InstanceInformation.InstanceId,Values= i-a12b3c4d5e6g, i-1a2b3c4d5e6,Type=Equal. 
    */
  var Values: InventoryFilterValueList
}
object InventoryFilter {
  
  inline def apply(Key: InventoryFilterKey, Values: InventoryFilterValueList): InventoryFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
  
  extension [Self <: InventoryFilter](x: Self) {
    
    inline def setKey(value: InventoryFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setType(value: InventoryQueryOperatorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValues(value: InventoryFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: InventoryFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
