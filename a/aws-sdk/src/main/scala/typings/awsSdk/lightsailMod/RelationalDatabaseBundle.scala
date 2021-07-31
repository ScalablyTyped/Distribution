package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationalDatabaseBundle extends StObject {
  
  /**
    * The ID for the database bundle.
    */
  var bundleId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of virtual CPUs (vCPUs) for the database bundle.
    */
  var cpuCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The size of the disk for the database bundle.
    */
  var diskSizeInGb: js.UndefOr[integer] = js.undefined
  
  /**
    * A Boolean value indicating whether the database bundle is active.
    */
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value indicating whether the database bundle is encrypted.
    */
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name for the database bundle.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The cost of the database bundle in US currency.
    */
  var price: js.UndefOr[float] = js.undefined
  
  /**
    * The amount of RAM in GB (for example, 2.0) for the database bundle.
    */
  var ramSizeInGb: js.UndefOr[float] = js.undefined
  
  /**
    * The data transfer rate per month in GB for the database bundle.
    */
  var transferPerMonthInGb: js.UndefOr[integer] = js.undefined
}
object RelationalDatabaseBundle {
  
  @scala.inline
  def apply(): RelationalDatabaseBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseBundle]
  }
  
  @scala.inline
  implicit class RelationalDatabaseBundleMutableBuilder[Self <: RelationalDatabaseBundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setCpuCount(value: integer): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    @scala.inline
    def setDiskSizeInGb(value: integer): Self = StObject.set(x, "diskSizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeInGbUndefined: Self = StObject.set(x, "diskSizeInGb", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setIsEncrypted(value: Boolean): Self = StObject.set(x, "isEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEncryptedUndefined: Self = StObject.set(x, "isEncrypted", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrice(value: float): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setRamSizeInGb(value: float): Self = StObject.set(x, "ramSizeInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamSizeInGbUndefined: Self = StObject.set(x, "ramSizeInGb", js.undefined)
    
    @scala.inline
    def setTransferPerMonthInGb(value: integer): Self = StObject.set(x, "transferPerMonthInGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferPerMonthInGbUndefined: Self = StObject.set(x, "transferPerMonthInGb", js.undefined)
  }
}
