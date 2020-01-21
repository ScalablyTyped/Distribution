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
  def apply(
    DiskAllocationResource: String = null,
    DiskAllocationType: DiskAllocationType = null,
    DiskAttributeList: DiskAttributeList = null,
    DiskId: DiskId = null,
    DiskNode: String = null,
    DiskPath: String = null,
    DiskSizeInBytes: Int | Double = null,
    DiskStatus: String = null
  ): Disk = {
    val __obj = js.Dynamic.literal()
    if (DiskAllocationResource != null) __obj.updateDynamic("DiskAllocationResource")(DiskAllocationResource.asInstanceOf[js.Any])
    if (DiskAllocationType != null) __obj.updateDynamic("DiskAllocationType")(DiskAllocationType.asInstanceOf[js.Any])
    if (DiskAttributeList != null) __obj.updateDynamic("DiskAttributeList")(DiskAttributeList.asInstanceOf[js.Any])
    if (DiskId != null) __obj.updateDynamic("DiskId")(DiskId.asInstanceOf[js.Any])
    if (DiskNode != null) __obj.updateDynamic("DiskNode")(DiskNode.asInstanceOf[js.Any])
    if (DiskPath != null) __obj.updateDynamic("DiskPath")(DiskPath.asInstanceOf[js.Any])
    if (DiskSizeInBytes != null) __obj.updateDynamic("DiskSizeInBytes")(DiskSizeInBytes.asInstanceOf[js.Any])
    if (DiskStatus != null) __obj.updateDynamic("DiskStatus")(DiskStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disk]
  }
}

