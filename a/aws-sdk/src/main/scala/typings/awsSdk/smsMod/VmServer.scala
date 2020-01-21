package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VmServer extends js.Object {
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.native
  /**
    * The type of VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.native
  /**
    * The name of the VM.
    */
  var vmName: js.UndefOr[VmName] = js.native
  /**
    * The VM folder path in the vCenter Server virtual machine inventory tree.
    */
  var vmPath: js.UndefOr[VmPath] = js.native
  /**
    * Information about the VM server location.
    */
  var vmServerAddress: js.UndefOr[VmServerAddress] = js.native
}

object VmServer {
  @scala.inline
  def apply(
    vmManagerName: VmManagerName = null,
    vmManagerType: VmManagerType = null,
    vmName: VmName = null,
    vmPath: VmPath = null,
    vmServerAddress: VmServerAddress = null
  ): VmServer = {
    val __obj = js.Dynamic.literal()
    if (vmManagerName != null) __obj.updateDynamic("vmManagerName")(vmManagerName.asInstanceOf[js.Any])
    if (vmManagerType != null) __obj.updateDynamic("vmManagerType")(vmManagerType.asInstanceOf[js.Any])
    if (vmName != null) __obj.updateDynamic("vmName")(vmName.asInstanceOf[js.Any])
    if (vmPath != null) __obj.updateDynamic("vmPath")(vmPath.asInstanceOf[js.Any])
    if (vmServerAddress != null) __obj.updateDynamic("vmServerAddress")(vmServerAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[VmServer]
  }
}

