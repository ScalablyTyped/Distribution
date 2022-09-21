package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverDnssecConfigResponse extends StObject {
  
  /**
    * The information about a configuration for DNSSEC validation.
    */
  var ResolverDNSSECConfig: js.UndefOr[ResolverDnssecConfig] = js.undefined
}
object GetResolverDnssecConfigResponse {
  
  inline def apply(): GetResolverDnssecConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverDnssecConfigResponse]
  }
  
  extension [Self <: GetResolverDnssecConfigResponse](x: Self) {
    
    inline def setResolverDNSSECConfig(value: ResolverDnssecConfig): Self = StObject.set(x, "ResolverDNSSECConfig", value.asInstanceOf[js.Any])
    
    inline def setResolverDNSSECConfigUndefined: Self = StObject.set(x, "ResolverDNSSECConfig", js.undefined)
  }
}
