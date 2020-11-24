package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactList extends js.Object {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: js.UndefOr[typings.awsSdk.sesv2Mod.ContactListName] = js.native
  
  /**
    * A timestamp noting the last time the contact list was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
}
object ContactList {
  
  @scala.inline
  def apply(): ContactList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactList]
  }
  
  @scala.inline
  implicit class ContactListOps[Self <: ContactList] (val x: Self) extends AnyVal {
    
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
    def deleteContactListName: Self = this.set("ContactListName", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = this.set("LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("LastUpdatedTimestamp", js.undefined)
  }
}
