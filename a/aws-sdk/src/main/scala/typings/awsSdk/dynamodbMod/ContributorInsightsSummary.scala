package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributorInsightsSummary extends js.Object {
  /**
    * Describes the current status for contributor insights for the given table and index, if applicable.
    */
  var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ContributorInsightsStatus] = js.native
  /**
    * Name of the index associated with the summary, if any.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.native
  /**
    * Name of the table associated with the summary.
    */
  var TableName: js.UndefOr[typings.awsSdk.dynamodbMod.TableName] = js.native
}

object ContributorInsightsSummary {
  @scala.inline
  def apply(
    ContributorInsightsStatus: ContributorInsightsStatus = null,
    IndexName: IndexName = null,
    TableName: TableName = null
  ): ContributorInsightsSummary = {
    val __obj = js.Dynamic.literal()
    if (ContributorInsightsStatus != null) __obj.updateDynamic("ContributorInsightsStatus")(ContributorInsightsStatus.asInstanceOf[js.Any])
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributorInsightsSummary]
  }
}

