package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLayerVersionRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName = js.native
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber = js.native
}

object DeleteLayerVersionRequest {
  @scala.inline
  def apply(LayerName: LayerName, VersionNumber: LayerVersionNumber): DeleteLayerVersionRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLayerVersionRequest]
  }
  @scala.inline
  implicit class DeleteLayerVersionRequestOps[Self <: DeleteLayerVersionRequest] (val x: Self) extends AnyVal {
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
    def setLayerName(value: LayerName): Self = this.set("LayerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionNumber(value: LayerVersionNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
  }
  
}

