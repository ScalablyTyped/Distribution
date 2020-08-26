package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesEbs extends js.Object {
  /**
    * Indicates whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that support them.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. For io1 volumes, this represents the number of IOPS that are provisioned for the volume. For gp2 volumes, this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more information about gp2 baseline performance, I/O credits, and bursting, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud User Guide. Constraint: Range is 100-20000 IOPS for io1 volumes and 100-10000 IOPS for gp2 volumes. Condition: This parameter is required for requests to create io1volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotId] = js.native
  /**
    * The size of the volume, in GiB. Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the snapshot size.
    */
  var VolumeSize: js.UndefOr[Integer] = js.native
  /**
    * The volume type. gp2 for General Purpose SSD, io1 for Provisioned IOPS SSD, Throughput Optimized HDD for st1, Cold HDD for sc1, or standard for Magnetic. Default: gp2 
    */
  var VolumeType: js.UndefOr[String] = js.native
}

object ScheduledInstancesEbs {
  @scala.inline
  def apply(): ScheduledInstancesEbs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesEbs]
  }
  @scala.inline
  implicit class ScheduledInstancesEbsOps[Self <: ScheduledInstancesEbs] (val x: Self) extends AnyVal {
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
    def setDeleteOnTermination(value: Boolean): Self = this.set("DeleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("DeleteOnTermination", js.undefined)
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    @scala.inline
    def setIops(value: Integer): Self = this.set("Iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    @scala.inline
    def setVolumeSize(value: Integer): Self = this.set("VolumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSize: Self = this.set("VolumeSize", js.undefined)
    @scala.inline
    def setVolumeType(value: String): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
  }
  
}

