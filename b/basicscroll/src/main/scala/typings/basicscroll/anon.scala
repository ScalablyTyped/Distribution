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
    
    @scala.inline
    def apply(): From = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: AnimatedType): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromNull: Self = StObject.set(x, "from", null)
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setTiming(value: KnownTimings | TimingFunction): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingFunction1(value: /* t */ Double => Double): Self = StObject.set(x, "timing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
      
      @scala.inline
      def setTo(value: AnimatedType): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToNull: Self = StObject.set(x, "to", null)
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
