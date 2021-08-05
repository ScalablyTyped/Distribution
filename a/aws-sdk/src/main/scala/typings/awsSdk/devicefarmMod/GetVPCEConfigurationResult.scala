package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVPCEConfigurationResult extends StObject {
  
  /**
    * An object that contains information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.undefined
}
object GetVPCEConfigurationResult {
  
  inline def apply(): GetVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVPCEConfigurationResult]
  }
  
  extension [Self <: GetVPCEConfigurationResult](x: Self) {
    
    inline def setVpceConfiguration(value: VPCEConfiguration): Self = StObject.set(x, "vpceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpceConfigurationUndefined: Self = StObject.set(x, "vpceConfiguration", js.undefined)
  }
}
