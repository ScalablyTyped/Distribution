package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRightsizingRecommendationRequest extends StObject {
  
  /**
    *  Enables you to customize recommendations across two attributes. You can choose to view recommendations for instances within the same instance families or across different instance families. You can also choose to view your estimated savings associated with recommendations with consideration of existing Savings Plans or RI benefits, or neither. 
    */
  var Configuration: js.UndefOr[RightsizingRecommendationConfiguration] = js.native
  
  var Filter: js.UndefOr[Expression] = js.native
  
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  
  /**
    * The number of recommendations that you want returned in a single response object.
    */
  var PageSize: js.UndefOr[NonNegativeInteger] = js.native
  
  /**
    * The specific service that you want recommendations for. The only valid value for GetRightsizingRecommendation is "AmazonEC2".
    */
  var Service: GenericString = js.native
}
object GetRightsizingRecommendationRequest {
  
  @scala.inline
  def apply(Service: GenericString): GetRightsizingRecommendationRequest = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRightsizingRecommendationRequest]
  }
  
  @scala.inline
  implicit class GetRightsizingRecommendationRequestMutableBuilder[Self <: GetRightsizingRecommendationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: RightsizingRecommendationConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setFilter(value: Expression): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: NonNegativeInteger): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setService(value: GenericString): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
  }
}
