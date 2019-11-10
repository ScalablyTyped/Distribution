package typings.cassandraDashDriver.cassandraDashDriverMod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.loadBalancing")
@js.native
object loadBalancing extends js.Object {
  @js.native
  class DCAwareRoundRobinPolicy protected ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.DCAwareRoundRobinPolicy {
    def this(localDc: String) = this()
  }
  
  @js.native
  abstract class LoadBalancingPolicy ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
  
  @js.native
  class RoundRobinPolicy ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.RoundRobinPolicy
  
  @js.native
  class TokenAwarePolicy protected ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.TokenAwarePolicy {
    def this(childPolicy: typings.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy) = this()
  }
  
  @js.native
  class WhiteListPolicy protected ()
    extends typings.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.WhiteListPolicy {
    def this(
      childPolicy: typings.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy,
      whiteList: js.Array[String]
    ) = this()
  }
  
}

