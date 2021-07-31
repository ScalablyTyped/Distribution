package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactsRequest extends StObject {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName
  
  /**
    * A filter that can be applied to a list of contacts.
    */
  var Filter: js.UndefOr[ListContactsFilter] = js.undefined
  
  /**
    * A string token indicating that there might be additional contacts available to be listed. Use the token provided in the Response to use in the subsequent call to ListContacts with the same parameters to retrieve the next page of contacts.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.undefined
  
  /**
    * The number of contacts that may be returned at once, which is dependent on if there are more or less contacts than the value of the PageSize. Use this parameter to paginate results. If additional contacts exist beyond the specified limit, the NextToken element is sent in the response. Use the NextToken value in subsequent requests to retrieve additional contacts.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
}
object ListContactsRequest {
  
  @scala.inline
  def apply(ContactListName: ContactListName): ListContactsRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactsRequest]
  }
  
  @scala.inline
  implicit class ListContactsRequestMutableBuilder[Self <: ListContactsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: ListContactsFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
