package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskInfo extends StObject {
  
  /**
    * The number of disks with this configuration.
    */
  var Count: js.UndefOr[DiskCount] = js.undefined
  
  /**
    * The size of the disk in GB.
    */
  var SizeInGB: js.UndefOr[DiskSize] = js.undefined
  
  /**
    * The type of disk.
    */
  var Type: js.UndefOr[DiskType] = js.undefined
}
object DiskInfo {
  
  @scala.inline
  def apply(): DiskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskInfo]
  }
  
  @scala.inline
  implicit class DiskInfoMutableBuilder[Self <: DiskInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: DiskCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setSizeInGB(value: DiskSize): Self = StObject.set(x, "SizeInGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInGBUndefined: Self = StObject.set(x, "SizeInGB", js.undefined)
    
    @scala.inline
    def setType(value: DiskType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
