package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskIopsConfiguration extends StObject {
  
  /**
    * The total number of SSD IOPS provisioned for the file system.
    */
  var Iops: js.UndefOr[typings.awsSdk.fsxMod.Iops] = js.undefined
  
  /**
    * Specifies whether the number of IOPS for the file system is using the system default (AUTOMATIC) or was provisioned by the customer (USER_PROVISIONED).
    */
  var Mode: js.UndefOr[DiskIopsConfigurationMode] = js.undefined
}
object DiskIopsConfiguration {
  
  inline def apply(): DiskIopsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskIopsConfiguration]
  }
  
  extension [Self <: DiskIopsConfiguration](x: Self) {
    
    inline def setIops(value: Iops): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setMode(value: DiskIopsConfigurationMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
  }
}
