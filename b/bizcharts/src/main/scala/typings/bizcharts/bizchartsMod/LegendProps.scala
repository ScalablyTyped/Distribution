package typings.bizcharts.bizchartsMod

import typings.atAntvG2.atAntvG2Mod.Styles.background
import typings.atAntvG2.atAntvG2Mod.Styles.text
import typings.bizcharts.bizchartsStrings.multiple
import typings.bizcharts.bizchartsStrings.single
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import typings.std.CanvasRenderingContext2D
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendProps
  extends Props[js.Any] {
  var allowAllCanceled: js.UndefOr[Boolean] = js.undefined
  var background: js.UndefOr[typings.atAntvG2.atAntvG2Mod.Styles.background] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String] = js.undefined
   // useHtml 为true时生效
  var containerTpl: js.UndefOr[String] = js.undefined
  // 自定义混合图例
  var custom: js.UndefOr[Boolean] = js.undefined
  var `g2-legend`: js.UndefOr[CSSProperties] = js.undefined
  var `g2-legend-item`: js.UndefOr[CSSProperties] = js.undefined
  var `g2-legend-list-item`: js.UndefOr[CSSProperties] = js.undefined
  var `g2-legend-marker`: js.UndefOr[CSSProperties] = js.undefined
  var `g2-legend-text`: js.UndefOr[CSSProperties] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var itemFormatter: js.UndefOr[js.Function1[/* val */ js.UndefOr[js.Any], String | Double]] = js.undefined
  var itemGap: js.UndefOr[Double] = js.undefined
  var itemMarginBottom: js.UndefOr[Double] = js.undefined
  var itemTpl: js.UndefOr[
    String | (js.Function4[
      /* value */ js.UndefOr[String], 
      /* color */ js.UndefOr[String], 
      /* checked */ js.UndefOr[Boolean], 
      /* index */ js.UndefOr[Double], 
      String
    ])
  ] = js.undefined
  var itemWidth: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var layout: js.UndefOr[LegendLayoutType] = js.undefined
  var marker: js.UndefOr[
    String | MarkerType | (js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* r */ js.UndefOr[Double], 
      /* ctx */ js.UndefOr[CanvasRenderingContext2D], 
      Unit
    ])
  ] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var position: js.UndefOr[LegendPositionType] = js.undefined
  var scroll: js.UndefOr[Boolean] = js.undefined
  var selectedMode: js.UndefOr[single | multiple] = js.undefined
  // 连续图例
  var slidable: js.UndefOr[Boolean] = js.undefined
  var textStyle: js.UndefOr[text] = js.undefined
  var title: js.UndefOr[Boolean] = js.undefined
  var unChecked: js.UndefOr[String] = js.undefined
  var useHtml: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object LegendProps {
  @scala.inline
  def apply(
    allowAllCanceled: js.UndefOr[Boolean] = js.undefined,
    background: background = null,
    children: ReactNode = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    containerTpl: String = null,
    custom: js.UndefOr[Boolean] = js.undefined,
    `g2-legend`: CSSProperties = null,
    `g2-legend-item`: CSSProperties = null,
    `g2-legend-list-item`: CSSProperties = null,
    `g2-legend-marker`: CSSProperties = null,
    `g2-legend-text`: CSSProperties = null,
    height: Int | Double = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    itemFormatter: /* val */ js.UndefOr[js.Any] => String | Double = null,
    itemGap: Int | Double = null,
    itemMarginBottom: Int | Double = null,
    itemTpl: String | (js.Function4[
      /* value */ js.UndefOr[String], 
      /* color */ js.UndefOr[String], 
      /* checked */ js.UndefOr[Boolean], 
      /* index */ js.UndefOr[Double], 
      String
    ]) = null,
    itemWidth: Int | Double = null,
    items: js.Array[_] = null,
    key: Key = null,
    layout: LegendLayoutType = null,
    marker: String | MarkerType | (js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* r */ js.UndefOr[Double], 
      /* ctx */ js.UndefOr[CanvasRenderingContext2D], 
      Unit
    ]) = null,
    name: String = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    onClick: /* ev */ MouseEvent => Unit = null,
    onHover: /* ev */ MouseEvent => Unit = null,
    position: LegendPositionType = null,
    ref: LegacyRef[js.Any] = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    selectedMode: single | multiple = null,
    slidable: js.UndefOr[Boolean] = js.undefined,
    textStyle: text = null,
    title: js.UndefOr[Boolean] = js.undefined,
    unChecked: String = null,
    useHtml: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): LegendProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAllCanceled)) __obj.updateDynamic("allowAllCanceled")(allowAllCanceled.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerTpl != null) __obj.updateDynamic("containerTpl")(containerTpl.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (`g2-legend` != null) __obj.updateDynamic("g2-legend")(`g2-legend`.asInstanceOf[js.Any])
    if (`g2-legend-item` != null) __obj.updateDynamic("g2-legend-item")(`g2-legend-item`.asInstanceOf[js.Any])
    if (`g2-legend-list-item` != null) __obj.updateDynamic("g2-legend-list-item")(`g2-legend-list-item`.asInstanceOf[js.Any])
    if (`g2-legend-marker` != null) __obj.updateDynamic("g2-legend-marker")(`g2-legend-marker`.asInstanceOf[js.Any])
    if (`g2-legend-text` != null) __obj.updateDynamic("g2-legend-text")(`g2-legend-text`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (itemFormatter != null) __obj.updateDynamic("itemFormatter")(js.Any.fromFunction1(itemFormatter))
    if (itemGap != null) __obj.updateDynamic("itemGap")(itemGap.asInstanceOf[js.Any])
    if (itemMarginBottom != null) __obj.updateDynamic("itemMarginBottom")(itemMarginBottom.asInstanceOf[js.Any])
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (selectedMode != null) __obj.updateDynamic("selectedMode")(selectedMode.asInstanceOf[js.Any])
    if (!js.isUndefined(slidable)) __obj.updateDynamic("slidable")(slidable.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unChecked != null) __obj.updateDynamic("unChecked")(unChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(useHtml)) __obj.updateDynamic("useHtml")(useHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendProps]
  }
}

