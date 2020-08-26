package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPortfolioAccessOutput extends js.Object {
  /**
    * Information about the AWS accounts with access to the portfolio.
    */
  var AccountIds: js.UndefOr[typings.awsSdk.servicecatalogMod.AccountIds] = js.native
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
}

object ListPortfolioAccessOutput {
  @scala.inline
  def apply(): ListPortfolioAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPortfolioAccessOutput]
  }
  @scala.inline
  implicit class ListPortfolioAccessOutputOps[Self <: ListPortfolioAccessOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("AccountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: AccountIds): Self = this.set("AccountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountIds: Self = this.set("AccountIds", js.undefined)
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
  }
  
}

