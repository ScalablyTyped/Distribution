package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventTypeRequest extends StObject {
  
  /**
    * The description of the event type.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The entity type for the event type. Example entity types: customer, merchant, account.
    */
  var entityTypes: NonEmptyListOfStrings = js.native
  
  /**
    * The event type variables.
    */
  var eventVariables: NonEmptyListOfStrings = js.native
  
  /**
    * The event type labels.
    */
  var labels: js.UndefOr[ListOfStrings] = js.native
  
  /**
    * The name.
    */
  var name: identifier = js.native
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
}
object PutEventTypeRequest {
  
  @scala.inline
  def apply(entityTypes: NonEmptyListOfStrings, eventVariables: NonEmptyListOfStrings, name: identifier): PutEventTypeRequest = {
    val __obj = js.Dynamic.literal(entityTypes = entityTypes.asInstanceOf[js.Any], eventVariables = eventVariables.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventTypeRequest]
  }
  
  @scala.inline
  implicit class PutEventTypeRequestMutableBuilder[Self <: PutEventTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntityTypes(value: NonEmptyListOfStrings): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEventVariables(value: NonEmptyListOfStrings): Self = StObject.set(x, "eventVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventVariablesVarargs(value: String*): Self = StObject.set(x, "eventVariables", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: ListOfStrings): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
