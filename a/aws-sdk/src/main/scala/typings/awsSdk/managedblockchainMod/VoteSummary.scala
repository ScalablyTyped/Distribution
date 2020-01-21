package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoteSummary extends js.Object {
  /**
    *  The unique identifier of the member that cast the vote. 
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
  /**
    *  The name of the member that cast the vote. 
    */
  var MemberName: js.UndefOr[NetworkMemberNameString] = js.native
  /**
    *  The vote value, either YES or NO. 
    */
  var Vote: js.UndefOr[VoteValue] = js.native
}

object VoteSummary {
  @scala.inline
  def apply(
    MemberId: ResourceIdString = null,
    MemberName: NetworkMemberNameString = null,
    Vote: VoteValue = null
  ): VoteSummary = {
    val __obj = js.Dynamic.literal()
    if (MemberId != null) __obj.updateDynamic("MemberId")(MemberId.asInstanceOf[js.Any])
    if (MemberName != null) __obj.updateDynamic("MemberName")(MemberName.asInstanceOf[js.Any])
    if (Vote != null) __obj.updateDynamic("Vote")(Vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoteSummary]
  }
}

