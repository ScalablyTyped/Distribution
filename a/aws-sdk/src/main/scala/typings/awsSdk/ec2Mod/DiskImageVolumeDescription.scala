package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskImageVolumeDescription extends StObject {
  
  /**
    * The volume identifier.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the volume, in GiB.
    */
  var Size: js.UndefOr[Long] = js.undefined
}
object DiskImageVolumeDescription {
  
  inline def apply(): DiskImageVolumeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskImageVolumeDescription]
  }
  
  extension [Self <: DiskImageVolumeDescription](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setSize(value: Long): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
