package typings.awsSdk.workmailMod

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
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object CancelMailboxExportJobRequest {
  
  @scala.inline
  def apply(ClientToken: IdempotencyClientToken, JobId: MailboxExportJobId, OrganizationId: OrganizationId): CancelMailboxExportJobRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelMailboxExportJobRequest]
  }
  
  @scala.inline
  implicit class CancelMailboxExportJobRequestMutableBuilder[Self <: CancelMailboxExportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: IdempotencyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: MailboxExportJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
