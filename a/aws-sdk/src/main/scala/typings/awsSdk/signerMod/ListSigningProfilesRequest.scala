package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSigningProfilesRequest extends StObject {
  
  /**
    * Designates whether to include profiles with the status of CANCELED.
    */
  var includeCanceled: js.UndefOr[bool] = js.native
  
  /**
    * The maximum number of profiles to be returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * Value for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListSigningProfilesRequest {
  
  @scala.inline
  def apply(): ListSigningProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningProfilesRequest]
  }
  
  @scala.inline
  implicit class ListSigningProfilesRequestMutableBuilder[Self <: ListSigningProfilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeCanceled(value: bool): Self = StObject.set(x, "includeCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCanceledUndefined: Self = StObject.set(x, "includeCanceled", js.undefined)
    
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
