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
  def apply(): StorageRuleType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageRuleType]
  }
  @scala.inline
  implicit class StorageRuleTypeOps[Self <: StorageRuleType] (val x: Self) extends AnyVal {
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
    def setStorageAllocatedInBytes(value: PositiveSizeType): Self = this.set("StorageAllocatedInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageAllocatedInBytes: Self = this.set("StorageAllocatedInBytes", js.undefined)
    @scala.inline
    def setStorageType(value: StorageType): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
  }
  
}

