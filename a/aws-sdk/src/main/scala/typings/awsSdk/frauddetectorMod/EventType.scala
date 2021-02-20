package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventType extends StObject {
  
  /**
    * The entity type ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  
  /**
    * Timestamp of when the event type was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  
  /**
    * The event type description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The event type entity types.
    */
  var entityTypes: js.UndefOr[NonEmptyListOfStrings] = js.native
  
  /**
    * The event type event variables.
    */
  var eventVariables: js.UndefOr[ListOfStrings] = js.native
  
  /**
    * The event type labels.
    */
  var labels: js.UndefOr[ListOfStrings] = js.native
  
  /**
    * Timestamp of when the event type was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  
  /**
    * The event type name.
    */
  var name: js.UndefOr[String] = js.native
}
object EventType {
  
  @scala.inline
  def apply(): EventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventType]
  }
  
  @scala.inline
  implicit class EventTypeMutableBuilder[Self <: EventType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntityTypes(value: NonEmptyListOfStrings): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEventVariables(value: ListOfStrings): Self = StObject.set(x, "eventVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventVariablesUndefined: Self = StObject.set(x, "eventVariables", js.undefined)
    
    @scala.inline
    def setEventVariablesVarargs(value: String*): Self = StObject.set(x, "eventVariables", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: ListOfStrings): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
