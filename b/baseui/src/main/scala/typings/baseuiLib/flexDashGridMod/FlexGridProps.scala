package typings
package baseuiLib.flexDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexGridProps
  extends baseuiLib.blockMod.BlockProps {
  var flexGridColumnCount: js.UndefOr[baseuiLib.blockMod.Responsive[scala.Double]] = js.undefined
  var flexGridColumnGap: js.UndefOr[baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale]] = js.undefined
  var flexGridRowGap: js.UndefOr[baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale]] = js.undefined
}

object FlexGridProps {
  @scala.inline
  def apply(
    alignContent: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.AlignContent] = null,
    alignItems: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.AlignItems] = null,
    alignSelf: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.AlignSelf] = null,
    as: reactLib.reactMod.ElementType[_] = null,
    backgroundColor: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    bottom: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    children: reactLib.reactMod.ReactNode = null,
    color: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    display: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Display] = null,
    flex: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Flex] = null,
    flexDirection: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.FlexDirection] = null,
    flexGridColumnCount: baseuiLib.blockMod.Responsive[scala.Double] = null,
    flexGridColumnGap: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    flexGridRowGap: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    flexWrap: baseuiLib.blockMod.Responsive[scala.Boolean] = null,
    font: java.lang.String | js.Array[java.lang.String] = null,
    grid: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridArea: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridAutoColumns: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridAutoFlow: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.GridAutoFlow] = null,
    gridAutoRows: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridColumn: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridColumnEnd: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridColumnGap: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    gridColumnStart: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridGap: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    gridRow: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridRowEnd: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridRowGap: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    gridRowStart: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridTemplate: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridTemplateAreas: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridTemplateColumns: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    gridTemplateRows: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    height: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    justifyContent: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.JustifyContent] = null,
    justifyItems: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.JustifyItems] = null,
    justifySelf: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.JustifySelf] = null,
    left: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    margin: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    marginBottom: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    marginLeft: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    marginRight: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    marginTop: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    maxHeight: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    maxWidth: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    minHeight: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    minWidth: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    overflow: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Overflow] = null,
    overrides: baseuiLib.blockMod.BlockOverrides = null,
    padding: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    paddingBottom: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    paddingLeft: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    paddingRight: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    paddingTop: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    placeContent: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    placeItems: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    placeSelf: baseuiLib.blockMod.Responsive[java.lang.String] = null,
    position: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Position] = null,
    right: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    top: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null,
    width: baseuiLib.blockMod.Responsive[baseuiLib.blockMod.Scale] = null
  ): FlexGridProps = {
    val __obj = js.Dynamic.literal()
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
    if (flexGridColumnCount != null) __obj.updateDynamic("flexGridColumnCount")(flexGridColumnCount.asInstanceOf[js.Any])
    if (flexGridColumnGap != null) __obj.updateDynamic("flexGridColumnGap")(flexGridColumnGap.asInstanceOf[js.Any])
    if (flexGridRowGap != null) __obj.updateDynamic("flexGridRowGap")(flexGridRowGap.asInstanceOf[js.Any])
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
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (placeContent != null) __obj.updateDynamic("placeContent")(placeContent.asInstanceOf[js.Any])
    if (placeItems != null) __obj.updateDynamic("placeItems")(placeItems.asInstanceOf[js.Any])
    if (placeSelf != null) __obj.updateDynamic("placeSelf")(placeSelf.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexGridProps]
  }
}

