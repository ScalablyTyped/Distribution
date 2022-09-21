package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadiusSettings extends StObject {
  
  /**
    * The protocol specified for your RADIUS endpoints.
    */
  var AuthenticationProtocol: js.UndefOr[RadiusAuthenticationProtocol] = js.undefined
  
  /**
    * Not currently used.
    */
  var DisplayLabel: js.UndefOr[RadiusDisplayLabel] = js.undefined
  
  /**
    * The port that your RADIUS server is using for communications. Your self-managed network must allow inbound traffic over this port from the Directory Service servers.
    */
  var RadiusPort: js.UndefOr[PortNumber] = js.undefined
  
  /**
    * The maximum number of times that communication with the RADIUS server is attempted.
    */
  var RadiusRetries: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusRetries] = js.undefined
  
  /**
    * An array of strings that contains the fully qualified domain name (FQDN) or IP addresses of the RADIUS server endpoints, or the FQDN or IP addresses of your RADIUS server load balancer.
    */
  var RadiusServers: js.UndefOr[Servers] = js.undefined
  
  /**
    * The amount of time, in seconds, to wait for the RADIUS server to respond.
    */
  var RadiusTimeout: js.UndefOr[typings.awsSdk.directoryserviceMod.RadiusTimeout] = js.undefined
  
  /**
    * Required for enabling RADIUS on the directory.
    */
  var SharedSecret: js.UndefOr[RadiusSharedSecret] = js.undefined
  
  /**
    * Not currently used.
    */
  var UseSameUsername: js.UndefOr[typings.awsSdk.directoryserviceMod.UseSameUsername] = js.undefined
}
object RadiusSettings {
  
  inline def apply(): RadiusSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadiusSettings]
  }
  
  extension [Self <: RadiusSettings](x: Self) {
    
    inline def setAuthenticationProtocol(value: RadiusAuthenticationProtocol): Self = StObject.set(x, "AuthenticationProtocol", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProtocolUndefined: Self = StObject.set(x, "AuthenticationProtocol", js.undefined)
    
    inline def setDisplayLabel(value: RadiusDisplayLabel): Self = StObject.set(x, "DisplayLabel", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabelUndefined: Self = StObject.set(x, "DisplayLabel", js.undefined)
    
    inline def setRadiusPort(value: PortNumber): Self = StObject.set(x, "RadiusPort", value.asInstanceOf[js.Any])
    
    inline def setRadiusPortUndefined: Self = StObject.set(x, "RadiusPort", js.undefined)
    
    inline def setRadiusRetries(value: RadiusRetries): Self = StObject.set(x, "RadiusRetries", value.asInstanceOf[js.Any])
    
    inline def setRadiusRetriesUndefined: Self = StObject.set(x, "RadiusRetries", js.undefined)
    
    inline def setRadiusServers(value: Servers): Self = StObject.set(x, "RadiusServers", value.asInstanceOf[js.Any])
    
    inline def setRadiusServersUndefined: Self = StObject.set(x, "RadiusServers", js.undefined)
    
    inline def setRadiusServersVarargs(value: Server*): Self = StObject.set(x, "RadiusServers", js.Array(value*))
    
    inline def setRadiusTimeout(value: RadiusTimeout): Self = StObject.set(x, "RadiusTimeout", value.asInstanceOf[js.Any])
    
    inline def setRadiusTimeoutUndefined: Self = StObject.set(x, "RadiusTimeout", js.undefined)
    
    inline def setSharedSecret(value: RadiusSharedSecret): Self = StObject.set(x, "SharedSecret", value.asInstanceOf[js.Any])
    
    inline def setSharedSecretUndefined: Self = StObject.set(x, "SharedSecret", js.undefined)
    
    inline def setUseSameUsername(value: UseSameUsername): Self = StObject.set(x, "UseSameUsername", value.asInstanceOf[js.Any])
    
    inline def setUseSameUsernameUndefined: Self = StObject.set(x, "UseSameUsername", js.undefined)
  }
}
