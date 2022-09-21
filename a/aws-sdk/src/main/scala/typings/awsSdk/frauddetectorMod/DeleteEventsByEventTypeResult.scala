package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventsByEventTypeResult extends StObject {
  
  /**
    * Name of event type for which to delete the events.
    */
  var eventTypeName: js.UndefOr[identifier] = js.undefined
  
  /**
    * The status of the delete request.
    */
  var eventsDeletionStatus: js.UndefOr[String] = js.undefined
}
object DeleteEventsByEventTypeResult {
  
  inline def apply(): DeleteEventsByEventTypeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEventsByEventTypeResult]
  }
  
  extension [Self <: DeleteEventsByEventTypeResult](x: Self) {
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    inline def setEventsDeletionStatus(value: String): Self = StObject.set(x, "eventsDeletionStatus", value.asInstanceOf[js.Any])
    
    inline def setEventsDeletionStatusUndefined: Self = StObject.set(x, "eventsDeletionStatus", js.undefined)
  }
}
