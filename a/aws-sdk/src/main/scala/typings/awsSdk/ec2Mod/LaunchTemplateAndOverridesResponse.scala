package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateAndOverridesResponse extends js.Object {
  
  /**
    * The launch template.
    */
  var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification] = js.native
  
  /**
    * Any parameters that you specify override the same parameters in the launch template.
    */
  var Overrides: js.UndefOr[FleetLaunchTemplateOverrides] = js.native
}
object LaunchTemplateAndOverridesResponse {
  
  @scala.inline
  def apply(): LaunchTemplateAndOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateAndOverridesResponse]
  }
  
  @scala.inline
  implicit class LaunchTemplateAndOverridesResponseOps[Self <: LaunchTemplateAndOverridesResponse] (val x: Self) extends AnyVal {
    
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
    def setLaunchTemplateSpecification(value: FleetLaunchTemplateSpecification): Self = this.set("LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateSpecification: Self = this.set("LaunchTemplateSpecification", js.undefined)
    
    @scala.inline
    def setOverrides(value: FleetLaunchTemplateOverrides): Self = this.set("Overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("Overrides", js.undefined)
  }
}
