package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAnalysisResponse extends StObject {
  
  /**
    * A metadata structure that contains summary information for the analysis that you're describing.
    */
  var Analysis: js.UndefOr[typings.awsSdk.quicksightMod.Analysis] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object DescribeAnalysisResponse {
  
  @scala.inline
  def apply(): DescribeAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAnalysisResponse]
  }
  
  @scala.inline
  implicit class DescribeAnalysisResponseMutableBuilder[Self <: DescribeAnalysisResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysis(value: Analysis): Self = StObject.set(x, "Analysis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisUndefined: Self = StObject.set(x, "Analysis", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
