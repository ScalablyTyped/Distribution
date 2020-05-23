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
  def apply(queryDefinitionId: QueryId = null): PutQueryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    if (queryDefinitionId != null) __obj.updateDynamic("queryDefinitionId")(queryDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutQueryDefinitionResponse]
  }
}

