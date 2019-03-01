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

object Anon_AddressResolution {
  @scala.inline
  def apply(
    addressResolution: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.addressResolutionNs.AddressTranslator = null,
    loadBalancing: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy = null,
    reconnection: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.reconnectionNs.ReconnectionPolicy = null,
    retry: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy = null,
    speculativeExecution: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.speculativeExecutionNs.SpeculativeExecutionPolicy = null,
    timestampGeneration: cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.timestampGenerationNs.TimestampGenerator = null
  ): Anon_AddressResolution = {
    val __obj = js.Dynamic.literal()
    if (addressResolution != null) __obj.updateDynamic("addressResolution")(addressResolution)
    if (loadBalancing != null) __obj.updateDynamic("loadBalancing")(loadBalancing)
    if (reconnection != null) __obj.updateDynamic("reconnection")(reconnection)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (speculativeExecution != null) __obj.updateDynamic("speculativeExecution")(speculativeExecution)
    if (timestampGeneration != null) __obj.updateDynamic("timestampGeneration")(timestampGeneration)
    __obj.asInstanceOf[Anon_AddressResolution]
  }
}

