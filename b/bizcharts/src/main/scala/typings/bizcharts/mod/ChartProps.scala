package typings.bizcharts.mod

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.mod.EventParams
import typings.antvG2.mod.Styles.background
import typings.bizcharts.anon.Bottom
import typings.bizcharts.anon.Data
import typings.bizcharts.anon.Items
import typings.bizcharts.anon.TooltipAny
import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined ref, key */ trait ChartProps
  extends StObject
     with DOMAttributes[js.Object]
     with /* event */ StringDictionary[js.Any] {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var filter: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var forceFit: js.UndefOr[Boolean] = js.undefined
  
  var height: Double
  
  var key: js.UndefOr[Key] = js.undefined
  
  // 事件属性
  var onGetG2Instance: js.UndefOr[js.Function1[/* chart */ typings.antvG2.mod.Chart, Unit]] = js.undefined
  
  var onItemSelected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  var onItemSelectedChange: js.UndefOr[js.Function1[/* ev */ Data, Unit]] = js.undefined
  
  var onItemUnselected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  var onPlotClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  var onPlotDblClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  var onPlotEnter: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  var onPlotLeave: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  var onPlotMove: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.undefined
  
  var onTooltipChange: js.UndefOr[js.Function1[/* ev */ Items, Unit]] = js.undefined
  
  var onTooltipHide: js.UndefOr[js.Function1[/* ev */ TooltipAny, Unit]] = js.undefined
  
  var onTooltipShow: js.UndefOr[js.Function1[/* ev */ typings.bizcharts.anon.Tooltip, Unit]] = js.undefined
  
  var padding: js.UndefOr[
    String | Bottom | Double | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
  ] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var placeholder: js.UndefOr[ReactElement | String | Boolean] = js.undefined
  
  var plotBackground: js.UndefOr[background] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
  
  var scale: js.UndefOr[js.Any] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ChartProps {
  
  inline def apply(height: Double): ChartProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
  
  extension [Self <: ChartProps](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBackground(value: background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFilter(value: js.Array[js.Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    inline def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
    
    inline def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnGetG2Instance(value: /* chart */ typings.antvG2.mod.Chart => Unit): Self = StObject.set(x, "onGetG2Instance", js.Any.fromFunction1(value))
    
    inline def setOnGetG2InstanceUndefined: Self = StObject.set(x, "onGetG2Instance", js.undefined)
    
    inline def setOnItemSelected(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1(value))
    
    inline def setOnItemSelectedChange(value: /* ev */ Data => Unit): Self = StObject.set(x, "onItemSelectedChange", js.Any.fromFunction1(value))
    
    inline def setOnItemSelectedChangeUndefined: Self = StObject.set(x, "onItemSelectedChange", js.undefined)
    
    inline def setOnItemSelectedUndefined: Self = StObject.set(x, "onItemSelected", js.undefined)
    
    inline def setOnItemUnselected(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onItemUnselected", js.Any.fromFunction1(value))
    
    inline def setOnItemUnselectedUndefined: Self = StObject.set(x, "onItemUnselected", js.undefined)
    
    inline def setOnPlotClick(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotClick", js.Any.fromFunction1(value))
    
    inline def setOnPlotClickUndefined: Self = StObject.set(x, "onPlotClick", js.undefined)
    
    inline def setOnPlotDblClick(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotDblClick", js.Any.fromFunction1(value))
    
    inline def setOnPlotDblClickUndefined: Self = StObject.set(x, "onPlotDblClick", js.undefined)
    
    inline def setOnPlotEnter(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotEnter", js.Any.fromFunction1(value))
    
    inline def setOnPlotEnterUndefined: Self = StObject.set(x, "onPlotEnter", js.undefined)
    
    inline def setOnPlotLeave(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotLeave", js.Any.fromFunction1(value))
    
    inline def setOnPlotLeaveUndefined: Self = StObject.set(x, "onPlotLeave", js.undefined)
    
    inline def setOnPlotMove(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotMove", js.Any.fromFunction1(value))
    
    inline def setOnPlotMoveUndefined: Self = StObject.set(x, "onPlotMove", js.undefined)
    
    inline def setOnTooltipChange(value: /* ev */ Items => Unit): Self = StObject.set(x, "onTooltipChange", js.Any.fromFunction1(value))
    
    inline def setOnTooltipChangeUndefined: Self = StObject.set(x, "onTooltipChange", js.undefined)
    
    inline def setOnTooltipHide(value: /* ev */ TooltipAny => Unit): Self = StObject.set(x, "onTooltipHide", js.Any.fromFunction1(value))
    
    inline def setOnTooltipHideUndefined: Self = StObject.set(x, "onTooltipHide", js.undefined)
    
    inline def setOnTooltipShow(value: /* ev */ typings.bizcharts.anon.Tooltip => Unit): Self = StObject.set(x, "onTooltipShow", js.Any.fromFunction1(value))
    
    inline def setOnTooltipShowUndefined: Self = StObject.set(x, "onTooltipShow", js.undefined)
    
    inline def setPadding(
      value: String | Bottom | Double | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setPlaceholder(value: ReactElement | String | Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPlotBackground(value: background): Self = StObject.set(x, "plotBackground", value.asInstanceOf[js.Any])
    
    inline def setPlotBackgroundUndefined: Self = StObject.set(x, "plotBackground", js.undefined)
    
    inline def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setScale(value: js.Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
