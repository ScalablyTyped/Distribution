package typings.cassandraDriver.mod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.reconnection")
@js.native
object reconnection extends js.Object {
  @js.native
  class ConstantReconnectionPolicy protected ()
    extends typings.cassandraDriver.policiesMod.policies.reconnection.ConstantReconnectionPolicy {
    def this(delay: Double) = this()
  }
  
  @js.native
  class ExponentialReconnectionPolicy protected ()
    extends typings.cassandraDriver.policiesMod.policies.reconnection.ExponentialReconnectionPolicy {
    def this(baseDelay: Double, maxDelay: Double) = this()
    def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
  }
  
}

