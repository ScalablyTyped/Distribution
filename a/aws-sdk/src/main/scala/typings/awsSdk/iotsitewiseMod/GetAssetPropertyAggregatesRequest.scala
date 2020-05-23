package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssetPropertyAggregatesRequest extends js.Object {
  /**
    * The data aggregating function.
    */
  var aggregateTypes: AggregateTypes = js.native
  /**
    * The ID of the asset.
    */
  var assetId: js.UndefOr[ID] = js.native
  /**
    * The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch time.
    */
  var endDate: Timestamp = js.native
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping Industrial Data Streams to Asset Properties in the AWS IoT SiteWise User Guide.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.native
  /**
    * The ID of the asset property.
    */
  var propertyId: js.UndefOr[ID] = js.native
  /**
    * The quality by which to filter asset data.
    */
  var qualities: js.UndefOr[Qualities] = js.native
  /**
    * The time interval over which to aggregate data.
    */
  var resolution: Resolution = js.native
  /**
    * The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch time.
    */
  var startDate: Timestamp = js.native
  /**
    * The chronological sorting order of the requested information.
    */
  var timeOrdering: js.UndefOr[TimeOrdering] = js.native
}

object GetAssetPropertyAggregatesRequest {
  @scala.inline
  def apply(
    aggregateTypes: AggregateTypes,
    endDate: Timestamp,
    resolution: Resolution,
    startDate: Timestamp,
    assetId: ID = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    propertyAlias: AssetPropertyAlias = null,
    propertyId: ID = null,
    qualities: Qualities = null,
    timeOrdering: TimeOrdering = null
  ): GetAssetPropertyAggregatesRequest = {
    val __obj = js.Dynamic.literal(aggregateTypes = aggregateTypes.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    if (assetId != null) __obj.updateDynamic("assetId")(assetId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (propertyAlias != null) __obj.updateDynamic("propertyAlias")(propertyAlias.asInstanceOf[js.Any])
    if (propertyId != null) __obj.updateDynamic("propertyId")(propertyId.asInstanceOf[js.Any])
    if (qualities != null) __obj.updateDynamic("qualities")(qualities.asInstanceOf[js.Any])
    if (timeOrdering != null) __obj.updateDynamic("timeOrdering")(timeOrdering.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetPropertyAggregatesRequest]
  }
}

