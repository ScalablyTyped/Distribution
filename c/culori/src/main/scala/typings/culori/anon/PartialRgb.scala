package typings.culori.anon

import typings.culori.culoriStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<culori.culori/src/rgb/types.Rgb> */
trait PartialRgb extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var b: js.UndefOr[Double] = js.undefined
  
  var g: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[rgb] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
}
object PartialRgb {
  
  inline def apply(): PartialRgb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRgb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRgb] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setGUndefined: Self = StObject.set(x, "g", js.undefined)
    
    inline def setMode(value: rgb): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
  }
}
