package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCurrentMetricDataRequest extends js.Object {
  /**
    * The metrics to retrieve. Specify the name and unit for each metric. The following metrics are available:  AGENTS_AFTER_CONTACT_WORK  Unit: COUNT  AGENTS_AVAILABLE  Unit: COUNT  AGENTS_ERROR  Unit: COUNT  AGENTS_NON_PRODUCTIVE  Unit: COUNT  AGENTS_ON_CALL  Unit: COUNT  AGENTS_ON_CONTACT  Unit: COUNT  AGENTS_ONLINE  Unit: COUNT  AGENTS_STAFFED  Unit: COUNT  CONTACTS_IN_QUEUE  Unit: COUNT  CONTACTS_SCHEDULED  Unit: COUNT  OLDEST_CONTACT_AGE  Unit: SECONDS  SLOTS_ACTIVE  Unit: COUNT  SLOTS_AVAILABLE  Unit: COUNT  
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
  def apply(
    CurrentMetrics: CurrentMetrics,
    Filters: Filters,
    InstanceId: InstanceId,
    Groupings: Groupings = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): GetCurrentMetricDataRequest = {
    val __obj = js.Dynamic.literal(CurrentMetrics = CurrentMetrics.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    if (Groupings != null) __obj.updateDynamic("Groupings")(Groupings.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentMetricDataRequest]
  }
}

