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

object ExecutionOptions {
  @scala.inline
  def apply(
    getCaptureStackTrace: js.Function0[scala.Boolean],
    getConsistency: js.Function0[cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies],
    getCustomPayload: js.Function0[org.scalablytyped.runtime.StringDictionary[js.Any]],
    getFetchSize: js.Function0[scala.Double],
    getFixedHost: js.Function0[Host],
    getHints: js.Function0[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]],
    getKeyspace: js.Function0[java.lang.String],
    getLoadBalancingPolicy: js.Function0[
      cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy
    ],
    getPageState: js.Function0[nodeLib.Buffer],
    getRawQueryOptions: js.Function0[QueryOptions],
    getReadTimeout: js.Function0[scala.Double],
    getRetryPolicy: js.Function0[cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy],
    getRoutingKey: js.Function0[nodeLib.Buffer | js.Array[nodeLib.Buffer]],
    getSerialConsistency: js.Function0[cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies],
    getTimestamp: js.Function0[
      js.UndefOr[
        scala.Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) | scala.Null
      ]
    ],
    isAutoPage: js.Function0[scala.Boolean],
    isBatchCounter: js.Function0[scala.Boolean],
    isBatchLogged: js.Function0[scala.Boolean],
    isIdempotent: js.Function0[scala.Boolean],
    isPrepared: js.Function0[scala.Boolean],
    isQueryTracing: js.Function0[scala.Boolean],
    setHints: js.Function1[js.Array[java.lang.String], scala.Unit]
  ): ExecutionOptions = {
    val __obj = js.Dynamic.literal(getCaptureStackTrace = getCaptureStackTrace, getConsistency = getConsistency, getCustomPayload = getCustomPayload, getFetchSize = getFetchSize, getFixedHost = getFixedHost, getHints = getHints, getKeyspace = getKeyspace, getLoadBalancingPolicy = getLoadBalancingPolicy, getPageState = getPageState, getRawQueryOptions = getRawQueryOptions, getReadTimeout = getReadTimeout, getRetryPolicy = getRetryPolicy, getRoutingKey = getRoutingKey, getSerialConsistency = getSerialConsistency, getTimestamp = getTimestamp, isAutoPage = isAutoPage, isBatchCounter = isBatchCounter, isBatchLogged = isBatchLogged, isIdempotent = isIdempotent, isPrepared = isPrepared, isQueryTracing = isQueryTracing, setHints = setHints)
  
    __obj.asInstanceOf[ExecutionOptions]
  }
}

