package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeConfiguration extends js.Object {
  /**
    * Specifies whether an Amazon EBS volume is encrypted. For more information, see Amazon EBS Encryption.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The volume mount point. For example "/dev/sdh".
    */
  var MountPoint: String = js.native
  /**
    * The number of disks in the volume.
    */
  var NumberOfDisks: Integer = js.native
  /**
    * The volume RAID level.
    */
  var RaidLevel: js.UndefOr[Integer] = js.native
  /**
    * The volume size.
    */
  var Size: Integer = js.native
  /**
    * The volume type. For more information, see  Amazon EBS Volume Types.    standard - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024 GiB.    io1 - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of 16384 GiB.    gp2 - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum size of 16384 GiB.    st1 - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.    sc1 - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.  
    */
  var VolumeType: js.UndefOr[String] = js.native
}

object VolumeConfiguration {
  @scala.inline
  def apply(
    MountPoint: String,
    NumberOfDisks: Integer,
    Size: Integer,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Iops: js.UndefOr[Integer] = js.undefined,
    RaidLevel: js.UndefOr[Integer] = js.undefined,
    VolumeType: String = null
  ): VolumeConfiguration = {
    val __obj = js.Dynamic.literal(MountPoint = MountPoint.asInstanceOf[js.Any], NumberOfDisks = NumberOfDisks.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RaidLevel)) __obj.updateDynamic("RaidLevel")(RaidLevel.get.asInstanceOf[js.Any])
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeConfiguration]
  }
}

