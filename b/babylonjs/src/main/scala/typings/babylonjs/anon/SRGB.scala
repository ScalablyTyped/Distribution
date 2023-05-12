package typings.babylonjs.anon

import typings.babylonjs.babylonjsInts.`0x8C40`
import typings.babylonjs.babylonjsInts.`0x8C41`
import typings.babylonjs.babylonjsInts.`0x8C42`
import typings.babylonjs.babylonjsInts.`0x8C43`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SRGB extends StObject {
  
  var SRGB: `0x8C40`
  
  var SRGB8: `0x8C41` | `0x8C42`
  
  var SRGB8_ALPHA8: `0x8C43` | `0x8C42`
}
object SRGB {
  
  inline def apply(SRGB8: `0x8C41` | `0x8C42`, SRGB8_ALPHA8: `0x8C43` | `0x8C42`): SRGB = {
    val __obj = js.Dynamic.literal(SRGB = 0x8C40, SRGB8 = SRGB8.asInstanceOf[js.Any], SRGB8_ALPHA8 = SRGB8_ALPHA8.asInstanceOf[js.Any])
    __obj.asInstanceOf[SRGB]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SRGB] (val x: Self) extends AnyVal {
    
    inline def setSRGB(value: `0x8C40`): Self = StObject.set(x, "SRGB", value.asInstanceOf[js.Any])
    
    inline def setSRGB8(value: `0x8C41` | `0x8C42`): Self = StObject.set(x, "SRGB8", value.asInstanceOf[js.Any])
    
    inline def setSRGB8_ALPHA8(value: `0x8C43` | `0x8C42`): Self = StObject.set(x, "SRGB8_ALPHA8", value.asInstanceOf[js.Any])
  }
}
