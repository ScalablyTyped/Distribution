package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodeInput extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString = js.native
  /**
    * The unique identifier of the member that owns this node.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique identifier of the network in which this node runs.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The properties of a node configuration.
    */
  var NodeConfiguration: typings.awsSdk.managedblockchainMod.NodeConfiguration = js.native
}

object CreateNodeInput {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestTokenString,
    MemberId: ResourceIdString,
    NetworkId: ResourceIdString,
    NodeConfiguration: NodeConfiguration
  ): CreateNodeInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeConfiguration = NodeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodeInput]
  }
}

