package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /**
    * The ARN of the model.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  /**
    * Timestamp of when the model was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The model description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The name of the event type.
    */
  var eventTypeName: js.UndefOr[String] = js.native
  /**
    * Timestamp of last time the model was updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[modelIdentifier] = js.native
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setArn(value: fraudDetectorArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreatedTime(value: time): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEventTypeName(value: String): Self = this.set("eventTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypeName: Self = this.set("eventTypeName", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: time): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    @scala.inline
    def setModelId(value: modelIdentifier): Self = this.set("modelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelId: Self = this.set("modelId", js.undefined)
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = this.set("modelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelType: Self = this.set("modelType", js.undefined)
  }
  
}

