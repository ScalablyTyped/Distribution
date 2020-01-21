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
  def apply(ElasticLoadBalancers: ElasticLoadBalancers = null): DescribeElasticLoadBalancersResult = {
    val __obj = js.Dynamic.literal()
    if (ElasticLoadBalancers != null) __obj.updateDynamic("ElasticLoadBalancers")(ElasticLoadBalancers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticLoadBalancersResult]
  }
}

