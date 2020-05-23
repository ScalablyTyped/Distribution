package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /**
    * The device's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Indicates how likely a device is available for a test run. Currently available in the ListDevices and GetDevice API methods.
    */
  var availability: js.UndefOr[DeviceAvailability] = js.native
  /**
    * The device's carrier.
    */
  var carrier: js.UndefOr[String] = js.native
  /**
    * Information about the device's CPU.
    */
  var cpu: js.UndefOr[CPU] = js.native
  /**
    * The name of the fleet to which this device belongs.
    */
  var fleetName: js.UndefOr[String] = js.native
  /**
    * The type of fleet to which this device belongs. Possible values are PRIVATE and PUBLIC.
    */
  var fleetType: js.UndefOr[String] = js.native
  /**
    * The device's form factor. Allowed values include:   PHONE   TABLET  
    */
  var formFactor: js.UndefOr[DeviceFormFactor] = js.native
  /**
    * The device's heap size, expressed in bytes.
    */
  var heapSize: js.UndefOr[Long] = js.native
  /**
    * The device's image name.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The instances that belong to this device.
    */
  var instances: js.UndefOr[DeviceInstances] = js.native
  /**
    * The device's manufacturer name.
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * The device's total memory size, expressed in bytes.
    */
  var memory: js.UndefOr[Long] = js.native
  /**
    * The device's model name.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * The device's model ID.
    */
  var modelId: js.UndefOr[String] = js.native
  /**
    * The device's display name.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The device's operating system type.
    */
  var os: js.UndefOr[String] = js.native
  /**
    * The device's platform. Allowed values include:   ANDROID   IOS  
    */
  var platform: js.UndefOr[DevicePlatform] = js.native
  /**
    * The device's radio.
    */
  var radio: js.UndefOr[String] = js.native
  /**
    * Specifies whether remote access has been enabled for the specified device.
    */
  var remoteAccessEnabled: js.UndefOr[Boolean] = js.native
  /**
    * This flag is set to true if remote debugging is enabled for the device. Remote debugging is no longer supported.
    */
  var remoteDebugEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The resolution of the device.
    */
  var resolution: js.UndefOr[Resolution] = js.native
}

object Device {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    availability: DeviceAvailability = null,
    carrier: String = null,
    cpu: CPU = null,
    fleetName: String = null,
    fleetType: String = null,
    formFactor: DeviceFormFactor = null,
    heapSize: js.UndefOr[Long] = js.undefined,
    image: String = null,
    instances: DeviceInstances = null,
    manufacturer: String = null,
    memory: js.UndefOr[Long] = js.undefined,
    model: String = null,
    modelId: String = null,
    name: Name = null,
    os: String = null,
    platform: DevicePlatform = null,
    radio: String = null,
    remoteAccessEnabled: js.UndefOr[Boolean] = js.undefined,
    remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined,
    resolution: Resolution = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (fleetName != null) __obj.updateDynamic("fleetName")(fleetName.asInstanceOf[js.Any])
    if (fleetType != null) __obj.updateDynamic("fleetType")(fleetType.asInstanceOf[js.Any])
    if (formFactor != null) __obj.updateDynamic("formFactor")(formFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(heapSize)) __obj.updateDynamic("heapSize")(heapSize.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory.get.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (modelId != null) __obj.updateDynamic("modelId")(modelId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (radio != null) __obj.updateDynamic("radio")(radio.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteAccessEnabled)) __obj.updateDynamic("remoteAccessEnabled")(remoteAccessEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteDebugEnabled)) __obj.updateDynamic("remoteDebugEnabled")(remoteDebugEnabled.get.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

