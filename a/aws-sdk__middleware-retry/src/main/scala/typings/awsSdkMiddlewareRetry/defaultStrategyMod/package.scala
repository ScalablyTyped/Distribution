package typings.awsSdkMiddlewareRetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object defaultStrategyMod {
  
  type DelayDecider = js.Function2[/* delayBase */ scala.Double, /* attempts */ scala.Double, scala.Double]
  
  type RetryDecider = js.Function1[/* error */ typings.awsSdkSmithyClient.sdkErrorMod.SdkError, scala.Boolean]
}
