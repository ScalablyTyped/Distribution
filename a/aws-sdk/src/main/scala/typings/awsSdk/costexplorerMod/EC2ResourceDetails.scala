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
  def apply(): EC2ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2ResourceDetails]
  }
  @scala.inline
  implicit class EC2ResourceDetailsOps[Self <: EC2ResourceDetails] (val x: Self) extends AnyVal {
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
    def setHourlyOnDemandRate(value: GenericString): Self = this.set("HourlyOnDemandRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourlyOnDemandRate: Self = this.set("HourlyOnDemandRate", js.undefined)
    @scala.inline
    def setInstanceType(value: GenericString): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setMemory(value: GenericString): Self = this.set("Memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("Memory", js.undefined)
    @scala.inline
    def setNetworkPerformance(value: GenericString): Self = this.set("NetworkPerformance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkPerformance: Self = this.set("NetworkPerformance", js.undefined)
    @scala.inline
    def setPlatform(value: GenericString): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setRegion(value: GenericString): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    @scala.inline
    def setSku(value: GenericString): Self = this.set("Sku", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSku: Self = this.set("Sku", js.undefined)
    @scala.inline
    def setStorage(value: GenericString): Self = this.set("Storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("Storage", js.undefined)
    @scala.inline
    def setVcpu(value: GenericString): Self = this.set("Vcpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVcpu: Self = this.set("Vcpu", js.undefined)
  }
  
}

