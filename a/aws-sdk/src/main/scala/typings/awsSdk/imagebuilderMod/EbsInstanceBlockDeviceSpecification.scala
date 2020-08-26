package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsInstanceBlockDeviceSpecification extends js.Object {
  /**
    * Use to configure delete on termination of the associated device.
    */
  var deleteOnTermination: js.UndefOr[NullableBoolean] = js.native
  /**
    * Use to configure device encryption.
    */
  var encrypted: js.UndefOr[NullableBoolean] = js.native
  /**
    * Use to configure device IOPS.
    */
  var iops: js.UndefOr[EbsIopsInteger] = js.native
  /**
    * Use to configure the KMS key to use when encrypting the device.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The snapshot that defines the device contents.
    */
  var snapshotId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Use to override the device's volume size.
    */
  var volumeSize: js.UndefOr[EbsVolumeSizeInteger] = js.native
  /**
    * Use to override the device's volume type.
    */
  var volumeType: js.UndefOr[EbsVolumeType] = js.native
}

object EbsInstanceBlockDeviceSpecification {
  @scala.inline
  def apply(): EbsInstanceBlockDeviceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInstanceBlockDeviceSpecification]
  }
  @scala.inline
  implicit class EbsInstanceBlockDeviceSpecificationOps[Self <: EbsInstanceBlockDeviceSpecification] (val x: Self) extends AnyVal {
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
    def setDeleteOnTermination(value: NullableBoolean): Self = this.set("deleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("deleteOnTermination", js.undefined)
    @scala.inline
    def setEncrypted(value: NullableBoolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    @scala.inline
    def setIops(value: EbsIopsInteger): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("iops", js.undefined)
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setSnapshotId(value: NonEmptyString): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
    @scala.inline
    def setVolumeSize(value: EbsVolumeSizeInteger): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSize: Self = this.set("volumeSize", js.undefined)
    @scala.inline
    def setVolumeType(value: EbsVolumeType): Self = this.set("volumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("volumeType", js.undefined)
  }
  
}

