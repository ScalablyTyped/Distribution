package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFleetsRequest extends StObject {
  
  /**
    * The maximum number of results to be included in the next page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.worklinkMod.MaxResults] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.worklinkMod.NextToken] = js.undefined
}
object ListFleetsRequest {
  
  @scala.inline
  def apply(): ListFleetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsRequest]
  }
  
  @scala.inline
  implicit class ListFleetsRequestMutableBuilder[Self <: ListFleetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
