package typings.cassandraDriver.policiesMod.policies

import typings.cassandraDriver.anon.Filter
import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.mod.EmptyCallback
import typings.cassandraDriver.mod.ExecutionOptions
import typings.cassandraDriver.mod.Host
import typings.cassandraDriver.mod.HostMap
import typings.cassandraDriver.typesMod.types.distance
import typings.std.Error
import typings.std.Iterator
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/policies", "policies.loadBalancing")
@js.native
object loadBalancing extends js.Object {
  
  @js.native
  class AllowListPolicy protected () extends LoadBalancingPolicy {
    def this(childPolicy: LoadBalancingPolicy, allowList: js.Array[String]) = this()
  }
  
  @js.native
  class DCAwareRoundRobinPolicy protected () extends LoadBalancingPolicy {
    def this(localDc: String) = this()
  }
  
  @js.native
  class DefaultLoadBalancingPolicy () extends LoadBalancingPolicy {
    def this(options: Filter) = this()
  }
  
  @js.native
  abstract class LoadBalancingPolicy () extends js.Object {
    
    def getDistance(host: Host): distance = js.native
    
    def getOptions(): Map[String, js.Object] = js.native
    
    def init(client: Client, hosts: HostMap, callback: EmptyCallback): Unit = js.native
    
    def newQueryPlan(
      keyspace: String,
      executionOptions: ExecutionOptions,
      callback: js.Function2[/* error */ Error, /* iterator */ Iterator[Host, _, js.UndefOr[scala.Nothing]], Unit]
    ): Unit = js.native
  }
  
  @js.native
  class RoundRobinPolicy () extends LoadBalancingPolicy
  
  @js.native
  class TokenAwarePolicy protected () extends LoadBalancingPolicy {
    def this(childPolicy: LoadBalancingPolicy) = this()
  }
  
  @js.native
  class WhiteListPolicy () extends AllowListPolicy
}
