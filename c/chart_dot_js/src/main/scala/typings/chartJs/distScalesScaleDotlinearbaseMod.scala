package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distScalesScaleDotlinearbaseMod {
  
  @JSImport("chart.js/dist/scales/scale.linearbase", JSImport.Default)
  @js.native
  open class default () extends LinearScaleBase
  
  @js.native
  trait LinearScaleBase
    extends typings.chartJs.distCoreCoreDotscaleMod.default {
    
    /** @type {number} */
    var _endValue: Double = js.native
    
    /** @type {number} */
    var _startValue: Double = js.native
    
    var _valueRange: Double = js.native
    
    /**
      * @protected
      */
    /* protected */ def computeTickLimit(): Double = js.native
    
    /** @type {number} */
    var end: Double = js.native
    
    def getTickLimit(): Double = js.native
    
    def handleTickRangeOptions(): Unit = js.native
    
    def parse(raw: Any, index: Any): Double = js.native
    
    /** @type {number} */
    var start: Double = js.native
  }
}
