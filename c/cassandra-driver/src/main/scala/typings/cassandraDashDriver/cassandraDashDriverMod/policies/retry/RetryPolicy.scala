package typings.cassandraDashDriver.cassandraDashDriverMod.policies.retry

import org.scalablytyped.runtime.TopLevel
import typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryPolicy extends js.Object {
  def onReadTimeout(
    requestInfo: RequestInfo,
    consistency: consistencies,
    received: Double,
    blockFor: Double,
    isDataPresent: Boolean
  ): DecisionInfo = js.native
  def onUnavailable(requestInfo: RequestInfo, consistency: consistencies, required: Double, alive: Double): DecisionInfo = js.native
  def onWriteTimeout(
    requestInfo: RequestInfo,
    consistency: consistencies,
    received: Double,
    blockFor: Double,
    writeType: String
  ): DecisionInfo = js.native
  def rethrowResult(): DecisionInfo = js.native
  def retryResult(): DecisionInfo = js.native
  def retryResult(consistency: consistencies): DecisionInfo = js.native
  def retryResult(consistency: consistencies, useCurrentHost: Boolean): DecisionInfo = js.native
}

@JSImport("cassandra-driver", "policies.retry.RetryPolicy")
@js.native
object RetryPolicy extends TopLevel[RetryPolicyStatic]

