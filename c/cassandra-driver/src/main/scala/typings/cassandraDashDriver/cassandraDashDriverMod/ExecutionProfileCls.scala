package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.cassandraDashDriverMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policies.retry.RetryPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "ExecutionProfile")
@js.native
class ExecutionProfileCls protected () extends ExecutionProfile {
  def this(name: String, options: ExecutionProfileOptions) = this()
  /* CompleteClass */
  override var consistency: Double = js.native
  /* CompleteClass */
  override var loadBalancing: LoadBalancingPolicy = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var readTimeout: Double = js.native
  /* CompleteClass */
  override var retry: RetryPolicy = js.native
  /* CompleteClass */
  override var serialConsistency: Double = js.native
}

