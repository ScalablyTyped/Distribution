package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOTAUpdatesRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A token used to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The OTA update job status.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
}
object ListOTAUpdatesRequest {
  
  @scala.inline
  def apply(): ListOTAUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOTAUpdatesRequest]
  }
  
  @scala.inline
  implicit class ListOTAUpdatesRequestMutableBuilder[Self <: ListOTAUpdatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setOtaUpdateStatus(value: OTAUpdateStatus): Self = StObject.set(x, "otaUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdateStatusUndefined: Self = StObject.set(x, "otaUpdateStatus", js.undefined)
  }
}
