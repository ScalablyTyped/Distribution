package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateAndOverridesResponse extends StObject {
  
  /**
    * The launch template.
    */
  var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecification] = js.undefined
  
  /**
    * Any parameters that you specify override the same parameters in the launch template.
    */
  var Overrides: js.UndefOr[FleetLaunchTemplateOverrides] = js.undefined
}
object LaunchTemplateAndOverridesResponse {
  
  inline def apply(): LaunchTemplateAndOverridesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateAndOverridesResponse]
  }
  
  extension [Self <: LaunchTemplateAndOverridesResponse](x: Self) {
    
    inline def setLaunchTemplateSpecification(value: FleetLaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateSpecificationUndefined: Self = StObject.set(x, "LaunchTemplateSpecification", js.undefined)
    
    inline def setOverrides(value: FleetLaunchTemplateOverrides): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
  }
}
