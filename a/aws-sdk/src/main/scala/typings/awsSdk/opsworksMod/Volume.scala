package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volume extends js.Object {
  /**
    * The volume Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The device name.
    */
  var Device: js.UndefOr[String] = js.native
  /**
    * The Amazon EC2 volume ID.
    */
  var Ec2VolumeId: js.UndefOr[String] = js.native
  /**
    * Specifies whether an Amazon EBS volume is encrypted. For more information, see Amazon EBS Encryption.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The volume mount point. For example, "/mnt/disk1".
    */
  var MountPoint: js.UndefOr[String] = js.native
  /**
    * The volume name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The RAID array ID.
    */
  var RaidArrayId: js.UndefOr[String] = js.native
  /**
    * The AWS region. For more information about AWS regions, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * The volume size.
    */
  var Size: js.UndefOr[Integer] = js.native
  /**
    * The value returned by DescribeVolumes.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.native
  /**
    * The volume type. For more information, see  Amazon EBS Volume Types.    standard - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024 GiB.    io1 - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of 16384 GiB.    gp2 - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum size of 16384 GiB.    st1 - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.    sc1 - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.  
    */
  var VolumeType: js.UndefOr[String] = js.native
}

object Volume {
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setDevice(value: String): Self = this.set("Device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("Device", js.undefined)
    @scala.inline
    def setEc2VolumeId(value: String): Self = this.set("Ec2VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2VolumeId: Self = this.set("Ec2VolumeId", js.undefined)
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setIops(value: Integer): Self = this.set("Iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    @scala.inline
    def setMountPoint(value: String): Self = this.set("MountPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountPoint: Self = this.set("MountPoint", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRaidArrayId(value: String): Self = this.set("RaidArrayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaidArrayId: Self = this.set("RaidArrayId", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    @scala.inline
    def setSize(value: Integer): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setVolumeId(value: String): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("VolumeId", js.undefined)
    @scala.inline
    def setVolumeType(value: String): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
  }
  
}

