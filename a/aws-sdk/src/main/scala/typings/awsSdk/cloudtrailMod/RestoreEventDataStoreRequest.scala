package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreEventDataStoreRequest extends StObject {
  
  /**
    * The ARN (or the ID suffix of the ARN) of the event data store that you want to restore.
    */
  var EventDataStore: EventDataStoreArn
}
object RestoreEventDataStoreRequest {
  
  inline def apply(EventDataStore: EventDataStoreArn): RestoreEventDataStoreRequest = {
    val __obj = js.Dynamic.literal(EventDataStore = EventDataStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreEventDataStoreRequest]
  }
  
  extension [Self <: RestoreEventDataStoreRequest](x: Self) {
    
    inline def setEventDataStore(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStore", value.asInstanceOf[js.Any])
  }
}
