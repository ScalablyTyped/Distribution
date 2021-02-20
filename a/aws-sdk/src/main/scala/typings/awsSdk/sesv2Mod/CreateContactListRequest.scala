package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContactListRequest extends StObject {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName = js.native
  
  /**
    * A description of what the contact list is about.
    */
  var Description: js.UndefOr[typings.awsSdk.sesv2Mod.Description] = js.native
  
  /**
    * The tags associated with a contact list.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * An interest group, theme, or label within a list. A contact list can have multiple topics.
    */
  var Topics: js.UndefOr[typings.awsSdk.sesv2Mod.Topics] = js.native
}
object CreateContactListRequest {
  
  @scala.inline
  def apply(ContactListName: ContactListName): CreateContactListRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactListRequest]
  }
  
  @scala.inline
  implicit class CreateContactListRequestMutableBuilder[Self <: CreateContactListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: Topics): Self = StObject.set(x, "Topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "Topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: Topic*): Self = StObject.set(x, "Topics", js.Array(value :_*))
  }
}
