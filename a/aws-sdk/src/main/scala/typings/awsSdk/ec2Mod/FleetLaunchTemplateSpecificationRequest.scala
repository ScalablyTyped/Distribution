package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetLaunchTemplateSpecificationRequest extends StObject {
  
  /**
    * The ID of the launch template. You must specify the LaunchTemplateId or the LaunchTemplateName, but not both.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateId] = js.undefined
  
  /**
    * The name of the launch template. You must specify the LaunchTemplateName or the LaunchTemplateId, but not both.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.undefined
  
  /**
    * The launch template version number, $Latest, or $Default. You must specify a value, otherwise the request fails. If the value is $Latest, Amazon EC2 uses the latest version of the launch template. If the value is $Default, Amazon EC2 uses the default version of the launch template.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object FleetLaunchTemplateSpecificationRequest {
  
  inline def apply(): FleetLaunchTemplateSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetLaunchTemplateSpecificationRequest]
  }
  
  extension [Self <: FleetLaunchTemplateSpecificationRequest](x: Self) {
    
    inline def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
