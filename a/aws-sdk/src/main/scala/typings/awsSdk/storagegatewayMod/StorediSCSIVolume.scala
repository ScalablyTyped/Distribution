package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorediSCSIVolume extends js.Object {
  /**
    * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
    */
  var CreatedDate: js.UndefOr[typings.awsSdk.storagegatewayMod.CreatedDate] = js.native
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * Indicates if when the stored volume was created, existing data on the underlying local disk was preserved. Valid Values: true | false 
    */
  var PreservedExistingData: js.UndefOr[scala.Boolean] = js.native
  /**
    * If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not included.
    */
  var SourceSnapshotId: js.UndefOr[SnapshotId] = js.native
  /**
    * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
    */
  var TargetName: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the storage volume.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.native
  /**
    * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway. For more information, see Moving your volumes to a different gateway.
    */
  var VolumeAttachmentStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeAttachmentStatus] = js.native
  /**
    * The ID of the local disk that was specified in the CreateStorediSCSIVolume operation.
    */
  var VolumeDiskId: js.UndefOr[DiskId] = js.native
  /**
    * The unique identifier of the volume, e.g. vol-AE4B946D.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeId] = js.native
  /**
    * Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of data transferred. This field does not appear in the response if the stored volume is not restoring or bootstrapping.
    */
  var VolumeProgress: js.UndefOr[DoubleObject] = js.native
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.native
  /**
    * One of the VolumeStatus values that indicates the state of the storage volume.
    */
  var VolumeStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeStatus] = js.native
  /**
    * One of the VolumeType enumeration values describing the type of the volume.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeType] = js.native
  /**
    * The size of the data stored on the volume in bytes. This value is calculated based on the number of blocks that are touched, instead of the actual amount of data written. This value can be useful for sequential write patterns but less accurate for random write patterns. VolumeUsedInBytes is different from the compressed size of the volume, which is the value that is used to calculate your bill.  This value is not available for volumes created prior to May 13, 2015, until you store data on the volume. 
    */
  var VolumeUsedInBytes: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeUsedInBytes] = js.native
  /**
    * An VolumeiSCSIAttributes object that represents a collection of iSCSI attributes for one stored volume.
    */
  var VolumeiSCSIAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeiSCSIAttributes] = js.native
}

object StorediSCSIVolume {
  @scala.inline
  def apply(): StorediSCSIVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorediSCSIVolume]
  }
  @scala.inline
  implicit class StorediSCSIVolumeOps[Self <: StorediSCSIVolume] (val x: Self) extends AnyVal {
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
    def setCreatedDate(value: CreatedDate): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setKMSKey(value: KMSKey): Self = this.set("KMSKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSKey: Self = this.set("KMSKey", js.undefined)
    @scala.inline
    def setPreservedExistingData(value: scala.Boolean): Self = this.set("PreservedExistingData", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreservedExistingData: Self = this.set("PreservedExistingData", js.undefined)
    @scala.inline
    def setSourceSnapshotId(value: SnapshotId): Self = this.set("SourceSnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceSnapshotId: Self = this.set("SourceSnapshotId", js.undefined)
    @scala.inline
    def setTargetName(value: TargetName): Self = this.set("TargetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetName: Self = this.set("TargetName", js.undefined)
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = this.set("VolumeARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeARN: Self = this.set("VolumeARN", js.undefined)
    @scala.inline
    def setVolumeAttachmentStatus(value: VolumeAttachmentStatus): Self = this.set("VolumeAttachmentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeAttachmentStatus: Self = this.set("VolumeAttachmentStatus", js.undefined)
    @scala.inline
    def setVolumeDiskId(value: DiskId): Self = this.set("VolumeDiskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeDiskId: Self = this.set("VolumeDiskId", js.undefined)
    @scala.inline
    def setVolumeId(value: VolumeId): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("VolumeId", js.undefined)
    @scala.inline
    def setVolumeProgress(value: DoubleObject): Self = this.set("VolumeProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeProgress: Self = this.set("VolumeProgress", js.undefined)
    @scala.inline
    def setVolumeSizeInBytes(value: long): Self = this.set("VolumeSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSizeInBytes: Self = this.set("VolumeSizeInBytes", js.undefined)
    @scala.inline
    def setVolumeStatus(value: VolumeStatus): Self = this.set("VolumeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeStatus: Self = this.set("VolumeStatus", js.undefined)
    @scala.inline
    def setVolumeType(value: VolumeType): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
    @scala.inline
    def setVolumeUsedInBytes(value: VolumeUsedInBytes): Self = this.set("VolumeUsedInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeUsedInBytes: Self = this.set("VolumeUsedInBytes", js.undefined)
    @scala.inline
    def setVolumeiSCSIAttributes(value: VolumeiSCSIAttributes): Self = this.set("VolumeiSCSIAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeiSCSIAttributes: Self = this.set("VolumeiSCSIAttributes", js.undefined)
  }
  
}

