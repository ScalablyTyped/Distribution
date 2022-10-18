package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelMailboxExportJobRequest extends StObject {
  
  /**
    * The idempotency token for the client request.
    */
  var ClientToken: IdempotencyClientToken
  
  /**
    * The job ID.
    */
  var JobId: MailboxExportJobId
  
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object CancelMailboxExportJobRequest {
  
  inline def apply(ClientToken: IdempotencyClientToken, JobId: MailboxExportJobId, OrganizationId: OrganizationId): CancelMailboxExportJobRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelMailboxExportJobRequest]
  }
  
  extension [Self <: CancelMailboxExportJobRequest](x: Self) {
    
    inline def setClientToken(value: IdempotencyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: MailboxExportJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
