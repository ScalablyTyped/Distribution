package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpoint extends js.Object {
  /**
    * The date and time that the VPC endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[MillisecondDateTime] = js.native
  /**
    * (Interface endpoint) The DNS entries for the endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.native
  /**
    * (Interface endpoint) Information about the security groups that are associated with the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierSet] = js.native
  /**
    * The last error that occurred for VPC endpoint.
    */
  var LastError: js.UndefOr[typings.awsSdk.ec2Mod.LastError] = js.native
  /**
    * (Interface endpoint) One or more network interfaces for the endpoint.
    */
  var NetworkInterfaceIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The policy document associated with the endpoint, if applicable.
    */
  var PolicyDocument: js.UndefOr[String] = js.native
  /**
    * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
    */
  var PrivateDnsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the VPC endpoint is being managed by its service.
    */
  var RequesterManaged: js.UndefOr[Boolean] = js.native
  /**
    * (Gateway endpoint) One or more route tables associated with the endpoint.
    */
  var RouteTableIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The name of the service to which the endpoint is associated.
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * The state of the VPC endpoint.
    */
  var State: js.UndefOr[typings.awsSdk.ec2Mod.State] = js.native
  /**
    * (Interface endpoint) One or more subnets in which the endpoint is located.
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.native
  /**
    * Any tags assigned to the VPC endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.native
  /**
    * The type of endpoint.
    */
  var VpcEndpointType: js.UndefOr[typings.awsSdk.ec2Mod.VpcEndpointType] = js.native
  /**
    * The ID of the VPC to which the endpoint is associated.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object VpcEndpoint {
  @scala.inline
  def apply(
    CreationTimestamp: MillisecondDateTime = null,
    DnsEntries: DnsEntrySet = null,
    Groups: GroupIdentifierSet = null,
    LastError: LastError = null,
    NetworkInterfaceIds: ValueStringList = null,
    OwnerId: String = null,
    PolicyDocument: String = null,
    PrivateDnsEnabled: js.UndefOr[Boolean] = js.undefined,
    RequesterManaged: js.UndefOr[Boolean] = js.undefined,
    RouteTableIds: ValueStringList = null,
    ServiceName: String = null,
    State: State = null,
    SubnetIds: ValueStringList = null,
    Tags: TagList = null,
    VpcEndpointId: String = null,
    VpcEndpointType: VpcEndpointType = null,
    VpcId: String = null
  ): VpcEndpoint = {
    val __obj = js.Dynamic.literal()
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (DnsEntries != null) __obj.updateDynamic("DnsEntries")(DnsEntries.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (LastError != null) __obj.updateDynamic("LastError")(LastError.asInstanceOf[js.Any])
    if (NetworkInterfaceIds != null) __obj.updateDynamic("NetworkInterfaceIds")(NetworkInterfaceIds.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (PolicyDocument != null) __obj.updateDynamic("PolicyDocument")(PolicyDocument.asInstanceOf[js.Any])
    if (!js.isUndefined(PrivateDnsEnabled)) __obj.updateDynamic("PrivateDnsEnabled")(PrivateDnsEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequesterManaged)) __obj.updateDynamic("RequesterManaged")(RequesterManaged.get.asInstanceOf[js.Any])
    if (RouteTableIds != null) __obj.updateDynamic("RouteTableIds")(RouteTableIds.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId.asInstanceOf[js.Any])
    if (VpcEndpointType != null) __obj.updateDynamic("VpcEndpointType")(VpcEndpointType.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpoint]
  }
}

