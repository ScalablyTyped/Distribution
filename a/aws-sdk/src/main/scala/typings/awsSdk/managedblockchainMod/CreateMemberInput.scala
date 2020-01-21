package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMemberInput extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString = js.native
  /**
    * The unique identifier of the invitation that is sent to the member to join the network.
    */
  var InvitationId: ResourceIdString = js.native
  /**
    * Member configuration parameters.
    */
  var MemberConfiguration: typings.awsSdk.managedblockchainMod.MemberConfiguration = js.native
  /**
    * The unique identifier of the network in which the member is created.
    */
  var NetworkId: ResourceIdString = js.native
}

object CreateMemberInput {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestTokenString,
    InvitationId: ResourceIdString,
    MemberConfiguration: MemberConfiguration,
    NetworkId: ResourceIdString
  ): CreateMemberInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], InvitationId = InvitationId.asInstanceOf[js.Any], MemberConfiguration = MemberConfiguration.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateMemberInput]
  }
}

