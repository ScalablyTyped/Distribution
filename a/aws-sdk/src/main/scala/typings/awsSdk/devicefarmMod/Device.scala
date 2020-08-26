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
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAvailability(value: DeviceAvailability): Self = this.set("availability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    @scala.inline
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    @scala.inline
    def setCpu(value: CPU): Self = this.set("cpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    @scala.inline
    def setFleetName(value: String): Self = this.set("fleetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetName: Self = this.set("fleetName", js.undefined)
    @scala.inline
    def setFleetType(value: String): Self = this.set("fleetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetType: Self = this.set("fleetType", js.undefined)
    @scala.inline
    def setFormFactor(value: DeviceFormFactor): Self = this.set("formFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormFactor: Self = this.set("formFactor", js.undefined)
    @scala.inline
    def setHeapSize(value: Long): Self = this.set("heapSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeapSize: Self = this.set("heapSize", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setInstancesVarargs(value: DeviceInstance*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: DeviceInstances): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    @scala.inline
    def setMemory(value: Long): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setModelId(value: String): Self = this.set("modelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelId: Self = this.set("modelId", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    @scala.inline
    def setPlatform(value: DevicePlatform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setRadio(value: String): Self = this.set("radio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadio: Self = this.set("radio", js.undefined)
    @scala.inline
    def setRemoteAccessEnabled(value: Boolean): Self = this.set("remoteAccessEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteAccessEnabled: Self = this.set("remoteAccessEnabled", js.undefined)
    @scala.inline
    def setRemoteDebugEnabled(value: Boolean): Self = this.set("remoteDebugEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteDebugEnabled: Self = this.set("remoteDebugEnabled", js.undefined)
    @scala.inline
    def setResolution(value: Resolution): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
  
}

