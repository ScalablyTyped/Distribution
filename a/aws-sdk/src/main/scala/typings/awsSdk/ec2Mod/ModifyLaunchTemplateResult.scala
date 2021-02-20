package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyLaunchTemplateResult extends StObject {
  
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplate] = js.native
}
object ModifyLaunchTemplateResult {
  
  @scala.inline
  def apply(): ModifyLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLaunchTemplateResult]
  }
  
  @scala.inline
  implicit class ModifyLaunchTemplateResultMutableBuilder[Self <: ModifyLaunchTemplateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplate): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
  }
}
