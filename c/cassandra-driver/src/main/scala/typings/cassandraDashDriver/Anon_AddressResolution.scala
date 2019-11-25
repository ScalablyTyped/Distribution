package typings.cassandraDashDriver

import typings.cassandraDashDriver.libPoliciesMod.policies.addressResolution.AddressTranslator
import typings.cassandraDashDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDashDriver.libPoliciesMod.policies.reconnection.ReconnectionPolicy
import typings.cassandraDashDriver.libPoliciesMod.policies.retry.RetryPolicy
import typings.cassandraDashDriver.libPoliciesMod.policies.speculativeExecution.SpeculativeExecutionPolicy
import typings.cassandraDashDriver.libPoliciesMod.policies.timestampGeneration.TimestampGenerator
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
    if (addressResolution != null) __obj.updateDynamic("addressResolution")(addressResolution.asInstanceOf[js.Any])
    if (loadBalancing != null) __obj.updateDynamic("loadBalancing")(loadBalancing.asInstanceOf[js.Any])
    if (reconnection != null) __obj.updateDynamic("reconnection")(reconnection.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (speculativeExecution != null) __obj.updateDynamic("speculativeExecution")(speculativeExecution.asInstanceOf[js.Any])
    if (timestampGeneration != null) __obj.updateDynamic("timestampGeneration")(timestampGeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddressResolution]
  }
}

