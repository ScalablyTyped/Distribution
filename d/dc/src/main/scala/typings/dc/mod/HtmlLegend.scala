package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlLegend extends StObject {
  
  def container(): String
  def container(t: String): HtmlLegend
  @JSName("container")
  var container_Original: IGetSet[String, HtmlLegend]
  
  def highlightSelected(): String
  def highlightSelected(t: String): HtmlLegend
  @JSName("highlightSelected")
  var highlightSelected_Original: IGetSet[String, HtmlLegend]
  
  def horizontal(): String
  def horizontal(t: String): HtmlLegend
  @JSName("horizontal")
  var horizontal_Original: IGetSet[String, HtmlLegend]
  
  def legendItemClass(): String
  def legendItemClass(t: String): HtmlLegend
  @JSName("legendItemClass")
  var legendItemClass_Original: IGetSet[String, HtmlLegend]
  
  def legendText(): js.Function
  def legendText(t: js.Function): HtmlLegend
  @JSName("legendText")
  var legendText_Original: IGetSet[js.Function, HtmlLegend]
  
  def maxItems(): Double
  def maxItems(t: Double): HtmlLegend
  @JSName("maxItems")
  var maxItems_Original: IGetSet[Double, HtmlLegend]
}
object HtmlLegend {
  
  @scala.inline
  def apply(
    container: IGetSet[String, HtmlLegend],
    highlightSelected: IGetSet[String, HtmlLegend],
    horizontal: IGetSet[String, HtmlLegend],
    legendItemClass: IGetSet[String, HtmlLegend],
    legendText: IGetSet[js.Function, HtmlLegend],
    maxItems: IGetSet[Double, HtmlLegend]
  ): HtmlLegend = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], highlightSelected = highlightSelected.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], legendItemClass = legendItemClass.asInstanceOf[js.Any], legendText = legendText.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlLegend]
  }
  
  @scala.inline
  implicit class HtmlLegendMutableBuilder[Self <: HtmlLegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: IGetSet[String, HtmlLegend]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightSelected(value: IGetSet[String, HtmlLegend]): Self = StObject.set(x, "highlightSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontal(value: IGetSet[String, HtmlLegend]): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendItemClass(value: IGetSet[String, HtmlLegend]): Self = StObject.set(x, "legendItemClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendText(value: IGetSet[js.Function, HtmlLegend]): Self = StObject.set(x, "legendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: IGetSet[Double, HtmlLegend]): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
  }
}
