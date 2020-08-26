package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSummary extends js.Object {
  /**
    * The time the input was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the input.
    */
  var inputArn: js.UndefOr[InputArn] = js.native
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.native
  /**
    * The name of the input.
    */
  var inputName: js.UndefOr[InputName] = js.native
  /**
    * The last time the input was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the input.
    */
  var status: js.UndefOr[InputStatus] = js.native
}

object InputSummary {
  @scala.inline
  def apply(): InputSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSummary]
  }
  @scala.inline
  implicit class InputSummaryOps[Self <: InputSummary] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setInputArn(value: InputArn): Self = this.set("inputArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputArn: Self = this.set("inputArn", js.undefined)
    @scala.inline
    def setInputDescription(value: InputDescription): Self = this.set("inputDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDescription: Self = this.set("inputDescription", js.undefined)
    @scala.inline
    def setInputName(value: InputName): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputName: Self = this.set("inputName", js.undefined)
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    @scala.inline
    def setStatus(value: InputStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

