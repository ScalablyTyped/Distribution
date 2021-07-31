package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTerminologiesRequest extends StObject {
  
  /**
    * The maximum number of custom terminologies returned per list request.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * If the result of the request to ListTerminologies was truncated, include the NextToken to fetch the next group of custom terminologies. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.translateMod.NextToken] = js.undefined
}
object ListTerminologiesRequest {
  
  @scala.inline
  def apply(): ListTerminologiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTerminologiesRequest]
  }
  
  @scala.inline
  implicit class ListTerminologiesRequestMutableBuilder[Self <: ListTerminologiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
