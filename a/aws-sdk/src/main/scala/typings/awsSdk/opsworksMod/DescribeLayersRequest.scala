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
  def apply(): DescribeLayersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLayersRequest]
  }
  @scala.inline
  implicit class DescribeLayersRequestOps[Self <: DescribeLayersRequest] (val x: Self) extends AnyVal {
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
    def setLayerIdsVarargs(value: String*): Self = this.set("LayerIds", js.Array(value :_*))
    @scala.inline
    def setLayerIds(value: Strings): Self = this.set("LayerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerIds: Self = this.set("LayerIds", js.undefined)
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

