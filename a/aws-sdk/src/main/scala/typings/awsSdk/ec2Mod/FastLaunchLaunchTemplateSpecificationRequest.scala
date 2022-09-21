package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastLaunchLaunchTemplateSpecificationRequest extends StObject {
  
  /**
    * The ID of the launch template to use for faster launching for a Windows AMI.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateId] = js.undefined
  
  /**
    * The name of the launch template to use for faster launching for a Windows AMI.
    */
  var LaunchTemplateName: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the launch template to use for faster launching for a Windows AMI.
    */
  var Version: String
}
object FastLaunchLaunchTemplateSpecificationRequest {
  
  inline def apply(Version: String): FastLaunchLaunchTemplateSpecificationRequest = {
    val __obj = js.Dynamic.literal(Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastLaunchLaunchTemplateSpecificationRequest]
  }
  
  extension [Self <: FastLaunchLaunchTemplateSpecificationRequest](x: Self) {
    
    inline def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: String): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
