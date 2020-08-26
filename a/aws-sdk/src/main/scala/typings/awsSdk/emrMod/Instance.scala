package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The list of EBS volumes that are attached to this instance.
    */
  var EbsVolumes: js.UndefOr[EbsVolumeList] = js.native
  /**
    * The unique identifier of the instance in Amazon EC2.
    */
  var Ec2InstanceId: js.UndefOr[InstanceId] = js.native
  /**
    * The unique identifier for the instance in Amazon EMR.
    */
  var Id: js.UndefOr[InstanceId] = js.native
  /**
    * The unique identifier of the instance fleet to which an EC2 instance belongs.
    */
  var InstanceFleetId: js.UndefOr[typings.awsSdk.emrMod.InstanceFleetId] = js.native
  /**
    * The identifier of the instance group to which this instance belongs.
    */
  var InstanceGroupId: js.UndefOr[String] = js.native
  /**
    * The EC2 instance type, for example m3.xlarge.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.emrMod.InstanceType] = js.native
  /**
    * The instance purchasing option. Valid values are ON_DEMAND or SPOT. 
    */
  var Market: js.UndefOr[MarketType] = js.native
  /**
    * The private DNS name of the instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The private IP address of the instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The public DNS name of the instance.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  /**
    * The public IP address of the instance.
    */
  var PublicIpAddress: js.UndefOr[String] = js.native
  /**
    * The current status of the instance.
    */
  var Status: js.UndefOr[InstanceStatus] = js.native
}

object Instance {
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEbsVolumesVarargs(value: EbsVolume*): Self = this.set("EbsVolumes", js.Array(value :_*))
    @scala.inline
    def setEbsVolumes(value: EbsVolumeList): Self = this.set("EbsVolumes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsVolumes: Self = this.set("EbsVolumes", js.undefined)
    @scala.inline
    def setEc2InstanceId(value: InstanceId): Self = this.set("Ec2InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2InstanceId: Self = this.set("Ec2InstanceId", js.undefined)
    @scala.inline
    def setId(value: InstanceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setInstanceFleetId(value: InstanceFleetId): Self = this.set("InstanceFleetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceFleetId: Self = this.set("InstanceFleetId", js.undefined)
    @scala.inline
    def setInstanceGroupId(value: String): Self = this.set("InstanceGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroupId: Self = this.set("InstanceGroupId", js.undefined)
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setMarket(value: MarketType): Self = this.set("Market", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarket: Self = this.set("Market", js.undefined)
    @scala.inline
    def setPrivateDnsName(value: String): Self = this.set("PrivateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsName: Self = this.set("PrivateDnsName", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
    @scala.inline
    def setPublicDnsName(value: String): Self = this.set("PublicDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicDnsName: Self = this.set("PublicDnsName", js.undefined)
    @scala.inline
    def setPublicIpAddress(value: String): Self = this.set("PublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIpAddress: Self = this.set("PublicIpAddress", js.undefined)
    @scala.inline
    def setStatus(value: InstanceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

