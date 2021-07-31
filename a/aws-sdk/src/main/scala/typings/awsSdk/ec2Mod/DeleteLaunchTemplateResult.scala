package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLaunchTemplateResult extends StObject {
  
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplate] = js.undefined
}
object DeleteLaunchTemplateResult {
  
  @scala.inline
  def apply(): DeleteLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchTemplateResult]
  }
  
  @scala.inline
  implicit class DeleteLaunchTemplateResultMutableBuilder[Self <: DeleteLaunchTemplateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplate): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
  }
}
