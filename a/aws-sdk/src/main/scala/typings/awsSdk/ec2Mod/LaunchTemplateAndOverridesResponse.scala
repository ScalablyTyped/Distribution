package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateAndOverridesResponse extends StObject {
  
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
  implicit class LaunchTemplateAndOverridesResponseMutableBuilder[Self <: LaunchTemplateAndOverridesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateSpecification(value: FleetLaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateSpecificationUndefined: Self = StObject.set(x, "LaunchTemplateSpecification", js.undefined)
    
    @scala.inline
    def setOverrides(value: FleetLaunchTemplateOverrides): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
  }
}
