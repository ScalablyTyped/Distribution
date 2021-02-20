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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined ref, key */ @js.native
trait ChartProps
  extends DOMAttributes[js.Object]
     with /* event */ StringDictionary[js.Any] {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var filter: js.UndefOr[js.Array[_]] = js.native
  
  var forceFit: js.UndefOr[Boolean] = js.native
  
  var height: Double = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  // 事件属性
  var onGetG2Instance: js.UndefOr[js.Function1[/* chart */ typings.antvG2.mod.Chart, Unit]] = js.native
  
  var onItemSelected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  var onItemSelectedChange: js.UndefOr[js.Function1[/* ev */ Data, Unit]] = js.native
  
  var onItemUnselected: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  var onPlotClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  var onPlotDblClick: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  var onPlotEnter: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  var onPlotLeave: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  var onPlotMove: js.UndefOr[js.Function1[/* ev */ EventParams, Unit]] = js.native
  
  var onTooltipChange: js.UndefOr[js.Function1[/* ev */ Items, Unit]] = js.native
  
  var onTooltipHide: js.UndefOr[js.Function1[/* ev */ TooltipAny, Unit]] = js.native
  
  var onTooltipShow: js.UndefOr[js.Function1[/* ev */ typings.bizcharts.anon.Tooltip, Unit]] = js.native
  
  var padding: js.UndefOr[
    String | Bottom | Double | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
  ] = js.native
  
  var pixelRatio: js.UndefOr[Double] = js.native
  
  var placeholder: js.UndefOr[ReactElement | String | Boolean] = js.native
  
  var plotBackground: js.UndefOr[background] = js.native
  
  var ref: js.UndefOr[LegacyRef[js.Any]] = js.native
  
  var scale: js.UndefOr[js.Any] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ChartProps {
  
  @scala.inline
  def apply(height: Double): ChartProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
  
  @scala.inline
  implicit class ChartPropsMutableBuilder[Self <: ChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBackground(value: background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Array[_]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setForceFit(value: Boolean): Self = StObject.set(x, "forceFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFitUndefined: Self = StObject.set(x, "forceFit", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOnGetG2Instance(value: /* chart */ typings.antvG2.mod.Chart => Unit): Self = StObject.set(x, "onGetG2Instance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGetG2InstanceUndefined: Self = StObject.set(x, "onGetG2Instance", js.undefined)
    
    @scala.inline
    def setOnItemSelected(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemSelectedChange(value: /* ev */ Data => Unit): Self = StObject.set(x, "onItemSelectedChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemSelectedChangeUndefined: Self = StObject.set(x, "onItemSelectedChange", js.undefined)
    
    @scala.inline
    def setOnItemSelectedUndefined: Self = StObject.set(x, "onItemSelected", js.undefined)
    
    @scala.inline
    def setOnItemUnselected(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onItemUnselected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnItemUnselectedUndefined: Self = StObject.set(x, "onItemUnselected", js.undefined)
    
    @scala.inline
    def setOnPlotClick(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlotClickUndefined: Self = StObject.set(x, "onPlotClick", js.undefined)
    
    @scala.inline
    def setOnPlotDblClick(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlotDblClickUndefined: Self = StObject.set(x, "onPlotDblClick", js.undefined)
    
    @scala.inline
    def setOnPlotEnter(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlotEnterUndefined: Self = StObject.set(x, "onPlotEnter", js.undefined)
    
    @scala.inline
    def setOnPlotLeave(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlotLeaveUndefined: Self = StObject.set(x, "onPlotLeave", js.undefined)
    
    @scala.inline
    def setOnPlotMove(value: /* ev */ EventParams => Unit): Self = StObject.set(x, "onPlotMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlotMoveUndefined: Self = StObject.set(x, "onPlotMove", js.undefined)
    
    @scala.inline
    def setOnTooltipChange(value: /* ev */ Items => Unit): Self = StObject.set(x, "onTooltipChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTooltipChangeUndefined: Self = StObject.set(x, "onTooltipChange", js.undefined)
    
    @scala.inline
    def setOnTooltipHide(value: /* ev */ TooltipAny => Unit): Self = StObject.set(x, "onTooltipHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTooltipHideUndefined: Self = StObject.set(x, "onTooltipHide", js.undefined)
    
    @scala.inline
    def setOnTooltipShow(value: /* ev */ typings.bizcharts.anon.Tooltip => Unit): Self = StObject.set(x, "onTooltipShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTooltipShowUndefined: Self = StObject.set(x, "onTooltipShow", js.undefined)
    
    @scala.inline
    def setPadding(
      value: String | Bottom | Double | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: ReactElement | String | Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPlotBackground(value: background): Self = StObject.set(x, "plotBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotBackgroundUndefined: Self = StObject.set(x, "plotBackground", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setScale(value: js.Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
