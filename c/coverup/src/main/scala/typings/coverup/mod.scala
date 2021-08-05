package typings.coverup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(value: String): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("coverup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var char: js.UndefOr[String] = js.undefined
    
    var compactTo: js.UndefOr[Double] = js.undefined
    
    var keepLeft: js.UndefOr[Double] = js.undefined
    
    var keepRight: js.UndefOr[Double] = js.undefined
    
    var keepSymbols: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setCharUndefined: Self = StObject.set(x, "char", js.undefined)
      
      inline def setCompactTo(value: Double): Self = StObject.set(x, "compactTo", value.asInstanceOf[js.Any])
      
      inline def setCompactToUndefined: Self = StObject.set(x, "compactTo", js.undefined)
      
      inline def setKeepLeft(value: Double): Self = StObject.set(x, "keepLeft", value.asInstanceOf[js.Any])
      
      inline def setKeepLeftUndefined: Self = StObject.set(x, "keepLeft", js.undefined)
      
      inline def setKeepRight(value: Double): Self = StObject.set(x, "keepRight", value.asInstanceOf[js.Any])
      
      inline def setKeepRightUndefined: Self = StObject.set(x, "keepRight", js.undefined)
      
      inline def setKeepSymbols(value: Boolean): Self = StObject.set(x, "keepSymbols", value.asInstanceOf[js.Any])
      
      inline def setKeepSymbolsUndefined: Self = StObject.set(x, "keepSymbols", js.undefined)
    }
  }
}
