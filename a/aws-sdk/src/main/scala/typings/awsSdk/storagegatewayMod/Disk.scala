package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disk extends js.Object {
  /**
    * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the local disk is not defined as an iSCSI target. The format of this field is targetIqn::LUNNumber::region-volumeId.
    */
  var DiskAllocationResource: js.UndefOr[String] = js.native
  var DiskAllocationType: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskAllocationType] = js.native
  var DiskAttributeList: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskAttributeList] = js.native
  /**
    * The unique device ID or other distinguishing data that identifies a local disk.
    */
  var DiskId: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskId] = js.native
  /**
    * The device node of a local disk as assigned by the virtualization environment.
    */
  var DiskNode: js.UndefOr[String] = js.native
  /**
    * The path of a local disk in the gateway virtual machine (VM).
    */
  var DiskPath: js.UndefOr[String] = js.native
  /**
    * The local disk size in bytes.
    */
  var DiskSizeInBytes: js.UndefOr[long] = js.native
  /**
    * A value that represents the status of a local disk.
    */
  var DiskStatus: js.UndefOr[String] = js.native
}

object Disk {
  @scala.inline
  def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  @scala.inline
  implicit class DiskOps[Self <: Disk] (val x: Self) extends AnyVal {
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
    def setDiskAllocationResource(value: String): Self = this.set("DiskAllocationResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskAllocationResource: Self = this.set("DiskAllocationResource", js.undefined)
    @scala.inline
    def setDiskAllocationType(value: DiskAllocationType): Self = this.set("DiskAllocationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskAllocationType: Self = this.set("DiskAllocationType", js.undefined)
    @scala.inline
    def setDiskAttributeListVarargs(value: DiskAttribute*): Self = this.set("DiskAttributeList", js.Array(value :_*))
    @scala.inline
    def setDiskAttributeList(value: DiskAttributeList): Self = this.set("DiskAttributeList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskAttributeList: Self = this.set("DiskAttributeList", js.undefined)
    @scala.inline
    def setDiskId(value: DiskId): Self = this.set("DiskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskId: Self = this.set("DiskId", js.undefined)
    @scala.inline
    def setDiskNode(value: String): Self = this.set("DiskNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskNode: Self = this.set("DiskNode", js.undefined)
    @scala.inline
    def setDiskPath(value: String): Self = this.set("DiskPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskPath: Self = this.set("DiskPath", js.undefined)
    @scala.inline
    def setDiskSizeInBytes(value: long): Self = this.set("DiskSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskSizeInBytes: Self = this.set("DiskSizeInBytes", js.undefined)
    @scala.inline
    def setDiskStatus(value: String): Self = this.set("DiskStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskStatus: Self = this.set("DiskStatus", js.undefined)
  }
  
}

