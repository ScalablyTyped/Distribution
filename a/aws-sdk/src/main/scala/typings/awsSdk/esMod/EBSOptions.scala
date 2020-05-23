package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBSOptions extends js.Object {
  /**
    * Specifies whether EBS-based storage is enabled.
    */
  var EBSEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
    */
  var Iops: js.UndefOr[IntegerClass] = js.native
  /**
    *  Integer to specify the size of an EBS volume.
    */
  var VolumeSize: js.UndefOr[IntegerClass] = js.native
  /**
    *  Specifies the volume type for EBS-based storage.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.esMod.VolumeType] = js.native
}

object EBSOptions {
  @scala.inline
  def apply(
    EBSEnabled: js.UndefOr[Boolean] = js.undefined,
    Iops: js.UndefOr[IntegerClass] = js.undefined,
    VolumeSize: js.UndefOr[IntegerClass] = js.undefined,
    VolumeType: VolumeType = null
  ): EBSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EBSEnabled)) __obj.updateDynamic("EBSEnabled")(EBSEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(VolumeSize)) __obj.updateDynamic("VolumeSize")(VolumeSize.get.asInstanceOf[js.Any])
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EBSOptions]
  }
}

