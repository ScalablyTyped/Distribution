package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.cassandraDashDriverMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policies.retry.RetryPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

