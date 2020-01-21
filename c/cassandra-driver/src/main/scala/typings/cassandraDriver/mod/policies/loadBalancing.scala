package typings.cassandraDriver.mod.policies

import typings.cassandraDriver.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.loadBalancing")
@js.native
object loadBalancing extends js.Object {
  @js.native
  class DCAwareRoundRobinPolicy protected ()
    extends typings.cassandraDriver.policiesMod.policies.loadBalancing.DCAwareRoundRobinPolicy {
    def this(localDc: String) = this()
  }
  
  @js.native
  class DefaultLoadBalancingPolicy ()
    extends typings.cassandraDriver.policiesMod.policies.loadBalancing.DefaultLoadBalancingPolicy {
    def this(options: AnonFilter) = this()
  }
  
  @js.native
  abstract class LoadBalancingPolicy ()
    extends typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
  
  @js.native
  class RoundRobinPolicy ()
    extends typings.cassandraDriver.policiesMod.policies.loadBalancing.RoundRobinPolicy
  
  @js.native
  class TokenAwarePolicy protected ()
    extends typings.cassandraDriver.policiesMod.policies.loadBalancing.TokenAwarePolicy {
    def this(childPolicy: typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy) = this()
  }
  
  @js.native
  class WhiteListPolicy protected ()
    extends typings.cassandraDriver.policiesMod.policies.loadBalancing.WhiteListPolicy {
    def this(
      childPolicy: typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy,
      whiteList: js.Array[String]
    ) = this()
  }
  
}

