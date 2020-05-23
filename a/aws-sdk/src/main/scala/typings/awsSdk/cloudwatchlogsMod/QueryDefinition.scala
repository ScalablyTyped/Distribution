package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDefinition extends js.Object {
  var lastModified: js.UndefOr[Timestamp] = js.native
  var logGroupNames: js.UndefOr[LogGroupNames] = js.native
  var name: js.UndefOr[QueryDefinitionName] = js.native
  var queryDefinitionId: js.UndefOr[QueryId] = js.native
  var queryString: js.UndefOr[QueryDefinitionString] = js.native
}

object QueryDefinition {
  @scala.inline
  def apply(
    lastModified: js.UndefOr[Timestamp] = js.undefined,
    logGroupNames: LogGroupNames = null,
    name: QueryDefinitionName = null,
    queryDefinitionId: QueryId = null,
    queryString: QueryDefinitionString = null
  ): QueryDefinition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lastModified)) __obj.updateDynamic("lastModified")(lastModified.get.asInstanceOf[js.Any])
    if (logGroupNames != null) __obj.updateDynamic("logGroupNames")(logGroupNames.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (queryDefinitionId != null) __obj.updateDynamic("queryDefinitionId")(queryDefinitionId.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDefinition]
  }
}

