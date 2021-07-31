package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactsResponse extends StObject {
  
  /**
    * List of contacts.
    */
  var contactList: js.UndefOr[ContactList] = js.undefined
  
  /**
    * Next token returned in the response of a previous ListContacts call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListContactsResponse {
  
  @scala.inline
  def apply(): ListContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactsResponse]
  }
  
  @scala.inline
  implicit class ListContactsResponseMutableBuilder[Self <: ListContactsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactList(value: ContactList): Self = StObject.set(x, "contactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactListUndefined: Self = StObject.set(x, "contactList", js.undefined)
    
    @scala.inline
    def setContactListVarargs(value: ContactData*): Self = StObject.set(x, "contactList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
