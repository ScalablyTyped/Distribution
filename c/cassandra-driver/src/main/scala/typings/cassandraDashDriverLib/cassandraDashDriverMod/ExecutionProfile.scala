package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "ExecutionProfile")
@js.native
class ExecutionProfileCls protected () extends ExecutionProfile {
  def this(name: java.lang.String, options: ExecutionProfileOptions) = this()
  /* CompleteClass */
  override var consistency: scala.Double = js.native
  /* CompleteClass */
  override var loadBalancing: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var readTimeout: scala.Double = js.native
  /* CompleteClass */
  override var retry: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy = js.native
  /* CompleteClass */
  override var serialConsistency: scala.Double = js.native
}

