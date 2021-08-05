package typings.countupJs

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("countup.js", "CountUp")
  @js.native
  class CountUp protected () extends StObject {
    def this(target: String, endVal: Double) = this()
    def this(target: HTMLElement, endVal: Double) = this()
    def this(target: HTMLInputElement, endVal: Double) = this()
    def this(target: String, endVal: Double, options: CountUpOptions) = this()
    def this(target: HTMLElement, endVal: Double, options: CountUpOptions) = this()
    def this(target: HTMLInputElement, endVal: Double, options: CountUpOptions) = this()
    
    def callback(): js.Any = js.native
    def callback(args: js.Any): js.Any = js.native
    
    def count(timestamp: Double): Unit = js.native
    
    /* private */ var countDown: js.Any = js.native
    
    /* private */ var defaults: js.Any = js.native
    
    /* private */ var determineDirectionAndSmartEasing: js.Any = js.native
    
    var duration: Double = js.native
    
    def easeOutExpo(t: Double, b: Double, c: Double, d: Double): Double = js.native
    
    var easingFn: js.UndefOr[
        js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
      ] = js.native
    
    /* private */ var el: js.Any = js.native
    
    /* private */ var endVal: js.Any = js.native
    
    def ensureNumber(n: js.Any): Boolean = js.native
    
    var error: String = js.native
    
    /* private */ var finalEndVal: js.Any = js.native
    
    def formatNumber(num: Double): String = js.native
    
    def formattingFn(num: Double): String = js.native
    
    var frameVal: Double = js.native
    
    var options: js.UndefOr[CountUpOptions] = js.native
    
    def pauseResume(): Unit = js.native
    
    var paused: Boolean = js.native
    
    def printValue(`val`: Double): Unit = js.native
    
    /* private */ var rAF: js.Any = js.native
    
    /* private */ var remaining: js.Any = js.native
    
    def reset(): Unit = js.native
    
    /* private */ var resetDuration: js.Any = js.native
    
    def start(): Unit = js.native
    def start(callback: js.Function1[/* args */ js.UndefOr[js.Any], js.Any]): Unit = js.native
    
    /* private */ var startTime: js.Any = js.native
    
    var startVal: Double = js.native
    
    /* private */ var target: js.Any = js.native
    
    def update(newEndVal: String): Unit = js.native
    def update(newEndVal: Double): Unit = js.native
    
    /* private */ var useEasing: js.Any = js.native
    
    def validateValue(value: String): Double = js.native
    def validateValue(value: Double): Double = js.native
    
    var version: String = js.native
  }
  
  trait CountUpOptions extends StObject {
    
    var decimal: js.UndefOr[String] = js.undefined
    
    var decimalPlaces: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easingFn: js.UndefOr[
        js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
      ] = js.undefined
    
    var formattingFn: js.UndefOr[js.Function1[/* n */ Double, String]] = js.undefined
    
    var numerals: js.UndefOr[js.Array[String]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var smartEasingAmount: js.UndefOr[Double] = js.undefined
    
    var smartEasingThreshold: js.UndefOr[Double] = js.undefined
    
    var startVal: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var useEasing: js.UndefOr[Boolean] = js.undefined
    
    var useGrouping: js.UndefOr[Boolean] = js.undefined
  }
  object CountUpOptions {
    
    inline def apply(): CountUpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountUpOptions]
    }
    
    extension [Self <: CountUpOptions](x: Self) {
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
      
      inline def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
      
      inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasingFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double): Self = StObject.set(x, "easingFn", js.Any.fromFunction4(value))
      
      inline def setEasingFnUndefined: Self = StObject.set(x, "easingFn", js.undefined)
      
      inline def setFormattingFn(value: /* n */ Double => String): Self = StObject.set(x, "formattingFn", js.Any.fromFunction1(value))
      
      inline def setFormattingFnUndefined: Self = StObject.set(x, "formattingFn", js.undefined)
      
      inline def setNumerals(value: js.Array[String]): Self = StObject.set(x, "numerals", value.asInstanceOf[js.Any])
      
      inline def setNumeralsUndefined: Self = StObject.set(x, "numerals", js.undefined)
      
      inline def setNumeralsVarargs(value: String*): Self = StObject.set(x, "numerals", js.Array(value :_*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSmartEasingAmount(value: Double): Self = StObject.set(x, "smartEasingAmount", value.asInstanceOf[js.Any])
      
      inline def setSmartEasingAmountUndefined: Self = StObject.set(x, "smartEasingAmount", js.undefined)
      
      inline def setSmartEasingThreshold(value: Double): Self = StObject.set(x, "smartEasingThreshold", value.asInstanceOf[js.Any])
      
      inline def setSmartEasingThresholdUndefined: Self = StObject.set(x, "smartEasingThreshold", js.undefined)
      
      inline def setStartVal(value: Double): Self = StObject.set(x, "startVal", value.asInstanceOf[js.Any])
      
      inline def setStartValUndefined: Self = StObject.set(x, "startVal", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setUseEasing(value: Boolean): Self = StObject.set(x, "useEasing", value.asInstanceOf[js.Any])
      
      inline def setUseEasingUndefined: Self = StObject.set(x, "useEasing", js.undefined)
      
      inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
      
      inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
    }
  }
}
