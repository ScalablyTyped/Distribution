package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQueriesRequest extends StObject {
  
  /**
    * Limits the returned queries to only those for the specified log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * Limits the number of returned queries to the specified number.
    */
  var maxResults: js.UndefOr[DescribeQueriesMaxResults] = js.undefined
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Limits the returned queries to only those that have the specified status. Valid values are Cancelled, Complete, Failed, Running, and Scheduled.
    */
  var status: js.UndefOr[QueryStatus] = js.undefined
}
object DescribeQueriesRequest {
  
  @scala.inline
  def apply(): DescribeQueriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueriesRequest]
  }
  
  @scala.inline
  implicit class DescribeQueriesRequestMutableBuilder[Self <: DescribeQueriesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DescribeQueriesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: QueryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
