package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartRect extends StObject {
  
  def height(): Unit = js.native
  
  var padding: IChartPadding = js.native
  
  def width(): Unit = js.native
  
  var x1: Double = js.native
  
  var x2: Double = js.native
  
  var y1: Double = js.native
  
  var y2: Double = js.native
}
object IChartRect {
  
  @scala.inline
  def apply(
    height: () => Unit,
    padding: IChartPadding,
    width: () => Unit,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): IChartRect = {
    val __obj = js.Dynamic.literal(height = js.Any.fromFunction0(height), padding = padding.asInstanceOf[js.Any], width = js.Any.fromFunction0(width), x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartRect]
  }
  
  @scala.inline
  implicit class IChartRectMutableBuilder[Self <: IChartRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: () => Unit): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPadding(value: IChartPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: () => Unit): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
