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
  def apply(): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetResponse]
  }
  @scala.inline
  implicit class CreateDatasetResponseOps[Self <: CreateDatasetResponse] (val x: Self) extends AnyVal {
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
    def setDatasetArn(value: DatasetArn): Self = this.set("datasetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetArn: Self = this.set("datasetArn", js.undefined)
    @scala.inline
    def setDatasetName(value: DatasetName): Self = this.set("datasetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetName: Self = this.set("datasetName", js.undefined)
    @scala.inline
    def setRetentionPeriod(value: RetentionPeriod): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("retentionPeriod", js.undefined)
  }
  
}

