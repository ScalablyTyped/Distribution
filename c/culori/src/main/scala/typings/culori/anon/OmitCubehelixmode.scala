package typings.culori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<culori.culori/src/cubehelix/types.Cubehelix, 'mode'> */
trait OmitCubehelixmode extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var h: js.UndefOr[Double] = js.undefined
  
  var l: Double
  
  var s: js.UndefOr[Double] = js.undefined
}
object OmitCubehelixmode {
  
  inline def apply(l: Double): OmitCubehelixmode = {
    val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitCubehelixmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitCubehelixmode] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
  }
}
