package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBasedAutoScalingRequest extends js.Object {
  /**
    * An array of layer IDs.
    */
  var LayerIds: Strings = js.native
}

object DescribeLoadBasedAutoScalingRequest {
  @scala.inline
  def apply(LayerIds: Strings): DescribeLoadBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(LayerIds = LayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBasedAutoScalingRequest]
  }
}

