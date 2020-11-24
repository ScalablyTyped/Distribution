package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLogStreamsRequest extends js.Object {
  
  /**
    * If the value is true, results are returned in descending order. If the value is to false, results are returned in ascending order. The default value is false.
    */
  var descending: js.UndefOr[Descending] = js.native
  
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.native
  
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
  
  /**
    * The prefix to match. If orderBy is LastEventTime, you cannot specify this parameter.
    */
  var logStreamNamePrefix: js.UndefOr[LogStreamName] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * If the value is LogStreamName, the results are ordered by log stream name. If the value is LastEventTime, the results are ordered by the event time. The default value is LogStreamName. If you order the results by event time, you cannot specify the logStreamNamePrefix parameter.  lastEventTimeStamp represents the time of the most recent log event in the log stream in CloudWatch Logs. This number is expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. lastEventTimeStamp updates on an eventual consistency basis. It typically updates in less than an hour from ingestion, but in rare situations might take longer.
    */
  var orderBy: js.UndefOr[OrderBy] = js.native
}
object DescribeLogStreamsRequest {
  
  @scala.inline
  def apply(logGroupName: LogGroupName): DescribeLogStreamsRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLogStreamsRequest]
  }
  
  @scala.inline
  implicit class DescribeLogStreamsRequestOps[Self <: DescribeLogStreamsRequest] (val x: Self) extends AnyVal {
    
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
    def setLogGroupName(value: LogGroupName): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescending(value: Descending): Self = this.set("descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescending: Self = this.set("descending", js.undefined)
    
    @scala.inline
    def setLimit(value: DescribeLimit): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLogStreamNamePrefix(value: LogStreamName): Self = this.set("logStreamNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreamNamePrefix: Self = this.set("logStreamNamePrefix", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setOrderBy(value: OrderBy): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
  }
}
