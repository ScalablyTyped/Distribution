package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProgressUpdateStreamsRequest extends StObject {
  
  /**
    * Filter to limit the maximum number of results to list per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.migrationhubMod.MaxResults] = js.undefined
  
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListProgressUpdateStreamsRequest {
  
  @scala.inline
  def apply(): ListProgressUpdateStreamsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProgressUpdateStreamsRequest]
  }
  
  @scala.inline
  implicit class ListProgressUpdateStreamsRequestMutableBuilder[Self <: ListProgressUpdateStreamsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
