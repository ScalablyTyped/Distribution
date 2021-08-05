package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProvisioningTemplateVersionRequest extends StObject {
  
  /**
    * The name of the fleet provisioning template version to delete.
    */
  var templateName: TemplateName
  
  /**
    * The fleet provisioning template version ID to delete.
    */
  var versionId: TemplateVersionId
}
object DeleteProvisioningTemplateVersionRequest {
  
  inline def apply(templateName: TemplateName, versionId: TemplateVersionId): DeleteProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisioningTemplateVersionRequest]
  }
  
  extension [Self <: DeleteProvisioningTemplateVersionRequest](x: Self) {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: TemplateVersionId): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
