package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.cassandraDashDriver.Anon_Ignore
import typings.cassandraDashDriver.Anon_Next
import typings.cassandraDashDriver.Anon_NextExecution
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.addressResolutionNs.AddressTranslator
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.addressResolutionNs.EC2MultiRegionTranslator
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.addressResolutionNs.EC2MultiRegionTranslatorStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.reconnectionNs.ConstantReconnectionPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.reconnectionNs.ConstantReconnectionPolicyStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.reconnectionNs.ExponentialReconnectionPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.reconnectionNs.ExponentialReconnectionPolicyStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.reconnectionNs.ReconnectionPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.DecisionInfo
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.RequestInfo
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicyStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.retryDecision
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.speculativeExecutionNs.ConstantSpeculativeExecutionPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.speculativeExecutionNs.NoSpeculativeExecutionPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.speculativeExecutionNs.NoSpeculativeExecutionPolicyStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.speculativeExecutionNs.SpeculativeExecutionPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.timestampGenerationNs.MonotonicTimestampGeneratorStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.timestampGenerationNs.TimestampGenerator
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.distance
import typings.std.Error
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies")
@js.native
object policiesNs extends js.Object {
  @JSName("addressResolution")
  @js.native
  object addressResolutionNs extends js.Object {
    trait AddressTranslator extends js.Object {
      def translate(address: String, port: Double, callback: Callback): Unit
    }
    
    trait EC2MultiRegionTranslator extends AddressTranslator {
      def logError(address: String, err: Error): Unit
    }
    
    @js.native
    class EC2MultiRegionTranslatorCls () extends EC2MultiRegionTranslator {
      /* CompleteClass */
      override def logError(address: String, err: Error): Unit = js.native
      /* CompleteClass */
      override def translate(address: String, port: Double, callback: Callback): Unit = js.native
    }
    
    @js.native
    trait EC2MultiRegionTranslatorStatic extends Instantiable0[EC2MultiRegionTranslator]
    
    var EC2MultiRegionTranslator: EC2MultiRegionTranslatorStatic = js.native
  }
  
  @JSName("loadBalancing")
  @js.native
  object loadBalancingNs extends js.Object {
    @js.native
    class DCAwareRoundRobinPolicy () extends LoadBalancingPolicy {
      def this(localDc: String) = this()
      var localDc: String = js.native
      var localHostsArray: js.Array[Host] = js.native
    }
    
    @js.native
    class LoadBalancingPolicy () extends js.Object {
      def getDistance(host: Host): distance = js.native
      def getOptions(): Map[String, _] = js.native
      def init(client: Client, hosts: HostMap, callback: Callback): Unit = js.native
      def newQueryPlan(keyspace: String, queryOptions: Null, callback: Callback): Unit = js.native
      def newQueryPlan(keyspace: String, queryOptions: ExecutionOptions, callback: Callback): Unit = js.native
    }
    
    @js.native
    class RoundRobinPolicy () extends LoadBalancingPolicy
    
    @js.native
    class TokenAwarePolicy protected () extends LoadBalancingPolicy {
      def this(childPolicy: LoadBalancingPolicy) = this()
    }
    
    @js.native
    class WhiteListPolicy protected () extends LoadBalancingPolicy {
      def this(childPolicy: LoadBalancingPolicy, whiteList: js.Array[String]) = this()
    }
    
  }
  
  @JSName("reconnection")
  @js.native
  object reconnectionNs extends js.Object {
    @js.native
    class ConstantReconnectionPolicyCls protected () extends ConstantReconnectionPolicy {
      def this(delay: Double) = this()
      /* CompleteClass */
      override def newSchedule(): Anon_Next = js.native
    }
    
    @js.native
    trait ConstantReconnectionPolicyStatic extends Instantiable1[/* delay */ Double, ConstantReconnectionPolicy]
    
    @js.native
    class ExponentialReconnectionPolicyCls protected () extends ExponentialReconnectionPolicy {
      def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
      /* CompleteClass */
      override def newSchedule(): Anon_Next = js.native
    }
    
    @js.native
    trait ExponentialReconnectionPolicyStatic extends Instantiable3[
              /* baseDelay */ Double, 
              /* maxDelay */ Double, 
              /* startWithNoDelay */ Boolean, 
              ExponentialReconnectionPolicy
            ]
    
