package typings.cassandraDriver.policiesMod.policies.reconnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/policies", "policies.reconnection.ConstantReconnectionPolicy")
@js.native
class ConstantReconnectionPolicy protected () extends ReconnectionPolicy {
  def this(delay: Double) = this()
}

