package typings.awsSdkMiddlewareLogger

import typings.awsSdkTypes.middlewareMod.AbsoluteLocation
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.middlewareMod.InitializeHandler
import typings.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLoggerPlugin(options: js.Any): Pluggable[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Pluggable[js.Any, js.Any]]
  
  inline def loggerMiddleware(): js.Function2[
    /* next */ InitializeHandler[js.Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    InitializeHandler[js.Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("loggerMiddleware")().asInstanceOf[js.Function2[
    /* next */ InitializeHandler[js.Any, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    InitializeHandler[js.Any, MetadataBearer]
  ]]
  
  @JSImport("@aws-sdk/middleware-logger", "loggerMiddlewareOptions")
  @js.native
  val loggerMiddlewareOptions: InitializeHandlerOptions & AbsoluteLocation = js.native
}
