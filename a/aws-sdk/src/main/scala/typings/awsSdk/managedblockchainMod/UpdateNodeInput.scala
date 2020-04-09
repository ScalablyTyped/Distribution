package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNodeInput extends js.Object {
  /**
    * Configuration properties for publishing to Amazon CloudWatch Logs.
    */
  var LogPublishingConfiguration: js.UndefOr[NodeLogPublishingConfiguration] = js.native
  /**
    * The unique ID of the member that owns the node.
    */
  var MemberId: ResourceIdString = js.native
  /**
    * The unique ID of the Managed Blockchain network to which the node belongs.
    */
  var NetworkId: ResourceIdString = js.native
  /**
    * The unique ID of the node.
    */
  var NodeId: ResourceIdString = js.native
}

object UpdateNodeInput {
  @scala.inline
  def apply(
    MemberId: ResourceIdString,
    NetworkId: ResourceIdString,
    NodeId: ResourceIdString,
    LogPublishingConfiguration: NodeLogPublishingConfiguration = null
  ): UpdateNodeInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any], NetworkId = NetworkId.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
    if (LogPublishingConfiguration != null) __obj.updateDynamic("LogPublishingConfiguration")(LogPublishingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodeInput]
  }
}

