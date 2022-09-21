package typings.chartist.coreTypesMod

import typings.chartist.axesMod.Axis
import typings.chartist.chartistStrings.label
import typings.chartist.svgMod.Svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<chartist.chartist/dist/core/types.DrawEvent, 'chartRect' | 'axisX' | 'axisY' | 'meta' | 'series' | 'seriesIndex'> */
trait LabelDrawEvent
  extends StObject
     with AxesDrawEvent {
  
  var axis: Axis
  
  var element: Svg
  
  var group: Svg
  
  var height: Double
  
  var index: Double
  
  var text: Label
  
  var `type`: label
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object LabelDrawEvent {
  
  inline def apply(
    axis: Axis,
    element: Svg,
    group: Svg,
    height: Double,
    index: Double,
    text: Label,
    width: Double,
    x: Double,
    y: Double
  ): LabelDrawEvent = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[LabelDrawEvent]
  }
  
  extension [Self <: LabelDrawEvent](x: Self) {
    
    inline def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Svg): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Svg): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setText(value: Label): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: label): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
