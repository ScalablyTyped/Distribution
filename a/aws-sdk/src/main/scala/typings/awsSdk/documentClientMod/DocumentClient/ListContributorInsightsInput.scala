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
  def apply(): ListContributorInsightsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContributorInsightsInput]
  }
  @scala.inline
  implicit class ListContributorInsightsInputOps[Self <: ListContributorInsightsInput] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: ListContributorInsightsLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextTokenString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("TableName", js.undefined)
  }
  
}

