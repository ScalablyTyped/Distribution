package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverDnssecConfigResponse extends StObject {
  
  /**
    * A complex type that contains settings for the specified DNSSEC configuration.
    */
  var ResolverDNSSECConfig: js.UndefOr[ResolverDnssecConfig] = js.undefined
}
object UpdateResolverDnssecConfigResponse {
  
  inline def apply(): UpdateResolverDnssecConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResolverDnssecConfigResponse]
  }
  
  extension [Self <: UpdateResolverDnssecConfigResponse](x: Self) {
    
    inline def setResolverDNSSECConfig(value: ResolverDnssecConfig): Self = StObject.set(x, "ResolverDNSSECConfig", value.asInstanceOf[js.Any])
    
    inline def setResolverDNSSECConfigUndefined: Self = StObject.set(x, "ResolverDNSSECConfig", js.undefined)
  }
}
