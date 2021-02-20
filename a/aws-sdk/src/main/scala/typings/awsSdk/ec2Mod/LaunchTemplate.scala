package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplate extends StObject {
  
  /**
    * The time launch template was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The principal that created the launch template. 
    */
  var CreatedBy: js.UndefOr[String] = js.native
  
  /**
    * The version number of the default version of the launch template.
    */
  var DefaultVersionNumber: js.UndefOr[Long] = js.native
  
  /**
    * The version number of the latest version of the launch template.
    */
  var LatestVersionNumber: js.UndefOr[Long] = js.native
  
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  
  /**
    * The tags for the launch template.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object LaunchTemplate {
  
  @scala.inline
  def apply(): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplate]
  }
  
  @scala.inline
  implicit class LaunchTemplateMutableBuilder[Self <: LaunchTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setDefaultVersionNumber(value: Long): Self = StObject.set(x, "DefaultVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionNumberUndefined: Self = StObject.set(x, "DefaultVersionNumber", js.undefined)
    
    @scala.inline
    def setLatestVersionNumber(value: Long): Self = StObject.set(x, "LatestVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersionNumberUndefined: Self = StObject.set(x, "LatestVersionNumber", js.undefined)
    
    @scala.inline
    def setLaunchTemplateId(value: String): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
