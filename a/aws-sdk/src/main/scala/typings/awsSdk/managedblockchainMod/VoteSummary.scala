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
  def apply(): VoteSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoteSummary]
  }
  @scala.inline
  implicit class VoteSummaryOps[Self <: VoteSummary] (val x: Self) extends AnyVal {
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
    def deleteMemberId: Self = this.set("MemberId", js.undefined)
    @scala.inline
    def setMemberName(value: NetworkMemberNameString): Self = this.set("MemberName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberName: Self = this.set("MemberName", js.undefined)
    @scala.inline
    def setVote(value: VoteValue): Self = this.set("Vote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVote: Self = this.set("Vote", js.undefined)
  }
  
}

