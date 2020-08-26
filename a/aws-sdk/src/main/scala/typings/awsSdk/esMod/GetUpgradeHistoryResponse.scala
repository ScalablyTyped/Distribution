package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUpgradeHistoryResponse extends js.Object {
  /**
    * Pagination token that needs to be supplied to the next call to get the next page of results
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    *  A list of  UpgradeHistory  objects corresponding to each Upgrade or Upgrade Eligibility Check performed on a domain returned as part of  GetUpgradeHistoryResponse  object. 
    */
  var UpgradeHistories: js.UndefOr[UpgradeHistoryList] = js.native
}

object GetUpgradeHistoryResponse {
  @scala.inline
  def apply(): GetUpgradeHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpgradeHistoryResponse]
  }
  @scala.inline
  implicit class GetUpgradeHistoryResponseOps[Self <: GetUpgradeHistoryResponse] (val x: Self) extends AnyVal {
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
    def setUpgradeHistoriesVarargs(value: UpgradeHistory*): Self = this.set("UpgradeHistories", js.Array(value :_*))
    @scala.inline
    def setUpgradeHistories(value: UpgradeHistoryList): Self = this.set("UpgradeHistories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgradeHistories: Self = this.set("UpgradeHistories", js.undefined)
  }
  
}

