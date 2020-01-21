package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetImportJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset import job.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.native
}

object CreateDatasetImportJobResponse {
  @scala.inline
  def apply(DatasetImportJobArn: Arn = null): CreateDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (DatasetImportJobArn != null) __obj.updateDynamic("DatasetImportJobArn")(DatasetImportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetImportJobResponse]
  }
}

