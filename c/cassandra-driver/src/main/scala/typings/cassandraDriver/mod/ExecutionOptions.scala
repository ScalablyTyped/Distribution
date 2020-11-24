package typings.cassandraDriver.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.typesMod.types.Long
import typings.cassandraDriver.typesMod.types.consistencies
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionOptions extends js.Object {
  
  def getCaptureStackTrace(): Boolean = js.native
  
  def getConsistency(): consistencies = js.native
  
  def getCustomPayload(): StringDictionary[js.Any] = js.native
  
  def getFetchSize(): Double = js.native
  
  def getFixedHost(): Host = js.native
  
  def getHints(): js.Array[js.Array[String] | String] = js.native
  
  def getKeyspace(): String = js.native
  
  def getLoadBalancingPolicy(): LoadBalancingPolicy = js.native
  
  def getPageState(): Buffer = js.native
  
  def getRawQueryOptions(): QueryOptions = js.native
  
  def getReadTimeout(): Double = js.native
  
  def getRetryPolicy(): RetryPolicy = js.native
  
  def getRoutingKey(): Buffer | js.Array[Buffer] = js.native
  
  def getSerialConsistency(): consistencies = js.native
  
  def getTimestamp(): js.UndefOr[Double | Long | Null] = js.native
  
  def isAutoPage(): Boolean = js.native
  
  def isBatchCounter(): Boolean = js.native
  
  def isBatchLogged(): Boolean = js.native
  
  def isIdempotent(): Boolean = js.native
  
  def isPrepared(): Boolean = js.native
  
  def isQueryTracing(): Boolean = js.native
  
  def setHints(hints: js.Array[String]): Unit = js.native
}
object ExecutionOptions {
  
  @scala.inline
  def apply(
    getCaptureStackTrace: () => Boolean,
    getConsistency: () => consistencies,
    getCustomPayload: () => StringDictionary[js.Any],
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
  implicit class ExecutionOptionsOps[Self <: ExecutionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetCaptureStackTrace(value: () => Boolean): Self = this.set("getCaptureStackTrace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetConsistency(value: () => consistencies): Self = this.set("getConsistency", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomPayload(value: () => StringDictionary[js.Any]): Self = this.set("getCustomPayload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFetchSize(value: () => Double): Self = this.set("getFetchSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFixedHost(value: () => Host): Self = this.set("getFixedHost", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHints(value: () => js.Array[js.Array[String] | String]): Self = this.set("getHints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKeyspace(value: () => String): Self = this.set("getKeyspace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLoadBalancingPolicy(value: () => LoadBalancingPolicy): Self = this.set("getLoadBalancingPolicy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPageState(value: () => Buffer): Self = this.set("getPageState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawQueryOptions(value: () => QueryOptions): Self = this.set("getRawQueryOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReadTimeout(value: () => Double): Self = this.set("getReadTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRetryPolicy(value: () => RetryPolicy): Self = this.set("getRetryPolicy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRoutingKey(value: () => Buffer | js.Array[Buffer]): Self = this.set("getRoutingKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSerialConsistency(value: () => consistencies): Self = this.set("getSerialConsistency", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimestamp(value: () => js.UndefOr[Double | Long | Null]): Self = this.set("getTimestamp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAutoPage(value: () => Boolean): Self = this.set("isAutoPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBatchCounter(value: () => Boolean): Self = this.set("isBatchCounter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBatchLogged(value: () => Boolean): Self = this.set("isBatchLogged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIdempotent(value: () => Boolean): Self = this.set("isIdempotent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPrepared(value: () => Boolean): Self = this.set("isPrepared", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsQueryTracing(value: () => Boolean): Self = this.set("isQueryTracing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHints(value: js.Array[String] => Unit): Self = this.set("setHints", js.Any.fromFunction1(value))
  }
}
