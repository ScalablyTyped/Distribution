package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportsListItem extends StObject {
  
  /**
    *  The timestamp of the import's creation. 
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The destination event data store. 
    */
  var Destinations: js.UndefOr[ImportDestinations] = js.undefined
  
  /**
    *  The ID of the import. 
    */
  var ImportId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The status of the import. 
    */
  var ImportStatus: js.UndefOr[typings.awsSdk.cloudtrailMod.ImportStatus] = js.undefined
  
  /**
    *  The timestamp of the import's last update. 
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object ImportsListItem {
  
  inline def apply(): ImportsListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportsListItem]
  }
  
  extension [Self <: ImportsListItem](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDestinations(value: ImportDestinations): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: EventDataStoreArn*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setImportId(value: UUID): Self = StObject.set(x, "ImportId", value.asInstanceOf[js.Any])
    
    inline def setImportIdUndefined: Self = StObject.set(x, "ImportId", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "ImportStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "ImportStatus", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
