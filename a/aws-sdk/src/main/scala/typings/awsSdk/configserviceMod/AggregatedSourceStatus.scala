package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedSourceStatus extends js.Object {
  /**
    * The region authorized to collect aggregated data.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.configserviceMod.AwsRegion] = js.native
  /**
    * The error code that AWS Config returned when the source account aggregation last failed.
    */
  var LastErrorCode: js.UndefOr[String] = js.native
  /**
    * The message indicating that the source account aggregation failed due to an error.
    */
  var LastErrorMessage: js.UndefOr[String] = js.native
  /**
    * Filters the last updated status type.   Valid value FAILED indicates errors while moving data.   Valid value SUCCEEDED indicates the data was successfully moved.   Valid value OUTDATED indicates the data is not the most recent.  
    */
  var LastUpdateStatus: js.UndefOr[AggregatedSourceStatusType] = js.native
  /**
    * The time of the last update.
    */
  var LastUpdateTime: js.UndefOr[Date] = js.native
  /**
    * The source account ID or an organization.
    */
  var SourceId: js.UndefOr[String] = js.native
  /**
    * The source account or an organization.
    */
  var SourceType: js.UndefOr[AggregatedSourceType] = js.native
}

object AggregatedSourceStatus {
  @scala.inline
  def apply(): AggregatedSourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedSourceStatus]
  }
  @scala.inline
  implicit class AggregatedSourceStatusOps[Self <: AggregatedSourceStatus] (val x: Self) extends AnyVal {
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
    def setAwsRegion(value: AwsRegion): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsRegion: Self = this.set("AwsRegion", js.undefined)
    @scala.inline
    def setLastErrorCode(value: String): Self = this.set("LastErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastErrorCode: Self = this.set("LastErrorCode", js.undefined)
    @scala.inline
    def setLastErrorMessage(value: String): Self = this.set("LastErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastErrorMessage: Self = this.set("LastErrorMessage", js.undefined)
    @scala.inline
    def setLastUpdateStatus(value: AggregatedSourceStatusType): Self = this.set("LastUpdateStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateStatus: Self = this.set("LastUpdateStatus", js.undefined)
    @scala.inline
    def setLastUpdateTime(value: Date): Self = this.set("LastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("LastUpdateTime", js.undefined)
    @scala.inline
    def setSourceId(value: String): Self = this.set("SourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceId: Self = this.set("SourceId", js.undefined)
    @scala.inline
    def setSourceType(value: AggregatedSourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
  }
  
}

