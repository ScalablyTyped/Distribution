package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSolutionMetricsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the solution version for which to get metrics.
    */
  var solutionVersionArn: Arn = js.native
}
object GetSolutionMetricsRequest {
  
  @scala.inline
  def apply(solutionVersionArn: Arn): GetSolutionMetricsRequest = {
    val __obj = js.Dynamic.literal(solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolutionMetricsRequest]
  }
  
  @scala.inline
  implicit class GetSolutionMetricsRequestMutableBuilder[Self <: GetSolutionMetricsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
  }
}
