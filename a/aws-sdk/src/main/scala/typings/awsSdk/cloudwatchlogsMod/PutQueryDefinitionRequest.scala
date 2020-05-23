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
  def apply(
    name: QueryDefinitionName,
    queryString: QueryDefinitionString,
    logGroupNames: LogGroupNames = null,
    queryDefinitionId: QueryId = null
  ): PutQueryDefinitionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    if (logGroupNames != null) __obj.updateDynamic("logGroupNames")(logGroupNames.asInstanceOf[js.Any])
    if (queryDefinitionId != null) __obj.updateDynamic("queryDefinitionId")(queryDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutQueryDefinitionRequest]
  }
}

