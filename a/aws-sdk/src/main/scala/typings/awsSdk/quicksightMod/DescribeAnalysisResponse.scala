package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnalysisResponse extends StObject {
  
  /**
    * A metadata structure that contains summary information for the analysis that you're describing.
    */
  var Analysis: js.UndefOr[typings.awsSdk.quicksightMod.Analysis] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeAnalysisResponse {
  
  inline def apply(): DescribeAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAnalysisResponse]
  }
  
  extension [Self <: DescribeAnalysisResponse](x: Self) {
    
    inline def setAnalysis(value: Analysis): Self = StObject.set(x, "Analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalysisUndefined: Self = StObject.set(x, "Analysis", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
