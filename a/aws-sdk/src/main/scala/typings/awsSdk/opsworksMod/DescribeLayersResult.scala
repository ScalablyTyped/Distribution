package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLayersResult extends js.Object {
  /**
    * An array of Layer objects that describe the layers.
    */
  var Layers: js.UndefOr[typings.awsSdk.opsworksMod.Layers] = js.native
}

object DescribeLayersResult {
  @scala.inline
  def apply(): DescribeLayersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLayersResult]
  }
  @scala.inline
  implicit class DescribeLayersResultOps[Self <: DescribeLayersResult] (val x: Self) extends AnyVal {
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
    def setLayersVarargs(value: Layer*): Self = this.set("Layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: Layers): Self = this.set("Layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("Layers", js.undefined)
  }
  
}

