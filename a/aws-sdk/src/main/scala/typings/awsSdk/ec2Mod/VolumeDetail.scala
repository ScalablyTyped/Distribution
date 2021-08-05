package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeDetail extends StObject {
  
  /**
    * The size of the volume, in GiB.
    */
  var Size: Long
}
object VolumeDetail {
  
  inline def apply(Size: Long): VolumeDetail = {
    val __obj = js.Dynamic.literal(Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeDetail]
  }
  
  extension [Self <: VolumeDetail](x: Self) {
    
    inline def setSize(value: Long): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
