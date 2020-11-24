package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingsFiltersResponse extends js.Object {
  
  /**
    * An array of objects, one for each filter that's associated with the account.
    */
  var findingsFilterListItems: js.UndefOr[listOfFindingsFilterListItem] = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}
object ListFindingsFiltersResponse {
  
  @scala.inline
  def apply(): ListFindingsFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsFiltersResponse]
  }
  
  @scala.inline
  implicit class ListFindingsFiltersResponseOps[Self <: ListFindingsFiltersResponse] (val x: Self) extends AnyVal {
    
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
    def setFindingsFilterListItemsVarargs(value: FindingsFilterListItem*): Self = this.set("findingsFilterListItems", js.Array(value :_*))
    
    @scala.inline
    def setFindingsFilterListItems(value: listOfFindingsFilterListItem): Self = this.set("findingsFilterListItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindingsFilterListItems: Self = this.set("findingsFilterListItems", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
