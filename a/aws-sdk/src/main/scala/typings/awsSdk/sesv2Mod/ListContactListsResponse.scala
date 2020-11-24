package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactListsResponse extends js.Object {
  
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
  implicit class ListContactListsResponseOps[Self <: ListContactListsResponse] (val x: Self) extends AnyVal {
    
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
    def setContactListsVarargs(value: ContactList*): Self = this.set("ContactLists", js.Array(value :_*))
    
    @scala.inline
    def setContactLists(value: ListOfContactLists): Self = this.set("ContactLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactLists: Self = this.set("ContactLists", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
