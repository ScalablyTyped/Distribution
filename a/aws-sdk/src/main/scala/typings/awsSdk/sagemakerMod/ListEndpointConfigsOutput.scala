package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointConfigsOutput extends StObject {
  
  /**
    * An array of endpoint configurations.
    */
  var EndpointConfigs: EndpointConfigSummaryList
  
  /**
    *  If the response is truncated, SageMaker returns this token. To retrieve the next set of endpoint configurations, use it in the subsequent request 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListEndpointConfigsOutput {
  
  inline def apply(EndpointConfigs: EndpointConfigSummaryList): ListEndpointConfigsOutput = {
    val __obj = js.Dynamic.literal(EndpointConfigs = EndpointConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointConfigsOutput]
  }
  
  extension [Self <: ListEndpointConfigsOutput](x: Self) {
    
    inline def setEndpointConfigs(value: EndpointConfigSummaryList): Self = StObject.set(x, "EndpointConfigs", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigsVarargs(value: EndpointConfigSummary*): Self = StObject.set(x, "EndpointConfigs", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
