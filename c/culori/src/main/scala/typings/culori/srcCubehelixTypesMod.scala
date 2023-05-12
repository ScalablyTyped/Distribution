package typings.culori

import typings.culori.culoriStrings.cubehelix
import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCubehelixTypesMod {
  
  trait Cubehelix
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var l: Double
    
    var mode: cubehelix
    
    var s: js.UndefOr[Double] = js.undefined
  }
  object Cubehelix {
    
    inline def apply(l: Double): Cubehelix = {
      val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], mode = "cubehelix")
      __obj.asInstanceOf[Cubehelix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cubehelix] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setMode(value: cubehelix): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    }
  }
}
