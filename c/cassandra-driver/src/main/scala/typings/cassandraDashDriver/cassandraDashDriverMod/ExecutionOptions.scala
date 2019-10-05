package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.cassandraDashDriver.cassandraDashDriverMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policies.retry.RetryPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies
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
object ExecutionOptions extends TopLevel[ExecutionOptionsStatic]

