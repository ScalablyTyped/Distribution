package typings.cassandraDriver.policiesMod.policies.reconnection

import typings.std.Iterator
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/policies", "policies.reconnection.ExponentialReconnectionPolicy")
@js.native
class ExponentialReconnectionPolicy protected () extends ReconnectionPolicy {
  def this(baseDelay: Double, maxDelay: Double) = this()
  def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
  /* CompleteClass */
  override def getOptions(): Map[String, js.Object] = js.native
  /* CompleteClass */
  override def newSchedule(): Iterator[Double, _, js.UndefOr[scala.Nothing]] = js.native
}

