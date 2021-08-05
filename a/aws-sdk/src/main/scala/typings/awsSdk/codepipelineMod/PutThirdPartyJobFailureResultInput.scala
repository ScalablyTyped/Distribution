package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutThirdPartyJobFailureResultInput extends StObject {
  
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientToken: ClientToken
  
  /**
    * Represents information about failure details.
    */
  var failureDetails: FailureDetails
  
  /**
    * The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
    */
  var jobId: ThirdPartyJobId
}
object PutThirdPartyJobFailureResultInput {
  
  inline def apply(clientToken: ClientToken, failureDetails: FailureDetails, jobId: ThirdPartyJobId): PutThirdPartyJobFailureResultInput = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], failureDetails = failureDetails.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutThirdPartyJobFailureResultInput]
  }
  
  extension [Self <: PutThirdPartyJobFailureResultInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setFailureDetails(value: FailureDetails): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: ThirdPartyJobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
