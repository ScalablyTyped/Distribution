package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportClientVpnClientConfigurationResult extends StObject {
  
  /**
    * The contents of the Client VPN endpoint configuration file.
    */
  var ClientConfiguration: js.UndefOr[String] = js.undefined
}
object ExportClientVpnClientConfigurationResult {
  
  @scala.inline
  def apply(): ExportClientVpnClientConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportClientVpnClientConfigurationResult]
  }
  
  @scala.inline
  implicit class ExportClientVpnClientConfigurationResultMutableBuilder[Self <: ExportClientVpnClientConfigurationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientConfiguration(value: String): Self = StObject.set(x, "ClientConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientConfigurationUndefined: Self = StObject.set(x, "ClientConfiguration", js.undefined)
  }
}
