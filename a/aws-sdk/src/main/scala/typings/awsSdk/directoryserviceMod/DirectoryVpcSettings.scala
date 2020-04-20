package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryVpcSettings extends js.Object {
  /**
    * The identifiers of the subnets for the directory servers. The two subnets must be in different Availability Zones. AWS Directory Service creates a directory server and a DNS server in each of these subnets.
    */
  var SubnetIds: typings.awsSdk.directoryserviceMod.SubnetIds = js.native
  /**
    * The identifier of the VPC in which to create the directory.
    */
  var VpcId: typings.awsSdk.directoryserviceMod.VpcId = js.native
}

object DirectoryVpcSettings {
  @scala.inline
  def apply(SubnetIds: SubnetIds, VpcId: VpcId): DirectoryVpcSettings = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryVpcSettings]
  }
}

