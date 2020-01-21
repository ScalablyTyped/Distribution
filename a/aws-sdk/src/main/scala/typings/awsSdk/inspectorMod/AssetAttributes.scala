package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetAttributes extends js.Object {
  /**
    * The ID of the agent that is installed on the EC2 instance where the finding is generated.
    */
  var agentId: js.UndefOr[AgentId] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
    */
  var amiId: js.UndefOr[AmiId] = js.native
  /**
    * The Auto Scaling group of the EC2 instance where the finding is generated.
    */
  var autoScalingGroup: js.UndefOr[AutoScalingGroup] = js.native
  /**
    * The hostname of the EC2 instance where the finding is generated.
    */
  var hostname: js.UndefOr[Hostname] = js.native
  /**
    * The list of IP v4 addresses of the EC2 instance where the finding is generated.
    */
  var ipv4Addresses: js.UndefOr[Ipv4AddressList] = js.native
  /**
    * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.native
  /**
    * The schema version of this data type.
    */
  var schemaVersion: NumericVersion = js.native
  /**
    * The tags related to the EC2 instance where the finding is generated.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object AssetAttributes {
  @scala.inline
  def apply(
    schemaVersion: NumericVersion,
    agentId: AgentId = null,
    amiId: AmiId = null,
    autoScalingGroup: AutoScalingGroup = null,
    hostname: Hostname = null,
    ipv4Addresses: Ipv4AddressList = null,
    networkInterfaces: NetworkInterfaces = null,
    tags: Tags = null
  ): AssetAttributes = {
    val __obj = js.Dynamic.literal(schemaVersion = schemaVersion.asInstanceOf[js.Any])
    if (agentId != null) __obj.updateDynamic("agentId")(agentId.asInstanceOf[js.Any])
    if (amiId != null) __obj.updateDynamic("amiId")(amiId.asInstanceOf[js.Any])
    if (autoScalingGroup != null) __obj.updateDynamic("autoScalingGroup")(autoScalingGroup.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (ipv4Addresses != null) __obj.updateDynamic("ipv4Addresses")(ipv4Addresses.asInstanceOf[js.Any])
    if (networkInterfaces != null) __obj.updateDynamic("networkInterfaces")(networkInterfaces.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetAttributes]
  }
}

