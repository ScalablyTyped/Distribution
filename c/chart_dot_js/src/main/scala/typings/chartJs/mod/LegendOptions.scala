package typings.chartJs.mod

import typings.chartJs.anon.BoxHeight
import typings.chartJs.anon.Color
import typings.chartJs.layoutMod.LayoutPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendOptions[TType /* <: ChartType */] extends StObject {
  
  /**
    * Alignment of the legend.
    * @default 'center'
    */
  var align: Align
  
  /**
    * Is the legend shown?
    * @default true
    */
  var display: Boolean
  
  /**
    * Marks that this box should take the full width/height of the canvas (moving other boxes). This is unlikely to need to be changed in day-to-day use.
    * @default true
    */
  var fullSize: Boolean
  
  var labels: BoxHeight
  
  /**
    * Maximum height of the legend, in pixels
    */
  var maxHeight: Double
  
  /**
    * Maximum width of the legend, in pixels
    */
  var maxWidth: Double
  
  /**
    * A callback that is called when a click event is registered on a label item.
    */
  def onClick(e: ChartEvent, legendItem: LegendItem, legend: LegendElement[TType]): Unit
  
  /**
    * A callback that is called when a 'mousemove' event is registered on top of a label item
    */
  def onHover(e: ChartEvent, legendItem: LegendItem, legend: LegendElement[TType]): Unit
  
  /**
    * A callback that is called when a 'mousemove' event is registered outside of a previously hovered label item.
    */
  def onLeave(e: ChartEvent, legendItem: LegendItem, legend: LegendElement[TType]): Unit
  
  /**
    * Position of the legend.
    * @default 'top'
    */
  var position: LayoutPosition
  
  /**
    * Legend will show datasets in reverse order.
    * @default false
    */
  var reverse: Boolean
  
  /**
    * true for rendering the legends from right to left.
    */
  var rtl: Boolean
  
  /**
    * This will force the text direction 'rtl' or 'ltr' on the canvas for rendering the legend, regardless of the css specified on the canvas
    * @default canvas' default
    */
  var textDirection: String
  
  var title: Color
}
object LegendOptions {
  
  inline def apply[TType /* <: ChartType */](
    align: Align,
    display: Boolean,
    fullSize: Boolean,
    labels: BoxHeight,
    maxHeight: Double,
    maxWidth: Double,
    onClick: (ChartEvent, LegendItem, LegendElement[TType]) => Unit,
    onHover: (ChartEvent, LegendItem, LegendElement[TType]) => Unit,
    onLeave: (ChartEvent, LegendItem, LegendElement[TType]) => Unit,
    position: LayoutPosition,
    reverse: Boolean,
    rtl: Boolean,
    textDirection: String,
    title: Color
  ): LegendOptions[TType] = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], fullSize = fullSize.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], onClick = js.Any.fromFunction3(onClick), onHover = js.Any.fromFunction3(onHover), onLeave = js.Any.fromFunction3(onLeave), position = position.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], textDirection = textDirection.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendOptions[TType]]
  }
  
  extension [Self <: LegendOptions[?], TType /* <: ChartType */](x: Self & LegendOptions[TType]) {
    
    inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setFullSize(value: Boolean): Self = StObject.set(x, "fullSize", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: BoxHeight): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: (ChartEvent, LegendItem, LegendElement[TType]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
    
    inline def setOnHover(value: (ChartEvent, LegendItem, LegendElement[TType]) => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction3(value))
    
    inline def setOnLeave(value: (ChartEvent, LegendItem, LegendElement[TType]) => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction3(value))
    
    inline def setPosition(value: LayoutPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setTextDirection(value: String): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Color): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
