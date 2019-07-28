package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionProfileOptions extends js.Object {
  var consistency: Double
  var loadBalancing: LoadBalancingPolicy
  var name: String
  var readTimeout: Double
  var retry: RetryPolicy
  var serialConsistency: Double
}

object ExecutionProfileOptions {
  @scala.inline
  def apply(
    consistency: Double,
    loadBalancing: LoadBalancingPolicy,
    name: String,
    readTimeout: Double,
    retry: RetryPolicy,
    serialConsistency: Double
  ): ExecutionProfileOptions = {
    val __obj = js.Dynamic.literal(consistency = consistency, loadBalancing = loadBalancing, name = name, readTimeout = readTimeout, retry = retry, serialConsistency = serialConsistency)
  
    __obj.asInstanceOf[ExecutionProfileOptions]
  }
}

