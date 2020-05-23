package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceDeviceInfo extends js.Object {
  /**
    * The number of Inference accelerators for the instance type.
    */
  var Count: js.UndefOr[InferenceDeviceCount] = js.native
  /**
    * The manufacturer of the Inference accelerator.
    */
  var Manufacturer: js.UndefOr[InferenceDeviceManufacturerName] = js.native
  /**
    * The name of the Inference accelerator.
    */
  var Name: js.UndefOr[InferenceDeviceName] = js.native
}

object InferenceDeviceInfo {
  @scala.inline
  def apply(
    Count: js.UndefOr[InferenceDeviceCount] = js.undefined,
    Manufacturer: InferenceDeviceManufacturerName = null,
    Name: InferenceDeviceName = null
  ): InferenceDeviceInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count.get.asInstanceOf[js.Any])
    if (Manufacturer != null) __obj.updateDynamic("Manufacturer")(Manufacturer.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceDeviceInfo]
  }
}

