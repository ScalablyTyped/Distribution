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
  def apply(
    AlignedEndTime: ISOTimestamp = null,
    AlignedStartTime: ISOTimestamp = null,
    Identifier: String = null,
    MetricList: MetricKeyDataPointsList = null,
    NextToken: String = null
  ): GetResourceMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (AlignedEndTime != null) __obj.updateDynamic("AlignedEndTime")(AlignedEndTime.asInstanceOf[js.Any])
    if (AlignedStartTime != null) __obj.updateDynamic("AlignedStartTime")(AlignedStartTime.asInstanceOf[js.Any])
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier.asInstanceOf[js.Any])
    if (MetricList != null) __obj.updateDynamic("MetricList")(MetricList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceMetricsResponse]
  }
}

