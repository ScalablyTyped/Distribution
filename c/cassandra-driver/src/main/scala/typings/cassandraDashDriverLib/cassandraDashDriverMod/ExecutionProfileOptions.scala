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

