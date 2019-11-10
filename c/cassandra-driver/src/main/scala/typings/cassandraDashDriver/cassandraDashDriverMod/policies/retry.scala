package typings.cassandraDashDriver.cassandraDashDriverMod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.retry")
@js.native
object retry extends js.Object {
  @js.native
  class DecisionInfo ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.retry.DecisionInfo
  
  @js.native
  class IdempotenceAwareRetryPolicy protected ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.retry.IdempotenceAwareRetryPolicy {
    def this(childPolicy: typings.cassandraDashDriver.libPoliciesMod.policies.retry.RetryPolicy) = this()
  }
  
  @js.native
  class OperationInfo ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.retry.OperationInfo
  
  @js.native
  class RetryPolicy ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.retry.RetryPolicy
  
  @js.native
  object RetryDecision extends js.Object {
    @js.native
    object retryDecision extends js.Object {
      /* 0 */ val ignore: typings.cassandraDashDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision.ignore with Double = js.native
      /* 1 */ val rethrow: typings.cassandraDashDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision.rethrow with Double = js.native
      /* 2 */ val retry: typings.cassandraDashDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision.retry with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.cassandraDashDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision with Double
          ] = js.native
    }
    
  }
  
}

