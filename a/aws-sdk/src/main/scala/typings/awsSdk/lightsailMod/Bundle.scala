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
    * The price in US dollars (e.g., 5.0).
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
  def apply(
    bundleId: NonEmptyString = null,
    cpuCount: Int | Double = null,
    diskSizeInGb: Int | Double = null,
    instanceType: String = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    power: Int | Double = null,
    price: Int | Double = null,
    ramSizeInGb: Int | Double = null,
    supportedPlatforms: InstancePlatformList = null,
    transferPerMonthInGb: Int | Double = null
  ): Bundle = {
    val __obj = js.Dynamic.literal()
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (cpuCount != null) __obj.updateDynamic("cpuCount")(cpuCount.asInstanceOf[js.Any])
    if (diskSizeInGb != null) __obj.updateDynamic("diskSizeInGb")(diskSizeInGb.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (power != null) __obj.updateDynamic("power")(power.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (ramSizeInGb != null) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb.asInstanceOf[js.Any])
    if (supportedPlatforms != null) __obj.updateDynamic("supportedPlatforms")(supportedPlatforms.asInstanceOf[js.Any])
    if (transferPerMonthInGb != null) __obj.updateDynamic("transferPerMonthInGb")(transferPerMonthInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle]
  }
}

