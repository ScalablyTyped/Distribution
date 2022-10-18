package typings.awsSdkMiddlewareLogger

import typings.awsSdkTypes.distTypesMiddlewareMod.AbsoluteLocation
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeHandler
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.Pluggable
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLoggerPlugin(options: Any): Pluggable[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[Any, Any]]
  
  inline def loggerMiddleware(): js.Function2[
    /* next */ InitializeHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    InitializeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("loggerMiddleware")().asInstanceOf[js.Function2[
    /* next */ InitializeHandler[Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    InitializeHandler[Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-logger", "loggerMiddlewareOptions")
  @js.native
  val loggerMiddlewareOptions: InitializeHandlerOptions & AbsoluteLocation = js.native
}
