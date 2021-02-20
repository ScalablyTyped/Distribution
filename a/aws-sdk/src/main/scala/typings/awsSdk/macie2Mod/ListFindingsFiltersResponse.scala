package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingsFiltersResponse extends StObject {
  
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
  implicit class ListFindingsFiltersResponseMutableBuilder[Self <: ListFindingsFiltersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingsFilterListItems(value: listOfFindingsFilterListItem): Self = StObject.set(x, "findingsFilterListItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsFilterListItemsUndefined: Self = StObject.set(x, "findingsFilterListItems", js.undefined)
    
    @scala.inline
    def setFindingsFilterListItemsVarargs(value: FindingsFilterListItem*): Self = StObject.set(x, "findingsFilterListItems", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
