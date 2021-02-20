package typings.awsSdkMiddlewareLogger

import typings.awsSdkTypes.middlewareMod.AbsoluteLocation
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.middlewareMod.InitializeHandler
import typings.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.middlewareMod.Pluggable
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMiddlewareMod {
  
  @JSImport("@aws-sdk/middleware-logger/dist/cjs/loggerMiddleware", "getLoggerPlugin")
  @js.native
  def getLoggerPlugin(options: js.Any): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-logger/dist/cjs/loggerMiddleware", "loggerMiddleware")
  @js.native
  def loggerMiddleware(): js.Function2[
    /* next */ InitializeHandler[_, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    InitializeHandler[_, MetadataBearer]
  ] = js.native
  
  @JSImport("@aws-sdk/middleware-logger/dist/cjs/loggerMiddleware", "loggerMiddlewareOptions")
  @js.native
  val loggerMiddlewareOptions: InitializeHandlerOptions with AbsoluteLocation = js.native
}
