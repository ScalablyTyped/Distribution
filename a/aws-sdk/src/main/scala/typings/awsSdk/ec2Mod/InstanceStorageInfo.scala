package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceStorageInfo extends StObject {
  
  /**
    * Describes the disks that are available for the instance type.
    */
  var Disks: js.UndefOr[DiskInfoList] = js.undefined
  
  /**
    * Indicates whether non-volatile memory express (NVMe) is supported for instance store.
    */
  var NvmeSupport: js.UndefOr[EphemeralNvmeSupport] = js.undefined
  
  /**
    * The total size of the disks, in GB.
    */
  var TotalSizeInGB: js.UndefOr[DiskSize] = js.undefined
}
object InstanceStorageInfo {
  
  @scala.inline
  def apply(): InstanceStorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStorageInfo]
  }
  
  @scala.inline
  implicit class InstanceStorageInfoMutableBuilder[Self <: InstanceStorageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisks(value: DiskInfoList): Self = StObject.set(x, "Disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "Disks", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: DiskInfo*): Self = StObject.set(x, "Disks", js.Array(value :_*))
    
    @scala.inline
    def setNvmeSupport(value: EphemeralNvmeSupport): Self = StObject.set(x, "NvmeSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNvmeSupportUndefined: Self = StObject.set(x, "NvmeSupport", js.undefined)
    
    @scala.inline
    def setTotalSizeInGB(value: DiskSize): Self = StObject.set(x, "TotalSizeInGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeInGBUndefined: Self = StObject.set(x, "TotalSizeInGB", js.undefined)
  }
}
