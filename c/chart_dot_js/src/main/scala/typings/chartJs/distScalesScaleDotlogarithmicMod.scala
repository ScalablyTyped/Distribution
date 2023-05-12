package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distScalesScaleDotlogarithmicMod {
  
  @JSImport("chart.js/dist/scales/scale.logarithmic", JSImport.Default)
  @js.native
  open class default () extends LogarithmicScale
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/scales/scale.logarithmic", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/scales/scale.logarithmic", "default.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/scales/scale.logarithmic", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LogarithmicScale
    extends typings.chartJs.distCoreCoreDotscaleMod.default {
    
    /** @type {number} */
    var _startValue: Double = js.native
    
    var _valueRange: Double = js.native
    
    var _zero: Boolean = js.native
    
    /** @type {number} */
    var end: Double = js.native
    
    /**
      * @param {number} value
      * @return {string}
      */
    def getLabelForValue(value: Double): String = js.native
    
    def getValueForPixel(pixel: Any): Double = js.native
    
    def handleTickRangeOptions(): Unit = js.native
    
    def parse(raw: Any, index: Any): Double = js.native
    
    /** @type {number} */
    var start: Double = js.native
  }
}
