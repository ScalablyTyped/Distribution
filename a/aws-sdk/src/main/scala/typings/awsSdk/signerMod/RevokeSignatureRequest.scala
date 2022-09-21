package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeSignatureRequest extends StObject {
  
  /**
    * ID of the signing job to be revoked.
    */
  var jobId: JobId
  
  /**
    * AWS account ID of the job owner.
    */
  var jobOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The reason for revoking the signing job.
    */
  var reason: RevocationReasonString
}
object RevokeSignatureRequest {
  
  inline def apply(jobId: JobId, reason: RevocationReasonString): RevokeSignatureRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSignatureRequest]
  }
  
  extension [Self <: RevokeSignatureRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobOwner(value: AccountId): Self = StObject.set(x, "jobOwner", value.asInstanceOf[js.Any])
    
    inline def setJobOwnerUndefined: Self = StObject.set(x, "jobOwner", js.undefined)
    
    inline def setReason(value: RevocationReasonString): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
