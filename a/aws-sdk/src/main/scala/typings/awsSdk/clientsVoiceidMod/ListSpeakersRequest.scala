package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSpeakersRequest extends StObject {
  
  /**
    * The identifier of the domain.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The maximum number of results that are returned per call. You can use NextToken to obtain more pages of results. The default is 100; the maximum allowed page size is also 100. 
    */
  var MaxResults: js.UndefOr[MaxResultsForList] = js.undefined
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsVoiceidMod.NextToken] = js.undefined
}
object ListSpeakersRequest {
  
  inline def apply(DomainId: DomainId): ListSpeakersRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSpeakersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSpeakersRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResultsForList): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
