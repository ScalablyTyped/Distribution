package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutQueryDefinitionRequest extends js.Object {
  var logGroupNames: js.UndefOr[LogGroupNames] = js.native
  var name: QueryDefinitionName = js.native
  var queryDefinitionId: js.UndefOr[QueryId] = js.native
  var queryString: QueryDefinitionString = js.native
}

object PutQueryDefinitionRequest {
  @scala.inline
  def apply(name: QueryDefinitionName, queryString: QueryDefinitionString): PutQueryDefinitionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutQueryDefinitionRequest]
  }
  @scala.inline
  implicit class PutQueryDefinitionRequestOps[Self <: PutQueryDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setName(value: QueryDefinitionName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryString(value: QueryDefinitionString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogGroupNamesVarargs(value: LogGroupName*): Self = this.set("logGroupNames", js.Array(value :_*))
    @scala.inline
    def setLogGroupNames(value: LogGroupNames): Self = this.set("logGroupNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogGroupNames: Self = this.set("logGroupNames", js.undefined)
    @scala.inline
    def setQueryDefinitionId(value: QueryId): Self = this.set("queryDefinitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryDefinitionId: Self = this.set("queryDefinitionId", js.undefined)
  }
  
}

