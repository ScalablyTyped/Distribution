package typings.basicscroll

import typings.basicscroll.mod.AnimatedType
import typings.basicscroll.mod.KnownTimings
import typings.basicscroll.mod.TimingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait From extends StObject {
    
    /**
      * Start and end values.
      * @default null
      */
    var from: js.UndefOr[AnimatedType] = js.undefined
    
    /**
      * Animation timing.
      * @default 'linear'
      */
    var timing: js.UndefOr[KnownTimings | TimingFunction] = js.undefined
    
    /**
      * Start and end values.
      * @default null
      */
    var to: js.UndefOr[AnimatedType] = js.undefined
  }
  object From {
    
    inline def apply(): From = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: AnimatedType): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromNull: Self = StObject.set(x, "from", null)
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTiming(value: KnownTimings | TimingFunction): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      inline def setTimingFunction1(value: /* t */ Double => Double): Self = StObject.set(x, "timing", js.Any.fromFunction1(value))
      
      inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
      
      inline def setTo(value: AnimatedType): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToNull: Self = StObject.set(x, "to", null)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
