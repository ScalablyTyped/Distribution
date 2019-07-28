package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionOptions extends js.Object {
  def getCaptureStackTrace(): Boolean
  def getConsistency(): consistencies
  def getCustomPayload(): StringDictionary[js.Any]
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
  def getTimestamp(): js.UndefOr[
    Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ]
  def isAutoPage(): Boolean
  def isBatchCounter(): Boolean
  def isBatchLogged(): Boolean
  def isIdempotent(): Boolean
  def isPrepared(): Boolean
  def isQueryTracing(): Boolean
  def setHints(hints: js.Array[String]): Unit
}

@JSImport("cassandra-driver", "ExecutionOptions")
@js.native
class ExecutionOptionsCls () extends ExecutionOptions {
  /* CompleteClass */
  override def getCaptureStackTrace(): Boolean = js.native
  /* CompleteClass */
  override def getConsistency(): consistencies = js.native
  /* CompleteClass */
  override def getCustomPayload(): StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override def getFetchSize(): Double = js.native
  /* CompleteClass */
  override def getFixedHost(): Host = js.native
  /* CompleteClass */
  override def getHints(): js.Array[js.Array[String] | String] = js.native
  /* CompleteClass */
  override def getKeyspace(): String = js.native
  /* CompleteClass */
  override def getLoadBalancingPolicy(): LoadBalancingPolicy = js.native
  /* CompleteClass */
  override def getPageState(): Buffer = js.native
  /* CompleteClass */
  override def getRawQueryOptions(): QueryOptions = js.native
  /* CompleteClass */
  override def getReadTimeout(): Double = js.native
  /* CompleteClass */
  override def getRetryPolicy(): RetryPolicy = js.native
  /* CompleteClass */
  override def getRoutingKey(): Buffer | js.Array[Buffer] = js.native
  /* CompleteClass */
  override def getSerialConsistency(): consistencies = js.native
  /* CompleteClass */
  override def getTimestamp(): js.UndefOr[
    Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
  /* CompleteClass */
  override def isAutoPage(): Boolean = js.native
  /* CompleteClass */
  override def isBatchCounter(): Boolean = js.native
  /* CompleteClass */
  override def isBatchLogged(): Boolean = js.native
  /* CompleteClass */
  override def isIdempotent(): Boolean = js.native
  /* CompleteClass */
  override def isPrepared(): Boolean = js.native
  /* CompleteClass */
  override def isQueryTracing(): Boolean = js.native
  /* CompleteClass */
  override def setHints(hints: js.Array[String]): Unit = js.native
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
    getTimestamp: () => js.UndefOr[
      Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
    ],
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
}

