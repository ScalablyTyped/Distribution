package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProposalsOutput extends js.Object {
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The summary of each proposal made on the network.
    */
  var Proposals: js.UndefOr[ProposalSummaryList] = js.native
}

object ListProposalsOutput {
  @scala.inline
  def apply(): ListProposalsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProposalsOutput]
  }
  @scala.inline
  implicit class ListProposalsOutputOps[Self <: ListProposalsOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setProposalsVarargs(value: ProposalSummary*): Self = this.set("Proposals", js.Array(value :_*))
    @scala.inline
    def setProposals(value: ProposalSummaryList): Self = this.set("Proposals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposals: Self = this.set("Proposals", js.undefined)
  }
  
}

