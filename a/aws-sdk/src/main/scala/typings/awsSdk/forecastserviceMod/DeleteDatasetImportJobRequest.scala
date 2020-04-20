package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetImportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset import job to delete.
    */
  var DatasetImportJobArn: Arn = js.native
}

object DeleteDatasetImportJobRequest {
  @scala.inline
  def apply(DatasetImportJobArn: Arn): DeleteDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DatasetImportJobArn = DatasetImportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetImportJobRequest]
  }
}

