package typings.baseui.blockMod

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.styletronReact.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockProps extends js.Object {
  @JSName("$style")
  var $style: js.UndefOr[StyleProp[BlockProps]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-content */
  var alignContent: js.UndefOr[Responsive[AlignContent]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-items */
  var alignItems: js.UndefOr[Responsive[AlignItems]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-self */
  var alignSelf: js.UndefOr[Responsive[AlignSelf]] = js.undefined
  var as: js.UndefOr[ElementType[_]] = js.undefined
  var backgroundColor: js.UndefOr[Responsive[String]] = js.undefined
  var bottom: js.UndefOr[Responsive[Scale]] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var color: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/display */
  var display: js.UndefOr[Responsive[Display]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/flex */
  var flex: js.UndefOr[Responsive[Flex]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction */
  var flexDirection: js.UndefOr[Responsive[FlexDirection]] = js.undefined
  var flexWrap: js.UndefOr[Responsive[Boolean]] = js.undefined
  var font: js.UndefOr[String | js.Array[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid */
  var grid: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-area */
  var gridArea: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns */
  var gridAutoColumns: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow */
  var gridAutoFlow: js.UndefOr[Responsive[GridAutoFlow]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows */
  var gridAutoRows: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column */
  var gridColumn: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-end */
  var gridColumnEnd: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-gap */
  var gridColumnGap: js.UndefOr[Responsive[Scale]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-start */
  var gridColumnStart: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-gap */
  var gridGap: js.UndefOr[Responsive[Scale]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row */
  var gridRow: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-end */
  var gridRowEnd: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-gap */
  var gridRowGap: js.UndefOr[Responsive[Scale]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-start */
  var gridRowStart: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template */
  var gridTemplate: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas */
  var gridTemplateAreas: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns */
  var gridTemplateColumns: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-rows */
  var gridTemplateRows: js.UndefOr[Responsive[String]] = js.undefined
  var height: js.UndefOr[Responsive[Scale]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content */
  var justifyContent: js.UndefOr[Responsive[JustifyContent]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items */
  var justifyItems: js.UndefOr[Responsive[JustifyItems]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self */
  var justifySelf: js.UndefOr[Responsive[JustifySelf]] = js.undefined
  var left: js.UndefOr[Responsive[Scale]] = js.undefined
  var margin: js.UndefOr[Responsive[Scale]] = js.undefined
  var marginBottom: js.UndefOr[Responsive[Scale]] = js.undefined
  var marginLeft: js.UndefOr[Responsive[Scale]] = js.undefined
  var marginRight: js.UndefOr[Responsive[Scale]] = js.undefined
  var marginTop: js.UndefOr[Responsive[Scale]] = js.undefined
  var maxHeight: js.UndefOr[Responsive[Scale]] = js.undefined
  var maxWidth: js.UndefOr[Responsive[Scale]] = js.undefined
  var minHeight: js.UndefOr[Responsive[Scale]] = js.undefined
  var minWidth: js.UndefOr[Responsive[Scale]] = js.undefined
  var overflow: js.UndefOr[Responsive[Overflow]] = js.undefined
  var overrides: js.UndefOr[BlockOverrides] = js.undefined
  var padding: js.UndefOr[Responsive[Scale]] = js.undefined
  var paddingBottom: js.UndefOr[Responsive[Scale]] = js.undefined
  var paddingLeft: js.UndefOr[Responsive[Scale]] = js.undefined
  var paddingRight: js.UndefOr[Responsive[Scale]] = js.undefined
  var paddingTop: js.UndefOr[Responsive[Scale]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-content */
  var placeContent: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-items */
  var placeItems: js.UndefOr[Responsive[String]] = js.undefined
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-self */
  var placeSelf: js.UndefOr[Responsive[String]] = js.undefined
  var position: js.UndefOr[Responsive[Position]] = js.undefined
  var ref: js.UndefOr[Ref[_]] = js.undefined
  var right: js.UndefOr[Responsive[Scale]] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[Responsive[Scale]] = js.undefined
  var width: js.UndefOr[Responsive[Scale]] = js.undefined
}

object BlockProps {
  @scala.inline
  def apply(
    $style: StyleProp[BlockProps] = null,
    alignContent: Responsive[AlignContent] = null,
    alignItems: Responsive[AlignItems] = null,
    alignSelf: Responsive[AlignSelf] = null,
    as: ElementType[_] = null,
    backgroundColor: Responsive[String] = null,
    bottom: Responsive[Scale] = null,
    children: ReactNode = null,
    color: Responsive[String] = null,
    display: Responsive[Display] = null,
    flex: Responsive[Flex] = null,
    flexDirection: Responsive[FlexDirection] = null,
    flexWrap: Responsive[Boolean] = null,
    font: String | js.Array[String] = null,
    grid: Responsive[String] = null,
    gridArea: Responsive[String] = null,
    gridAutoColumns: Responsive[String] = null,
    gridAutoFlow: Responsive[GridAutoFlow] = null,
    gridAutoRows: Responsive[String] = null,
    gridColumn: Responsive[String] = null,
    gridColumnEnd: Responsive[String] = null,
    gridColumnGap: Responsive[Scale] = null,
    gridColumnStart: Responsive[String] = null,
    gridGap: Responsive[Scale] = null,
    gridRow: Responsive[String] = null,
    gridRowEnd: Responsive[String] = null,
    gridRowGap: Responsive[Scale] = null,
    gridRowStart: Responsive[String] = null,
    gridTemplate: Responsive[String] = null,
    gridTemplateAreas: Responsive[String] = null,
    gridTemplateColumns: Responsive[String] = null,
    gridTemplateRows: Responsive[String] = null,
    height: Responsive[Scale] = null,
    justifyContent: Responsive[JustifyContent] = null,
    justifyItems: Responsive[JustifyItems] = null,
    justifySelf: Responsive[JustifySelf] = null,
    left: Responsive[Scale] = null,
    margin: Responsive[Scale] = null,
    marginBottom: Responsive[Scale] = null,
    marginLeft: Responsive[Scale] = null,
    marginRight: Responsive[Scale] = null,
    marginTop: Responsive[Scale] = null,
    maxHeight: Responsive[Scale] = null,
    maxWidth: Responsive[Scale] = null,
    minHeight: Responsive[Scale] = null,
    minWidth: Responsive[Scale] = null,
    overflow: Responsive[Overflow] = null,
    overrides: BlockOverrides = null,
    padding: Responsive[Scale] = null,
    paddingBottom: Responsive[Scale] = null,
    paddingLeft: Responsive[Scale] = null,
    paddingRight: Responsive[Scale] = null,
    paddingTop: Responsive[Scale] = null,
    placeContent: Responsive[String] = null,
    placeItems: Responsive[String] = null,
    placeSelf: Responsive[String] = null,
    position: Responsive[Position] = null,
    ref: js.UndefOr[Null | Ref[_]] = js.undefined,
    right: Responsive[Scale] = null,
    src: String = null,
    top: Responsive[Scale] = null,
    width: Responsive[Scale] = null
  ): BlockProps = {
    val __obj = js.Dynamic.literal()
    if ($style != null) __obj.updateDynamic("$style")($style.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (gridAutoColumns != null) __obj.updateDynamic("gridAutoColumns")(gridAutoColumns.asInstanceOf[js.Any])
    if (gridAutoFlow != null) __obj.updateDynamic("gridAutoFlow")(gridAutoFlow.asInstanceOf[js.Any])
    if (gridAutoRows != null) __obj.updateDynamic("gridAutoRows")(gridAutoRows.asInstanceOf[js.Any])
    if (gridColumn != null) __obj.updateDynamic("gridColumn")(gridColumn.asInstanceOf[js.Any])
    if (gridColumnEnd != null) __obj.updateDynamic("gridColumnEnd")(gridColumnEnd.asInstanceOf[js.Any])
    if (gridColumnGap != null) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    if (gridColumnStart != null) __obj.updateDynamic("gridColumnStart")(gridColumnStart.asInstanceOf[js.Any])
    if (gridGap != null) __obj.updateDynamic("gridGap")(gridGap.asInstanceOf[js.Any])
    if (gridRow != null) __obj.updateDynamic("gridRow")(gridRow.asInstanceOf[js.Any])
    if (gridRowEnd != null) __obj.updateDynamic("gridRowEnd")(gridRowEnd.asInstanceOf[js.Any])
    if (gridRowGap != null) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    if (gridRowStart != null) __obj.updateDynamic("gridRowStart")(gridRowStart.asInstanceOf[js.Any])
    if (gridTemplate != null) __obj.updateDynamic("gridTemplate")(gridTemplate.asInstanceOf[js.Any])
    if (gridTemplateAreas != null) __obj.updateDynamic("gridTemplateAreas")(gridTemplateAreas.asInstanceOf[js.Any])
    if (gridTemplateColumns != null) __obj.updateDynamic("gridTemplateColumns")(gridTemplateColumns.asInstanceOf[js.Any])
    if (gridTemplateRows != null) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (justifyItems != null) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    if (justifySelf != null) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (placeContent != null) __obj.updateDynamic("placeContent")(placeContent.asInstanceOf[js.Any])
    if (placeItems != null) __obj.updateDynamic("placeItems")(placeItems.asInstanceOf[js.Any])
    if (placeSelf != null) __obj.updateDynamic("placeSelf")(placeSelf.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockProps]
  }
}

