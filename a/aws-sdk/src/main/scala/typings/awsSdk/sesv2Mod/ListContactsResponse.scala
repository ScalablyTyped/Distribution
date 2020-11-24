package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactsResponse extends js.Object {
  
  /**
    * The contacts present in a specific contact list.
    */
  var Contacts: js.UndefOr[ListOfContacts] = js.native
  
  /**
    * A string token indicating that there might be additional contacts available to be listed. Copy this token to a subsequent call to ListContacts with the same parameters to retrieve the next page of contacts.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContactsVarargs(value: Contact*): Self = this.set("Contacts", js.Array(value :_*))
    
    @scala.inline
    def setContacts(value: ListOfContacts): Self = this.set("Contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContacts: Self = this.set("Contacts", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
