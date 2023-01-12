package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMailboxExportJobRequest extends StObject {
  
  /**
    * The mailbox export job ID.
    */
  var JobId: MailboxExportJobId
  
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object DescribeMailboxExportJobRequest {
  
  inline def apply(JobId: MailboxExportJobId, OrganizationId: OrganizationId): DescribeMailboxExportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMailboxExportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMailboxExportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: MailboxExportJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
