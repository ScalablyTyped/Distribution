package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfiguration extends js.Object {
  /**
    * The ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var SecurityGroupIds: typings.awsSdk.codestarconnectionsMod.SecurityGroupIds = js.native
  /**
    * The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var SubnetIds: typings.awsSdk.codestarconnectionsMod.SubnetIds = js.native
  /**
    * The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your provider type is installed.
    */
  var TlsCertificate: js.UndefOr[typings.awsSdk.codestarconnectionsMod.TlsCertificate] = js.native
  /**
    * The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var VpcId: typings.awsSdk.codestarconnectionsMod.VpcId = js.native
}

object VpcConfiguration {
  @scala.inline
  def apply(
    SecurityGroupIds: SecurityGroupIds,
    SubnetIds: SubnetIds,
    VpcId: VpcId,
    TlsCertificate: TlsCertificate = null
  ): VpcConfiguration = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (TlsCertificate != null) __obj.updateDynamic("TlsCertificate")(TlsCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfiguration]
  }
}

