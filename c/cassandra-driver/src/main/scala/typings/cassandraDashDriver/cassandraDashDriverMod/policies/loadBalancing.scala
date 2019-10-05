package typings.cassandraDashDriver.cassandraDashDriverMod.policies

import typings.cassandraDashDriver.cassandraDashDriverMod.Callback
import typings.cassandraDashDriver.cassandraDashDriverMod.Client
import typings.cassandraDashDriver.cassandraDashDriverMod.ExecutionOptions
import typings.cassandraDashDriver.cassandraDashDriverMod.Host
import typings.cassandraDashDriver.cassandraDashDriverMod.HostMap
import typings.cassandraDashDriver.cassandraDashDriverMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.types.distance
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.loadBalancing")
@js.native
object loadBalancing extends js.Object {
  @js.native
  class DCAwareRoundRobinPolicy () extends LoadBalancingPolicy {
    def this(localDc: String) = this()
    var localDc: String = js.native
    var localHostsArray: js.Array[Host] = js.native
  }
  
  @js.native
  class LoadBalancingPolicy () extends js.Object {
    def getDistance(host: Host): distance = js.native
    def getOptions(): Map[String, _] = js.native
    def init(client: Client, hosts: HostMap, callback: Callback): Unit = js.native
    def newQueryPlan(keyspace: String, queryOptions: Null, callback: Callback): Unit = js.native
    def newQueryPlan(keyspace: String, queryOptions: ExecutionOptions, callback: Callback): Unit = js.native
  }
  
  @js.native
  class RoundRobinPolicy () extends LoadBalancingPolicy
  
  @js.native
  class TokenAwarePolicy protected () extends LoadBalancingPolicy {
    def this(childPolicy: LoadBalancingPolicy) = this()
  }
  
  @js.native
  class WhiteListPolicy protected () extends LoadBalancingPolicy {
    def this(childPolicy: LoadBalancingPolicy, whiteList: js.Array[String]) = this()
  }
  
}

