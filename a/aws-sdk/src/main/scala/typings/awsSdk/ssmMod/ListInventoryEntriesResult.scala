package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInventoryEntriesResult extends StObject {
  
  /**
    * The time that inventory information was collected for the managed node(s).
    */
  var CaptureTime: js.UndefOr[InventoryItemCaptureTime] = js.undefined
  
  /**
    * A list of inventory items on the managed node(s).
    */
  var Entries: js.UndefOr[InventoryItemEntryList] = js.undefined
  
  /**
    * The managed node ID targeted by the request to query inventory information.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * The inventory schema version used by the managed node(s).
    */
  var SchemaVersion: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
  
  /**
    * The type of inventory item returned by the request.
    */
  var TypeName: js.UndefOr[InventoryItemTypeName] = js.undefined
}
object ListInventoryEntriesResult {
  
  inline def apply(): ListInventoryEntriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInventoryEntriesResult]
  }
  
  extension [Self <: ListInventoryEntriesResult](x: Self) {
    
    inline def setCaptureTime(value: InventoryItemCaptureTime): Self = StObject.set(x, "CaptureTime", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeUndefined: Self = StObject.set(x, "CaptureTime", js.undefined)
    
    inline def setEntries(value: InventoryItemEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: InventoryItemEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchemaVersion(value: InventoryItemSchemaVersion): Self = StObject.set(x, "SchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "SchemaVersion", js.undefined)
    
    inline def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
