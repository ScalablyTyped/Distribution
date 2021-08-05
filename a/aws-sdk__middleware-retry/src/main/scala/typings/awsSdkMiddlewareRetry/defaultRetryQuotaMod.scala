package typings.awsSdkMiddlewareRetry

import typings.awsSdkMiddlewareRetry.defaultStrategyMod.RetryQuota
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultRetryQuotaMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist/cjs/defaultRetryQuota", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultRetryQuota(initialRetryTokens: Double): RetryQuota = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRetryQuota")(initialRetryTokens.asInstanceOf[js.Any]).asInstanceOf[RetryQuota]
}
