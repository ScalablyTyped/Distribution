package typings.cassandraDriver.mod

import typings.cassandraDriver.anon.Filter
import typings.cassandraDriver.policiesMod.policies.addressResolution.AddressTranslator
import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.reconnection.ReconnectionPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.policiesMod.policies.speculativeExecution.SpeculativeExecutionPolicy
import typings.cassandraDriver.policiesMod.policies.timestampGeneration.TimestampGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policies {
  
  object addressResolution {
    
    @JSImport("cassandra-driver", "policies.addressResolution.EC2MultiRegionTranslator")
    @js.native
    class EC2MultiRegionTranslator ()
      extends typings.cassandraDriver.policiesMod.policies.addressResolution.EC2MultiRegionTranslator
  }
  
  @JSImport("cassandra-driver", "policies.defaultAddressTranslator")
  @js.native
  def defaultAddressTranslator(): AddressTranslator = js.native
  
  @JSImport("cassandra-driver", "policies.defaultLoadBalancingPolicy")
  @js.native
  def defaultLoadBalancingPolicy(): LoadBalancingPolicy = js.native
  @JSImport("cassandra-driver", "policies.defaultLoadBalancingPolicy")
  @js.native
  def defaultLoadBalancingPolicy(localDc: String): LoadBalancingPolicy = js.native
  
  @JSImport("cassandra-driver", "policies.defaultReconnectionPolicy")
  @js.native
  def defaultReconnectionPolicy(): ReconnectionPolicy = js.native
  
  @JSImport("cassandra-driver", "policies.defaultRetryPolicy")
  @js.native
  def defaultRetryPolicy(): RetryPolicy = js.native
  
  @JSImport("cassandra-driver", "policies.defaultSpeculativeExecutionPolicy")
  @js.native
  def defaultSpeculativeExecutionPolicy(): SpeculativeExecutionPolicy = js.native
  
  @JSImport("cassandra-driver", "policies.defaultTimestampGenerator")
  @js.native
  def defaultTimestampGenerator(): TimestampGenerator = js.native
  
  object loadBalancing {
    
    @JSImport("cassandra-driver", "policies.loadBalancing.AllowListPolicy")
    @js.native
    class AllowListPolicy protected ()
      extends typings.cassandraDriver.policiesMod.policies.loadBalancing.AllowListPolicy {
      def this(
        childPolicy: typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy,
        allowList: js.Array[String]
      ) = this()
    }
    
    @JSImport("cassandra-driver", "policies.loadBalancing.DCAwareRoundRobinPolicy")
    @js.native
    class DCAwareRoundRobinPolicy protected ()
      extends typings.cassandraDriver.policiesMod.policies.loadBalancing.DCAwareRoundRobinPolicy {
      def this(localDc: String) = this()
    }
    
    @JSImport("cassandra-driver", "policies.loadBalancing.DefaultLoadBalancingPolicy")
    @js.native
    class DefaultLoadBalancingPolicy ()
      extends typings.cassandraDriver.policiesMod.policies.loadBalancing.DefaultLoadBalancingPolicy {
      def this(options: Filter) = this()
    }
    
    @JSImport("cassandra-driver", "policies.loadBalancing.LoadBalancingPolicy")
    @js.native
    abstract class LoadBalancingPolicy ()
      extends typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
    
    @JSImport("cassandra-driver", "policies.loadBalancing.RoundRobinPolicy")
    @js.native
    class RoundRobinPolicy ()
      extends typings.cassandraDriver.policiesMod.policies.loadBalancing.RoundRobinPolicy
    
    @JSImport("cassandra-driver", "policies.loadBalancing.TokenAwarePolicy")
    @js.native
    class TokenAwarePolicy protected ()
      extends typings.cassandraDriver.policiesMod.policies.loadBalancing.TokenAwarePolicy {
      def this(childPolicy: typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy) = this()
    }
    
    @JSImport("cassandra-driver", "policies.loadBalancing.WhiteListPolicy")
    @js.native
    class WhiteListPolicy protected ()
      extends typings.cassandraDriver.policiesMod.policies.loadBalancing.WhiteListPolicy {
      def this(
        childPolicy: typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy,
        allowList: js.Array[String]
      ) = this()
    }
  }
  
  object reconnection {
    
    @JSImport("cassandra-driver", "policies.reconnection.ConstantReconnectionPolicy")
    @js.native
    class ConstantReconnectionPolicy protected ()
      extends typings.cassandraDriver.policiesMod.policies.reconnection.ConstantReconnectionPolicy {
      def this(delay: Double) = this()
    }
    
    @JSImport("cassandra-driver", "policies.reconnection.ExponentialReconnectionPolicy")
    @js.native
    class ExponentialReconnectionPolicy protected ()
      extends typings.cassandraDriver.policiesMod.policies.reconnection.ExponentialReconnectionPolicy {
      def this(baseDelay: Double, maxDelay: Double) = this()
      def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
    }
  }
  
  object retry {
    
    @JSImport("cassandra-driver", "policies.retry.DecisionInfo")
    @js.native
    class DecisionInfo ()
      extends typings.cassandraDriver.policiesMod.policies.retry.DecisionInfo
    
    @JSImport("cassandra-driver", "policies.retry.FallthroughRetryPolicy")
    @js.native
    class FallthroughRetryPolicy ()
      extends typings.cassandraDriver.policiesMod.policies.retry.FallthroughRetryPolicy
    
    @JSImport("cassandra-driver", "policies.retry.IdempotenceAwareRetryPolicy")
    @js.native
    class IdempotenceAwareRetryPolicy protected ()
      extends typings.cassandraDriver.policiesMod.policies.retry.IdempotenceAwareRetryPolicy {
      def this(childPolicy: typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy) = this()
    }
    
    @JSImport("cassandra-driver", "policies.retry.OperationInfo")
    @js.native
    class OperationInfo ()
      extends typings.cassandraDriver.policiesMod.policies.retry.OperationInfo
    
    object RetryDecision {
      
      @JSImport("cassandra-driver", "policies.retry.RetryDecision.retryDecision")
      @js.native
      object retryDecision extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision with Double
              ] = js.native
        
        /* 0 */ val ignore: typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.ignore with Double = js.native
        
        /* 1 */ val rethrow: typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.rethrow with Double = js.native
        
        /* 2 */ val retry: typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.retry with Double = js.native
      }
    }
    
    @JSImport("cassandra-driver", "policies.retry.RetryPolicy")
    @js.native
    class RetryPolicy ()
      extends typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
  }
  
  object speculativeExecution {
    
    @JSImport("cassandra-driver", "policies.speculativeExecution.ConstantSpeculativeExecutionPolicy")
    @js.native
    class ConstantSpeculativeExecutionPolicy protected ()
      extends typings.cassandraDriver.policiesMod.policies.speculativeExecution.ConstantSpeculativeExecutionPolicy {
      def this(delay: Double, maxSpeculativeExecutions: Double) = this()
    }
    
    @JSImport("cassandra-driver", "policies.speculativeExecution.NoSpeculativeExecutionPolicy")
    @js.native
    class NoSpeculativeExecutionPolicy ()
      extends typings.cassandraDriver.policiesMod.policies.speculativeExecution.NoSpeculativeExecutionPolicy
  }
  
  object timestampGeneration {
    
    @JSImport("cassandra-driver", "policies.timestampGeneration.MonotonicTimestampGenerator")
    @js.native
    class MonotonicTimestampGenerator protected ()
      extends typings.cassandraDriver.policiesMod.policies.timestampGeneration.MonotonicTimestampGenerator {
      def this(warningThreshold: Double, minLogInterval: Double) = this()
    }
  }
}
