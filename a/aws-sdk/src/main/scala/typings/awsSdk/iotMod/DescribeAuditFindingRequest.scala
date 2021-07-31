package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuditFindingRequest extends StObject {
  
  /**
    * A unique identifier for a single audit finding. You can use this identifier to apply mitigation actions to the finding.
    */
  var findingId: FindingId
}
object DescribeAuditFindingRequest {
  
  @scala.inline
  def apply(findingId: FindingId): DescribeAuditFindingRequest = {
    val __obj = js.Dynamic.literal(findingId = findingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditFindingRequest]
  }
  
  @scala.inline
  implicit class DescribeAuditFindingRequestMutableBuilder[Self <: DescribeAuditFindingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingId(value: FindingId): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
  }
}
