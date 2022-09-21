package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventDataStoreRequest extends StObject {
  
  /**
    * The ARN (or ID suffix of the ARN) of the event data store about which you want information.
    */
  var EventDataStore: EventDataStoreArn
}
object GetEventDataStoreRequest {
  
  inline def apply(EventDataStore: EventDataStoreArn): GetEventDataStoreRequest = {
    val __obj = js.Dynamic.literal(EventDataStore = EventDataStore.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventDataStoreRequest]
  }
  
  extension [Self <: GetEventDataStoreRequest](x: Self) {
    
    inline def setEventDataStore(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStore", value.asInstanceOf[js.Any])
  }
}
