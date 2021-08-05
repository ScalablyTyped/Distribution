package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventType extends StObject {
  
  /**
    * The entity type ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * Timestamp of when the event type was created.
    */
  var createdTime: js.UndefOr[time] = js.undefined
  
  /**
    * The event type description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.undefined
  
  /**
    * The event type entity types.
    */
  var entityTypes: js.UndefOr[NonEmptyListOfStrings] = js.undefined
  
  /**
    * The event type event variables.
    */
  var eventVariables: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    * The event type labels.
    */
  var labels: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    * Timestamp of when the event type was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.undefined
  
  /**
    * The event type name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object EventType {
  
  inline def apply(): EventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventType]
  }
  
  extension [Self <: EventType](x: Self) {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityTypes(value: NonEmptyListOfStrings): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    inline def setEventVariables(value: ListOfStrings): Self = StObject.set(x, "eventVariables", value.asInstanceOf[js.Any])
    
    inline def setEventVariablesUndefined: Self = StObject.set(x, "eventVariables", js.undefined)
    
    inline def setEventVariablesVarargs(value: String*): Self = StObject.set(x, "eventVariables", js.Array(value :_*))
    
    inline def setLabels(value: ListOfStrings): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    inline def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
