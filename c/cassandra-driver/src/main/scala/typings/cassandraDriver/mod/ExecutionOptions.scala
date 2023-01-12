package typings.cassandraDriver.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.libPoliciesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.libTypesMod.types.Long
import typings.cassandraDriver.libTypesMod.types.consistencies
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionOptions extends StObject {
  
  def getCaptureStackTrace(): Boolean
  
  def getConsistency(): consistencies
  
  def getCustomPayload(): StringDictionary[Any]
  
  def getFetchSize(): Double
  
  def getFixedHost(): Host
  
  def getHints(): js.Array[js.Array[String] | String]
  
  def getKeyspace(): String
  
  def getLoadBalancingPolicy(): LoadBalancingPolicy
  
  def getPageState(): Buffer
  
  def getRawQueryOptions(): QueryOptions
  
  def getReadTimeout(): Double
  
  def getRetryPolicy(): RetryPolicy
  
  def getRoutingKey(): Buffer | js.Array[Buffer]
  
  def getSerialConsistency(): consistencies
  
  def getTimestamp(): js.UndefOr[Double | Long | Null]
  
  def isAutoPage(): Boolean
  
  def isBatchCounter(): Boolean
  
  def isBatchLogged(): Boolean
  
  def isIdempotent(): Boolean
  
  def isPrepared(): Boolean
  
  def isQueryTracing(): Boolean
  
  def setHints(hints: js.Array[String]): Unit
}
object ExecutionOptions {
  
  inline def apply(
    getCaptureStackTrace: () => Boolean,
    getConsistency: () => consistencies,
    getCustomPayload: () => StringDictionary[Any],
    getFetchSize: () => Double,
    getFixedHost: () => Host,
    getHints: () => js.Array[js.Array[String] | String],
    getKeyspace: () => String,
    getLoadBalancingPolicy: () => LoadBalancingPolicy,
    getPageState: () => Buffer,
    getRawQueryOptions: () => QueryOptions,
    getReadTimeout: () => Double,
    getRetryPolicy: () => RetryPolicy,
    getRoutingKey: () => Buffer | js.Array[Buffer],
    getSerialConsistency: () => consistencies,
    getTimestamp: () => js.UndefOr[Double | Long | Null],
    isAutoPage: () => Boolean,
    isBatchCounter: () => Boolean,
    isBatchLogged: () => Boolean,
    isIdempotent: () => Boolean,
    isPrepared: () => Boolean,
    isQueryTracing: () => Boolean,
    setHints: js.Array[String] => Unit
  ): ExecutionOptions = {
    val __obj = js.Dynamic.literal(getCaptureStackTrace = js.Any.fromFunction0(getCaptureStackTrace), getConsistency = js.Any.fromFunction0(getConsistency), getCustomPayload = js.Any.fromFunction0(getCustomPayload), getFetchSize = js.Any.fromFunction0(getFetchSize), getFixedHost = js.Any.fromFunction0(getFixedHost), getHints = js.Any.fromFunction0(getHints), getKeyspace = js.Any.fromFunction0(getKeyspace), getLoadBalancingPolicy = js.Any.fromFunction0(getLoadBalancingPolicy), getPageState = js.Any.fromFunction0(getPageState), getRawQueryOptions = js.Any.fromFunction0(getRawQueryOptions), getReadTimeout = js.Any.fromFunction0(getReadTimeout), getRetryPolicy = js.Any.fromFunction0(getRetryPolicy), getRoutingKey = js.Any.fromFunction0(getRoutingKey), getSerialConsistency = js.Any.fromFunction0(getSerialConsistency), getTimestamp = js.Any.fromFunction0(getTimestamp), isAutoPage = js.Any.fromFunction0(isAutoPage), isBatchCounter = js.Any.fromFunction0(isBatchCounter), isBatchLogged = js.Any.fromFunction0(isBatchLogged), isIdempotent = js.Any.fromFunction0(isIdempotent), isPrepared = js.Any.fromFunction0(isPrepared), isQueryTracing = js.Any.fromFunction0(isQueryTracing), setHints = js.Any.fromFunction1(setHints))
    __obj.asInstanceOf[ExecutionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionOptions] (val x: Self) extends AnyVal {
    
    inline def setGetCaptureStackTrace(value: () => Boolean): Self = StObject.set(x, "getCaptureStackTrace", js.Any.fromFunction0(value))
    
    inline def setGetConsistency(value: () => consistencies): Self = StObject.set(x, "getConsistency", js.Any.fromFunction0(value))
    
    inline def setGetCustomPayload(value: () => StringDictionary[Any]): Self = StObject.set(x, "getCustomPayload", js.Any.fromFunction0(value))
    
    inline def setGetFetchSize(value: () => Double): Self = StObject.set(x, "getFetchSize", js.Any.fromFunction0(value))
    
    inline def setGetFixedHost(value: () => Host): Self = StObject.set(x, "getFixedHost", js.Any.fromFunction0(value))
    
    inline def setGetHints(value: () => js.Array[js.Array[String] | String]): Self = StObject.set(x, "getHints", js.Any.fromFunction0(value))
    
    inline def setGetKeyspace(value: () => String): Self = StObject.set(x, "getKeyspace", js.Any.fromFunction0(value))
    
    inline def setGetLoadBalancingPolicy(value: () => LoadBalancingPolicy): Self = StObject.set(x, "getLoadBalancingPolicy", js.Any.fromFunction0(value))
    
    inline def setGetPageState(value: () => Buffer): Self = StObject.set(x, "getPageState", js.Any.fromFunction0(value))
    
    inline def setGetRawQueryOptions(value: () => QueryOptions): Self = StObject.set(x, "getRawQueryOptions", js.Any.fromFunction0(value))
    
    inline def setGetReadTimeout(value: () => Double): Self = StObject.set(x, "getReadTimeout", js.Any.fromFunction0(value))
    
    inline def setGetRetryPolicy(value: () => RetryPolicy): Self = StObject.set(x, "getRetryPolicy", js.Any.fromFunction0(value))
    
    inline def setGetRoutingKey(value: () => Buffer | js.Array[Buffer]): Self = StObject.set(x, "getRoutingKey", js.Any.fromFunction0(value))
    
    inline def setGetSerialConsistency(value: () => consistencies): Self = StObject.set(x, "getSerialConsistency", js.Any.fromFunction0(value))
    
    inline def setGetTimestamp(value: () => js.UndefOr[Double | Long | Null]): Self = StObject.set(x, "getTimestamp", js.Any.fromFunction0(value))
    
    inline def setIsAutoPage(value: () => Boolean): Self = StObject.set(x, "isAutoPage", js.Any.fromFunction0(value))
    
    inline def setIsBatchCounter(value: () => Boolean): Self = StObject.set(x, "isBatchCounter", js.Any.fromFunction0(value))
    
    inline def setIsBatchLogged(value: () => Boolean): Self = StObject.set(x, "isBatchLogged", js.Any.fromFunction0(value))
    
    inline def setIsIdempotent(value: () => Boolean): Self = StObject.set(x, "isIdempotent", js.Any.fromFunction0(value))
    
    inline def setIsPrepared(value: () => Boolean): Self = StObject.set(x, "isPrepared", js.Any.fromFunction0(value))
    
    inline def setIsQueryTracing(value: () => Boolean): Self = StObject.set(x, "isQueryTracing", js.Any.fromFunction0(value))
    
    inline def setSetHints(value: js.Array[String] => Unit): Self = StObject.set(x, "setHints", js.Any.fromFunction1(value))
  }
}
