package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2ResourceDetails extends js.Object {
  /**
    *  Hourly public On Demand rate for the instance type.
    */
  var HourlyOnDemandRate: js.UndefOr[GenericString] = js.native
  /**
    *  The type of Amazon Web Services instance.
    */
  var InstanceType: js.UndefOr[GenericString] = js.native
  /**
    *  Memory capacity of Amazon Web Services instance.
    */
  var Memory: js.UndefOr[GenericString] = js.native
  /**
    *  Network performance capacity of the Amazon Web Services instance.
    */
  var NetworkPerformance: js.UndefOr[GenericString] = js.native
  /**
    *  The platform of the Amazon Web Services instance. The platform is the specific combination of operating system, license model, and software on an instance.
    */
  var Platform: js.UndefOr[GenericString] = js.native
  /**
    *  The Amazon Web Services Region of the instance.
    */
  var Region: js.UndefOr[GenericString] = js.native
  /**
    *  The SKU of the product.
    */
  var Sku: js.UndefOr[GenericString] = js.native
  /**
    *  The disk storage of the Amazon Web Services instance (Not EBS storage).
    */
  var Storage: js.UndefOr[GenericString] = js.native
  /**
    *  Number of VCPU cores in the Amazon Web Services instance type.
    */
  var Vcpu: js.UndefOr[GenericString] = js.native
}

object EC2ResourceDetails {
  @scala.inline
  def apply(
    HourlyOnDemandRate: GenericString = null,
    InstanceType: GenericString = null,
    Memory: GenericString = null,
    NetworkPerformance: GenericString = null,
    Platform: GenericString = null,
    Region: GenericString = null,
    Sku: GenericString = null,
    Storage: GenericString = null,
    Vcpu: GenericString = null
  ): EC2ResourceDetails = {
    val __obj = js.Dynamic.literal()
    if (HourlyOnDemandRate != null) __obj.updateDynamic("HourlyOnDemandRate")(HourlyOnDemandRate.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (Memory != null) __obj.updateDynamic("Memory")(Memory.asInstanceOf[js.Any])
    if (NetworkPerformance != null) __obj.updateDynamic("NetworkPerformance")(NetworkPerformance.asInstanceOf[js.Any])
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (Sku != null) __obj.updateDynamic("Sku")(Sku.asInstanceOf[js.Any])
    if (Storage != null) __obj.updateDynamic("Storage")(Storage.asInstanceOf[js.Any])
    if (Vcpu != null) __obj.updateDynamic("Vcpu")(Vcpu.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2ResourceDetails]
  }
}

