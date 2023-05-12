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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setShouldCloneBeforeSet(value: Boolean): Self = StObject.set(x, "shouldCloneBeforeSet", value.asInstanceOf[js.Any])
      
      inline def setShouldCloneBeforeSetUndefined: Self = StObject.set(x, "shouldCloneBeforeSet", js.undefined)
      
      inline def setSizeCalculation(value: (/* key */ String, /* value */ Any) => Double): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
      
      inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Pick<cache-manager.cache-manager/dist/stores/memory.Pre, 'ttlAutopurge'>> */
  trait PartialPickPrettlAutopurg extends StObject {
    
    var ttlAutopurge: js.UndefOr[Any] = js.undefined
  }
  object PartialPickPrettlAutopurg {
    
    inline def apply(): PartialPickPrettlAutopurg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPickPrettlAutopurg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPickPrettlAutopurg] (val x: Self) extends AnyVal {
      
      inline def setTtlAutopurge(value: Any): Self = StObject.set(x, "ttlAutopurge", value.asInstanceOf[js.Any])
      
      inline def setTtlAutopurgeUndefined: Self = StObject.set(x, "ttlAutopurge", js.undefined)
    }
  }
}
