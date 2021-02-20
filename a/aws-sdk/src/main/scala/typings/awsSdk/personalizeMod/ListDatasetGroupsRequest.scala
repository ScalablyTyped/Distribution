package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatasetGroupsRequest extends StObject {
  
  /**
    * The maximum number of dataset groups to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * A token returned from the previous call to ListDatasetGroups for getting the next set of dataset groups (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDatasetGroupsRequest {
  
  @scala.inline
  def apply(): ListDatasetGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetGroupsRequest]
  }
  
  @scala.inline
  implicit class ListDatasetGroupsRequestMutableBuilder[Self <: ListDatasetGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
