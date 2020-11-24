package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContactListRequest extends js.Object {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName = js.native
  
  /**
    * A description of what the contact list is about.
    */
  var Description: js.UndefOr[typings.awsSdk.sesv2Mod.Description] = js.native
  
  /**
    * An interest group, theme, or label within a list. A contact list can have multiple topics.
    */
  var Topics: js.UndefOr[typings.awsSdk.sesv2Mod.Topics] = js.native
}
object UpdateContactListRequest {
  
  @scala.inline
  def apply(ContactListName: ContactListName): UpdateContactListRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactListRequest]
  }
  
  @scala.inline
  implicit class UpdateContactListRequestOps[Self <: UpdateContactListRequest] (val x: Self) extends AnyVal {
    
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
    def setContactListName(value: ContactListName): Self = this.set("ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: Topic*): Self = this.set("Topics", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: Topics): Self = this.set("Topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopics: Self = this.set("Topics", js.undefined)
  }
}
