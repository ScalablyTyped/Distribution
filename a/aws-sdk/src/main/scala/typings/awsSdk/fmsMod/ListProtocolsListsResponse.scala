package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProtocolsListsResponse extends StObject {
  
  /**
    * If you specify a value for MaxResults in your list request, and you have more objects than the maximum, AWS Firewall Manager returns this token in the response. You can use this token in subsequent requests to retrieve the next batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An array of ProtocolsListDataSummary objects.
    */
  var ProtocolsLists: js.UndefOr[ProtocolsListsData] = js.native
}
object ListProtocolsListsResponse {
  
  @scala.inline
  def apply(): ListProtocolsListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtocolsListsResponse]
  }
  
  @scala.inline
  implicit class ListProtocolsListsResponseMutableBuilder[Self <: ListProtocolsListsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProtocolsLists(value: ProtocolsListsData): Self = StObject.set(x, "ProtocolsLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsListsUndefined: Self = StObject.set(x, "ProtocolsLists", js.undefined)
    
    @scala.inline
    def setProtocolsListsVarargs(value: ProtocolsListDataSummary*): Self = StObject.set(x, "ProtocolsLists", js.Array(value :_*))
  }
}
