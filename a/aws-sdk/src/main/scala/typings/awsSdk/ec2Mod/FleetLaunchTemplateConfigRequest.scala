package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetLaunchTemplateConfigRequest extends StObject {
  
  /**
    * The launch template to use. You must specify either the launch template ID or launch template name in the request. 
    */
  var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecificationRequest] = js.undefined
  
  /**
    * Any parameters that you specify override the same parameters in the launch template.
    */
  var Overrides: js.UndefOr[FleetLaunchTemplateOverridesListRequest] = js.undefined
}
object FleetLaunchTemplateConfigRequest {
  
  inline def apply(): FleetLaunchTemplateConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetLaunchTemplateConfigRequest]
  }
  
  extension [Self <: FleetLaunchTemplateConfigRequest](x: Self) {
    
    inline def setLaunchTemplateSpecification(value: FleetLaunchTemplateSpecificationRequest): Self = StObject.set(x, "LaunchTemplateSpecification", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateSpecificationUndefined: Self = StObject.set(x, "LaunchTemplateSpecification", js.undefined)
    
    inline def setOverrides(value: FleetLaunchTemplateOverridesListRequest): Self = StObject.set(x, "Overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "Overrides", js.undefined)
    
    inline def setOverridesVarargs(value: FleetLaunchTemplateOverridesRequest*): Self = StObject.set(x, "Overrides", js.Array(value :_*))
  }
}
