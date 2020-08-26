package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bundle extends js.Object {
  /**
    * The bundle ID (e.g., micro_1_0).
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The number of vCPUs included in the bundle (e.g., 2).
    */
  var cpuCount: js.UndefOr[integer] = js.native
  /**
    * The size of the SSD (e.g., 30).
    */
  var diskSizeInGb: js.UndefOr[integer] = js.native
  /**
    * The Amazon EC2 instance type (e.g., t2.micro).
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * A Boolean value indicating whether the bundle is active.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * A friendly name for the bundle (e.g., Micro).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A numeric value that represents the power of the bundle (e.g., 500). You can use the bundle's power value in conjunction with a blueprint's minimum power value to determine whether the blueprint will run on the bundle. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500.
    */
  var power: js.UndefOr[integer] = js.native
  /**
    * The price in US dollars (e.g., 5.0) of the bundle.
    */
  var price: js.UndefOr[float] = js.native
  /**
    * The amount of RAM in GB (e.g., 2.0).
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
  /**
    * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only launch a WINDOWS bundle on a blueprint that supports the WINDOWS platform. LINUX_UNIX blueprints require a LINUX_UNIX bundle.
    */
  var supportedPlatforms: js.UndefOr[InstancePlatformList] = js.native
  /**
    * The data transfer rate per month in GB (e.g., 2000).
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.native
}

object Bundle {
  @scala.inline
  def apply(): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bundle]
  }
  @scala.inline
  implicit class BundleOps[Self <: Bundle] (val x: Self) extends AnyVal {
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
    def setBundleId(value: NonEmptyString): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setCpuCount(value: integer): Self = this.set("cpuCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuCount: Self = this.set("cpuCount", js.undefined)
    @scala.inline
    def setDiskSizeInGb(value: integer): Self = this.set("diskSizeInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskSizeInGb: Self = this.set("diskSizeInGb", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPower(value: integer): Self = this.set("power", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
    @scala.inline
    def setPrice(value: float): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setRamSizeInGb(value: float): Self = this.set("ramSizeInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamSizeInGb: Self = this.set("ramSizeInGb", js.undefined)
    @scala.inline
    def setSupportedPlatformsVarargs(value: InstancePlatform*): Self = this.set("supportedPlatforms", js.Array(value :_*))
    @scala.inline
    def setSupportedPlatforms(value: InstancePlatformList): Self = this.set("supportedPlatforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedPlatforms: Self = this.set("supportedPlatforms", js.undefined)
    @scala.inline
    def setTransferPerMonthInGb(value: integer): Self = this.set("transferPerMonthInGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferPerMonthInGb: Self = this.set("transferPerMonthInGb", js.undefined)
  }
  
}

