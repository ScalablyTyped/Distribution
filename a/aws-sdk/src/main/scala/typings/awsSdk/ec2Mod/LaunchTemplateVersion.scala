package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateVersion extends StObject {
  
  /**
    * The time the version was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The principal that created the version.
    */
  var CreatedBy: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the version is the default version.
    */
  var DefaultVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the launch template.
    */
  var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData] = js.undefined
  
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.undefined
  
  /**
    * The description for the version.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.ec2Mod.VersionDescription] = js.undefined
  
  /**
    * The version number.
    */
  var VersionNumber: js.UndefOr[Long] = js.undefined
}
object LaunchTemplateVersion {
  
  @scala.inline
  def apply(): LaunchTemplateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateVersion]
  }
  
  @scala.inline
  implicit class LaunchTemplateVersionMutableBuilder[Self <: LaunchTemplateVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setDefaultVersion(value: Boolean): Self = StObject.set(x, "DefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionUndefined: Self = StObject.set(x, "DefaultVersion", js.undefined)
    
    @scala.inline
    def setLaunchTemplateData(value: ResponseLaunchTemplateData): Self = StObject.set(x, "LaunchTemplateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateDataUndefined: Self = StObject.set(x, "LaunchTemplateData", js.undefined)
    
    @scala.inline
    def setLaunchTemplateId(value: String): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setVersionDescription(value: VersionDescription): Self = StObject.set(x, "VersionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDescriptionUndefined: Self = StObject.set(x, "VersionDescription", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Long): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
