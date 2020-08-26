package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticLoadBalancersResult extends js.Object {
  /**
    * A list of ElasticLoadBalancer objects that describe the specified Elastic Load Balancing instances.
    */
  var ElasticLoadBalancers: js.UndefOr[typings.awsSdk.opsworksMod.ElasticLoadBalancers] = js.native
}

object DescribeElasticLoadBalancersResult {
  @scala.inline
  def apply(): DescribeElasticLoadBalancersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeElasticLoadBalancersResult]
  }
  @scala.inline
  implicit class DescribeElasticLoadBalancersResultOps[Self <: DescribeElasticLoadBalancersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElasticLoadBalancersVarargs(value: ElasticLoadBalancer*): Self = this.set("ElasticLoadBalancers", js.Array(value :_*))
    @scala.inline
    def setElasticLoadBalancers(value: ElasticLoadBalancers): Self = this.set("ElasticLoadBalancers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticLoadBalancers: Self = this.set("ElasticLoadBalancers", js.undefined)
  }
  
}

