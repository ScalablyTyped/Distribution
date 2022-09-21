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
    * Indicates whether data is encrypted at rest.
    */
  var EncryptionSupport: js.UndefOr[InstanceStorageEncryptionSupport] = js.undefined
  
  /**
    * Indicates whether non-volatile memory express (NVMe) is supported.
    */
  var NvmeSupport: js.UndefOr[EphemeralNvmeSupport] = js.undefined
  
  /**
    * The total size of the disks, in GB.
    */
  var TotalSizeInGB: js.UndefOr[DiskSize] = js.undefined
}
object InstanceStorageInfo {
  
  inline def apply(): InstanceStorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStorageInfo]
  }
  
  extension [Self <: InstanceStorageInfo](x: Self) {
    
    inline def setDisks(value: DiskInfoList): Self = StObject.set(x, "Disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "Disks", js.undefined)
    
    inline def setDisksVarargs(value: DiskInfo*): Self = StObject.set(x, "Disks", js.Array(value*))
    
    inline def setEncryptionSupport(value: InstanceStorageEncryptionSupport): Self = StObject.set(x, "EncryptionSupport", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSupportUndefined: Self = StObject.set(x, "EncryptionSupport", js.undefined)
    
    inline def setNvmeSupport(value: EphemeralNvmeSupport): Self = StObject.set(x, "NvmeSupport", value.asInstanceOf[js.Any])
    
    inline def setNvmeSupportUndefined: Self = StObject.set(x, "NvmeSupport", js.undefined)
    
    inline def setTotalSizeInGB(value: DiskSize): Self = StObject.set(x, "TotalSizeInGB", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeInGBUndefined: Self = StObject.set(x, "TotalSizeInGB", js.undefined)
  }
}
