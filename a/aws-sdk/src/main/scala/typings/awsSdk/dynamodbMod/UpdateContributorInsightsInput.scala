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
  def apply(ContributorInsightsAction: ContributorInsightsAction, TableName: TableName): UpdateContributorInsightsInput = {
    val __obj = js.Dynamic.literal(ContributorInsightsAction = ContributorInsightsAction.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContributorInsightsInput]
  }
  @scala.inline
  implicit class UpdateContributorInsightsInputOps[Self <: UpdateContributorInsightsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContributorInsightsAction(value: ContributorInsightsAction): Self = this.set("ContributorInsightsAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
  }
  
}

