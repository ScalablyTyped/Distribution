package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAuditSuppressionRequest extends StObject {
  
  var checkName: AuditCheckName
  
  var resourceIdentifier: ResourceIdentifier
}
object DeleteAuditSuppressionRequest {
  
  @scala.inline
  def apply(checkName: AuditCheckName, resourceIdentifier: ResourceIdentifier): DeleteAuditSuppressionRequest = {
    val __obj = js.Dynamic.literal(checkName = checkName.asInstanceOf[js.Any], resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAuditSuppressionRequest]
  }
  
  @scala.inline
  implicit class DeleteAuditSuppressionRequestMutableBuilder[Self <: DeleteAuditSuppressionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
  }
}
