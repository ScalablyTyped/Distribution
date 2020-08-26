package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelVersionDetail extends js.Object {
  /**
    * The model version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  /**
    * The timestamp when the model was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The event details.
    */
  var externalEventsDetail: js.UndefOr[ExternalEventsDetail] = js.native
  /**
    * The timestamp when the model was last updated.
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
  /**
    * The model version number.
    */
  var modelVersionNumber: js.UndefOr[floatVersionString] = js.native
  /**
    * The status of the model version.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The training data schema.
    */
  var trainingDataSchema: js.UndefOr[TrainingDataSchema] = js.native
  /**
    * The model version training data source.
    */
  var trainingDataSource: js.UndefOr[TrainingDataSourceEnum] = js.native
  /**
    * The training results.
    */
  var trainingResult: js.UndefOr[TrainingResult] = js.native
}

object ModelVersionDetail {
  @scala.inline
  def apply(): ModelVersionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelVersionDetail]
  }
  @scala.inline
  implicit class ModelVersionDetailOps[Self <: ModelVersionDetail] (val x: Self) extends AnyVal {
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
    def setExternalEventsDetail(value: ExternalEventsDetail): Self = this.set("externalEventsDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalEventsDetail: Self = this.set("externalEventsDetail", js.undefined)
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
    @scala.inline
    def setModelVersionNumber(value: floatVersionString): Self = this.set("modelVersionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelVersionNumber: Self = this.set("modelVersionNumber", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTrainingDataSchema(value: TrainingDataSchema): Self = this.set("trainingDataSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingDataSchema: Self = this.set("trainingDataSchema", js.undefined)
    @scala.inline
    def setTrainingDataSource(value: TrainingDataSourceEnum): Self = this.set("trainingDataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingDataSource: Self = this.set("trainingDataSource", js.undefined)
    @scala.inline
    def setTrainingResult(value: TrainingResult): Self = this.set("trainingResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingResult: Self = this.set("trainingResult", js.undefined)
  }
  
}

