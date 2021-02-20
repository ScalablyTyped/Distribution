package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVPCEConfigurationResult extends StObject {
  
  /**
    * An object that contains information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.native
}
object GetVPCEConfigurationResult {
  
  @scala.inline
  def apply(): GetVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVPCEConfigurationResult]
  }
  
  @scala.inline
  implicit class GetVPCEConfigurationResultMutableBuilder[Self <: GetVPCEConfigurationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpceConfiguration(value: VPCEConfiguration): Self = StObject.set(x, "vpceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceConfigurationUndefined: Self = StObject.set(x, "vpceConfiguration", js.undefined)
  }
}
