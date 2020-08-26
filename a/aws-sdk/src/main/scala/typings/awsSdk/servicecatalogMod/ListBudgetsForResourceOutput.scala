package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBudgetsForResourceOutput extends js.Object {
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.servicecatalogMod.Budgets] = js.native
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
}

object ListBudgetsForResourceOutput {
  @scala.inline
  def apply(): ListBudgetsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBudgetsForResourceOutput]
  }
  @scala.inline
  implicit class ListBudgetsForResourceOutputOps[Self <: ListBudgetsForResourceOutput] (val x: Self) extends AnyVal {
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
    def setBudgetsVarargs(value: BudgetDetail*): Self = this.set("Budgets", js.Array(value :_*))
    @scala.inline
    def setBudgets(value: Budgets): Self = this.set("Budgets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBudgets: Self = this.set("Budgets", js.undefined)
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
  }
  
}

