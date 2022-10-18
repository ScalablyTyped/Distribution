package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAdaptorsToEndpointV1Mod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/adaptors/toEndpointV1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toEndpointV1(endpoint: String): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
  inline def toEndpointV1(endpoint: EndpointV2): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
  inline def toEndpointV1(endpoint: Endpoint): Endpoint = ^.asInstanceOf[js.Dynamic].applyDynamic("toEndpointV1")(endpoint.asInstanceOf[js.Any]).asInstanceOf[Endpoint]
}
