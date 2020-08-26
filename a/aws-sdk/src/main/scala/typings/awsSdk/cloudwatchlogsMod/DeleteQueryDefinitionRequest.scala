package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueryDefinitionRequest extends js.Object {
  var queryDefinitionId: QueryId = js.native
}

object DeleteQueryDefinitionRequest {
  @scala.inline
  def apply(queryDefinitionId: QueryId): DeleteQueryDefinitionRequest = {
    val __obj = js.Dynamic.literal(queryDefinitionId = queryDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueryDefinitionRequest]
  }
  @scala.inline
  implicit class DeleteQueryDefinitionRequestOps[Self <: DeleteQueryDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setQueryDefinitionId(value: QueryId): Self = this.set("queryDefinitionId", value.asInstanceOf[js.Any])
  }
  
}

