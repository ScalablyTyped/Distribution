package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProvisioningTemplateVersionRequest extends StObject {
  
  /**
    * The template name.
    */
  var templateName: TemplateName = js.native
  
  /**
    * The fleet provisioning template version ID.
    */
  var versionId: TemplateVersionId = js.native
}
object DescribeProvisioningTemplateVersionRequest {
  
  @scala.inline
  def apply(templateName: TemplateName, versionId: TemplateVersionId): DescribeProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningTemplateVersionRequest]
  }
  
  @scala.inline
  implicit class DescribeProvisioningTemplateVersionRequestMutableBuilder[Self <: DescribeProvisioningTemplateVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionId(value: TemplateVersionId): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
