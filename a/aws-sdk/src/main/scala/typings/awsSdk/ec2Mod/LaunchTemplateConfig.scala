package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateConfig extends StObject {
  
  /**
    * The launch template.
    */
  var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification] = js.undefined
  
  /**
    * Any parameters that you specify override the same parameters in the launch template.
    */
  var Overrides: js.UndefOr[LaunchTemplateOverridesList] = js.undefined
}
object LaunchTemplateConfig {
  
  @scala.inline
  def apply(): LaunchTemplateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateConfig]
  }
  
  @scala.inline
  implicit class LaunchTemplateConfigMutableBuilder[Self <: LaunchTemplateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateSpecification(value: FleetLaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateSpecificationUndefined: Self = StObject.set(x, "LaunchTemplateSpecification", js.undefined)
    
    @scala.inline
    def setOverrides(value: LaunchTemplateOverridesList): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: LaunchTemplateOverrides*): Self = StObject.set(x, "Overrides", js.Array(value :_*))
  }
}
