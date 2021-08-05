package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnassignVolumeRequest extends StObject {
  
  /**
    * The volume ID.
    */
  var VolumeId: String
}
object UnassignVolumeRequest {
  
  inline def apply(VolumeId: String): UnassignVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignVolumeRequest]
  }
  
  extension [Self <: UnassignVolumeRequest](x: Self) {
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
