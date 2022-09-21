package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.BaseGauge.TooltipInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseGaugeOptions[TComponent]
  extends StObject
     with BaseWidgetOptions[TComponent] {
  
  /**
    * Specifies animation properties.
    */
  var animation: js.UndefOr[BaseGaugeAnimation] = js.undefined
  
  /**
    * Specifies the color of the parent page element.
    */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the loading indicator.
    */
  @JSName("loadingIndicator")
  var loadingIndicator_BaseGaugeOptions: js.UndefOr[BaseGaugeLoadingIndicator] = js.undefined
  
  /**
    * A function that is executed when a tooltip becomes hidden.
    */
  var onTooltipHidden: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & TooltipInfo, Unit]] = js.undefined
  
  /**
    * A function that is executed when a tooltip appears.
    */
  var onTooltipShown: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & TooltipInfo, Unit]] = js.undefined
  
  /**
    * Specifies properties of the gauge&apos;s range container.
    */
  var rangeContainer: js.UndefOr[BaseGaugeRangeContainer] = js.undefined
  
  /**
    * Specifies properties of the gauge&apos;s scale.
    */
  var scale: js.UndefOr[BaseGaugeScale] = js.undefined
  
  /**
    * Specifies a set of subvalues to be designated by the subvalue indicators.
    */
  var subvalues: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Configures tooltips.
    */
  @JSName("tooltip")
  var tooltip_BaseGaugeOptions: js.UndefOr[BaseGaugeTooltip] = js.undefined
  
  /**
    * Specifies the main value on a gauge.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object BaseGaugeOptions {
  
  inline def apply[TComponent](): BaseGaugeOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeOptions[TComponent]]
  }
  
  extension [Self <: BaseGaugeOptions[?], TComponent](x: Self & BaseGaugeOptions[TComponent]) {
    
    inline def setAnimation(value: BaseGaugeAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setContainerBackgroundColor(value: String): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    inline def setLoadingIndicator(value: BaseGaugeLoadingIndicator): Self = StObject.set(x, "loadingIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
    
    inline def setOnTooltipHidden(value: /* e */ EventInfo[TComponent] & TooltipInfo => Unit): Self = StObject.set(x, "onTooltipHidden", js.Any.fromFunction1(value))
    
    inline def setOnTooltipHiddenUndefined: Self = StObject.set(x, "onTooltipHidden", js.undefined)
    
    inline def setOnTooltipShown(value: /* e */ EventInfo[TComponent] & TooltipInfo => Unit): Self = StObject.set(x, "onTooltipShown", js.Any.fromFunction1(value))
    
    inline def setOnTooltipShownUndefined: Self = StObject.set(x, "onTooltipShown", js.undefined)
    
    inline def setRangeContainer(value: BaseGaugeRangeContainer): Self = StObject.set(x, "rangeContainer", value.asInstanceOf[js.Any])
    
    inline def setRangeContainerUndefined: Self = StObject.set(x, "rangeContainer", js.undefined)
    
    inline def setScale(value: BaseGaugeScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSubvalues(value: js.Array[Double]): Self = StObject.set(x, "subvalues", value.asInstanceOf[js.Any])
    
    inline def setSubvaluesUndefined: Self = StObject.set(x, "subvalues", js.undefined)
    
    inline def setSubvaluesVarargs(value: Double*): Self = StObject.set(x, "subvalues", js.Array(value*))
    
    inline def setTooltip(value: BaseGaugeTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
