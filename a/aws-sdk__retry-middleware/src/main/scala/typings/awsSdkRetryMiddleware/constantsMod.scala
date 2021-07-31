package typings.awsSdkRetryMiddleware

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@aws-sdk/retry-middleware/build/constants", "DEFAULT_RETRY_DELAY_BASE")
  @js.native
  val DEFAULT_RETRY_DELAY_BASE: /* 100 */ Double = js.native
  
  @JSImport("@aws-sdk/retry-middleware/build/constants", "MAXIMUM_RETRY_DELAY")
  @js.native
  val MAXIMUM_RETRY_DELAY: Double = js.native
  
  @JSImport("@aws-sdk/retry-middleware/build/constants", "RETRYABLE_STATUS_CODES")
  @js.native
  val RETRYABLE_STATUS_CODES: Set[Double] = js.native
  
  @JSImport("@aws-sdk/retry-middleware/build/constants", "THROTTLING_RETRY_DELAY_BASE")
  @js.native
  val THROTTLING_RETRY_DELAY_BASE: /* 500 */ Double = js.native
}
