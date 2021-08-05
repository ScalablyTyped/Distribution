package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProvisioningTemplateRequest extends StObject {
  
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName
}
object DescribeProvisioningTemplateRequest {
  
  inline def apply(templateName: TemplateName): DescribeProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningTemplateRequest]
  }
  
  extension [Self <: DescribeProvisioningTemplateRequest](x: Self) {
    
    inline def setTemplateName(value: TemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
