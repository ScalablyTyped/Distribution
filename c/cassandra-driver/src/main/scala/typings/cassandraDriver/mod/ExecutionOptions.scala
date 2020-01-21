package typings.cassandraDriver.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.typesMod.types.Long
import typings.cassandraDriver.typesMod.types.consistencies
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
}

