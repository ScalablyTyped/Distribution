package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateEbsBlockDevice extends js.Object {
  /**
    * Indicates whether the EBS volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the EBS volume is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. 
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.ec2Mod.KmsKeyId] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotId] = js.native
  /**
    * The size of the volume, in GiB.
    */
  var VolumeSize: js.UndefOr[Integer] = js.native
  /**
    * The volume type.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.ec2Mod.VolumeType] = js.native
}

object LaunchTemplateEbsBlockDevice {
  @scala.inline
  def apply(): LaunchTemplateEbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateEbsBlockDevice]
  }
  @scala.inline
  implicit class LaunchTemplateEbsBlockDeviceOps[Self <: LaunchTemplateEbsBlockDevice] (val x: Self) extends AnyVal {
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
    def setKmsKeyId(value: KmsKeyId): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    @scala.inline
    def setVolumeSize(value: Integer): Self = this.set("VolumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSize: Self = this.set("VolumeSize", js.undefined)
    @scala.inline
    def setVolumeType(value: VolumeType): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
  }
  
}

