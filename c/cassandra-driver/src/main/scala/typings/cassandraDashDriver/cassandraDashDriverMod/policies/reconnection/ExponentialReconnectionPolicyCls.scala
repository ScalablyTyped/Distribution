package typings.cassandraDashDriver.cassandraDashDriverMod.policies.reconnection

import typings.cassandraDashDriver.Anon_Next
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.reconnection.ExponentialReconnectionPolicy")
@js.native
class ExponentialReconnectionPolicyCls protected () extends ExponentialReconnectionPolicy {
  def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
  /* CompleteClass */
  override def getOptions(): Map[String, _] = js.native
  /* CompleteClass */
  override def newSchedule(): Anon_Next = js.native
}

