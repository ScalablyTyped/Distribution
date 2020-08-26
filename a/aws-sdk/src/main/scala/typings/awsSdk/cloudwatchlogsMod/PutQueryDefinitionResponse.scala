package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutQueryDefinitionResponse extends js.Object {
  var queryDefinitionId: js.UndefOr[QueryId] = js.native
}

object PutQueryDefinitionResponse {
  @scala.inline
  def apply(): PutQueryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutQueryDefinitionResponse]
  }
  @scala.inline
  implicit class PutQueryDefinitionResponseOps[Self <: PutQueryDefinitionResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteQueryDefinitionId: Self = this.set("queryDefinitionId", js.undefined)
  }
  
}

