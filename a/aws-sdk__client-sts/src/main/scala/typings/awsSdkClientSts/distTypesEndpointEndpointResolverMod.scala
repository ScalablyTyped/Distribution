package typings.awsSdkClientSts

import typings.awsSdkClientSts.anon.Logger
import typings.awsSdkClientSts.distTypesEndpointEndpointParametersMod.EndpointParameters
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointEndpointResolverMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/endpoint/endpointResolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultEndpointResolver(endpointParams: EndpointParameters): EndpointV2 = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultEndpointResolver")(endpointParams.asInstanceOf[js.Any]).asInstanceOf[EndpointV2]
  inline def defaultEndpointResolver(endpointParams: EndpointParameters, context: Logger): EndpointV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultEndpointResolver")(endpointParams.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EndpointV2]
}
