package typings.cassandraDashDriver.cassandraDashDriverMod.policies.retry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait retryDecision extends js.Object

@JSImport("cassandra-driver", "policies.retry.retryDecision")
@js.native
object retryDecision extends js.Object {
  @js.native
  sealed trait ignore extends retryDecision
  
  @js.native
  sealed trait rethrow extends retryDecision
  
  @js.native
  sealed trait retry extends retryDecision
  
  /* 1 */ val ignore: typings.cassandraDashDriver.cassandraDashDriverMod.policies.retry.retryDecision.ignore with Double = js.native
  /* 0 */ val rethrow: typings.cassandraDashDriver.cassandraDashDriverMod.policies.retry.retryDecision.rethrow with Double = js.native
  /* 0 */ val retry: typings.cassandraDashDriver.cassandraDashDriverMod.policies.retry.retryDecision.retry with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[retryDecision with Double] = js.native
}

