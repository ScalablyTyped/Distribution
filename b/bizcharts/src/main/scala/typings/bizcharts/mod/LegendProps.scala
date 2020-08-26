package typings.bizcharts.mod

import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.text
import typings.bizcharts.bizchartsStrings.multiple
import typings.bizcharts.bizchartsStrings.single
import typings.react.mod.CSSProperties
import typings.react.mod.Props
import typings.std.CanvasRenderingContext2D
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendProps
  extends Props[js.Any] {
  var allowAllCanceled: js.UndefOr[Boolean] = js.native
  var background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String] = js.native
   // useHtml 为true时生效
  var containerTpl: js.UndefOr[String] = js.native
  // 自定义混合图例
  var custom: js.UndefOr[Boolean] = js.native
  var `g2-legend`: js.UndefOr[CSSProperties] = js.native
  var `g2-legend-item`: js.UndefOr[CSSProperties] = js.native
  var `g2-legend-list-item`: js.UndefOr[CSSProperties] = js.native
  var `g2-legend-marker`: js.UndefOr[CSSProperties] = js.native
  var `g2-legend-text`: js.UndefOr[CSSProperties] = js.native
  var height: js.UndefOr[Double] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
  var itemFormatter: js.UndefOr[js.Function1[/* val */ js.UndefOr[js.Any], String | Double]] = js.native
  var itemGap: js.UndefOr[Double] = js.native
  var itemMarginBottom: js.UndefOr[Double] = js.native
  var itemTpl: js.UndefOr[
    String | (js.Function4[
      /* value */ js.UndefOr[String], 
      /* color */ js.UndefOr[String], 
      /* checked */ js.UndefOr[Boolean], 
      /* index */ js.UndefOr[Double], 
      String
    ])
  ] = js.native
  var itemWidth: js.UndefOr[Double] = js.native
  var items: js.UndefOr[js.Array[_]] = js.native
  var layout: js.UndefOr[LegendLayoutType] = js.native
  var marker: js.UndefOr[
    String | MarkerType | (js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* r */ js.UndefOr[Double], 
      /* ctx */ js.UndefOr[CanvasRenderingContext2D], 
      Unit
    ])
  ] = js.native
  var name: js.UndefOr[String] = js.native
  var offsetX: js.UndefOr[Double] = js.native
  var offsetY: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var onHover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var position: js.UndefOr[LegendPositionType] = js.native
  var scroll: js.UndefOr[Boolean] = js.native
  var selectedMode: js.UndefOr[single | multiple] = js.native
  // 连续图例
  var slidable: js.UndefOr[Boolean] = js.native
  var textStyle: js.UndefOr[text] = js.native
  var title: js.UndefOr[Boolean] = js.native
  var unChecked: js.UndefOr[String] = js.native
  var useHtml: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object LegendProps {
  @scala.inline
  def apply(): LegendProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendProps]
  }
  @scala.inline
  implicit class LegendPropsOps[Self <: LegendProps] (val x: Self) extends AnyVal {
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
    def setAllowAllCanceled(value: Boolean): Self = this.set("allowAllCanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAllCanceled: Self = this.set("allowAllCanceled", js.undefined)
    @scala.inline
    def setBackground(value: background): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerTpl(value: String): Self = this.set("containerTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerTpl: Self = this.set("containerTpl", js.undefined)
    @scala.inline
    def setCustom(value: Boolean): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def `setG2-legend`(value: CSSProperties): Self = this.set("g2-legend", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-legend`: Self = this.set("g2-legend", js.undefined)
    @scala.inline
    def `setG2-legend-item`(value: CSSProperties): Self = this.set("g2-legend-item", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-legend-item`: Self = this.set("g2-legend-item", js.undefined)
    @scala.inline
    def `setG2-legend-list-item`(value: CSSProperties): Self = this.set("g2-legend-list-item", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-legend-list-item`: Self = this.set("g2-legend-list-item", js.undefined)
    @scala.inline
    def `setG2-legend-marker`(value: CSSProperties): Self = this.set("g2-legend-marker", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-legend-marker`: Self = this.set("g2-legend-marker", js.undefined)
    @scala.inline
    def `setG2-legend-text`(value: CSSProperties): Self = this.set("g2-legend-text", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteG2-legend-text`: Self = this.set("g2-legend-text", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    @scala.inline
    def setItemFormatter(value: /* val */ js.UndefOr[js.Any] => String | Double): Self = this.set("itemFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemFormatter: Self = this.set("itemFormatter", js.undefined)
    @scala.inline
    def setItemGap(value: Double): Self = this.set("itemGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemGap: Self = this.set("itemGap", js.undefined)
    @scala.inline
    def setItemMarginBottom(value: Double): Self = this.set("itemMarginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemMarginBottom: Self = this.set("itemMarginBottom", js.undefined)
    @scala.inline
    def setItemTplFunction4(
      value: (/* value */ js.UndefOr[String], /* color */ js.UndefOr[String], /* checked */ js.UndefOr[Boolean], /* index */ js.UndefOr[Double]) => String
    ): Self = this.set("itemTpl", js.Any.fromFunction4(value))
    @scala.inline
    def setItemTpl(
      value: String | (js.Function4[
          /* value */ js.UndefOr[String], 
          /* color */ js.UndefOr[String], 
          /* checked */ js.UndefOr[Boolean], 
          /* index */ js.UndefOr[Double], 
          String
        ])
    ): Self = this.set("itemTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTpl: Self = this.set("itemTpl", js.undefined)
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLayout(value: LegendLayoutType): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMarkerFunction4(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* r */ js.UndefOr[Double], /* ctx */ js.UndefOr[CanvasRenderingContext2D]) => Unit
    ): Self = this.set("marker", js.Any.fromFunction4(value))
    @scala.inline
    def setMarker(
      value: String | MarkerType | (js.Function4[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* r */ js.UndefOr[Double], 
          /* ctx */ js.UndefOr[CanvasRenderingContext2D], 
          Unit
        ])
    ): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setOnClick(value: /* ev */ MouseEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnHover(value: /* ev */ MouseEvent => Unit): Self = this.set("onHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setPosition(value: LegendPositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setSelectedMode(value: single | multiple): Self = this.set("selectedMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedMode: Self = this.set("selectedMode", js.undefined)
    @scala.inline
    def setSlidable(value: Boolean): Self = this.set("slidable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidable: Self = this.set("slidable", js.undefined)
    @scala.inline
    def setTextStyle(value: text): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    @scala.inline
    def setTitle(value: Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUnChecked(value: String): Self = this.set("unChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnChecked: Self = this.set("unChecked", js.undefined)
    @scala.inline
    def setUseHtml(value: Boolean): Self = this.set("useHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHtml: Self = this.set("useHtml", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

