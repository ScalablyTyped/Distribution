package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hdr10Settings extends StObject {
  
  /**
    * Maximum Content Light Level
  An integer metadata value defining the maximum light level, in nits,
  of any single pixel within an encoded HDR video stream or file.
    */
  var MaxCll: js.UndefOr[integerMin0Max32768] = js.undefined
  
  /**
    * Maximum Frame Average Light Level
  An integer metadata value defining the maximum average light level, in nits,
  for any single frame within an encoded HDR video stream or file.
    */
  var MaxFall: js.UndefOr[integerMin0Max32768] = js.undefined
}
object Hdr10Settings {
  
  inline def apply(): Hdr10Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hdr10Settings]
  }
  
  extension [Self <: Hdr10Settings](x: Self) {
    
    inline def setMaxCll(value: integerMin0Max32768): Self = StObject.set(x, "MaxCll", value.asInstanceOf[js.Any])
    
    inline def setMaxCllUndefined: Self = StObject.set(x, "MaxCll", js.undefined)
    
    inline def setMaxFall(value: integerMin0Max32768): Self = StObject.set(x, "MaxFall", value.asInstanceOf[js.Any])
    
    inline def setMaxFallUndefined: Self = StObject.set(x, "MaxFall", js.undefined)
  }
}
