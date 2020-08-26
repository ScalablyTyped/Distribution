package typings.cassandraDriver.anon

import typings.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consistency extends js.Object {
  var consistency: js.UndefOr[consistencies] = js.native
  var graphOptions: js.UndefOr[Language] = js.native
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  var readTimeout: js.UndefOr[Double] = js.native
  var retry: js.UndefOr[RetryPolicy] = js.native
  var serialConsistency: js.UndefOr[consistencies] = js.native
}

object Consistency {
  @scala.inline
  def apply(): Consistency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Consistency]
  }
  @scala.inline
  implicit class ConsistencyOps[Self <: Consistency] (val x: Self) extends AnyVal {
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
    def setConsistency(value: consistencies): Self = this.set("consistency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistency: Self = this.set("consistency", js.undefined)
    @scala.inline
    def setGraphOptions(value: Language): Self = this.set("graphOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphOptions: Self = this.set("graphOptions", js.undefined)
    @scala.inline
    def setLoadBalancing(value: LoadBalancingPolicy): Self = this.set("loadBalancing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancing: Self = this.set("loadBalancing", js.undefined)
    @scala.inline
    def setReadTimeout(value: Double): Self = this.set("readTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadTimeout: Self = this.set("readTimeout", js.undefined)
    @scala.inline
    def setRetry(value: RetryPolicy): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setSerialConsistency(value: consistencies): Self = this.set("serialConsistency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialConsistency: Self = this.set("serialConsistency", js.undefined)
  }
  
}

