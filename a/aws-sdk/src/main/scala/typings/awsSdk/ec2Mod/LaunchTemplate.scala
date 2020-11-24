package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplate extends js.Object {
  
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
  implicit class LaunchTemplateOps[Self <: LaunchTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    
    @scala.inline
    def setDefaultVersionNumber(value: Long): Self = this.set("DefaultVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersionNumber: Self = this.set("DefaultVersionNumber", js.undefined)
    
    @scala.inline
    def setLatestVersionNumber(value: Long): Self = this.set("LatestVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVersionNumber: Self = this.set("LatestVersionNumber", js.undefined)
    
    @scala.inline
    def setLaunchTemplateId(value: String): Self = this.set("LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateId: Self = this.set("LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = this.set("LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateName: Self = this.set("LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
