package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Legend extends StObject {
  
  def autoItemWidth(): Boolean
  def autoItemWidth(t: Boolean): Legend
  @JSName("autoItemWidth")
  var autoItemWidth_Original: IGetSet[Boolean, Legend]
  
  def gap(): Double
  def gap(t: Double): Legend
  @JSName("gap")
  var gap_Original: IGetSet[Double, Legend]
  
  def horizontal(): Boolean
  def horizontal(t: Boolean): Legend
  @JSName("horizontal")
  var horizontal_Original: IGetSet[Boolean, Legend]
  
  def itemHeight(): Double
  def itemHeight(t: Double): Legend
  @JSName("itemHeight")
  var itemHeight_Original: IGetSet[Double, Legend]
  
  def itemWidth(): Double
  def itemWidth(t: Double): Legend
  @JSName("itemWidth")
  var itemWidth_Original: IGetSet[Double, Legend]
  
  def legendText(): js.Function
  def legendText(t: js.Function): Legend
  @JSName("legendText")
  var legendText_Original: IGetSet[js.Function, Legend]
  
  def legendWidth(): Double
  def legendWidth(t: Double): Legend
  @JSName("legendWidth")
  var legendWidth_Original: IGetSet[Double, Legend]
  
  def maxItems(): Double
  def maxItems(t: Double): Legend
  @JSName("maxItems")
  var maxItems_Original: IGetSet[Double, Legend]
  
  def x(): Double
  def x(t: Double): Legend
  @JSName("x")
  var x_Original: IGetSet[Double, Legend]
  
  def y(): Double
  def y(t: Double): Legend
  @JSName("y")
  var y_Original: IGetSet[Double, Legend]
}
object Legend {
  
  @scala.inline
  def apply(
    autoItemWidth: IGetSet[Boolean, Legend],
    gap: IGetSet[Double, Legend],
    horizontal: IGetSet[Boolean, Legend],
    itemHeight: IGetSet[Double, Legend],
    itemWidth: IGetSet[Double, Legend],
    legendText: IGetSet[js.Function, Legend],
    legendWidth: IGetSet[Double, Legend],
    maxItems: IGetSet[Double, Legend],
    x: IGetSet[Double, Legend],
    y: IGetSet[Double, Legend]
  ): Legend = {
    val __obj = js.Dynamic.literal(autoItemWidth = autoItemWidth.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any], legendText = legendText.asInstanceOf[js.Any], legendWidth = legendWidth.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  @scala.inline
  implicit class LegendMutableBuilder[Self <: Legend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoItemWidth(value: IGetSet[Boolean, Legend]): Self = StObject.set(x, "autoItemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGap(value: IGetSet[Double, Legend]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontal(value: IGetSet[Boolean, Legend]): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemHeight(value: IGetSet[Double, Legend]): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemWidth(value: IGetSet[Double, Legend]): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendText(value: IGetSet[js.Function, Legend]): Self = StObject.set(x, "legendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendWidth(value: IGetSet[Double, Legend]): Self = StObject.set(x, "legendWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: IGetSet[Double, Legend]): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: IGetSet[Double, Legend]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: IGetSet[Double, Legend]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
