package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * The label associated with the event.
    */
  var currentLabel: js.UndefOr[String] = js.undefined
  
  /**
    * The event entities.
    */
  var entities: js.UndefOr[listOfEntities] = js.undefined
  
  /**
    * The event ID.
    */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp that defines when the event under evaluation occurred. The timestamp must be specified using ISO 8601 standard in UTC.
    */
  var eventTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * The event type.
    */
  var eventTypeName: js.UndefOr[String] = js.undefined
  
  /**
    * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their corresponding values for the event you are sending for evaluation.
    */
  var eventVariables: js.UndefOr[EventAttributeMap] = js.undefined
  
  /**
    * The timestamp associated with the label to update. The timestamp must be specified using ISO 8601 standard in UTC.
    */
  var labelTimestamp: js.UndefOr[String] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setCurrentLabel(value: String): Self = StObject.set(x, "currentLabel", value.asInstanceOf[js.Any])
    
    inline def setCurrentLabelUndefined: Self = StObject.set(x, "currentLabel", js.undefined)
    
    inline def setEntities(value: listOfEntities): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setEventTimestamp(value: String): Self = StObject.set(x, "eventTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEventTimestampUndefined: Self = StObject.set(x, "eventTimestamp", js.undefined)
    
    inline def setEventTypeName(value: String): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    inline def setEventVariables(value: EventAttributeMap): Self = StObject.set(x, "eventVariables", value.asInstanceOf[js.Any])
    
    inline def setEventVariablesUndefined: Self = StObject.set(x, "eventVariables", js.undefined)
    
    inline def setLabelTimestamp(value: String): Self = StObject.set(x, "labelTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLabelTimestampUndefined: Self = StObject.set(x, "labelTimestamp", js.undefined)
  }
}
