package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEndpointConfigsOutput extends StObject {
  
  /**
    * An array of endpoint configurations.
    */
  var EndpointConfigs: EndpointConfigSummaryList = js.native
  
  /**
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of endpoint configurations, use it in the subsequent request 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListEndpointConfigsOutput {
  
  @scala.inline
  def apply(EndpointConfigs: EndpointConfigSummaryList): ListEndpointConfigsOutput = {
    val __obj = js.Dynamic.literal(EndpointConfigs = EndpointConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointConfigsOutput]
  }
  
  @scala.inline
  implicit class ListEndpointConfigsOutputMutableBuilder[Self <: ListEndpointConfigsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointConfigs(value: EndpointConfigSummaryList): Self = StObject.set(x, "EndpointConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigsVarargs(value: EndpointConfigSummary*): Self = StObject.set(x, "EndpointConfigs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
