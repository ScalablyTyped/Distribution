package typings.awsSdkMiddlewareRetry.defaultStrategyMod

import typings.awsSdkSmithyClient.sdkErrorMod.SdkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryQuota extends js.Object {
  
  /**
    * returns true if retry tokens are available from the retry quota bucket.
    */
  def hasRetryTokens(error: SdkError): Boolean = js.native
  
  /**
    * releases tokens back to the retry quota.
    */
  def releaseRetryTokens(): Unit = js.native
  def releaseRetryTokens(releaseCapacityAmount: Double): Unit = js.native
  
  /**
    * returns token amount from the retry quota bucket.
    * throws error is retry tokens are not available.
    */
  def retrieveRetryTokens(error: SdkError): Double = js.native
}
