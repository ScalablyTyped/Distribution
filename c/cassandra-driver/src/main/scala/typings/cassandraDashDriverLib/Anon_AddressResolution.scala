package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_AddressResolution extends js.Object {
  var addressResolution: js.UndefOr[
    cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.addressResolutionNs.AddressTranslator
  ] = js.undefined
  var loadBalancing: js.UndefOr[
    cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy
  ] = js.undefined
  var reconnection: js.UndefOr[
    cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.reconnectionNs.ReconnectionPolicy
  ] = js.undefined
  var retry: js.UndefOr[cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy] = js.undefined
  var speculativeExecution: js.UndefOr[
    cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.speculativeExecutionNs.SpeculativeExecutionPolicy
  ] = js.undefined
  var timestampGeneration: js.UndefOr[
    cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.timestampGenerationNs.TimestampGenerator
  ] = js.undefined
}

