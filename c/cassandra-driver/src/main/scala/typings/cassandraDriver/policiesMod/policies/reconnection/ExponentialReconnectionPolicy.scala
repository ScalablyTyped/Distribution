package typings.cassandraDriver.policiesMod.policies.reconnection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/policies", "policies.reconnection.ExponentialReconnectionPolicy")
@js.native
class ExponentialReconnectionPolicy protected () extends ReconnectionPolicy {
  def this(baseDelay: Double, maxDelay: Double) = this()
  def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
}
