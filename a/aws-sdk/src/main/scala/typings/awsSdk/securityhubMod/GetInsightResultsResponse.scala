package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightResultsResponse extends js.Object {
  
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
  implicit class GetInsightResultsResponseOps[Self <: GetInsightResultsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInsightResults(value: InsightResults): Self = this.set("InsightResults", value.asInstanceOf[js.Any])
  }
}
