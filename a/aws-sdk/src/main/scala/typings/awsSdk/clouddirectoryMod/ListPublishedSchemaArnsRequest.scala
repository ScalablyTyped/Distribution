package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPublishedSchemaArnsRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * The response for ListPublishedSchemaArns when this parameter is used will list all minor version ARNs for a major version.
    */
  var SchemaArn: js.UndefOr[Arn] = js.native
}

object ListPublishedSchemaArnsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null,
    SchemaArn: Arn = null
  ): ListPublishedSchemaArnsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPublishedSchemaArnsRequest]
  }
}

