package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachVolumeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the volume that was detached.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.undefined
}
object DetachVolumeOutput {
  
  inline def apply(): DetachVolumeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachVolumeOutput]
  }
  
  extension [Self <: DetachVolumeOutput](x: Self) {
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    inline def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
  }
}
