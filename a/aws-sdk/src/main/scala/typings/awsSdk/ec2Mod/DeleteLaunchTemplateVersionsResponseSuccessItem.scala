package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLaunchTemplateVersionsResponseSuccessItem extends StObject {
  
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the launch template.
    */
  var VersionNumber: js.UndefOr[Long] = js.undefined
}
object DeleteLaunchTemplateVersionsResponseSuccessItem {
  
  inline def apply(): DeleteLaunchTemplateVersionsResponseSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResponseSuccessItem]
  }
  
  extension [Self <: DeleteLaunchTemplateVersionsResponseSuccessItem](x: Self) {
    
    inline def setLaunchTemplateId(value: String): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: String): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    inline def setVersionNumber(value: Long): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
