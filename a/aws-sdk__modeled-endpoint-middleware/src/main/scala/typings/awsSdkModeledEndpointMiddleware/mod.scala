package typings.awsSdkModeledEndpointMiddleware

import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.utilMod.UrlParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/modeled-endpoint-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def modeledEndpointMiddleware[InputType /* <: js.Object */](urlParser: UrlParser, inputKey: /* keyof InputType */ String): BuildMiddleware[InputType, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("modeledEndpointMiddleware")(urlParser.asInstanceOf[js.Any], inputKey.asInstanceOf[js.Any])).asInstanceOf[BuildMiddleware[InputType, js.Any]]
}
