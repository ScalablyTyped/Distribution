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

