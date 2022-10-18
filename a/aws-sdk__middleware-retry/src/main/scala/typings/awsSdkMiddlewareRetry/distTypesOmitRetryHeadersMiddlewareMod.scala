package typings.awsSdkMiddlewareRetry

import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesMiddlewareMod.RelativeMiddlewareOptions
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOmitRetryHeadersMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/omitRetryHeadersMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOmitRetryHeadersPlugin(options: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOmitRetryHeadersPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def omitRetryHeadersMiddleware(): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("omitRetryHeadersMiddleware")().asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/omitRetryHeadersMiddleware", "omitRetryHeadersMiddlewareOptions")
  @js.native
  val omitRetryHeadersMiddlewareOptions: RelativeMiddlewareOptions = js.native
}
