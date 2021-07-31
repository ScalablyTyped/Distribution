package typings.cassandraDriver.policiesMod

import typings.cassandraDriver.anon.Filter
import typings.cassandraDriver.anon.NextExecution
import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.mod.EmptyCallback
import typings.cassandraDriver.mod.ExecutionOptions
import typings.cassandraDriver.mod.Host
import typings.cassandraDriver.mod.HostMap
import typings.cassandraDriver.policiesMod.policies.addressResolution.AddressTranslator
import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.reconnection.ReconnectionPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.policiesMod.policies.speculativeExecution.SpeculativeExecutionPolicy
import typings.cassandraDriver.policiesMod.policies.timestampGeneration.TimestampGenerator
import typings.cassandraDriver.typesMod.types.Long
import typings.cassandraDriver.typesMod.types.consistencies
import typings.cassandraDriver.typesMod.types.distance
import typings.std.Error
import typings.std.Iterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policies {
  
  @JSImport("cassandra-driver/lib/policies", "policies")
  @js.native
  val ^ : js.Any = js.native
  
  object addressResolution {
    
    @JSImport("cassandra-driver/lib/policies", "policies.addressResolution.EC2MultiRegionTranslator")
    @js.native
    class EC2MultiRegionTranslator ()
      extends StObject
         with AddressTranslator {
      
      /* CompleteClass */
      override def translate(address: String, port: Double, callback: js.Function): Unit = js.native
    }
    
    trait AddressTranslator extends StObject {
      
      def translate(address: String, port: Double, callback: js.Function): Unit
    }
    object AddressTranslator {
      
      @scala.inline
      def apply(translate: (String, Double, js.Function) => Unit): AddressTranslator = {
        val __obj = js.Dynamic.literal(translate = js.Any.fromFunction3(translate))
        __obj.asInstanceOf[AddressTranslator]
      }
      
      @scala.inline
      implicit class AddressTranslatorMutableBuilder[Self <: AddressTranslator] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTranslate(value: (String, Double, js.Function) => Unit): Self = StObject.set(x, "translate", js.Any.fromFunction3(value))
      }
    }
  }
  
  @scala.inline
  def defaultAddressTranslator(): AddressTranslator = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultAddressTranslator")().asInstanceOf[AddressTranslator]
  
  @scala.inline
  def defaultLoadBalancingPolicy(): LoadBalancingPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLoadBalancingPolicy")().asInstanceOf[LoadBalancingPolicy]
  @scala.inline
  def defaultLoadBalancingPolicy(localDc: String): LoadBalancingPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLoadBalancingPolicy")(localDc.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingPolicy]
  
  @scala.inline
  def defaultReconnectionPolicy(): ReconnectionPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultReconnectionPolicy")().asInstanceOf[ReconnectionPolicy]
  
  @scala.inline
  def defaultRetryPolicy(): RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryPolicy")().asInstanceOf[RetryPolicy]
  
  @scala.inline
  def defaultSpeculativeExecutionPolicy(): SpeculativeExecutionPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSpeculativeExecutionPolicy")().asInstanceOf[SpeculativeExecutionPolicy]
  
  @scala.inline
  def defaultTimestampGenerator(): TimestampGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTimestampGenerator")().asInstanceOf[TimestampGenerator]
  
  object loadBalancing {
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.AllowListPolicy")
    @js.native
    class AllowListPolicy protected () extends LoadBalancingPolicy {
      def this(childPolicy: LoadBalancingPolicy, allowList: js.Array[String]) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.DCAwareRoundRobinPolicy")
    @js.native
    class DCAwareRoundRobinPolicy protected () extends LoadBalancingPolicy {
      def this(localDc: String) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.DefaultLoadBalancingPolicy")
    @js.native
    class DefaultLoadBalancingPolicy () extends LoadBalancingPolicy {
      def this(options: Filter) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.LoadBalancingPolicy")
    @js.native
    abstract class LoadBalancingPolicy () extends StObject {
      
      def getDistance(host: Host): distance = js.native
      
      def getOptions(): Map[String, js.Object] = js.native
      
      def init(client: Client, hosts: HostMap, callback: EmptyCallback): Unit = js.native
      
      def newQueryPlan(
        keyspace: String,
        executionOptions: ExecutionOptions,
        callback: js.Function2[/* error */ Error, /* iterator */ Iterator[Host, js.Any, Unit], Unit]
      ): Unit = js.native
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.RoundRobinPolicy")
    @js.native
    class RoundRobinPolicy () extends LoadBalancingPolicy
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.TokenAwarePolicy")
    @js.native
    class TokenAwarePolicy protected () extends LoadBalancingPolicy {
      def this(childPolicy: LoadBalancingPolicy) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.WhiteListPolicy")
    @js.native
    class WhiteListPolicy protected () extends AllowListPolicy {
      def this(childPolicy: LoadBalancingPolicy, allowList: js.Array[String]) = this()
    }
  }
  
  object reconnection {
    
    @JSImport("cassandra-driver/lib/policies", "policies.reconnection.ConstantReconnectionPolicy")
    @js.native
    class ConstantReconnectionPolicy protected ()
      extends StObject
         with ReconnectionPolicy {
      def this(delay: Double) = this()
      
      /* CompleteClass */
      override def getOptions(): Map[String, js.Object] = js.native
      
      /* CompleteClass */
      override def newSchedule(): Iterator[Double, js.Any, Unit] = js.native
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.reconnection.ExponentialReconnectionPolicy")
    @js.native
    class ExponentialReconnectionPolicy protected ()
      extends StObject
         with ReconnectionPolicy {
      def this(baseDelay: Double, maxDelay: Double) = this()
      def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
      
      /* CompleteClass */
      override def getOptions(): Map[String, js.Object] = js.native
      
      /* CompleteClass */
      override def newSchedule(): Iterator[Double, js.Any, Unit] = js.native
    }
    
    trait ReconnectionPolicy extends StObject {
      
      def getOptions(): Map[String, js.Object]
      
      def newSchedule(): Iterator[Double, js.Any, Unit]
    }
    object ReconnectionPolicy {
      
      @scala.inline
      def apply(getOptions: () => Map[String, js.Object], newSchedule: () => Iterator[Double, js.Any, Unit]): ReconnectionPolicy = {
        val __obj = js.Dynamic.literal(getOptions = js.Any.fromFunction0(getOptions), newSchedule = js.Any.fromFunction0(newSchedule))
        __obj.asInstanceOf[ReconnectionPolicy]
      }
      
      @scala.inline
      implicit class ReconnectionPolicyMutableBuilder[Self <: ReconnectionPolicy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetOptions(value: () => Map[String, js.Object]): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
        
        @scala.inline
        def setNewSchedule(value: () => Iterator[Double, js.Any, Unit]): Self = StObject.set(x, "newSchedule", js.Any.fromFunction0(value))
      }
    }
  }
  
  object retry {
    
    @JSImport("cassandra-driver/lib/policies", "policies.retry.DecisionInfo")
    @js.native
    class DecisionInfo () extends StObject {
      
      var consistency: consistencies = js.native
      
      var decision: Double = js.native
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.retry.FallthroughRetryPolicy")
    @js.native
    class FallthroughRetryPolicy () extends RetryPolicy
    
    @JSImport("cassandra-driver/lib/policies", "policies.retry.IdempotenceAwareRetryPolicy")
    @js.native
    class IdempotenceAwareRetryPolicy protected () extends RetryPolicy {
      def this(childPolicy: RetryPolicy) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.retry.OperationInfo")
    @js.native
    class OperationInfo () extends StObject {
      
      var executionOptions: ExecutionOptions = js.native
      
      var nbRetry: Double = js.native
      
      var query: String = js.native
    }
    
    object RetryDecision {
      
      @js.native
      sealed trait retryDecision extends StObject
      @JSImport("cassandra-driver/lib/policies", "policies.retry.RetryDecision.retryDecision")
      @js.native
      object retryDecision extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[retryDecision & Double] = js.native
        
        @js.native
        sealed trait ignore
          extends StObject
             with retryDecision
        /* 0 */ val ignore: typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.ignore & Double = js.native
        
        @js.native
        sealed trait rethrow
          extends StObject
             with retryDecision
        /* 1 */ val rethrow: typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.rethrow & Double = js.native
        
        @js.native
        sealed trait retry
          extends StObject
             with retryDecision
        /* 2 */ val retry: typings.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.retry & Double = js.native
      }
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.retry.RetryPolicy")
    @js.native
    class RetryPolicy () extends StObject {
      
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
  
  object speculativeExecution {
    
    @JSImport("cassandra-driver/lib/policies", "policies.speculativeExecution.ConstantSpeculativeExecutionPolicy")
    @js.native
    class ConstantSpeculativeExecutionPolicy protected ()
      extends StObject
         with SpeculativeExecutionPolicy {
      def this(delay: Double, maxSpeculativeExecutions: Double) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.speculativeExecution.NoSpeculativeExecutionPolicy")
    @js.native
    class NoSpeculativeExecutionPolicy ()
      extends StObject
         with SpeculativeExecutionPolicy
    
    @js.native
    trait SpeculativeExecutionPolicy extends StObject {
      
      def getOptions(): Map[String, js.Object] = js.native
      
      def init(client: Client): Unit = js.native
      
      def newPlan(keyspace: String, queryInfo: String): NextExecution = js.native
      def newPlan(keyspace: String, queryInfo: js.Array[js.Object]): NextExecution = js.native
      
      def shutdown(): Unit = js.native
    }
  }
  
  object timestampGeneration {
    
    @JSImport("cassandra-driver/lib/policies", "policies.timestampGeneration.MonotonicTimestampGenerator")
    @js.native
    class MonotonicTimestampGenerator protected ()
      extends StObject
         with TimestampGenerator {
      def this(warningThreshold: Double, minLogInterval: Double) = this()
      
      def getDate(): Double = js.native
      
      /* CompleteClass */
      override def next(client: Client): Long | Double = js.native
    }
    
    trait TimestampGenerator extends StObject {
      
      def next(client: Client): Long | Double
    }
    object TimestampGenerator {
      
      @scala.inline
      def apply(next: Client => Long | Double): TimestampGenerator = {
        val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
        __obj.asInstanceOf[TimestampGenerator]
      }
      
      @scala.inline
      implicit class TimestampGeneratorMutableBuilder[Self <: TimestampGenerator] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNext(value: Client => Long | Double): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      }
    }
  }
}
