package typings.cassandraDriver.anon

import typings.cassandraDriver.policiesMod.policies.addressResolution.AddressTranslator
import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.reconnection.ReconnectionPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.policiesMod.policies.speculativeExecution.SpeculativeExecutionPolicy
import typings.cassandraDriver.policiesMod.policies.timestampGeneration.TimestampGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressResolution extends js.Object {
  var addressResolution: js.UndefOr[AddressTranslator] = js.native
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  var reconnection: js.UndefOr[ReconnectionPolicy] = js.native
  var retry: js.UndefOr[RetryPolicy] = js.native
  var speculativeExecution: js.UndefOr[SpeculativeExecutionPolicy] = js.native
  var timestampGeneration: js.UndefOr[TimestampGenerator] = js.native
}

object AddressResolution {
  @scala.inline
  def apply(): AddressResolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressResolution]
  }
  @scala.inline
  implicit class AddressResolutionOps[Self <: AddressResolution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressResolution(value: AddressTranslator): Self = this.set("addressResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressResolution: Self = this.set("addressResolution", js.undefined)
    @scala.inline
    def setLoadBalancing(value: LoadBalancingPolicy): Self = this.set("loadBalancing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancing: Self = this.set("loadBalancing", js.undefined)
    @scala.inline
    def setReconnection(value: ReconnectionPolicy): Self = this.set("reconnection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnection: Self = this.set("reconnection", js.undefined)
    @scala.inline
    def setRetry(value: RetryPolicy): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setSpeculativeExecution(value: SpeculativeExecutionPolicy): Self = this.set("speculativeExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeculativeExecution: Self = this.set("speculativeExecution", js.undefined)
    @scala.inline
    def setTimestampGeneration(value: TimestampGenerator): Self = this.set("timestampGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampGeneration: Self = this.set("timestampGeneration", js.undefined)
  }
  
}

