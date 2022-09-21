package typings.awsSdkMiddlewareRetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/constants", "DEFAULT_RETRY_DELAY_BASE")
  @js.native
  val DEFAULT_RETRY_DELAY_BASE: /* 100 */ Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/constants", "INITIAL_RETRY_TOKENS")
  @js.native
  val INITIAL_RETRY_TOKENS: /* 500 */ Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/constants", "INVOCATION_ID_HEADER")
  @js.native
  val INVOCATION_ID_HEADER: /* "amz-sdk-invocation-id" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/constants", "MAXIMUM_RETRY_DELAY")
  @js.native
  val MAXIMUM_RETRY_DELAY: Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/constants", "NO_RETRY_INCREMENT")
  @js.native
  val NO_RETRY_INCREMENT: /* 1 */ Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/constants", "REQUEST_HEADER")
  @js.native
  val REQUEST_HEADER: /* "amz-sdk-request" */ String = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/constants", "RETRY_COST")
  @js.native
  val RETRY_COST: /* 5 */ Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/constants", "THROTTLING_RETRY_DELAY_BASE")
  @js.native
  val THROTTLING_RETRY_DELAY_BASE: /* 500 */ Double = js.native
  
  @JSImport("@aws-sdk/middleware-retry/dist-types/constants", "TIMEOUT_RETRY_COST")
  @js.native
  val TIMEOUT_RETRY_COST: /* 10 */ Double = js.native
}
