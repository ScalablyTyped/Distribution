package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): RelationalDatabaseBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseBundle]
  }
  
  @scala.inline
  implicit class RelationalDatabaseBundleOps[Self <: RelationalDatabaseBundle] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
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
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setIsEncrypted(value: Boolean): Self = this.set("isEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEncrypted: Self = this.set("isEncrypted", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrice(value: float): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setRamSizeInGb(value: float): Self = this.set("ramSizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamSizeInGb: Self = this.set("ramSizeInGb", js.undefined)
    
    @scala.inline
    def setTransferPerMonthInGb(value: integer): Self = this.set("transferPerMonthInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferPerMonthInGb: Self = this.set("transferPerMonthInGb", js.undefined)
  }
}
