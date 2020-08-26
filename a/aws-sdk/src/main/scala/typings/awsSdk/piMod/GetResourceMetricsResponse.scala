package typings.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceMetricsResponse extends js.Object {
  /**
    * The end time for the returned metrics, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedEndTime will be greater than or equal to the value of the user-specified Endtime.
    */
  var AlignedEndTime: js.UndefOr[ISOTimestamp] = js.native
  /**
    * The start time for the returned metrics, after alignment to a granular boundary (as specified by PeriodInSeconds). AlignedStartTime will be less than or equal to the value of the user-specified StartTime.
    */
  var AlignedStartTime: js.UndefOr[ISOTimestamp] = js.native
  /**
    * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data source. To use an Amazon RDS instance as a data source, you specify its DbiResourceId value - for example: db-FAIHNTYBKTGAUSUZQYPDS2GW4A 
    */
  var Identifier: js.UndefOr[String] = js.native
  /**
    * An array of metric results,, where each array element contains all of the data points for a particular dimension.
    */
  var MetricList: js.UndefOr[MetricKeyDataPointsList] = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the token, up to the value specified by MaxRecords.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetResourceMetricsResponse {
  @scala.inline
  def apply(): GetResourceMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceMetricsResponse]
  }
  @scala.inline
  implicit class GetResourceMetricsResponseOps[Self <: GetResourceMetricsResponse] (val x: Self) extends AnyVal {
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
    def setAlignedEndTime(value: ISOTimestamp): Self = this.set("AlignedEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignedEndTime: Self = this.set("AlignedEndTime", js.undefined)
    @scala.inline
    def setAlignedStartTime(value: ISOTimestamp): Self = this.set("AlignedStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignedStartTime: Self = this.set("AlignedStartTime", js.undefined)
    @scala.inline
    def setIdentifier(value: String): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("Identifier", js.undefined)
    @scala.inline
    def setMetricListVarargs(value: MetricKeyDataPoints*): Self = this.set("MetricList", js.Array(value :_*))
    @scala.inline
    def setMetricList(value: MetricKeyDataPointsList): Self = this.set("MetricList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricList: Self = this.set("MetricList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

