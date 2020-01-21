package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLayersRequest extends js.Object {
  /**
    * An array of layer IDs that specify the layers to be described. If you omit this parameter, DescribeLayers returns a description of every layer in the specified stack.
    */
  var LayerIds: js.UndefOr[Strings] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeLayersRequest {
  @scala.inline
  def apply(LayerIds: Strings = null, StackId: String = null): DescribeLayersRequest = {
    val __obj = js.Dynamic.literal()
    if (LayerIds != null) __obj.updateDynamic("LayerIds")(LayerIds.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLayersRequest]
  }
}

