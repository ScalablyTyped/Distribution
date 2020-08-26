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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined key, ref */ @js.native
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
  implicit class ChartPropsOps[Self <: ChartProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBackground(value: background): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: js.Array[_]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setForceFit(value: Boolean): Self = this.set("forceFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceFit: Self = this.set("forceFit", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOnGetG2Instance(value: /* chart */ typings.antvG2.mod.Chart => Unit): Self = this.set("onGetG2Instance", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGetG2Instance: Self = this.set("onGetG2Instance", js.undefined)
    @scala.inline
    def setOnItemSelected(value: /* ev */ EventParams => Unit): Self = this.set("onItemSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemSelected: Self = this.set("onItemSelected", js.undefined)
    @scala.inline
    def setOnItemSelectedChange(value: /* ev */ Data => Unit): Self = this.set("onItemSelectedChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemSelectedChange: Self = this.set("onItemSelectedChange", js.undefined)
    @scala.inline
    def setOnItemUnselected(value: /* ev */ EventParams => Unit): Self = this.set("onItemUnselected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemUnselected: Self = this.set("onItemUnselected", js.undefined)
    @scala.inline
    def setOnPlotClick(value: /* ev */ EventParams => Unit): Self = this.set("onPlotClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlotClick: Self = this.set("onPlotClick", js.undefined)
    @scala.inline
    def setOnPlotDblClick(value: /* ev */ EventParams => Unit): Self = this.set("onPlotDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlotDblClick: Self = this.set("onPlotDblClick", js.undefined)
    @scala.inline
    def setOnPlotEnter(value: /* ev */ EventParams => Unit): Self = this.set("onPlotEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlotEnter: Self = this.set("onPlotEnter", js.undefined)
    @scala.inline
    def setOnPlotLeave(value: /* ev */ EventParams => Unit): Self = this.set("onPlotLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlotLeave: Self = this.set("onPlotLeave", js.undefined)
    @scala.inline
    def setOnPlotMove(value: /* ev */ EventParams => Unit): Self = this.set("onPlotMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlotMove: Self = this.set("onPlotMove", js.undefined)
    @scala.inline
    def setOnTooltipChange(value: /* ev */ Items => Unit): Self = this.set("onTooltipChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTooltipChange: Self = this.set("onTooltipChange", js.undefined)
    @scala.inline
    def setOnTooltipHide(value: /* ev */ TooltipAny => Unit): Self = this.set("onTooltipHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTooltipHide: Self = this.set("onTooltipHide", js.undefined)
    @scala.inline
    def setOnTooltipShow(value: /* ev */ typings.bizcharts.anon.Tooltip => Unit): Self = this.set("onTooltipShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTooltipShow: Self = this.set("onTooltipShow", js.undefined)
    @scala.inline
    def setPadding(
      value: String | Bottom | Double | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
    ): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setPlaceholder(value: ReactElement | String | Boolean): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlotBackground(value: background): Self = this.set("plotBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotBackground: Self = this.set("plotBackground", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: LegacyRef[js.Any]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setScale(value: js.Any): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

