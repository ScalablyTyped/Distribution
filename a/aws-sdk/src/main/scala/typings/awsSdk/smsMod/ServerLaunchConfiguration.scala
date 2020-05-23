package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerLaunchConfiguration extends js.Object {
  /**
    * If true, a publicly accessible IP address is created when launching the server.
    */
  var associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.native
  /**
    * Name of the EC2 SSH Key to be used for connecting to the launched server.
    */
  var ec2KeyName: js.UndefOr[EC2KeyName] = js.native
  /**
    * Instance type to be used for launching the server.
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  /**
    * Logical ID of the server in the Amazon CloudFormation template.
    */
  var logicalId: js.UndefOr[LogicalId] = js.native
  /**
    * Identifier of the security group that applies to the launched server.
    */
  var securityGroup: js.UndefOr[SecurityGroup] = js.native
  /**
    * Identifier of the server the launch configuration is associated with.
    */
  var server: js.UndefOr[Server] = js.native
  /**
    * Identifier of the subnet the server should be launched into.
    */
  var subnet: js.UndefOr[Subnet] = js.native
  /**
    * Location of the user-data script to be executed when launching the server.
    */
  var userData: js.UndefOr[UserData] = js.native
  /**
    * Identifier of the VPC the server should be launched into.
    */
  var vpc: js.UndefOr[VPC] = js.native
}

object ServerLaunchConfiguration {
  @scala.inline
  def apply(
    associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.undefined,
    ec2KeyName: EC2KeyName = null,
    instanceType: InstanceType = null,
    logicalId: LogicalId = null,
    securityGroup: SecurityGroup = null,
    server: Server = null,
    subnet: Subnet = null,
    userData: UserData = null,
    vpc: VPC = null
  ): ServerLaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(associatePublicIpAddress)) __obj.updateDynamic("associatePublicIpAddress")(associatePublicIpAddress.get.asInstanceOf[js.Any])
    if (ec2KeyName != null) __obj.updateDynamic("ec2KeyName")(ec2KeyName.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (logicalId != null) __obj.updateDynamic("logicalId")(logicalId.asInstanceOf[js.Any])
    if (securityGroup != null) __obj.updateDynamic("securityGroup")(securityGroup.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (subnet != null) __obj.updateDynamic("subnet")(subnet.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (vpc != null) __obj.updateDynamic("vpc")(vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerLaunchConfiguration]
  }
}

