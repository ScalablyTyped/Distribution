package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogGroupFieldsResponse extends js.Object {
  /**
    * The array of fields found in the query. Each object in the array contains the name of the field, along with the percentage of time it appeared in the log events that were queried.
    */
  var logGroupFields: js.UndefOr[LogGroupFieldList] = js.native
}

object GetLogGroupFieldsResponse {
  @scala.inline
  def apply(): GetLogGroupFieldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogGroupFieldsResponse]
  }
  @scala.inline
  implicit class GetLogGroupFieldsResponseOps[Self <: GetLogGroupFieldsResponse] (val x: Self) extends AnyVal {
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
    def setLogGroupFieldsVarargs(value: LogGroupField*): Self = this.set("logGroupFields", js.Array(value :_*))
    @scala.inline
    def setLogGroupFields(value: LogGroupFieldList): Self = this.set("logGroupFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupFields: Self = this.set("logGroupFields", js.undefined)
  }
  
}

