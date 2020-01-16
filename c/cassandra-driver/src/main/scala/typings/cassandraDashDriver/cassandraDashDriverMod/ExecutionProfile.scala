package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.Anon_Consistency
import typings.cassandraDashDriver.Anon_Language
import typings.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDashDriver.libPoliciesMod.policies.retry.RetryPolicy
import typings.cassandraDashDriver.libTypesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "ExecutionProfile")
@js.native
class ExecutionProfile protected () extends js.Object {
  def this(name: String, options: Anon_Consistency) = this()
  var consistency: js.UndefOr[consistencies] = js.native
  var graphOptions: js.UndefOr[Anon_Language] = js.native
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  var name: String = js.native
  var readTimeout: js.UndefOr[Double] = js.native
  var retry: js.UndefOr[RetryPolicy] = js.native
  var serialConsistency: js.UndefOr[consistencies] = js.native
}

