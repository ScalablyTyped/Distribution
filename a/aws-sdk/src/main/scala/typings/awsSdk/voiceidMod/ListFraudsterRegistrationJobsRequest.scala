package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFraudsterRegistrationJobsRequest extends StObject {
  
  /**
    * The identifier of the domain containing the fraudster registration Jobs.
    */
  var DomainId: typings.awsSdk.voiceidMod.DomainId
  
  /**
    * Provides the status of your fraudster registration job.
    */
  var JobStatus: js.UndefOr[FraudsterRegistrationJobStatus] = js.undefined
  
  /**
    * The maximum number of results that are returned per call. You can use NextToken to obtain further pages of results. The default is 100; the maximum allowed page size is also 100. 
    */
  var MaxResults: js.UndefOr[MaxResultsForList] = js.undefined
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.voiceidMod.NextToken] = js.undefined
}
object ListFraudsterRegistrationJobsRequest {
  
  inline def apply(DomainId: DomainId): ListFraudsterRegistrationJobsRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFraudsterRegistrationJobsRequest]
  }
  
  extension [Self <: ListFraudsterRegistrationJobsRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setJobStatus(value: FraudsterRegistrationJobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    inline def setMaxResults(value: MaxResultsForList): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
