package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConstraintsForPortfolioOutput extends js.Object {
  /**
    * Information about the constraints.
    */
  var ConstraintDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintDetails] = js.native
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
}

object ListConstraintsForPortfolioOutput {
  @scala.inline
  def apply(): ListConstraintsForPortfolioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConstraintsForPortfolioOutput]
  }
  @scala.inline
  implicit class ListConstraintsForPortfolioOutputOps[Self <: ListConstraintsForPortfolioOutput] (val x: Self) extends AnyVal {
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
    def setConstraintDetailsVarargs(value: ConstraintDetail*): Self = this.set("ConstraintDetails", js.Array(value :_*))
    @scala.inline
    def setConstraintDetails(value: ConstraintDetails): Self = this.set("ConstraintDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraintDetails: Self = this.set("ConstraintDetails", js.undefined)
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
  }
  
}

