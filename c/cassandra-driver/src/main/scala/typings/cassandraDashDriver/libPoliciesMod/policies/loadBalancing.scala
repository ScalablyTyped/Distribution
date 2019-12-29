package typings.cassandraDashDriver.libPoliciesMod.policies

import typings.cassandraDashDriver.cassandraDashDriverMod.Client
import typings.cassandraDashDriver.cassandraDashDriverMod.EmptyCallback
import typings.cassandraDashDriver.cassandraDashDriverMod.ExecutionOptions
import typings.cassandraDashDriver.cassandraDashDriverMod.Host
import typings.cassandraDashDriver.cassandraDashDriverMod.HostMap
import typings.cassandraDashDriver.libTypesMod.types.distance
import typings.std.Error
import typings.std.Iterator
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/policies", "policies.loadBalancing")
@js.native
object loadBalancing extends js.Object {
  @js.native
  class DCAwareRoundRobinPolicy protected () extends LoadBalancingPolicy {
    def this(localDc: String) = this()
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
  class WhiteListPolicy protected () extends LoadBalancingPolicy {
    def this(childPolicy: LoadBalancingPolicy, whiteList: js.Array[String]) = this()
  }
  
}

