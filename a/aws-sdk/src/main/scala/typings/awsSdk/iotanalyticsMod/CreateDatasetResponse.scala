package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetResponse extends js.Object {
  /**
    * The ARN of the data set.
    */
  var datasetArn: js.UndefOr[DatasetArn] = js.native
  /**
    * The name of the data set.
    */
  var datasetName: js.UndefOr[DatasetName] = js.native
  /**
    * How long, in days, data set contents are kept for the data set.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.native
}

object CreateDatasetResponse {
  @scala.inline
  def apply(
    datasetArn: DatasetArn = null,
    datasetName: DatasetName = null,
    retentionPeriod: RetentionPeriod = null
  ): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn.asInstanceOf[js.Any])
    if (datasetName != null) __obj.updateDynamic("datasetName")(datasetName.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetResponse]
  }
}

