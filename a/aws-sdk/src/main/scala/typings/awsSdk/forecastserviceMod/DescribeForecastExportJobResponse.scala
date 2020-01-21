package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeForecastExportJobResponse extends js.Object {
  /**
    * When the forecast export job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
    */
  var Destination: js.UndefOr[DataDestination] = js.native
  /**
    * The Amazon Resource Name (ARN) of the exported forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the forecast export job.
    */
  var ForecastExportJobArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the forecast export job.
    */
  var ForecastExportJobName: js.UndefOr[Name] = js.native
  /**
    * When the last successful export job finished.
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.forecastserviceMod.Message] = js.native
  /**
    * The status of the forecast export job. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the forecast export job must be ACTIVE before you can access the forecast in your S3 bucket. 
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.native
}

object DescribeForecastExportJobResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    Destination: DataDestination = null,
    ForecastArn: Arn = null,
    ForecastExportJobArn: Arn = null,
    ForecastExportJobName: Name = null,
    LastModificationTime: Timestamp = null,
    Message: Message = null,
    Status: Status = null
  ): DescribeForecastExportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination.asInstanceOf[js.Any])
    if (ForecastArn != null) __obj.updateDynamic("ForecastArn")(ForecastArn.asInstanceOf[js.Any])
    if (ForecastExportJobArn != null) __obj.updateDynamic("ForecastExportJobArn")(ForecastExportJobArn.asInstanceOf[js.Any])
    if (ForecastExportJobName != null) __obj.updateDynamic("ForecastExportJobName")(ForecastExportJobName.asInstanceOf[js.Any])
    if (LastModificationTime != null) __obj.updateDynamic("LastModificationTime")(LastModificationTime.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeForecastExportJobResponse]
  }
}

