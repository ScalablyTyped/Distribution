package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRemediationExecutionStatusResponse extends js.Object {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Returns a list of remediation execution statuses objects.
    */
  var RemediationExecutionStatuses: js.UndefOr[typings.awsSdk.configserviceMod.RemediationExecutionStatuses] = js.native
}
object DescribeRemediationExecutionStatusResponse {
  
  @scala.inline
  def apply(): DescribeRemediationExecutionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationExecutionStatusResponse]
  }
  
  @scala.inline
  implicit class DescribeRemediationExecutionStatusResponseOps[Self <: DescribeRemediationExecutionStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRemediationExecutionStatusesVarargs(value: RemediationExecutionStatus*): Self = this.set("RemediationExecutionStatuses", js.Array(value :_*))
    
    @scala.inline
    def setRemediationExecutionStatuses(value: RemediationExecutionStatuses): Self = this.set("RemediationExecutionStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemediationExecutionStatuses: Self = this.set("RemediationExecutionStatuses", js.undefined)
  }
}
