package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssetPropertyValueHistoryRequest extends StObject {
  
  /**
    * The ID of the asset.
    */
  var assetId: js.UndefOr[ID] = js.undefined
  
  /**
    * The inclusive end of the range from which to query historical data, expressed in seconds in Unix epoch time.
    */
  var endDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The maximum number of results to be returned per paginated request. Default: 100
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the AWS IoT SiteWise User Guide.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined
  
  /**
    * The ID of the asset property.
    */
  var propertyId: js.UndefOr[ID] = js.undefined
  
  /**
    * The quality by which to filter asset data.
    */
  var qualities: js.UndefOr[Qualities] = js.undefined
  
  /**
    * The exclusive start of the range from which to query historical data, expressed in seconds in Unix epoch time.
    */
  var startDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The chronological sorting order of the requested information. Default: ASCENDING 
    */
  var timeOrdering: js.UndefOr[TimeOrdering] = js.undefined
}
object GetAssetPropertyValueHistoryRequest {
  
  @scala.inline
  def apply(): GetAssetPropertyValueHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssetPropertyValueHistoryRequest]
  }
  
  @scala.inline
  implicit class GetAssetPropertyValueHistoryRequestMutableBuilder[Self <: GetAssetPropertyValueHistoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    @scala.inline
    def setEndDate(value: Timestamp): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPropertyAlias(value: AssetPropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    @scala.inline
    def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    @scala.inline
    def setQualities(value: Qualities): Self = StObject.set(x, "qualities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualitiesUndefined: Self = StObject.set(x, "qualities", js.undefined)
    
    @scala.inline
    def setQualitiesVarargs(value: Quality*): Self = StObject.set(x, "qualities", js.Array(value :_*))
    
    @scala.inline
    def setStartDate(value: Timestamp): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setTimeOrdering(value: TimeOrdering): Self = StObject.set(x, "timeOrdering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOrderingUndefined: Self = StObject.set(x, "timeOrdering", js.undefined)
  }
}
