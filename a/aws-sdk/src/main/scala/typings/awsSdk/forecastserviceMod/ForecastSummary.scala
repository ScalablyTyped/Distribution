package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForecastSummary extends js.Object {
  /**
    * When the forecast creation task was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group that provided the data used to train the predictor.
    */
  var DatasetGroupArn: js.UndefOr[String] = js.native
  /**
    * The ARN of the forecast.
    */
  var ForecastArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the forecast.
    */
  var ForecastName: js.UndefOr[Name] = js.native
  /**
    * Initially, the same as CreationTime (status is CREATE_PENDING). Updated when inference (creating the forecast) starts (status changed to CREATE_IN_PROGRESS), and when inference is complete (status changed to ACTIVE) or fails (status changed to CREATE_FAILED).
    */
  var LastModificationTime: js.UndefOr[Timestamp] = js.native
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The ARN of the predictor used to generate the forecast.
    */
  var PredictorArn: js.UndefOr[String] = js.native
  /**
    * The status of the forecast. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the forecast must be ACTIVE before you can query or export the forecast. 
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.native
}

object ForecastSummary {
  @scala.inline
  def apply(): ForecastSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastSummary]
  }
  @scala.inline
  implicit class ForecastSummaryOps[Self <: ForecastSummary] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDatasetGroupArn(value: String): Self = this.set("DatasetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetGroupArn: Self = this.set("DatasetGroupArn", js.undefined)
    @scala.inline
    def setForecastArn(value: Arn): Self = this.set("ForecastArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForecastArn: Self = this.set("ForecastArn", js.undefined)
    @scala.inline
    def setForecastName(value: Name): Self = this.set("ForecastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForecastName: Self = this.set("ForecastName", js.undefined)
    @scala.inline
    def setLastModificationTime(value: Timestamp): Self = this.set("LastModificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModificationTime: Self = this.set("LastModificationTime", js.undefined)
    @scala.inline
    def setMessage(value: ErrorMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setPredictorArn(value: String): Self = this.set("PredictorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictorArn: Self = this.set("PredictorArn", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

