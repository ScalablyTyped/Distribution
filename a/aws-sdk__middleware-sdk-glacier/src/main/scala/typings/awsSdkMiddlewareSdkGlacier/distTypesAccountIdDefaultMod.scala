package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeHandlerOptions
import typings.awsSdkTypes.distTypesMiddlewareMod.InitializeMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAccountIdDefaultMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/account-id-default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def accountIdDefaultMiddleware(): InitializeMiddleware[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("accountIdDefaultMiddleware")().asInstanceOf[InitializeMiddleware[Any, Any]]
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist-types/account-id-default", "accountIdDefaultMiddlewareOptions")
  @js.native
  val accountIdDefaultMiddlewareOptions: InitializeHandlerOptions = js.native
}
