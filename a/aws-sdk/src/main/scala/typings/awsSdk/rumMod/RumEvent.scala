package typings.awsSdk.rumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RumEvent extends StObject {
  
  /**
    * A string containing details about the event.
    */
  var details: JsonValue
  
  /**
    * A unique ID for this event.
    */
  var id: String
  
  /**
    * Metadata about this event, which contains a JSON serialization of the identity of the user for this session. The user information comes from information such as the HTTP user-agent request header and document interface.
    */
  var metadata: js.UndefOr[JsonValue] = js.undefined
  
  /**
    * The exact time that this event occurred.
    */
  var timestamp: js.Date
  
  /**
    * The JSON schema that denotes the type of event this is, such as a page load or a new session.
    */
  var `type`: String
}
object RumEvent {
  
  inline def apply(details: JsonValue, id: String, timestamp: js.Date, `type`: String): RumEvent = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RumEvent]
  }
  
  extension [Self <: RumEvent](x: Self) {
    
    inline def setDetails(value: JsonValue): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: JsonValue): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
