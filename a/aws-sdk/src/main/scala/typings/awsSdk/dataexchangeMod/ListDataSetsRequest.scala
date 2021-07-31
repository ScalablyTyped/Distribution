package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataSetsRequest extends StObject {
  
  /**
    * The maximum number of results returned by a single call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.dataexchangeMod.MaxResults] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers).
    */
  var Origin: js.UndefOr[string] = js.undefined
}
object ListDataSetsRequest {
  
  @scala.inline
  def apply(): ListDataSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSetsRequest]
  }
  
  @scala.inline
  implicit class ListDataSetsRequestMutableBuilder[Self <: ListDataSetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrigin(value: string): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
  }
}
