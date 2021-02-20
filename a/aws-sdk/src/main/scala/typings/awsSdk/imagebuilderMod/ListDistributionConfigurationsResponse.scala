package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDistributionConfigurationsResponse extends StObject {
  
  /**
    * The list of distributions. 
    */
  var distributionConfigurationSummaryList: js.UndefOr[DistributionConfigurationSummaryList] = js.native
  
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object ListDistributionConfigurationsResponse {
  
  @scala.inline
  def apply(): ListDistributionConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListDistributionConfigurationsResponseMutableBuilder[Self <: ListDistributionConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionConfigurationSummaryList(value: DistributionConfigurationSummaryList): Self = StObject.set(x, "distributionConfigurationSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionConfigurationSummaryListUndefined: Self = StObject.set(x, "distributionConfigurationSummaryList", js.undefined)
    
    @scala.inline
    def setDistributionConfigurationSummaryListVarargs(value: DistributionConfigurationSummary*): Self = StObject.set(x, "distributionConfigurationSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
