package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerInstanceOption extends js.Object {
  /**
    * The list of available az.
    */
  var AvailabilityZones: js.UndefOr[listOfAvailabilityZone] = js.native
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.native
  /**
    * The type of broker instance.
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.native
  /**
    * The list of supported deployment modes.
    */
  var SupportedDeploymentModes: js.UndefOr[listOfDeploymentMode] = js.native
  /**
    * The list of supported engine versions.
    */
  var SupportedEngineVersions: js.UndefOr[listOfString] = js.native
}

object BrokerInstanceOption {
  @scala.inline
  def apply(): BrokerInstanceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerInstanceOption]
  }
  @scala.inline
  implicit class BrokerInstanceOptionOps[Self <: BrokerInstanceOption] (val x: Self) extends AnyVal {
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
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: listOfAvailabilityZone): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setEngineType(value: EngineType): Self = this.set("EngineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineType: Self = this.set("EngineType", js.undefined)
    @scala.inline
    def setHostInstanceType(value: string): Self = this.set("HostInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostInstanceType: Self = this.set("HostInstanceType", js.undefined)
    @scala.inline
    def setStorageType(value: BrokerStorageType): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
    @scala.inline
    def setSupportedDeploymentModesVarargs(value: DeploymentMode*): Self = this.set("SupportedDeploymentModes", js.Array(value :_*))
    @scala.inline
    def setSupportedDeploymentModes(value: listOfDeploymentMode): Self = this.set("SupportedDeploymentModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedDeploymentModes: Self = this.set("SupportedDeploymentModes", js.undefined)
    @scala.inline
    def setSupportedEngineVersionsVarargs(value: string*): Self = this.set("SupportedEngineVersions", js.Array(value :_*))
    @scala.inline
    def setSupportedEngineVersions(value: listOfString): Self = this.set("SupportedEngineVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedEngineVersions: Self = this.set("SupportedEngineVersions", js.undefined)
  }
  
}

