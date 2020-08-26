package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMLModelOutput extends js.Object {
  /**
    * The ID assigned to the MLModel during creation. This value should be identical to the value of the MLModelID in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
}

object UpdateMLModelOutput {
  @scala.inline
  def apply(): UpdateMLModelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMLModelOutput]
  }
  @scala.inline
  implicit class UpdateMLModelOutputOps[Self <: UpdateMLModelOutput] (val x: Self) extends AnyVal {
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
    def setMLModelId(value: EntityId): Self = this.set("MLModelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMLModelId: Self = this.set("MLModelId", js.undefined)
  }
  
}

