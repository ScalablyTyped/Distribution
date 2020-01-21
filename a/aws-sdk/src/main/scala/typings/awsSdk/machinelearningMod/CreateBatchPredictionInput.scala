package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBatchPredictionInput extends js.Object {
  /**
    * The ID of the DataSource that points to the group of observations to predict.
    */
  var BatchPredictionDataSourceId: EntityId = js.native
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction.
    */
  var BatchPredictionId: EntityId = js.native
  /**
    * A user-supplied name or description of the BatchPrediction. BatchPredictionName can only use the UTF-8 character set.
    */
  var BatchPredictionName: js.UndefOr[EntityName] = js.native
  /**
    * The ID of the MLModel that will generate predictions for the group of observations. 
    */
  var MLModelId: EntityId = js.native
  /**
    * The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch prediction results. The following substrings are not allowed in the s3 key portion of the outputURI field: ':', '//', '/./', '/../'. Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to set permissions, see the Amazon Machine Learning Developer Guide.
    */
  var OutputUri: S3Url = js.native
}

object CreateBatchPredictionInput {
  @scala.inline
  def apply(
    BatchPredictionDataSourceId: EntityId,
    BatchPredictionId: EntityId,
    MLModelId: EntityId,
    OutputUri: S3Url,
    BatchPredictionName: EntityName = null
  ): CreateBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionDataSourceId = BatchPredictionDataSourceId.asInstanceOf[js.Any], BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any], MLModelId = MLModelId.asInstanceOf[js.Any], OutputUri = OutputUri.asInstanceOf[js.Any])
    if (BatchPredictionName != null) __obj.updateDynamic("BatchPredictionName")(BatchPredictionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchPredictionInput]
  }
}

