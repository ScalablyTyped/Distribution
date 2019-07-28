package typings.cassandraDashDriver

import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.addressResolutionNs.AddressTranslator
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.loadBalancingNs.LoadBalancingPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.reconnectionNs.ReconnectionPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.speculativeExecutionNs.SpeculativeExecutionPolicy
import typings.cassandraDashDriver.cassandraDashDriverMod.policiesNs.timestampGenerationNs.TimestampGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressResolution extends js.Object {
  var addressResolution: js.UndefOr[AddressTranslator] = js.undefined
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.undefined
  var reconnection: js.UndefOr[ReconnectionPolicy] = js.undefined
  var retry: js.UndefOr[RetryPolicy] = js.undefined
  var speculativeExecution: js.UndefOr[SpeculativeExecutionPolicy] = js.undefined
  var timestampGeneration: js.UndefOr[TimestampGenerator] = js.undefined
}

object Anon_AddressResolution {
  @scala.inline
  def apply(
    addressResolution: AddressTranslator = null,
    loadBalancing: LoadBalancingPolicy = null,
    reconnection: ReconnectionPolicy = null,
    retry: RetryPolicy = null,
    speculativeExecution: SpeculativeExecutionPolicy = null,
    timestampGeneration: TimestampGenerator = null
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

