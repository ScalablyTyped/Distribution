package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVerificationStateOnViolationRequest extends StObject {
  
  /**
    * The verification state of the violation.
    */
  var verificationState: VerificationState
  
  /**
    * The description of the verification state of the violation (detect alarm).
    */
  var verificationStateDescription: js.UndefOr[VerificationStateDescription] = js.undefined
  
  /**
    * The violation ID.
    */
  var violationId: ViolationId
}
object PutVerificationStateOnViolationRequest {
  
  inline def apply(verificationState: VerificationState, violationId: ViolationId): PutVerificationStateOnViolationRequest = {
    val __obj = js.Dynamic.literal(verificationState = verificationState.asInstanceOf[js.Any], violationId = violationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutVerificationStateOnViolationRequest]
  }
  
  extension [Self <: PutVerificationStateOnViolationRequest](x: Self) {
    
    inline def setVerificationState(value: VerificationState): Self = StObject.set(x, "verificationState", value.asInstanceOf[js.Any])
    
    inline def setVerificationStateDescription(value: VerificationStateDescription): Self = StObject.set(x, "verificationStateDescription", value.asInstanceOf[js.Any])
    
    inline def setVerificationStateDescriptionUndefined: Self = StObject.set(x, "verificationStateDescription", js.undefined)
    
    inline def setViolationId(value: ViolationId): Self = StObject.set(x, "violationId", value.asInstanceOf[js.Any])
  }
}
