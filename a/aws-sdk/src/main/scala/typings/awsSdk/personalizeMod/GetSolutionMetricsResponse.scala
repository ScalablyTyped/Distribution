package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolutionMetricsResponse extends StObject {
  
  /**
    * The metrics for the solution version.
    */
  var metrics: js.UndefOr[Metrics] = js.undefined
  
  /**
    * The same solution version ARN as specified in the request.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
}
object GetSolutionMetricsResponse {
  
  @scala.inline
  def apply(): GetSolutionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSolutionMetricsResponse]
  }
  
  @scala.inline
  implicit class GetSolutionMetricsResponseMutableBuilder[Self <: GetSolutionMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
  }
}
