package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersInput extends js.Object {
  /**
    * An optional Boolean value. If provided, the request is limited either to members that the current AWS account owns (true) or that other AWS accounts own (false). If omitted, all members are listed.
    */
  var IsOwned: js.UndefOr[typings.awsSdk.managedblockchainMod.IsOwned] = js.native
  /**
    * The maximum number of members to return in the request.
    */
  var MaxResults: js.UndefOr[MemberListMaxResults] = js.native
  /**
    * The optional name of the member to list.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The unique identifier of the network for which to list members.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An optional status specifier. If provided, only members currently in this status are listed.
    */
  var Status: js.UndefOr[MemberStatus] = js.native
}

object ListMembersInput {
  @scala.inline
  def apply(
    NetworkId: ResourceIdString,
    IsOwned: js.UndefOr[Boolean] = js.undefined,
    MaxResults: Int | Double = null,
    Name: String = null,
    NextToken: PaginationToken = null,
    Status: MemberStatus = null
  ): ListMembersInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any])
    if (!js.isUndefined(IsOwned)) __obj.updateDynamic("IsOwned")(IsOwned.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersInput]
  }
}

