package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputConfiguration extends js.Object {
  /**
    * The time the input was created.
    */
  var creationTime: Timestamp = js.native
  /**
    * The ARN of the input.
    */
  var inputArn: InputArn = js.native
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.native
  /**
    * The name of the input.
    */
  var inputName: InputName = js.native
  /**
    * The last time the input was updated.
    */
  var lastUpdateTime: Timestamp = js.native
  /**
    * The status of the input.
    */
  var status: InputStatus = js.native
}

object InputConfiguration {
  @scala.inline
  def apply(
    creationTime: Timestamp,
    inputArn: InputArn,
    inputName: InputName,
    lastUpdateTime: Timestamp,
    status: InputStatus
  ): InputConfiguration = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], inputArn = inputArn.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfiguration]
  }
  @scala.inline
  implicit class InputConfigurationOps[Self <: InputConfiguration] (val x: Self) extends AnyVal {
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
    def setInputArn(value: InputArn): Self = this.set("inputArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputName(value: InputName): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: InputStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputDescription(value: InputDescription): Self = this.set("inputDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDescription: Self = this.set("inputDescription", js.undefined)
  }
  
}

