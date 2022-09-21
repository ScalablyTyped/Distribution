package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.middlewareMod.InitializeMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountIdDefaultMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/account-id-default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def accountIdDefaultMiddleware(): InitializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("accountIdDefaultMiddleware")().asInstanceOf[InitializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/account-id-default", "accountIdDefaultMiddlewareOptions")
  @js.native
  val accountIdDefaultMiddlewareOptions: InitializeHandlerOptions = js.native
}
