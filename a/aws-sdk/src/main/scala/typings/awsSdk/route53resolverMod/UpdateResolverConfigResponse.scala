package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResolverConfigResponse extends StObject {
  
  /**
    * An array that contains settings for the specified Resolver configuration.
    */
  var ResolverConfig: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverConfig] = js.undefined
}
object UpdateResolverConfigResponse {
  
  inline def apply(): UpdateResolverConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResolverConfigResponse]
  }
  
  extension [Self <: UpdateResolverConfigResponse](x: Self) {
    
    inline def setResolverConfig(value: ResolverConfig): Self = StObject.set(x, "ResolverConfig", value.asInstanceOf[js.Any])
    
    inline def setResolverConfigUndefined: Self = StObject.set(x, "ResolverConfig", js.undefined)
  }
}
