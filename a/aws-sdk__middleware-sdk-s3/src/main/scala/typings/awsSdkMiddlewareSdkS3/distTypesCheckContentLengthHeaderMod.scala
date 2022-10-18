package typings.awsSdkMiddlewareSdkS3

import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeRequestHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeRequestMiddleware
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCheckContentLengthHeaderMod {
  
  @JSImport("@aws-sdk/middleware-sdk-s3/dist-types/check-content-length-header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkContentLengthHeader(): FinalizeRequestMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkContentLengthHeader")().asInstanceOf[FinalizeRequestMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-s3/dist-types/check-content-length-header", "checkContentLengthHeaderMiddlewareOptions")
  @js.native
  val checkContentLengthHeaderMiddlewareOptions: FinalizeRequestHandlerOptions = js.native
  
  inline def getCheckContentLengthHeaderPlugin(unused: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckContentLengthHeaderPlugin")(unused.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
}
