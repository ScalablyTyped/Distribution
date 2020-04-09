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
  def apply(
    MemberId: ResourceIdString,
    NetworkId: ResourceIdString,
    LogPublishingConfiguration: MemberLogPublishingConfiguration = null
  ): UpdateMemberInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
    if (LogPublishingConfiguration != null) __obj.updateDynamic("LogPublishingConfiguration")(LogPublishingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMemberInput]
  }
}

