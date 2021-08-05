package typings.awsSdk.workmailMod

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
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object DescribeMailboxExportJobRequest {
  
  inline def apply(JobId: MailboxExportJobId, OrganizationId: OrganizationId): DescribeMailboxExportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMailboxExportJobRequest]
  }
  
  extension [Self <: DescribeMailboxExportJobRequest](x: Self) {
    
    inline def setJobId(value: MailboxExportJobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
