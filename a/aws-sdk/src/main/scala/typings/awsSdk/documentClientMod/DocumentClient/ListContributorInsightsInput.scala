package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContributorInsightsInput extends js.Object {
  /**
    * Maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[ListContributorInsightsLimit] = js.native
  /**
    * A token to for the desired page, if there is one.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
}

object ListContributorInsightsInput {
  @scala.inline
  def apply(
    MaxResults: Int | scala.Double = null,
    NextToken: NextTokenString = null,
    TableName: TableName = null
  ): ListContributorInsightsInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContributorInsightsInput]
  }
}

