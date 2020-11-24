package typings.cassandraDriver.policiesMod.policies

import org.scalablytyped.runtime.TopLevel
import typings.cassandraDriver.mod.ExecutionOptions
import typings.cassandraDriver.typesMod.types.consistencies
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/policies", "policies.retry")
@js.native
object retry extends js.Object {
  
  @js.native
  class DecisionInfo () extends js.Object {
    
    var consistency: consistencies = js.native
    
    var decision: Double = js.native
  }
  
  @js.native
  class FallthroughRetryPolicy () extends RetryPolicy
  
  @js.native
  class IdempotenceAwareRetryPolicy protected () extends RetryPolicy {
    def this(childPolicy: RetryPolicy) = this()
  }
  
  @js.native
  class OperationInfo () extends js.Object {
    
    var executionOptions: ExecutionOptions = js.native
    
    var nbRetry: Double = js.native
    
    var query: String = js.native
  }
  
  @js.native
  object RetryDecision extends js.Object {
    
    @js.native
    sealed trait retryDecision extends js.Object
    @js.native
    object retryDecision extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[retryDecision with Double] = js.native
      
      @js.native
      sealed trait ignore extends retryDecision
      /* 0 */ @js.native
      object ignore extends TopLevel[ignore with Double]
      
      @js.native
      sealed trait rethrow extends retryDecision
      /* 1 */ @js.native
      object rethrow extends TopLevel[rethrow with Double]
      
      @js.native
      sealed trait retry extends retryDecision
      /* 2 */ @js.native
      object retry
        extends TopLevel[
                  typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.retry with Double
                ]
    }
  }
  
  @js.native
  class RetryPolicy () extends js.Object {
    
    def onReadTimeout(
      info: OperationInfo,
      consistency: consistencies,
      received: Double,
      blockFor: Double,
      isDataPresent: Boolean
    ): DecisionInfo = js.native
    
    def onRequestError(info: OperationInfo, consistency: consistencies, err: Error): DecisionInfo = js.native
    
    def onUnavailable(info: OperationInfo, consistency: consistencies, required: Double, alive: Boolean): DecisionInfo = js.native
    
    def onWriteTimeout(
      info: OperationInfo,
      consistency: consistencies,
      received: Double,
      blockFor: Double,
      writeType: String
    ): DecisionInfo = js.native
    
    def rethrowResult(): DecisionInfo = js.native
    
    def retryResult(consistency: consistencies): DecisionInfo = js.native
    def retryResult(consistency: consistencies, useCurrentHost: Boolean): DecisionInfo = js.native
  }
}
