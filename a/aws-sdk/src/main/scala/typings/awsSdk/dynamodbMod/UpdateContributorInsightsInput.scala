package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContributorInsightsInput extends js.Object {
  /**
    * Represents the contributor insights action.
    */
  var ContributorInsightsAction: typings.awsSdk.dynamodbMod.ContributorInsightsAction = js.native
  /**
    * The global secondary index name, if applicable.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.native
  /**
    * The name of the table.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}

object UpdateContributorInsightsInput {
  @scala.inline
  def apply(
    ContributorInsightsAction: ContributorInsightsAction,
    TableName: TableName,
    IndexName: IndexName = null
  ): UpdateContributorInsightsInput = {
    val __obj = js.Dynamic.literal(ContributorInsightsAction = ContributorInsightsAction.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContributorInsightsInput]
  }
}

