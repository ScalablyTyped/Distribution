package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLogGroupsResponse extends StObject {
  
  /**
    * The log groups. If the retentionInDays value if not included for a log group, then that log group is set to have its events never expire.
    */
  var logGroups: js.UndefOr[LogGroups] = js.undefined
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeLogGroupsResponse {
  
  @scala.inline
  def apply(): DescribeLogGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLogGroupsResponse]
  }
  
  @scala.inline
  implicit class DescribeLogGroupsResponseMutableBuilder[Self <: DescribeLogGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroups(value: LogGroups): Self = StObject.set(x, "logGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupsUndefined: Self = StObject.set(x, "logGroups", js.undefined)
    
    @scala.inline
    def setLogGroupsVarargs(value: LogGroup*): Self = StObject.set(x, "logGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
