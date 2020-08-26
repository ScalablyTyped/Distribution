package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPrediction extends js.Object {
  /**
    * The ID of the DataSource that points to the group of observations to predict.
    */
  var BatchPredictionDataSourceId: js.UndefOr[EntityId] = js.native
  /**
    * The ID assigned to the BatchPrediction at creation. This value should be identical to the value of the BatchPredictionID in the request. 
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.native
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the BatchPrediction was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The AWS user account that invoked the BatchPrediction. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  var FinishedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.native
  var InvalidRecordCount: js.UndefOr[LongType] = js.native
  /**
    * The time of the most recent edit to the BatchPrediction. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The ID of the MLModel that generated predictions for the BatchPrediction request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  /**
    * A description of the most recent details about processing the batch prediction request.
    */
  var Message: js.UndefOr[typings.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the BatchPrediction.
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * The location of an Amazon S3 bucket or directory to receive the operation results. The following substrings are not allowed in the s3 key portion of the outputURI field: ':', '//', '/./', '/../'.
    */
  var OutputUri: js.UndefOr[S3Url] = js.native
  var StartedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The status of the BatchPrediction. This element can have one of the following values:   PENDING - Amazon Machine Learning (Amazon ML) submitted a request to generate predictions for a batch of observations.  INPROGRESS - The process is underway.  FAILED - The request to perform a batch prediction did not run to completion. It is not usable.  COMPLETED - The batch prediction process completed successfully.  DELETED - The BatchPrediction is marked as deleted. It is not usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
  var TotalRecordCount: js.UndefOr[LongType] = js.native
}

object BatchPrediction {
  @scala.inline
  def apply(): BatchPrediction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPrediction]
  }
  @scala.inline
  implicit class BatchPredictionOps[Self <: BatchPrediction] (val x: Self) extends AnyVal {
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
    def setBatchPredictionDataSourceId(value: EntityId): Self = this.set("BatchPredictionDataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchPredictionDataSourceId: Self = this.set("BatchPredictionDataSourceId", js.undefined)
    @scala.inline
    def setBatchPredictionId(value: EntityId): Self = this.set("BatchPredictionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchPredictionId: Self = this.set("BatchPredictionId", js.undefined)
    @scala.inline
    def setComputeTime(value: LongType): Self = this.set("ComputeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeTime: Self = this.set("ComputeTime", js.undefined)
    @scala.inline
    def setCreatedAt(value: EpochTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setCreatedByIamUser(value: AwsUserArn): Self = this.set("CreatedByIamUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedByIamUser: Self = this.set("CreatedByIamUser", js.undefined)
    @scala.inline
    def setFinishedAt(value: EpochTime): Self = this.set("FinishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishedAt: Self = this.set("FinishedAt", js.undefined)
    @scala.inline
    def setInputDataLocationS3(value: S3Url): Self = this.set("InputDataLocationS3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDataLocationS3: Self = this.set("InputDataLocationS3", js.undefined)
    @scala.inline
    def setInvalidRecordCount(value: LongType): Self = this.set("InvalidRecordCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidRecordCount: Self = this.set("InvalidRecordCount", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: EpochTime): Self = this.set("LastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("LastUpdatedAt", js.undefined)
    @scala.inline
    def setMLModelId(value: EntityId): Self = this.set("MLModelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMLModelId: Self = this.set("MLModelId", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOutputUri(value: S3Url): Self = this.set("OutputUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputUri: Self = this.set("OutputUri", js.undefined)
    @scala.inline
    def setStartedAt(value: EpochTime): Self = this.set("StartedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("StartedAt", js.undefined)
    @scala.inline
    def setStatus(value: EntityStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTotalRecordCount(value: LongType): Self = this.set("TotalRecordCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRecordCount: Self = this.set("TotalRecordCount", js.undefined)
  }
  
}

