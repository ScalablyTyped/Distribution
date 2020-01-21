package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeElasticLoadBalancersRequest extends js.Object {
  /**
    * A list of layer IDs. The action describes the Elastic Load Balancing instances for the specified layers.
    */
  var LayerIds: js.UndefOr[Strings] = js.native
  /**
    * A stack ID. The action describes the stack's Elastic Load Balancing instances.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeElasticLoadBalancersRequest {
  @scala.inline
  def apply(LayerIds: Strings = null, StackId: String = null): DescribeElasticLoadBalancersRequest = {
    val __obj = js.Dynamic.literal()
    if (LayerIds != null) __obj.updateDynamic("LayerIds")(LayerIds.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticLoadBalancersRequest]
  }
}

