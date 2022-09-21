package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.event_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Server-initiated event message
  */
trait Event
  extends StObject
     with Message {
  
  /**
    * Event-specific information
    */
  var body: js.UndefOr[Any] = js.undefined
  
  /**
    * Name of event
    */
  var event: String
  
  @JSName("type")
  var type_Event: event_
}
object Event {
  
  inline def apply(event: String, seq: Double): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: event_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
