package typings.cacheManager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Max extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var shouldCloneBeforeSet: js.UndefOr[Boolean] = js.undefined
    
    var sizeCalculation: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Double]] = js.undefined
  }
  object Max {
    
    inline def apply(): Max = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setShouldCloneBeforeSet(value: Boolean): Self = StObject.set(x, "shouldCloneBeforeSet", value.asInstanceOf[js.Any])
      
      inline def setShouldCloneBeforeSetUndefined: Self = StObject.set(x, "shouldCloneBeforeSet", js.undefined)
      
      inline def setSizeCalculation(value: (/* key */ String, /* value */ Any) => Double): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
      
      inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
    }
  }
}
