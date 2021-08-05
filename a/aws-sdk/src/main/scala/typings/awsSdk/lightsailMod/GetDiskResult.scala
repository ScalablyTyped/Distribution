package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDiskResult extends StObject {
  
  /**
    * An object containing information about the disk.
    */
  var disk: js.UndefOr[Disk] = js.undefined
}
object GetDiskResult {
  
  inline def apply(): GetDiskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskResult]
  }
  
  extension [Self <: GetDiskResult](x: Self) {
    
    inline def setDisk(value: Disk): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    inline def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
  }
}
