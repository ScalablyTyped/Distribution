package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightResultsResponse extends StObject {
  
  /**
    * The insight results returned by the operation.
    */
  var InsightResults: typings.awsSdk.securityhubMod.InsightResults = js.native
}
object GetInsightResultsResponse {
  
  @scala.inline
  def apply(InsightResults: InsightResults): GetInsightResultsResponse = {
    val __obj = js.Dynamic.literal(InsightResults = InsightResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightResultsResponse]
  }
  
  @scala.inline
  implicit class GetInsightResultsResponseMutableBuilder[Self <: GetInsightResultsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightResults(value: InsightResults): Self = StObject.set(x, "InsightResults", value.asInstanceOf[js.Any])
  }
}
