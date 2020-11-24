package typings.cassandraDriver.mod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "policies.retry")
@js.native
object retry extends js.Object {
  
  @js.native
  class DecisionInfo ()
    extends typings.cassandraDriver.policiesMod.policies.retry.DecisionInfo
  
  @js.native
  class FallthroughRetryPolicy ()
    extends typings.cassandraDriver.policiesMod.policies.retry.FallthroughRetryPolicy
  
  @js.native
  class IdempotenceAwareRetryPolicy protected ()
    extends typings.cassandraDriver.policiesMod.policies.retry.IdempotenceAwareRetryPolicy {
    def this(childPolicy: typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy) = this()
  }
  
  @js.native
  class OperationInfo ()
    extends typings.cassandraDriver.policiesMod.policies.retry.OperationInfo
  
  @js.native
  object RetryDecision extends js.Object {
    
    @js.native
    object retryDecision extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision with Double
          ] = js.native
      
      /* 0 */ val ignore: typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.ignore with Double = js.native
      
      /* 1 */ val rethrow: typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.rethrow with Double = js.native
      
      /* 2 */ val retry: typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.retry with Double = js.native
    }
  }
  
  @js.native
  class RetryPolicy ()
    extends typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
}
