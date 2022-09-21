package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeleteEventsByEventTypeStatusResult extends StObject {
  
  /**
    * The event type name.
    */
  var eventTypeName: js.UndefOr[identifier] = js.undefined
  
  /**
    * The deletion status.
    */
  var eventsDeletionStatus: js.UndefOr[AsyncJobStatus] = js.undefined
}
object GetDeleteEventsByEventTypeStatusResult {
  
  inline def apply(): GetDeleteEventsByEventTypeStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeleteEventsByEventTypeStatusResult]
  }
  
  extension [Self <: GetDeleteEventsByEventTypeStatusResult](x: Self) {
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    inline def setEventsDeletionStatus(value: AsyncJobStatus): Self = StObject.set(x, "eventsDeletionStatus", value.asInstanceOf[js.Any])
    
    inline def setEventsDeletionStatusUndefined: Self = StObject.set(x, "eventsDeletionStatus", js.undefined)
  }
}
