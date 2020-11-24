package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLaunchTemplateVersionsResponseErrorItem extends js.Object {
  
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[String] = js.native
  
  /**
    * Information about the error.
    */
  var ResponseError: js.UndefOr[typings.awsSdk.ec2Mod.ResponseError] = js.native
  
  /**
    * The version number of the launch template.
    */
  var VersionNumber: js.UndefOr[Long] = js.native
}
object DeleteLaunchTemplateVersionsResponseErrorItem {
  
  @scala.inline
  def apply(): DeleteLaunchTemplateVersionsResponseErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResponseErrorItem]
  }
  
  @scala.inline
  implicit class DeleteLaunchTemplateVersionsResponseErrorItemOps[Self <: DeleteLaunchTemplateVersionsResponseErrorItem] (val x: Self) extends AnyVal {
    
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
    def setLaunchTemplateId(value: String): Self = this.set("LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateId: Self = this.set("LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: String): Self = this.set("LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateName: Self = this.set("LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setResponseError(value: ResponseError): Self = this.set("ResponseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseError: Self = this.set("ResponseError", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Long): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
}
