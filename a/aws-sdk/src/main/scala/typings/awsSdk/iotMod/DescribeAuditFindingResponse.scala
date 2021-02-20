package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuditFindingResponse extends StObject {
  
  var finding: js.UndefOr[AuditFinding] = js.native
}
object DescribeAuditFindingResponse {
  
  @scala.inline
  def apply(): DescribeAuditFindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditFindingResponse]
  }
  
  @scala.inline
  implicit class DescribeAuditFindingResponseMutableBuilder[Self <: DescribeAuditFindingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinding(value: AuditFinding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
  }
}
