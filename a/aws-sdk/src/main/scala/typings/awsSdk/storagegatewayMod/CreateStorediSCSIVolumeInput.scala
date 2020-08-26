package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStorediSCSIVolumeInput extends js.Object {
  /**
    * The unique identifier for the gateway local disk that is configured as a stored volume. Use ListLocalDisks to list disk IDs for a gateway.
    */
  var DiskId: typings.awsSdk.storagegatewayMod.DiskId = js.native
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * Set to true to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use DescribeGatewayInformation to get a list of the network interfaces available on a gateway. Valid Values: A valid IP address.
    */
  var NetworkInterfaceId: typings.awsSdk.storagegatewayMod.NetworkInterfaceId = js.native
  /**
    * Set to true true if you want to preserve the data on the local disk. Otherwise, set to false to create an empty volume. Valid Values: true | false 
    */
  var PreserveExistingData: scala.Boolean = js.native
  /**
    * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this field if you want to create the iSCSI storage volume from a snapshot; otherwise, do not include this field. To list snapshots for your account use DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.storagegatewayMod.SnapshotId] = js.native
  /**
    * A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
    */
  var TargetName: typings.awsSdk.storagegatewayMod.TargetName = js.native
}

object CreateStorediSCSIVolumeInput {
  @scala.inline
  def apply(
    DiskId: DiskId,
    GatewayARN: GatewayARN,
    NetworkInterfaceId: NetworkInterfaceId,
    PreserveExistingData: scala.Boolean,
    TargetName: TargetName
  ): CreateStorediSCSIVolumeInput = {
    val __obj = js.Dynamic.literal(DiskId = DiskId.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], PreserveExistingData = PreserveExistingData.asInstanceOf[js.Any], TargetName = TargetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorediSCSIVolumeInput]
  }
  @scala.inline
  implicit class CreateStorediSCSIVolumeInputOps[Self <: CreateStorediSCSIVolumeInput] (val x: Self) extends AnyVal {
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
    def setDiskId(value: DiskId): Self = this.set("DiskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveExistingData(value: scala.Boolean): Self = this.set("PreserveExistingData", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetName(value: TargetName): Self = this.set("TargetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKMSEncrypted(value: Boolean): Self = this.set("KMSEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSEncrypted: Self = this.set("KMSEncrypted", js.undefined)
    @scala.inline
    def setKMSKey(value: KMSKey): Self = this.set("KMSKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSKey: Self = this.set("KMSKey", js.undefined)
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

