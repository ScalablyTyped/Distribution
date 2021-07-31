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
  
  @scala.inline
  def apply(): DeleteLaunchTemplateVersionsResponseSuccessItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResponseSuccessItem]
  }
  
  @scala.inline
  implicit class DeleteLaunchTemplateVersionsResponseSuccessItemMutableBuilder[Self <: DeleteLaunchTemplateVersionsResponseSuccessItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateId(value: String): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: String): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Long): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
