package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFunnelItem extends StObject {
  
  /**
    * The item&apos;s argument.
    */
  var argument: js.UndefOr[String | js.Date | Double] = js.undefined
  
  /**
    * The item&apos;s original data object.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the funnel item&apos;s color specified in the data source or palette.
    */
  def getColor(): String
  
  /**
    * Changes the funnel item&apos;s hover state.
    */
  def hover(state: Boolean): Unit
  
  /**
    * Indicates whether the funnel item is in the hover state.
    */
  def isHovered(): Boolean
  
  /**
    * Indicates whether the funnel item is selected.
    */
  def isSelected(): Boolean
  
  /**
    * The item&apos;s calculated percentage value.
    */
  var percent: js.UndefOr[Double] = js.undefined
  
  /**
    * Selects or cancels the funnel item&apos;s selection.
    */
  def select(state: Boolean): Unit
  
  /**
    * Shows the funnel item&apos;s tooltip.
    */
  def showTooltip(): Unit
  
  /**
    * The item&apos;s value.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object dxFunnelItem {
  
  inline def apply(
    getColor: () => String,
    hover: Boolean => Unit,
    isHovered: () => Boolean,
    isSelected: () => Boolean,
    select: Boolean => Unit,
    showTooltip: () => Unit
  ): dxFunnelItem = {
    val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction0(getColor), hover = js.Any.fromFunction1(hover), isHovered = js.Any.fromFunction0(isHovered), isSelected = js.Any.fromFunction0(isSelected), select = js.Any.fromFunction1(select), showTooltip = js.Any.fromFunction0(showTooltip))
    __obj.asInstanceOf[dxFunnelItem]
  }
  
  extension [Self <: dxFunnelItem](x: Self) {
    
    inline def setArgument(value: String | js.Date | Double): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGetColor(value: () => String): Self = StObject.set(x, "getColor", js.Any.fromFunction0(value))
    
    inline def setHover(value: Boolean => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction1(value))
    
    inline def setIsHovered(value: () => Boolean): Self = StObject.set(x, "isHovered", js.Any.fromFunction0(value))
    
    inline def setIsSelected(value: () => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setSelect(value: Boolean => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setShowTooltip(value: () => Unit): Self = StObject.set(x, "showTooltip", js.Any.fromFunction0(value))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
