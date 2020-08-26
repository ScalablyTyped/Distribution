package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNodesInput extends js.Object {
  /**
    * The maximum number of nodes to list.
    */
  var MaxResults: js.UndefOr[NodeListMaxResults] = js.native
  /**
    * The unique identifier of the member who owns the nodes to list.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique identifier of the network for which to list nodes.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An optional status specifier. If provided, only nodes currently in this status are listed.
    */
  var Status: js.UndefOr[NodeStatus] = js.native
}

object ListNodesInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): ListNodesInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNodesInput]
  }
  @scala.inline
  implicit class ListNodesInputOps[Self <: ListNodesInput] (val x: Self) extends AnyVal {
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
    def setMemberId(value: ResourceIdString): Self = this.set("MemberId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkId(value: ResourceIdString): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: NodeListMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStatus(value: NodeStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

