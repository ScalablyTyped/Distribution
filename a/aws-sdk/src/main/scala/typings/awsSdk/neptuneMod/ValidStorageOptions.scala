package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidStorageOptions extends js.Object {
  /**
    * The valid range of Provisioned IOPS to gibibytes of storage multiplier. For example, 3-10, which means that provisioned IOPS can be between 3 and 10 times storage.
    */
  var IopsToStorageRatio: js.UndefOr[DoubleRangeList] = js.native
  /**
    * The valid range of provisioned IOPS. For example, 1000-20000.
    */
  var ProvisionedIops: js.UndefOr[RangeList] = js.native
  /**
    * The valid range of storage in gibibytes. For example, 100 to 16384.
    */
  var StorageSize: js.UndefOr[RangeList] = js.native
  /**
    * The valid storage types for your DB instance. For example, gp2, io1.
    */
  var StorageType: js.UndefOr[String] = js.native
}

object ValidStorageOptions {
  @scala.inline
  def apply(
    IopsToStorageRatio: DoubleRangeList = null,
    ProvisionedIops: RangeList = null,
    StorageSize: RangeList = null,
    StorageType: String = null
  ): ValidStorageOptions = {
    val __obj = js.Dynamic.literal()
    if (IopsToStorageRatio != null) __obj.updateDynamic("IopsToStorageRatio")(IopsToStorageRatio.asInstanceOf[js.Any])
    if (ProvisionedIops != null) __obj.updateDynamic("ProvisionedIops")(ProvisionedIops.asInstanceOf[js.Any])
    if (StorageSize != null) __obj.updateDynamic("StorageSize")(StorageSize.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidStorageOptions]
  }
}

