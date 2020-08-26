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
  def apply(): ServerLaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerLaunchConfiguration]
  }
  @scala.inline
  implicit class ServerLaunchConfigurationOps[Self <: ServerLaunchConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssociatePublicIpAddress(value: AssociatePublicIpAddress): Self = this.set("associatePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatePublicIpAddress: Self = this.set("associatePublicIpAddress", js.undefined)
    @scala.inline
    def setEc2KeyName(value: EC2KeyName): Self = this.set("ec2KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2KeyName: Self = this.set("ec2KeyName", js.undefined)
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setLogicalId(value: LogicalId): Self = this.set("logicalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogicalId: Self = this.set("logicalId", js.undefined)
    @scala.inline
    def setSecurityGroup(value: SecurityGroup): Self = this.set("securityGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroup: Self = this.set("securityGroup", js.undefined)
    @scala.inline
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    @scala.inline
    def setSubnet(value: Subnet): Self = this.set("subnet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnet: Self = this.set("subnet", js.undefined)
    @scala.inline
    def setUserData(value: UserData): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
    @scala.inline
    def setVpc(value: VPC): Self = this.set("vpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpc: Self = this.set("vpc", js.undefined)
  }
  
}

