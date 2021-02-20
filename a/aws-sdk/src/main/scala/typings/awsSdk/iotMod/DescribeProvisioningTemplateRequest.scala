package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProvisioningTemplateRequest extends StObject {
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName = js.native
}
object DescribeProvisioningTemplateRequest {
  
  @scala.inline
  def apply(templateName: TemplateName): DescribeProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningTemplateRequest]
  }
  
  @scala.inline
  implicit class DescribeProvisioningTemplateRequestMutableBuilder[Self <: DescribeProvisioningTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
