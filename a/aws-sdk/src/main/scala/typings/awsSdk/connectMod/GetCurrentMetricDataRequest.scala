package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCurrentMetricDataRequest extends js.Object {
  /**
    * The metrics to retrieve. Specify the name and unit for each metric. The following metrics are available. For a description of each metric, see Real-time Metrics Definitions in the Amazon Connect Administrator Guide.  AGENTS_AFTER_CONTACT_WORK  Unit: COUNT  AGENTS_AVAILABLE  Unit: COUNT  AGENTS_ERROR  Unit: COUNT  AGENTS_NON_PRODUCTIVE  Unit: COUNT  AGENTS_ON_CALL  Unit: COUNT  AGENTS_ON_CONTACT  Unit: COUNT  AGENTS_ONLINE  Unit: COUNT  AGENTS_STAFFED  Unit: COUNT  CONTACTS_IN_QUEUE  Unit: COUNT  CONTACTS_SCHEDULED  Unit: COUNT  OLDEST_CONTACT_AGE  Unit: SECONDS  SLOTS_ACTIVE  Unit: COUNT  SLOTS_AVAILABLE  Unit: COUNT  
    */
  var CurrentMetrics: typings.awsSdk.connectMod.CurrentMetrics = js.native
  /**
    * The queues, up to 100, or channels, to use to filter the metrics returned. Metric data is retrieved only for the resources associated with the queues or channels included in the filter. You can include both queue IDs and queue ARNs in the same request. The only supported channel is VOICE.
    */
  var Filters: typings.awsSdk.connectMod.Filters = js.native
  /**
    * The grouping applied to the metrics returned. For example, when grouped by QUEUE, the metrics returned apply to each queue rather than aggregated for all queues. If you group by CHANNEL, you should include a Channels filter. The only supported channel is VOICE. If no Grouping is included in the request, a summary of metrics is returned.
    */
  var Groupings: js.UndefOr[typings.awsSdk.connectMod.Groupings] = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.native
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. The token expires after 5 minutes from the time it is created. Subsequent requests that use the token must use the same request parameters as the request that generated the token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
}

object GetCurrentMetricDataRequest {
  @scala.inline
  def apply(CurrentMetrics: CurrentMetrics, Filters: Filters, InstanceId: InstanceId): GetCurrentMetricDataRequest = {
    val __obj = js.Dynamic.literal(CurrentMetrics = CurrentMetrics.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentMetricDataRequest]
  }
  @scala.inline
  implicit class GetCurrentMetricDataRequestOps[Self <: GetCurrentMetricDataRequest] (val x: Self) extends AnyVal {
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
    def setCurrentMetricsVarargs(value: CurrentMetric*): Self = this.set("CurrentMetrics", js.Array(value :_*))
    @scala.inline
    def setCurrentMetrics(value: CurrentMetrics): Self = this.set("CurrentMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: Filters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupingsVarargs(value: Grouping*): Self = this.set("Groupings", js.Array(value :_*))
    @scala.inline
    def setGroupings(value: Groupings): Self = this.set("Groupings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupings: Self = this.set("Groupings", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResult100): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

