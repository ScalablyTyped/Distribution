package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFraudsterRegistrationJobsResponse extends StObject {
  
  /**
    * A list containing details about each specified fraudster registration job.
    */
  var JobSummaries: js.UndefOr[FraudsterRegistrationJobSummaries] = js.undefined
  
  /**
    * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFraudsterRegistrationJobsResponse {
  
  inline def apply(): ListFraudsterRegistrationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFraudsterRegistrationJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFraudsterRegistrationJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobSummaries(value: FraudsterRegistrationJobSummaries): Self = StObject.set(x, "JobSummaries", value.asInstanceOf[js.Any])
    
    inline def setJobSummariesUndefined: Self = StObject.set(x, "JobSummaries", js.undefined)
    
    inline def setJobSummariesVarargs(value: FraudsterRegistrationJobSummary*): Self = StObject.set(x, "JobSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
