package typings.awsSdkMiddlewareEndpoint

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAdaptorsCreateConfigValueProviderMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/adaptors/createConfigValueProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConfigValueProvider[Config /* <: Record[String, Any] */](configKey: String, canonicalEndpointParamKey: String, config: Config): js.Function0[js.Promise[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createConfigValueProvider")(configKey.asInstanceOf[js.Any], canonicalEndpointParamKey.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Promise[Any]]]
}
