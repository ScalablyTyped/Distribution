package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLaunchTemplateVersionResult extends js.Object {
  
  /**
    * Information about the launch template version.
    */
  var LaunchTemplateVersion: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateVersion] = js.native
  
  /**
    * If the new version of the launch template contains parameters or parameter combinations that are not valid, an error code and an error message are returned for each issue that's found.
    */
  var Warning: js.UndefOr[ValidationWarning] = js.native
}
object CreateLaunchTemplateVersionResult {
  
  @scala.inline
  def apply(): CreateLaunchTemplateVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLaunchTemplateVersionResult]
  }
  
  @scala.inline
  implicit class CreateLaunchTemplateVersionResultOps[Self <: CreateLaunchTemplateVersionResult] (val x: Self) extends AnyVal {
    
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
    def setLaunchTemplateVersion(value: LaunchTemplateVersion): Self = this.set("LaunchTemplateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateVersion: Self = this.set("LaunchTemplateVersion", js.undefined)
    
    @scala.inline
    def setWarning(value: ValidationWarning): Self = this.set("Warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("Warning", js.undefined)
  }
}
