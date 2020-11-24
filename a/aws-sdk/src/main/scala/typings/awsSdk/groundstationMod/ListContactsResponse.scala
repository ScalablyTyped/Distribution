package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactsResponse extends js.Object {
  
  /**
    * List of contacts.
    */
  var contactList: js.UndefOr[ContactList] = js.native
  
  /**
    * Next token returned in the response of a previous ListContacts call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListContactsResponse {
  
  @scala.inline
  def apply(): ListContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactsResponse]
  }
  
  @scala.inline
  implicit class ListContactsResponseOps[Self <: ListContactsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContactListVarargs(value: ContactData*): Self = this.set("contactList", js.Array(value :_*))
    
    @scala.inline
    def setContactList(value: ContactList): Self = this.set("contactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactList: Self = this.set("contactList", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
