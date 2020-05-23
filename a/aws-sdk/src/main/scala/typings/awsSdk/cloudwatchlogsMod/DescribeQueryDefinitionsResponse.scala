package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeQueryDefinitionsResponse extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.native
  var queryDefinitions: js.UndefOr[QueryDefinitionList] = js.native
}

object DescribeQueryDefinitionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, queryDefinitions: QueryDefinitionList = null): DescribeQueryDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (queryDefinitions != null) __obj.updateDynamic("queryDefinitions")(queryDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeQueryDefinitionsResponse]
  }
}

