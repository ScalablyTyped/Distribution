package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventTypeRequest extends js.Object {
  
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
  implicit class PutEventTypeRequestOps[Self <: PutEventTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntityTypesVarargs(value: String*): Self = this.set("entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypes(value: NonEmptyListOfStrings): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventVariablesVarargs(value: String*): Self = this.set("eventVariables", js.Array(value :_*))
    
    @scala.inline
    def setEventVariables(value: NonEmptyListOfStrings): Self = this.set("eventVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: identifier): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: ListOfStrings): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: tagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
