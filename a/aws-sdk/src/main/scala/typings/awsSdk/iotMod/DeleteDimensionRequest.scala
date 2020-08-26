package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDimensionRequest extends js.Object {
  /**
    * The unique identifier for the dimension that you want to delete.
    */
  var name: DimensionName = js.native
}

object DeleteDimensionRequest {
  @scala.inline
  def apply(name: DimensionName): DeleteDimensionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDimensionRequest]
  }
  @scala.inline
  implicit class DeleteDimensionRequestOps[Self <: DeleteDimensionRequest] (val x: Self) extends AnyVal {
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
    def setName(value: DimensionName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

