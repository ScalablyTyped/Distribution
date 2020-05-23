package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageRuleType extends js.Object {
  /**
    * The amount of storage allocated, in bytes.
    */
  var StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.native
  /**
    * The type of storage.
    */
  var StorageType: js.UndefOr[typings.awsSdk.workdocsMod.StorageType] = js.native
}

object StorageRuleType {
  @scala.inline
  def apply(
    StorageAllocatedInBytes: js.UndefOr[PositiveSizeType] = js.undefined,
    StorageType: StorageType = null
  ): StorageRuleType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(StorageAllocatedInBytes)) __obj.updateDynamic("StorageAllocatedInBytes")(StorageAllocatedInBytes.get.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageRuleType]
  }
}

