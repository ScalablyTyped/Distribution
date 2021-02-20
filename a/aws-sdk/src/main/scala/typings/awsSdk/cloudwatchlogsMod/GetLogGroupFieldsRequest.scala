package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLogGroupFieldsRequest extends StObject {
  
  /**
    * The name of the log group to search.
    */
  var logGroupName: LogGroupName = js.native
  
  /**
    * The time to set as the center of the query. If you specify time, the 8 minutes before and 8 minutes after this time are searched. If you omit time, the past 15 minutes are queried. The time value is specified as epoch time, the number of seconds since January 1, 1970, 00:00:00 UTC.
    */
  var time: js.UndefOr[Timestamp] = js.native
}
object GetLogGroupFieldsRequest {
  
  @scala.inline
  def apply(logGroupName: LogGroupName): GetLogGroupFieldsRequest = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogGroupFieldsRequest]
  }
  
  @scala.inline
  implicit class GetLogGroupFieldsRequestMutableBuilder[Self <: GetLogGroupFieldsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Timestamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
