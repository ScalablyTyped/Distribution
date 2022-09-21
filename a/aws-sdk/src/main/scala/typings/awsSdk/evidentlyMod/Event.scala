package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * The event data.
    */
  var data: JsonValue
  
  /**
    * The timestamp of the event.
    */
  var timestamp: js.Date
  
  /**
    *  aws.evidently.evaluation specifies an evaluation event, which determines which feature variation that a user sees. aws.evidently.custom specifies a custom event, which generates metrics from user actions such as clicks and checkouts.
    */
  var `type`: EventType
}
object Event {
  
  inline def apply(data: JsonValue, timestamp: js.Date, `type`: EventType): Event = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setData(value: JsonValue): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
