package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListManagementOptions extends StObject {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName = js.native
  
  /**
    * The name of the topic.
    */
  var TopicName: js.UndefOr[typings.awsSdk.sesv2Mod.TopicName] = js.native
}
object ListManagementOptions {
  
  @scala.inline
  def apply(ContactListName: ContactListName): ListManagementOptions = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListManagementOptions]
  }
  
  @scala.inline
  implicit class ListManagementOptionsMutableBuilder[Self <: ListManagementOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "TopicName", js.undefined)
  }
}
