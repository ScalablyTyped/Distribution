package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionOptions extends js.Object {
  def getCaptureStackTrace(): scala.Boolean
  def getConsistency(): cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
  def getCustomPayload(): org.scalablytyped.runtime.StringDictionary[js.Any]
  def getFetchSize(): scala.Double
  def getFixedHost(): Host
  def getHints(): js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]
  def getKeyspace(): java.lang.String
  def getLoadBalancingPolicy(): cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy
  def getPageState(): nodeLib.Buffer
  def getRawQueryOptions(): QueryOptions
  def getReadTimeout(): scala.Double
  def getRetryPolicy(): cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy
  def getRoutingKey(): nodeLib.Buffer | js.Array[nodeLib.Buffer]
  def getSerialConsistency(): cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
  def getTimestamp(): js.UndefOr[
    scala.Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) | scala.Null
  ]
  def isAutoPage(): scala.Boolean
  def isBatchCounter(): scala.Boolean
  def isBatchLogged(): scala.Boolean
  def isIdempotent(): scala.Boolean
  def isPrepared(): scala.Boolean
  def isQueryTracing(): scala.Boolean
  def setHints(hints: js.Array[java.lang.String]): scala.Unit
}

@JSImport("cassandra-driver", "ExecutionOptions")
@js.native
class ExecutionOptionsCls () extends ExecutionOptions {
  /* CompleteClass */
  override def getCaptureStackTrace(): scala.Boolean = js.native
  /* CompleteClass */
  override def getConsistency(): cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies = js.native
  /* CompleteClass */
  override def getCustomPayload(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override def getFetchSize(): scala.Double = js.native
  /* CompleteClass */
  override def getFixedHost(): Host = js.native
  /* CompleteClass */
  override def getHints(): js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]] = js.native
  /* CompleteClass */
  override def getKeyspace(): java.lang.String = js.native
  /* CompleteClass */
  override def getLoadBalancingPolicy(): cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy = js.native
  /* CompleteClass */
  override def getPageState(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def getRawQueryOptions(): QueryOptions = js.native
  /* CompleteClass */
  override def getReadTimeout(): scala.Double = js.native
  /* CompleteClass */
  override def getRetryPolicy(): cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy = js.native
  /* CompleteClass */
  override def getRoutingKey(): nodeLib.Buffer | js.Array[nodeLib.Buffer] = js.native
  /* CompleteClass */
  override def getSerialConsistency(): cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies = js.native
  /* CompleteClass */
  override def getTimestamp(): js.UndefOr[
    scala.Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) | scala.Null
  ] = js.native
  /* CompleteClass */
  override def isAutoPage(): scala.Boolean = js.native
  /* CompleteClass */
  override def isBatchCounter(): scala.Boolean = js.native
  /* CompleteClass */
  override def isBatchLogged(): scala.Boolean = js.native
  /* CompleteClass */
  override def isIdempotent(): scala.Boolean = js.native
  /* CompleteClass */
  override def isPrepared(): scala.Boolean = js.native
  /* CompleteClass */
  override def isQueryTracing(): scala.Boolean = js.native
  /* CompleteClass */
  override def setHints(hints: js.Array[java.lang.String]): scala.Unit = js.native
}

object ExecutionOptions {
  @scala.inline
  def apply(
    getCaptureStackTrace: () => scala.Boolean,
    getConsistency: () => cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies,
    getCustomPayload: () => org.scalablytyped.runtime.StringDictionary[js.Any],
    getFetchSize: () => scala.Double,
    getFixedHost: () => Host,
    getHints: () => js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]],
    getKeyspace: () => java.lang.String,
    getLoadBalancingPolicy: () => cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy,
    getPageState: () => nodeLib.Buffer,
    getRawQueryOptions: () => QueryOptions,
    getReadTimeout: () => scala.Double,
    getRetryPolicy: () => cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy,
    getRoutingKey: () => nodeLib.Buffer | js.Array[nodeLib.Buffer],
    getSerialConsistency: () => cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies,
    getTimestamp: () => js.UndefOr[
      scala.Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) | scala.Null
    ],
    isAutoPage: () => scala.Boolean,
    isBatchCounter: () => scala.Boolean,
    isBatchLogged: () => scala.Boolean,
    isIdempotent: () => scala.Boolean,
    isPrepared: () => scala.Boolean,
    isQueryTracing: () => scala.Boolean,
    setHints: js.Array[java.lang.String] => scala.Unit
  ): ExecutionOptions = {
    val __obj = js.Dynamic.literal(getCaptureStackTrace = js.Any.fromFunction0(getCaptureStackTrace), getConsistency = js.Any.fromFunction0(getConsistency), getCustomPayload = js.Any.fromFunction0(getCustomPayload), getFetchSize = js.Any.fromFunction0(getFetchSize), getFixedHost = js.Any.fromFunction0(getFixedHost), getHints = js.Any.fromFunction0(getHints), getKeyspace = js.Any.fromFunction0(getKeyspace), getLoadBalancingPolicy = js.Any.fromFunction0(getLoadBalancingPolicy), getPageState = js.Any.fromFunction0(getPageState), getRawQueryOptions = js.Any.fromFunction0(getRawQueryOptions), getReadTimeout = js.Any.fromFunction0(getReadTimeout), getRetryPolicy = js.Any.fromFunction0(getRetryPolicy), getRoutingKey = js.Any.fromFunction0(getRoutingKey), getSerialConsistency = js.Any.fromFunction0(getSerialConsistency), getTimestamp = js.Any.fromFunction0(getTimestamp), isAutoPage = js.Any.fromFunction0(isAutoPage), isBatchCounter = js.Any.fromFunction0(isBatchCounter), isBatchLogged = js.Any.fromFunction0(isBatchLogged), isIdempotent = js.Any.fromFunction0(isIdempotent), isPrepared = js.Any.fromFunction0(isPrepared), isQueryTracing = js.Any.fromFunction0(isQueryTracing), setHints = js.Any.fromFunction1(setHints))
  
    __obj.asInstanceOf[ExecutionOptions]
  }
}

