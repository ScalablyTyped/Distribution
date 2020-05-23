package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseBundle extends js.Object {
  /**
    * The ID for the database bundle.
    */
  var bundleId: js.UndefOr[String] = js.native
  /**
    * The number of virtual CPUs (vCPUs) for the database bundle.
    */
  var cpuCount: js.UndefOr[integer] = js.native
  /**
    * The size of the disk for the database bundle.
    */
  var diskSizeInGb: js.UndefOr[integer] = js.native
  /**
    * A Boolean value indicating whether the database bundle is active.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value indicating whether the database bundle is encrypted.
    */
  var isEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The name for the database bundle.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The cost of the database bundle in US currency.
    */
  var price: js.UndefOr[float] = js.native
  /**
    * The amount of RAM in GB (for example, 2.0) for the database bundle.
    */
  var ramSizeInGb: js.UndefOr[float] = js.native
  /**
    * The data transfer rate per month in GB for the database bundle.
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.native
}

object RelationalDatabaseBundle {
  @scala.inline
  def apply(
    bundleId: String = null,
    cpuCount: js.UndefOr[integer] = js.undefined,
    diskSizeInGb: js.UndefOr[integer] = js.undefined,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isEncrypted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    price: js.UndefOr[float] = js.undefined,
    ramSizeInGb: js.UndefOr[float] = js.undefined,
    transferPerMonthInGb: js.UndefOr[integer] = js.undefined
  ): RelationalDatabaseBundle = {
    val __obj = js.Dynamic.literal()
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (!js.isUndefined(cpuCount)) __obj.updateDynamic("cpuCount")(cpuCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(diskSizeInGb)) __obj.updateDynamic("diskSizeInGb")(diskSizeInGb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isEncrypted)) __obj.updateDynamic("isEncrypted")(isEncrypted.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(price)) __obj.updateDynamic("price")(price.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ramSizeInGb)) __obj.updateDynamic("ramSizeInGb")(ramSizeInGb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transferPerMonthInGb)) __obj.updateDynamic("transferPerMonthInGb")(transferPerMonthInGb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabaseBundle]
  }
}

