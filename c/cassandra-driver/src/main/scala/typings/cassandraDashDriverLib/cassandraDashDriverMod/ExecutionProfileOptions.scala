package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionProfileOptions extends js.Object {
  var consistency: scala.Double
  var loadBalancing: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy
  var name: java.lang.String
  var readTimeout: scala.Double
  var retry: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy
  var serialConsistency: scala.Double
}

object ExecutionProfileOptions {
  @scala.inline
  def apply(
    consistency: scala.Double,
    loadBalancing: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy,
    name: java.lang.String,
    readTimeout: scala.Double,
    retry: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy,
    serialConsistency: scala.Double
  ): ExecutionProfileOptions = {
    val __obj = js.Dynamic.literal(consistency = consistency, loadBalancing = loadBalancing, name = name, readTimeout = readTimeout, retry = retry, serialConsistency = serialConsistency)
  
    __obj.asInstanceOf[ExecutionProfileOptions]
  }
}

