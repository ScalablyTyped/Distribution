package typings.cassandraDriver.mod.policies

import typings.cassandraDriver.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "policies.loadBalancing")
@js.native
object loadBalancing extends js.Object {
  
  @js.native
  class AllowListPolicy protected ()
    extends typings.cassandraDriver.policiesMod.policies.loadBalancing.AllowListPolicy {
    def this(
      childPolicy: typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy,
      allowList: js.Array[String]
    ) = this()
  }
  
  @js.native
  class DCAwareRoundRobinPolicy protected ()
    extends typings.cassandraDriver.policiesMod.policies.loadBalancing.DCAwareRoundRobinPolicy {
    def this(localDc: String) = this()
  }
  
  @js.native
  class DefaultLoadBalancingPolicy ()
    extends typings.cassandraDriver.policiesMod.policies.loadBalancing.DefaultLoadBalancingPolicy {
    def this(options: Filter) = this()
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
  class WhiteListPolicy ()
    extends typings.cassandraDriver.policiesMod.policies.loadBalancing.AllowListPolicy
}
