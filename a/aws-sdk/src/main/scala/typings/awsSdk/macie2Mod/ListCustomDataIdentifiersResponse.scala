package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCustomDataIdentifiersResponse extends StObject {
  
  /**
    * An array of objects, one for each custom data identifier.
    */
  var items: js.UndefOr[listOfCustomDataIdentifierSummary] = js.native
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.native
}
object ListCustomDataIdentifiersResponse {
  
  @scala.inline
  def apply(): ListCustomDataIdentifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomDataIdentifiersResponse]
  }
  
  @scala.inline
  implicit class ListCustomDataIdentifiersResponseMutableBuilder[Self <: ListCustomDataIdentifiersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: listOfCustomDataIdentifierSummary): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CustomDataIdentifierSummary*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
