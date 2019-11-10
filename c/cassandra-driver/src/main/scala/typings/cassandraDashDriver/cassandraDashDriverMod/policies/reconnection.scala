package typings.cassandraDashDriver.cassandraDashDriverMod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.reconnection")
@js.native
object reconnection extends js.Object {
  @js.native
  class ConstantReconnectionPolicy protected ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.reconnection.ConstantReconnectionPolicy {
    def this(delay: Double) = this()
  }
  
  @js.native
  class ExponentialReconnectionPolicy protected ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.reconnection.ExponentialReconnectionPolicy {
    def this(baseDelay: Double, maxDelay: Double) = this()
    def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
  }
  
}

