package typings.awsSdkConfigResolver.endpointsConfigMod

import typings.awsSdkTypes.httpMod.Endpoint
import typings.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<@aws-sdk/config-resolver.@aws-sdk/config-resolver/dist/cjs/EndpointsConfig.EndpointsInputConfig> */
@js.native
trait EndpointsResolvedConfig extends js.Object {
  
  def endpoint(): js.Promise[Endpoint] = js.native
  @JSName("endpoint")
  var endpoint_Original: Provider[Endpoint] = js.native
  
  var isCustomEndpoint: Boolean = js.native
  
  var tls: Boolean = js.native
}
