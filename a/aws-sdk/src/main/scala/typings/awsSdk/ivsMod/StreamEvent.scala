package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamEvent extends StObject {
  
  /**
    * Time when the event occurred. This is an ISO 8601 timestamp; note that this is returned as a string.
    */
  var eventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Name that identifies the stream event within a type.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Logical group for certain events.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object StreamEvent {
  
  inline def apply(): StreamEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamEvent]
  }
  
  extension [Self <: StreamEvent](x: Self) {
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
