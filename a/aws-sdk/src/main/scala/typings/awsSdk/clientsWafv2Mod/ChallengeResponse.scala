package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeResponse extends StObject {
  
  /**
    * The reason for failure, populated when the evaluation of the token fails.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsWafv2Mod.FailureReason] = js.undefined
  
  /**
    * The HTTP response code indicating the status of the challenge token in the web request. If the token is missing, invalid, or expired, this code is 202 Request Accepted.
    */
  var ResponseCode: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ResponseCode] = js.undefined
  
  /**
    * The time that the challenge was last solved for the supplied token. 
    */
  var SolveTimestamp: js.UndefOr[typings.awsSdk.clientsWafv2Mod.SolveTimestamp] = js.undefined
}
object ChallengeResponse {
  
  inline def apply(): ChallengeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChallengeResponse]
  }
  
  extension [Self <: ChallengeResponse](x: Self) {
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setResponseCode(value: ResponseCode): Self = StObject.set(x, "ResponseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "ResponseCode", js.undefined)
    
    inline def setSolveTimestamp(value: SolveTimestamp): Self = StObject.set(x, "SolveTimestamp", value.asInstanceOf[js.Any])
    
    inline def setSolveTimestampUndefined: Self = StObject.set(x, "SolveTimestamp", js.undefined)
  }
}
