package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLogGroupsResponse extends js.Object {
  
  /**
    * The log groups. If the retentionInDays value if not included for a log group, then that log group is set to have its events never expire.
    */
  var logGroups: js.UndefOr[LogGroups] = js.native
  
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeLogGroupsResponse {
  
  @scala.inline
  def apply(): DescribeLogGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLogGroupsResponse]
  }
  
  @scala.inline
  implicit class DescribeLogGroupsResponseOps[Self <: DescribeLogGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setLogGroupsVarargs(value: LogGroup*): Self = this.set("logGroups", js.Array(value :_*))
    
    @scala.inline
    def setLogGroups(value: LogGroups): Self = this.set("logGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroups: Self = this.set("logGroups", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
