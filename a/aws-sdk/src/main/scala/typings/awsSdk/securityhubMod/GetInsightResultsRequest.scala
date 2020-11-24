package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightResultsRequest extends js.Object {
  
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
  implicit class GetInsightResultsRequestOps[Self <: GetInsightResultsRequest] (val x: Self) extends AnyVal {
    
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
    def setInsightArn(value: NonEmptyString): Self = this.set("InsightArn", value.asInstanceOf[js.Any])
  }
}
