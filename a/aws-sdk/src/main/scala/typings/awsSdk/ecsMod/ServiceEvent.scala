package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEvent extends StObject {
  
  /**
    * The Unix timestamp for when the event was triggered.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ID string of the event.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The event message.
    */
  var message: js.UndefOr[String] = js.undefined
}
object ServiceEvent {
  
  inline def apply(): ServiceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceEvent]
  }
  
  extension [Self <: ServiceEvent](x: Self) {
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
