package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchTemplateVersionResult extends StObject {
  
  /**
    * Information about the launch template version.
    */
  var LaunchTemplateVersion: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateVersion] = js.undefined
  
  /**
    * If the new version of the launch template contains parameters or parameter combinations that are not valid, an error code and an error message are returned for each issue that's found.
    */
  var Warning: js.UndefOr[ValidationWarning] = js.undefined
}
object CreateLaunchTemplateVersionResult {
  
  @scala.inline
  def apply(): CreateLaunchTemplateVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLaunchTemplateVersionResult]
  }
  
  @scala.inline
  implicit class CreateLaunchTemplateVersionResultMutableBuilder[Self <: CreateLaunchTemplateVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateVersion(value: LaunchTemplateVersion): Self = StObject.set(x, "LaunchTemplateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateVersionUndefined: Self = StObject.set(x, "LaunchTemplateVersion", js.undefined)
    
    @scala.inline
    def setWarning(value: ValidationWarning): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}
