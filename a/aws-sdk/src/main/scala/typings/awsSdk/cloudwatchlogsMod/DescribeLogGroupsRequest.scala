package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLogGroupsRequest extends StObject {
  
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  
  /**
    * The prefix to match.
    */
  var logGroupNamePrefix: js.UndefOr[LogGroupName] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeLogGroupsRequest {
  
  @scala.inline
  def apply(): DescribeLogGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLogGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribeLogGroupsRequestMutableBuilder[Self <: DescribeLogGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: DescribeLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLogGroupNamePrefix(value: LogGroupName): Self = StObject.set(x, "logGroupNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNamePrefixUndefined: Self = StObject.set(x, "logGroupNamePrefix", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
