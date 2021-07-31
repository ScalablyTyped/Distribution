package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetLaunchTemplateSpecificationRequest extends StObject {
  
  /**
    * The ID of the launch template. If you specify the template ID, you can't specify the template name.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateId] = js.undefined
  
  /**
    * The name of the launch template. If you specify the template name, you can't specify the template ID.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.undefined
  
  /**
    * The launch template version number, $Latest, or $Default. You must specify a value, otherwise the request fails. If the value is $Latest, Amazon EC2 uses the latest version of the launch template. If the value is $Default, Amazon EC2 uses the default version of the launch template.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object FleetLaunchTemplateSpecificationRequest {
  
  @scala.inline
  def apply(): FleetLaunchTemplateSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetLaunchTemplateSpecificationRequest]
  }
  
  @scala.inline
  implicit class FleetLaunchTemplateSpecificationRequestMutableBuilder[Self <: FleetLaunchTemplateSpecificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