    trait ReconnectionPolicy extends js.Object {
      def newSchedule(): Anon_Next
    }
    
    var ConstantReconnectionPolicy: ConstantReconnectionPolicyStatic = js.native
    var ExponentialReconnectionPolicy: ExponentialReconnectionPolicyStatic = js.native
    type ConstantReconnectionPolicy = ReconnectionPolicy
    type ExponentialReconnectionPolicy = ReconnectionPolicy
  }
  
  @JSName("retry")
  @js.native
  object retryNs extends js.Object {
    trait DecisionInfo extends js.Object {
      var consistency: js.UndefOr[Double] = js.undefined
      var decision: Double
      var useCurrentHost: js.UndefOr[Boolean] = js.undefined
    }
    
    trait RequestInfo extends js.Object {
      var nbRetry: Double
      var request: js.Any
    }
    
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
    
    @js.native
    class RetryPolicyCls () extends RetryPolicy
    
    @js.native
    trait RetryPolicyStatic extends Instantiable0[RetryPolicy] {
      var retryDecision: Anon_Ignore = js.native
    }
    
    @js.native
    sealed trait retryDecision extends js.Object
    
    var RetryPolicy: RetryPolicyStatic = js.native
    @js.native
    object retryDecision extends js.Object {
      @js.native
      sealed trait ignore extends retryDecision
      
      @js.native
      sealed trait rethrow extends retryDecision
      
      @js.native
      sealed trait retry extends retryDecision
      
      /* 1 */ val ignore: typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.retryDecision.ignore with Double = js.native
      /* 0 */ val rethrow: typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.retryDecision.rethrow with Double = js.native
      /* 0 */ val retry: typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.retryDecision.retry with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[retryDecision with Double] = js.native
    }
    
  }
  
  @JSName("speculativeExecution")
  @js.native
  object speculativeExecutionNs extends js.Object {
    @js.native
    trait ConstantSpeculativeExecutionPolicyStatic extends Instantiable2[
              /* delay */ Double, 
              /* maxSpeculativeExecutions */ Double, 
              ConstantSpeculativeExecutionPolicy
            ]
    
    @js.native
    class NoSpeculativeExecutionPolicyCls () extends NoSpeculativeExecutionPolicy
    
    @js.native
    trait NoSpeculativeExecutionPolicyStatic extends Instantiable0[NoSpeculativeExecutionPolicy]
    
    @js.native
    trait SpeculativeExecutionPolicy extends js.Object {
      def init(client: Client): Unit = js.native
      def newPlan(keyspace: String, queryInfo: String): Anon_NextExecution = js.native
      def newPlan(keyspace: String, queryInfo: js.Array[String]): Anon_NextExecution = js.native
    }
    
    var NoSpeculativeExecutionPolicy: NoSpeculativeExecutionPolicyStatic = js.native
    type ConstantSpeculativeExecutionPolicy = SpeculativeExecutionPolicy
    type NoSpeculativeExecutionPolicy = SpeculativeExecutionPolicy
  }
  
  @JSName("timestampGeneration")
  @js.native
  object timestampGenerationNs extends js.Object {
    trait MonotonicTimestampGenerator extends TimestampGenerator {
      def getDate(): Double
    }
    
    @js.native
    class MonotonicTimestampGeneratorCls () extends MonotonicTimestampGeneratorStatic {
      def this(warningThreshold: Double) = this()
      def this(warningThreshold: Double, minLogInterval: Double) = this()
    }
    
    @js.native
    trait MonotonicTimestampGeneratorStatic
      extends Instantiable0[MonotonicTimestampGeneratorStatic]
         with Instantiable1[/* warningThreshold */ Double, MonotonicTimestampGeneratorStatic]
         with Instantiable2[
              /* warningThreshold */ Double, 
              /* minLogInterval */ Double, 
              MonotonicTimestampGeneratorStatic
            ]
    
    trait TimestampGenerator extends js.Object {
      def next(client: Client): Null | Double | typings.long.longMod.^ 
    }
    
    var MonotonicTimestampGenerator: MonotonicTimestampGeneratorStatic = js.native
  }
  
}

