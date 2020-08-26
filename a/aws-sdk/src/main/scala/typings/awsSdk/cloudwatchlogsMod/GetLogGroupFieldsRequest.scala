package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogGroupFieldsRequest extends js.Object {
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
  implicit class GetLogGroupFieldsRequestOps[Self <: GetLogGroupFieldsRequest] (val x: Self) extends AnyVal {
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
    def setTime(value: Timestamp): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

