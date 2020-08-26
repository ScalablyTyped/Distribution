package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogRecordRequest extends js.Object {
  /**
    * The pointer corresponding to the log event record you want to retrieve. You get this from the response of a GetQueryResults operation. In that response, the value of the @ptr field for a log event is the value to use as logRecordPointer to retrieve that complete log event record.
    */
  var logRecordPointer: LogRecordPointer = js.native
}

object GetLogRecordRequest {
  @scala.inline
  def apply(logRecordPointer: LogRecordPointer): GetLogRecordRequest = {
    val __obj = js.Dynamic.literal(logRecordPointer = logRecordPointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogRecordRequest]
  }
  @scala.inline
  implicit class GetLogRecordRequestOps[Self <: GetLogRecordRequest] (val x: Self) extends AnyVal {
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
    def setLogRecordPointer(value: LogRecordPointer): Self = this.set("logRecordPointer", value.asInstanceOf[js.Any])
  }
  
}

