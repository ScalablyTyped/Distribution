package typings.bizcharts.mod

import typings.bizcharts.AnonStyle
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps
  extends Props[js.Any] {
  var containerTpl: js.UndefOr[String] = js.undefined
  var crosshairs: js.UndefOr[AnonStyle | Boolean] = js.undefined
  var enterable: js.UndefOr[Boolean] = js.undefined
  var follow: js.UndefOr[Boolean] = js.undefined
  var `g2-tooltip`: js.UndefOr[CSSProperties] = js.undefined
  var `g2-tooltip-list`: js.UndefOr[CSSProperties] = js.undefined
  var `g2-tooltip-list-item`: js.UndefOr[CSSProperties] = js.undefined
  var `g2-tooltip-marker`: js.UndefOr[CSSProperties] = js.undefined
  var `g2-tooltip-title`: js.UndefOr[CSSProperties] = js.undefined
  var htmlContent: js.UndefOr[
    js.Function2[/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[_]], String]
  ] = js.undefined
  var inPlot: js.UndefOr[Boolean] = js.undefined
  var itemTpl: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var shared: js.UndefOr[Boolean] = js.undefined
  var showTitle: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var triggerOn: js.UndefOr[triggerOnType] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var useHtml: js.UndefOr[Boolean] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    containerTpl: String = null,
    crosshairs: AnonStyle | Boolean = null,
    enterable: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    `g2-tooltip`: CSSProperties = null,
    `g2-tooltip-list`: CSSProperties = null,
    `g2-tooltip-list-item`: CSSProperties = null,
    `g2-tooltip-marker`: CSSProperties = null,
    `g2-tooltip-title`: CSSProperties = null,
    htmlContent: (/* title */ js.UndefOr[String], /* items */ js.UndefOr[js.Array[_]]) => String = null,
    inPlot: js.UndefOr[Boolean] = js.undefined,
    itemTpl: String = null,
    key: Key = null,
    offset: Int | Double = null,
    position: PositionType = null,
    ref: LegacyRef[js.Any] = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    triggerOn: triggerOnType = null,
    `type`: String = null,
    useHtml: js.UndefOr[Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (containerTpl != null) __obj.updateDynamic("containerTpl")(containerTpl.asInstanceOf[js.Any])
    if (crosshairs != null) __obj.updateDynamic("crosshairs")(crosshairs.asInstanceOf[js.Any])
    if (!js.isUndefined(enterable)) __obj.updateDynamic("enterable")(enterable.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (`g2-tooltip` != null) __obj.updateDynamic("g2-tooltip")(`g2-tooltip`.asInstanceOf[js.Any])
    if (`g2-tooltip-list` != null) __obj.updateDynamic("g2-tooltip-list")(`g2-tooltip-list`.asInstanceOf[js.Any])
    if (`g2-tooltip-list-item` != null) __obj.updateDynamic("g2-tooltip-list-item")(`g2-tooltip-list-item`.asInstanceOf[js.Any])
    if (`g2-tooltip-marker` != null) __obj.updateDynamic("g2-tooltip-marker")(`g2-tooltip-marker`.asInstanceOf[js.Any])
    if (`g2-tooltip-title` != null) __obj.updateDynamic("g2-tooltip-title")(`g2-tooltip-title`.asInstanceOf[js.Any])
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(js.Any.fromFunction2(htmlContent))
    if (!js.isUndefined(inPlot)) __obj.updateDynamic("inPlot")(inPlot.asInstanceOf[js.Any])
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triggerOn != null) __obj.updateDynamic("triggerOn")(triggerOn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useHtml)) __obj.updateDynamic("useHtml")(useHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

