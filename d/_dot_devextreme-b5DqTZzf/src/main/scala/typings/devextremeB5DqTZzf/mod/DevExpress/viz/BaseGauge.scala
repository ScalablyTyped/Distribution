package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseGauge[TProperties]
  extends StObject
     with BaseWidget[TProperties] {
  
  /**
    * Gets subvalues.
    */
  def subvalues(): js.Array[Double] = js.native
  /**
    * Updates subvalues.
    */
  def subvalues(subvalues: js.Array[Double]): Unit = js.native
  
  /**
    * Gets the main value.
    */
  def value(): Double = js.native
  /**
    * Updates the main value.
    */
  def value(value: Double): Unit = js.native
}
object BaseGauge {
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.circle
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rangeBar
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rectangle
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rectangleNeedle
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rhombus
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.textCloud
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangleMarker
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangleNeedle
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.twoColorNeedle
  */
  trait GaugeIndicatorType extends StObject
  object GaugeIndicatorType {
    
    inline def circle: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.circle = "circle".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.circle]
    
    inline def rangeBar: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rangeBar = "rangeBar".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rangeBar]
    
    inline def rectangle: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rectangle = "rectangle".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rectangle]
    
    inline def rectangleNeedle: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rectangleNeedle = "rectangleNeedle".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rectangleNeedle]
    
    inline def rhombus: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rhombus = "rhombus".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.rhombus]
    
    inline def textCloud: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.textCloud = "textCloud".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.textCloud]
    
    inline def triangleMarker: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangleMarker = "triangleMarker".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangleMarker]
    
    inline def triangleNeedle: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangleNeedle = "triangleNeedle".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.triangleNeedle]
    
    inline def twoColorNeedle: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.twoColorNeedle = "twoColorNeedle".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.twoColorNeedle]
  }
  
  trait TooltipInfo extends StObject {
    
    var target: Any
  }
  object TooltipInfo {
    
    inline def apply(target: Any): TooltipInfo = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipInfo]
    }
    
    extension [Self <: TooltipInfo](x: Self) {
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
