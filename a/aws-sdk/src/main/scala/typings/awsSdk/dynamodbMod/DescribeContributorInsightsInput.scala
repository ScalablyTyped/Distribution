package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContributorInsightsInput extends js.Object {
  /**
    * The name of the global secondary index to describe, if applicable.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.native
  /**
    * The name of the table to describe.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}

object DescribeContributorInsightsInput {
  @scala.inline
  def apply(TableName: TableName): DescribeContributorInsightsInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContributorInsightsInput]
  }
  @scala.inline
  implicit class DescribeContributorInsightsInputOps[Self <: DescribeContributorInsightsInput] (val x: Self) extends AnyVal {
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
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
  }
  
}

