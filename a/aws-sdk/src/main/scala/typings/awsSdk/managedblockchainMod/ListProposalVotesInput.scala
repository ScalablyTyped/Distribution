package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProposalVotesInput extends js.Object {
  /**
    *  The maximum number of votes to return. 
    */
  var MaxResults: js.UndefOr[ProposalListMaxResults] = js.native
  /**
    *  The unique identifier of the network. 
    */
  var NetworkId: ResourceIdString = js.native
  /**
    *  The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: ResourceIdString = js.native
}

object ListProposalVotesInput {
  @scala.inline
  def apply(NetworkId: ResourceIdString, ProposalId: ResourceIdString): ListProposalVotesInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], ProposalId = ProposalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProposalVotesInput]
  }
  @scala.inline
  implicit class ListProposalVotesInputOps[Self <: ListProposalVotesInput] (val x: Self) extends AnyVal {
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
    def setNetworkId(value: ResourceIdString): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProposalId(value: ResourceIdString): Self = this.set("ProposalId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: ProposalListMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

