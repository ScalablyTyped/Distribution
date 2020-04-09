package typings.cassandraDriver.mod.policies

import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.defaultLoadBalancingPolicy")
@js.native
object defaultLoadBalancingPolicy extends js.Object {
  def apply(): LoadBalancingPolicy = js.native
  def apply(localDc: String): LoadBalancingPolicy = js.native
}

