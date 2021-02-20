package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.middlewareMod.InitializeMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountIdDefaultMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/account-id-default", "accountIdDefaultMiddleware")
  @js.native
  def accountIdDefaultMiddleware(): InitializeMiddleware[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/account-id-default", "accountIdDefaultMiddlewareOptions")
  @js.native
  val accountIdDefaultMiddlewareOptions: InitializeHandlerOptions = js.native
}
