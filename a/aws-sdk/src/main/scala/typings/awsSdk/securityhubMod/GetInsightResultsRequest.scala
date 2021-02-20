package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightResultsRequest extends StObject {
  
  /**
    * The ARN of the insight for which to return results.
    */
  var InsightArn: NonEmptyString = js.native
}
object GetInsightResultsRequest {
  
  @scala.inline
  def apply(InsightArn: NonEmptyString): GetInsightResultsRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightResultsRequest]
  }
  
  @scala.inline
  implicit class GetInsightResultsRequestMutableBuilder[Self <: GetInsightResultsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightArn(value: NonEmptyString): Self = StObject.set(x, "InsightArn", value.asInstanceOf[js.Any])
  }
}
