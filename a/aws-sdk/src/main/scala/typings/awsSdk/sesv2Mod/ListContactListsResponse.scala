package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactListsResponse extends StObject {
  
  /**
    * The available contact lists.
    */
  var ContactLists: js.UndefOr[ListOfContactLists] = js.native
  
  /**
    * A string token indicating that there might be additional contact lists available to be listed. Copy this token to a subsequent call to ListContactLists with the same parameters to retrieve the next page of contact lists.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
}
object ListContactListsResponse {
  
  @scala.inline
  def apply(): ListContactListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactListsResponse]
  }
  
  @scala.inline
  implicit class ListContactListsResponseMutableBuilder[Self <: ListContactListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactLists(value: ListOfContactLists): Self = StObject.set(x, "ContactLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactListsUndefined: Self = StObject.set(x, "ContactLists", js.undefined)
    
    @scala.inline
    def setContactListsVarargs(value: ContactList*): Self = StObject.set(x, "ContactLists", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
