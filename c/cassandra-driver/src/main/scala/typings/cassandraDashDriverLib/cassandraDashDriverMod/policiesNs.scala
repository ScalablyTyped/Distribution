package typings
package cassandraDashDriverLib.cassandraDashDriverMod

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
      def translate(
        address: java.lang.String,
        port: scala.Double,
        callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
      ): scala.Unit
    }
    
    trait EC2MultiRegionTranslator extends AddressTranslator {
      def logError(address: java.lang.String, err: nodeLib.Error): scala.Unit
    }
    
    @js.native
    trait EC2MultiRegionTranslatorStatic
      extends org.scalablytyped.runtime.Instantiable0[EC2MultiRegionTranslator]
    
    var EC2MultiRegionTranslator: EC2MultiRegionTranslatorStatic = js.native
  }
  
  @JSName("loadBalancing")
  @js.native
  object loadBalancingNs extends js.Object {
    @js.native
    trait DCAwareRoundRobinPolicy extends LoadBalancingPolicy {
      var localHostsArray: js.Array[cassandraDashDriverLib.cassandraDashDriverMod.Host] = js.native
      var remoteHostsArray: js.Array[cassandraDashDriverLib.cassandraDashDriverMod.Host] = js.native
    }
    
    @js.native
    trait DCAwareRoundRobinPolicyStatic
      extends org.scalablytyped.runtime.Instantiable0[DCAwareRoundRobinPolicy]
         with org.scalablytyped.runtime.Instantiable1[/* localDc */ java.lang.String, DCAwareRoundRobinPolicy]
    
    @js.native
    trait LoadBalancingPolicy extends js.Object {
      def getDistance(host: cassandraDashDriverLib.cassandraDashDriverMod.Host): cassandraDashDriverLib.cassandraDashDriverMod.typesNs.distance = js.native
      def init(
        client: cassandraDashDriverLib.cassandraDashDriverMod.Client,
        hosts: cassandraDashDriverLib.cassandraDashDriverMod.HostMap,
        callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
      ): scala.Unit = js.native
      def newQueryPlan(
        keyspace: java.lang.String,
        queryOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
        callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
      ): scala.Unit = js.native
      def newQueryPlan(
        keyspace: java.lang.String,
        queryOptions: scala.Null,
        callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback
      ): scala.Unit = js.native
    }
    
    @js.native
    trait RoundRobinPolicyStatic
      extends org.scalablytyped.runtime.Instantiable0[RoundRobinPolicy]
    
    @js.native
    trait TokenAwarePolicyStatic
      extends org.scalablytyped.runtime.Instantiable1[/* childPolicy */ LoadBalancingPolicy, TokenAwarePolicy]
    
    @js.native
    trait WhiteListPolicyStatic
      extends org.scalablytyped.runtime.Instantiable2[
              /* childPolicy */ LoadBalancingPolicy, 
              /* whiteList */ js.Array[java.lang.String], 
              WhiteListPolicy
            ]
    
    var DCAwareRoundRobinPolicy: DCAwareRoundRobinPolicyStatic = js.native
    var RoundRobinPolicy: RoundRobinPolicyStatic = js.native
    var TokenAwarePolicy: TokenAwarePolicyStatic = js.native
    var WhiteListPolicy: WhiteListPolicyStatic = js.native
    type RoundRobinPolicy = LoadBalancingPolicy
    type TokenAwarePolicy = LoadBalancingPolicy
    type WhiteListPolicy = LoadBalancingPolicy
  }
  
  @JSName("reconnection")
  @js.native
  object reconnectionNs extends js.Object {
    @js.native
    trait ConstantReconnectionPolicyStatic
      extends org.scalablytyped.runtime.Instantiable1[/* delay */ scala.Double, ConstantReconnectionPolicy]
    
    @js.native
    trait ExponentialReconnectionPolicyStatic
      extends org.scalablytyped.runtime.Instantiable3[
              /* baseDelay */ scala.Double, 
              /* maxDelay */ scala.Double, 
              /* startWithNoDelay */ scala.Boolean, 
              ExponentialReconnectionPolicy
            ]
    
    trait ReconnectionPolicy extends js.Object {
      def newSchedule(): cassandraDashDriverLib.Anon_Next
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
      var consistency: scala.Double
      var decision: scala.Double
    }
    
    trait RequestInfo extends js.Object {
      var nbRetry: scala.Double
      var request: js.Any
    }
    
    trait RetryPolicy extends js.Object {
      def onReadTimeout(
        requestInfo: RequestInfo,
        consistency: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies,
        received: scala.Double,
        blockFor: scala.Double,
        isDataPresent: scala.Boolean
      ): DecisionInfo
      def onUnavailable(
        requestInfo: RequestInfo,
        consistency: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies,
        required: scala.Double,
        alive: scala.Double
      ): DecisionInfo
      def onWriteTimeout(
        requestInfo: RequestInfo,
        consistency: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies,
        received: scala.Double,
        blockFor: scala.Double,
        writeType: java.lang.String
      ): DecisionInfo
      def rethrowResult(): cassandraDashDriverLib.Anon_Decision
      def retryResult(): cassandraDashDriverLib.Anon_Consistency
    }
    
    @js.native
    trait RetryPolicyStatic
      extends org.scalablytyped.runtime.Instantiable0[RetryPolicy] {
      var retryDecision: cassandraDashDriverLib.Anon_Ignore = js.native
    }
    
    @js.native
    sealed trait retryDecision extends js.Object
    
    var RetryPolicy: RetryPolicyStatic = js.native
    @js.native
    object retryDecision extends js.Object {
      @js.native
      sealed trait ignore
        extends cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.retryDecision
      
      @js.native
      sealed trait rethrow
        extends cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.retryDecision
      
      @js.native
      sealed trait retry
        extends cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.retryDecision
      
      val ignore: ignore with scala.Double = js.native
      /* 0 */ val rethrow: rethrow with scala.Double = js.native
      val retry: retry with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.retryDecision with scala.Double
          ] = js.native
    }
    
  }
  
  @JSName("speculativeExecution")
  @js.native
  object speculativeExecutionNs extends js.Object {
    @js.native
    trait ConstantSpeculativeExecutionPolicyStatic
      extends org.scalablytyped.runtime.Instantiable2[
              /* delay */ scala.Double, 
              /* maxSpeculativeExecutions */ scala.Double, 
              ConstantSpeculativeExecutionPolicy
            ]
    
    @js.native
    trait NoSpeculativeExecutionPolicyStatic
      extends org.scalablytyped.runtime.Instantiable0[NoSpeculativeExecutionPolicy]
    
    @js.native
    trait SpeculativeExecutionPolicy extends js.Object {
      def init(client: cassandraDashDriverLib.cassandraDashDriverMod.Client): scala.Unit = js.native
      def newPlan(keyspace: java.lang.String, queryInfo: java.lang.String): cassandraDashDriverLib.Anon_NextExecution = js.native
      def newPlan(keyspace: java.lang.String, queryInfo: js.Array[java.lang.String]): cassandraDashDriverLib.Anon_NextExecution = js.native
    }
    
    var NoSpeculativeExecutionPolicy: NoSpeculativeExecutionPolicyStatic = js.native
    type ConstantSpeculativeExecutionPolicy = SpeculativeExecutionPolicy
    type NoSpeculativeExecutionPolicy = SpeculativeExecutionPolicy
  }
  
  @JSName("timestampGeneration")
  @js.native
  object timestampGenerationNs extends js.Object {
    trait MonotonicTimestampGenerator extends TimestampGenerator {
      def getDate(): scala.Double
    }
    
    @js.native
    trait MonotonicTimestampGeneratorStatic
      extends org.scalablytyped.runtime.Instantiable0[MonotonicTimestampGeneratorStatic]
         with org.scalablytyped.runtime.Instantiable1[/* warningThreshold */ scala.Double, MonotonicTimestampGeneratorStatic]
         with org.scalablytyped.runtime.Instantiable2[
              /* warningThreshold */ scala.Double, 
              /* minLogInterval */ scala.Double, 
              MonotonicTimestampGeneratorStatic
            ]
    
    trait TimestampGenerator extends js.Object {
      def next(client: cassandraDashDriverLib.cassandraDashDriverMod.Client): scala.Null | scala.Double | longLib.longMod.namespaced
    }
    
    var MonotonicTimestampGenerator: MonotonicTimestampGeneratorStatic = js.native
  }
  
}

