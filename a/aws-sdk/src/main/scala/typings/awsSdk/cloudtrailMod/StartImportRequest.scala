package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImportRequest extends StObject {
  
  /**
    *  The destination event data store. Use this parameter for a new import. 
    */
  var Destinations: js.UndefOr[ImportDestinations] = js.undefined
  
  /**
    *  Use with StartEventTime to bound a StartImport request, and limit imported trail events to only those events logged within a specified time period. 
    */
  var EndEventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ID of the import. Use this parameter when you are retrying an import. 
    */
  var ImportId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The source S3 bucket for the import. Use this parameter for a new import. 
    */
  var ImportSource: js.UndefOr[typings.awsSdk.cloudtrailMod.ImportSource] = js.undefined
  
  /**
    *  Use with EndEventTime to bound a StartImport request, and limit imported trail events to only those events logged within a specified time period. 
    */
  var StartEventTime: js.UndefOr[js.Date] = js.undefined
}
object StartImportRequest {
  
  inline def apply(): StartImportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImportRequest]
  }
  
  extension [Self <: StartImportRequest](x: Self) {
    
    inline def setDestinations(value: ImportDestinations): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: EventDataStoreArn*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setEndEventTime(value: js.Date): Self = StObject.set(x, "EndEventTime", value.asInstanceOf[js.Any])
    
    inline def setEndEventTimeUndefined: Self = StObject.set(x, "EndEventTime", js.undefined)
    
    inline def setImportId(value: UUID): Self = StObject.set(x, "ImportId", value.asInstanceOf[js.Any])
    
    inline def setImportIdUndefined: Self = StObject.set(x, "ImportId", js.undefined)
    
    inline def setImportSource(value: ImportSource): Self = StObject.set(x, "ImportSource", value.asInstanceOf[js.Any])
    
    inline def setImportSourceUndefined: Self = StObject.set(x, "ImportSource", js.undefined)
    
    inline def setStartEventTime(value: js.Date): Self = StObject.set(x, "StartEventTime", value.asInstanceOf[js.Any])
    
    inline def setStartEventTimeUndefined: Self = StObject.set(x, "StartEventTime", js.undefined)
  }
}
