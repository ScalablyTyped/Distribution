package typings.awsSdkUtilEndpoints

import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EvaluateOptions
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.Expression
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsGetEndpointUrlMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/utils/getEndpointUrl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointUrl(endpointUrl: Expression, options: EvaluateOptions): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointUrl")(endpointUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URL]
}
