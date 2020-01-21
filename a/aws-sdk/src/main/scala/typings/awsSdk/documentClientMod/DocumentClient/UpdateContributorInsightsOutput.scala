package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContributorInsightsOutput extends js.Object {
  /**
    * The status of contributor insights
    */
  var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ContributorInsightsStatus] = js.native
  /**
    * The name of the global secondary index, if applicable.
    */
  var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
}

object UpdateContributorInsightsOutput {
  @scala.inline
  def apply(
    ContributorInsightsStatus: ContributorInsightsStatus = null,
    IndexName: IndexName = null,
    TableName: TableName = null
  ): UpdateContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    if (ContributorInsightsStatus != null) __obj.updateDynamic("ContributorInsightsStatus")(ContributorInsightsStatus.asInstanceOf[js.Any])
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContributorInsightsOutput]
  }
}

