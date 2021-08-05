package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait F4vSettings extends StObject {
  
  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  var MoovPlacement: js.UndefOr[F4vMoovPlacement] = js.undefined
}
object F4vSettings {
  
  inline def apply(): F4vSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[F4vSettings]
  }
  
  extension [Self <: F4vSettings](x: Self) {
    
    inline def setMoovPlacement(value: F4vMoovPlacement): Self = StObject.set(x, "MoovPlacement", value.asInstanceOf[js.Any])
    
    inline def setMoovPlacementUndefined: Self = StObject.set(x, "MoovPlacement", js.undefined)
  }
}
