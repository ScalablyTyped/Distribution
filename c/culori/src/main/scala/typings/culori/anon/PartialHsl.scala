package typings.culori.anon

import typings.culori.culoriStrings.hsl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<culori.culori/src/hsl/types.Hsl> */
trait PartialHsl extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var h: js.UndefOr[Double] = js.undefined
  
  var l: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[hsl] = js.undefined
  
  var s: js.UndefOr[Double] = js.undefined
}
object PartialHsl {
  
  inline def apply(): PartialHsl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHsl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialHsl] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    inline def setMode(value: hsl): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
  }
}
