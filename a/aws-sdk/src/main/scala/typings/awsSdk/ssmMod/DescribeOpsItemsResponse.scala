package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOpsItemsResponse extends js.Object {
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of OpsItems.
    */
  var OpsItemSummaries: js.UndefOr[typings.awsSdk.ssmMod.OpsItemSummaries] = js.native
}

object DescribeOpsItemsResponse {
  @scala.inline
  def apply(): DescribeOpsItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOpsItemsResponse]
  }
  @scala.inline
  implicit class DescribeOpsItemsResponseOps[Self <: DescribeOpsItemsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setOpsItemSummariesVarargs(value: OpsItemSummary*): Self = this.set("OpsItemSummaries", js.Array(value :_*))
    @scala.inline
    def setOpsItemSummaries(value: OpsItemSummaries): Self = this.set("OpsItemSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpsItemSummaries: Self = this.set("OpsItemSummaries", js.undefined)
  }
  
}

