package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainEndpointOptions extends StObject {
  
  /**
    * Whether the domain is HTTPS only enabled.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.native
  
  /**
    * The minimum required TLS version
    */
  var TLSSecurityPolicy: js.UndefOr[typings.awsSdk.cloudsearchMod.TLSSecurityPolicy] = js.native
}
object DomainEndpointOptions {
  
  @scala.inline
  def apply(): DomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainEndpointOptions]
  }
  
  @scala.inline
  implicit class DomainEndpointOptionsMutableBuilder[Self <: DomainEndpointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnforceHTTPS(value: Boolean): Self = StObject.set(x, "EnforceHTTPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceHTTPSUndefined: Self = StObject.set(x, "EnforceHTTPS", js.undefined)
    
    @scala.inline
    def setTLSSecurityPolicy(value: TLSSecurityPolicy): Self = StObject.set(x, "TLSSecurityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTLSSecurityPolicyUndefined: Self = StObject.set(x, "TLSSecurityPolicy", js.undefined)
  }
}
