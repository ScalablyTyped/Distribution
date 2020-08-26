package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetImportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset import job.
    */
  var DatasetImportJobArn: Arn = js.native
}

object DescribeDatasetImportJobRequest {
  @scala.inline
  def apply(DatasetImportJobArn: Arn): DescribeDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DatasetImportJobArn = DatasetImportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatasetImportJobRequest]
  }
  @scala.inline
  implicit class DescribeDatasetImportJobRequestOps[Self <: DescribeDatasetImportJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatasetImportJobArn(value: Arn): Self = this.set("DatasetImportJobArn", value.asInstanceOf[js.Any])
  }
  
}

