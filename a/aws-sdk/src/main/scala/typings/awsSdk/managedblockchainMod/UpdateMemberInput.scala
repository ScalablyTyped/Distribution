package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMemberInput extends js.Object {
  /**
    * Configuration properties for publishing to Amazon CloudWatch Logs.
    */
  var LogPublishingConfiguration: js.UndefOr[MemberLogPublishingConfiguration] = js.native
  /**
    * The unique ID of the member.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique ID of the Managed Blockchain network to which the member belongs.
    */
  var NetworkId: ResourceIdString = js.native
}

object UpdateMemberInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString): UpdateMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMemberInput]
  }
  @scala.inline
  implicit class UpdateMemberInputOps[Self <: UpdateMemberInput] (val x: Self) extends AnyVal {
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
    def setLogPublishingConfiguration(value: MemberLogPublishingConfiguration): Self = this.set("LogPublishingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPublishingConfiguration: Self = this.set("LogPublishingConfiguration", js.undefined)
  }
  
}

