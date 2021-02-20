package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInfrastructureConfigurationsResponse extends StObject {
  
  /**
    * The list of infrastructure configurations. 
    */
  var infrastructureConfigurationSummaryList: js.UndefOr[InfrastructureConfigurationSummaryList] = js.native
  
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object ListInfrastructureConfigurationsResponse {
  
  @scala.inline
  def apply(): ListInfrastructureConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInfrastructureConfigurationsResponse]
  }
  
  @scala.inline
  implicit class ListInfrastructureConfigurationsResponseMutableBuilder[Self <: ListInfrastructureConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfrastructureConfigurationSummaryList(value: InfrastructureConfigurationSummaryList): Self = StObject.set(x, "infrastructureConfigurationSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfrastructureConfigurationSummaryListUndefined: Self = StObject.set(x, "infrastructureConfigurationSummaryList", js.undefined)
    
    @scala.inline
    def setInfrastructureConfigurationSummaryListVarargs(value: InfrastructureConfigurationSummary*): Self = StObject.set(x, "infrastructureConfigurationSummaryList", js.Array(value :_*))
    
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
