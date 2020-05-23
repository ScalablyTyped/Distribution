package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeQueryDefinitionsRequest extends js.Object {
  var maxResults: js.UndefOr[QueryListMaxResults] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
  var queryDefinitionNamePrefix: js.UndefOr[QueryDefinitionName] = js.native
}

object DescribeQueryDefinitionsRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[QueryListMaxResults] = js.undefined,
    nextToken: NextToken = null,
    queryDefinitionNamePrefix: QueryDefinitionName = null
  ): DescribeQueryDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (queryDefinitionNamePrefix != null) __obj.updateDynamic("queryDefinitionNamePrefix")(queryDefinitionNamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeQueryDefinitionsRequest]
  }
}

