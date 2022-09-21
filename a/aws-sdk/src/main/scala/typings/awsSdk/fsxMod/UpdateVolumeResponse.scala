package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVolumeResponse extends StObject {
  
  /**
    * A description of the volume just updated. Returned after a successful UpdateVolume API operation.
    */
  var Volume: js.UndefOr[typings.awsSdk.fsxMod.Volume] = js.undefined
}
object UpdateVolumeResponse {
  
  inline def apply(): UpdateVolumeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVolumeResponse]
  }
  
  extension [Self <: UpdateVolumeResponse](x: Self) {
    
    inline def setVolume(value: Volume): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}
