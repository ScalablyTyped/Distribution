package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distScalesScaleDotcategoryMod {
  
  @JSImport("chart.js/dist/scales/scale.category", JSImport.Default)
  @js.native
  open class default () extends CategoryScale
  /* static members */
  object default {
    
    @JSImport("chart.js/dist/scales/scale.category", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/scales/scale.category", "default.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/scales/scale.category", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CategoryScale
    extends typings.chartJs.distCoreCoreDotscaleMod.default {
    
    var _addedLabels: js.Array[Any] = js.native
    
    /** @type {number} */
    var _startValue: Double = js.native
    
    var _valueRange: Double = js.native
    
    def getPixelForTick(index: Any): Double = js.native
    
    def getValueForPixel(pixel: Any): Double = js.native
    
    def parse(raw: Any, index: Any): Double = js.native
  }
}
