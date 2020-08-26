package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssetPropertyValueHistoryRequest extends js.Object {
  /**
    * The ID of the asset.
    */
  var assetId: js.UndefOr[ID] = js.native
  /**
    * The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch time.
    */
  var endDate: js.UndefOr[Timestamp] = js.native
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
    * The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch time.
    */
  var startDate: js.UndefOr[Timestamp] = js.native
  /**
    * The chronological sorting order of the requested information.
    */
  var timeOrdering: js.UndefOr[TimeOrdering] = js.native
}

object GetAssetPropertyValueHistoryRequest {
  @scala.inline
  def apply(): GetAssetPropertyValueHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssetPropertyValueHistoryRequest]
  }
  @scala.inline
  implicit class GetAssetPropertyValueHistoryRequestOps[Self <: GetAssetPropertyValueHistoryRequest] (val x: Self) extends AnyVal {
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
    def setAssetId(value: ID): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetId: Self = this.set("assetId", js.undefined)
    @scala.inline
    def setEndDate(value: Timestamp): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setPropertyAlias(value: AssetPropertyAlias): Self = this.set("propertyAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyAlias: Self = this.set("propertyAlias", js.undefined)
    @scala.inline
    def setPropertyId(value: ID): Self = this.set("propertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyId: Self = this.set("propertyId", js.undefined)
    @scala.inline
    def setQualitiesVarargs(value: Quality*): Self = this.set("qualities", js.Array(value :_*))
    @scala.inline
    def setQualities(value: Qualities): Self = this.set("qualities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualities: Self = this.set("qualities", js.undefined)
    @scala.inline
    def setStartDate(value: Timestamp): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setTimeOrdering(value: TimeOrdering): Self = this.set("timeOrdering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOrdering: Self = this.set("timeOrdering", js.undefined)
  }
  
}

