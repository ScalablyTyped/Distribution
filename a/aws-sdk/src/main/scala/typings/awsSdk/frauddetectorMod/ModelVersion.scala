package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelVersion extends js.Object {
  /**
    * The model version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  /**
    * The model ID.
    */
  var modelId: modelIdentifier = js.native
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum = js.native
  /**
    * The model version number.
    */
  var modelVersionNumber: nonEmptyString = js.native
}

object ModelVersion {
  @scala.inline
  def apply(modelId: modelIdentifier, modelType: ModelTypeEnum, modelVersionNumber: nonEmptyString): ModelVersion = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelVersion]
  }
  @scala.inline
  implicit class ModelVersionOps[Self <: ModelVersion] (val x: Self) extends AnyVal {
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
    def setModelId(value: modelIdentifier): Self = this.set("modelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = this.set("modelType", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelVersionNumber(value: nonEmptyString): Self = this.set("modelVersionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: fraudDetectorArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
  }
  
}

