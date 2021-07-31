package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubscriptionFiltersRequest extends StObject {
  
  /**
    * The prefix to match. If you don't specify a value, no prefix filter is applied.
    */
  var filterNamePrefix: js.UndefOr[FilterName] = js.undefined
  
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeSubscriptionFiltersRequest {
  
  @scala.inline
  def apply(logGroupName: LogGroupName): DescribeSubscriptionFiltersRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscriptionFiltersRequest]
  }
  
  @scala.inline
  implicit class DescribeSubscriptionFiltersRequestMutableBuilder[Self <: DescribeSubscriptionFiltersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterNamePrefix(value: FilterName): Self = StObject.set(x, "filterNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNamePrefixUndefined: Self = StObject.set(x, "filterNamePrefix", js.undefined)
    
    @scala.inline
    def setLimit(value: DescribeLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
