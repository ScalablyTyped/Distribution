package typings.baseui.headingMod

import typings.baseui.blockMod.AlignContent
import typings.baseui.blockMod.AlignItems
import typings.baseui.blockMod.AlignSelf
import typings.baseui.blockMod.BlockOverrides
import typings.baseui.blockMod.BlockProps
import typings.baseui.blockMod.Display
import typings.baseui.blockMod.Flex
import typings.baseui.blockMod.FlexDirection
import typings.baseui.blockMod.GridAutoFlow
import typings.baseui.blockMod.JustifyContent
import typings.baseui.blockMod.JustifyItems
import typings.baseui.blockMod.JustifySelf
import typings.baseui.blockMod.Overflow
import typings.baseui.blockMod.Position
import typings.baseui.blockMod.Responsive
import typings.baseui.blockMod.Scale
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.styletronReact.mod.StyleProp
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  styleLevel :number | undefined} & baseui.baseui/block.BlockProps */
@js.native
trait HeadingProps extends js.Object {
  @JSName("$style")
  var $style: js.UndefOr[StyleProp[BlockProps]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-content */
  var alignContent: js.UndefOr[Responsive[AlignContent]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-items */
  var alignItems: js.UndefOr[Responsive[AlignItems]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-self */
  var alignSelf: js.UndefOr[Responsive[AlignSelf]] = js.native
  var as: js.UndefOr[ElementType[_]] = js.native
  var backgroundColor: js.UndefOr[Responsive[String]] = js.native
  var bottom: js.UndefOr[Responsive[Scale]] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var color: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/display */
  var display: js.UndefOr[Responsive[Display]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/flex */
  var flex: js.UndefOr[Responsive[Flex]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction */
  var flexDirection: js.UndefOr[Responsive[FlexDirection]] = js.native
  var flexWrap: js.UndefOr[Responsive[Boolean]] = js.native
  var font: js.UndefOr[String | js.Array[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid */
  var grid: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-area */
  var gridArea: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns */
  var gridAutoColumns: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow */
  var gridAutoFlow: js.UndefOr[Responsive[GridAutoFlow]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows */
  var gridAutoRows: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column */
  var gridColumn: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-end */
  var gridColumnEnd: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-gap */
  var gridColumnGap: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column-start */
  var gridColumnStart: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-gap */
  var gridGap: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row */
  var gridRow: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-end */
  var gridRowEnd: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-gap */
  var gridRowGap: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row-start */
  var gridRowStart: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template */
  var gridTemplate: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas */
  var gridTemplateAreas: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns */
  var gridTemplateColumns: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-rows */
  var gridTemplateRows: js.UndefOr[Responsive[String]] = js.native
  var height: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content */
  var justifyContent: js.UndefOr[Responsive[JustifyContent]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items */
  var justifyItems: js.UndefOr[Responsive[JustifyItems]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self */
  var justifySelf: js.UndefOr[Responsive[JustifySelf]] = js.native
  var left: js.UndefOr[Responsive[Scale]] = js.native
  var margin: js.UndefOr[Responsive[Scale]] = js.native
  var marginBottom: js.UndefOr[Responsive[Scale]] = js.native
  var marginLeft: js.UndefOr[Responsive[Scale]] = js.native
  var marginRight: js.UndefOr[Responsive[Scale]] = js.native
  var marginTop: js.UndefOr[Responsive[Scale]] = js.native
  var maxHeight: js.UndefOr[Responsive[Scale]] = js.native
  var maxWidth: js.UndefOr[Responsive[Scale]] = js.native
  var minHeight: js.UndefOr[Responsive[Scale]] = js.native
  var minWidth: js.UndefOr[Responsive[Scale]] = js.native
  var overflow: js.UndefOr[Responsive[Overflow]] = js.native
  var overrides: js.UndefOr[BlockOverrides] = js.native
  var padding: js.UndefOr[Responsive[Scale]] = js.native
  var paddingBottom: js.UndefOr[Responsive[Scale]] = js.native
  var paddingLeft: js.UndefOr[Responsive[Scale]] = js.native
  var paddingRight: js.UndefOr[Responsive[Scale]] = js.native
  var paddingTop: js.UndefOr[Responsive[Scale]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-content */
  var placeContent: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-items */
  var placeItems: js.UndefOr[Responsive[String]] = js.native
  /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/place-self */
  var placeSelf: js.UndefOr[Responsive[String]] = js.native
  var position: js.UndefOr[Responsive[Position]] = js.native
  var ref: js.UndefOr[Ref[_]] = js.native
  var right: js.UndefOr[Responsive[Scale]] = js.native
  var src: js.UndefOr[String] = js.native
  var styleLevel: js.UndefOr[Double] = js.native
  var top: js.UndefOr[Responsive[Scale]] = js.native
  var width: js.UndefOr[Responsive[Scale]] = js.native
}

object HeadingProps {
  @scala.inline
  def apply(): HeadingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadingProps]
  }
  @scala.inline
  implicit class HeadingPropsOps[Self <: HeadingProps] (val x: Self) extends AnyVal {
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
    def set$styleFunction1(value: BlockProps => StyleObject): Self = this.set("$style", js.Any.fromFunction1(value))
    @scala.inline
    def set$style(value: StyleProp[BlockProps]): Self = this.set("$style", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$style: Self = this.set("$style", js.undefined)
    @scala.inline
    def setAlignContentVarargs(value: AlignContent*): Self = this.set("alignContent", js.Array(value :_*))
    @scala.inline
    def setAlignContent(value: Responsive[AlignContent]): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    @scala.inline
    def setAlignItemsVarargs(value: AlignItems*): Self = this.set("alignItems", js.Array(value :_*))
    @scala.inline
    def setAlignItems(value: Responsive[AlignItems]): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    @scala.inline
    def setAlignSelfVarargs(value: AlignSelf*): Self = this.set("alignSelf", js.Array(value :_*))
    @scala.inline
    def setAlignSelf(value: Responsive[AlignSelf]): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAs(value: ElementType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setBackgroundColorVarargs(value: String*): Self = this.set("backgroundColor", js.Array(value :_*))
    @scala.inline
    def setBackgroundColor(value: Responsive[String]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBottomVarargs(value: Scale*): Self = this.set("bottom", js.Array(value :_*))
    @scala.inline
    def setBottom(value: Responsive[Scale]): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setColorVarargs(value: String*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: Responsive[String]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisplayVarargs(value: Display*): Self = this.set("display", js.Array(value :_*))
    @scala.inline
    def setDisplay(value: Responsive[Display]): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setFlexVarargs(value: Flex*): Self = this.set("flex", js.Array(value :_*))
    @scala.inline
    def setFlex(value: Responsive[Flex]): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setFlexDirectionVarargs(value: FlexDirection*): Self = this.set("flexDirection", js.Array(value :_*))
    @scala.inline
    def setFlexDirection(value: Responsive[FlexDirection]): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexDirection: Self = this.set("flexDirection", js.undefined)
    @scala.inline
    def setFlexWrapVarargs(value: Boolean*): Self = this.set("flexWrap", js.Array(value :_*))
    @scala.inline
    def setFlexWrap(value: Responsive[Boolean]): Self = this.set("flexWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexWrap: Self = this.set("flexWrap", js.undefined)
    @scala.inline
    def setFontVarargs(value: String*): Self = this.set("font", js.Array(value :_*))
    @scala.inline
    def setFont(value: String | js.Array[String]): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setGridVarargs(value: String*): Self = this.set("grid", js.Array(value :_*))
    @scala.inline
    def setGrid(value: Responsive[String]): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setGridAreaVarargs(value: String*): Self = this.set("gridArea", js.Array(value :_*))
    @scala.inline
    def setGridArea(value: Responsive[String]): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setGridAutoColumnsVarargs(value: String*): Self = this.set("gridAutoColumns", js.Array(value :_*))
    @scala.inline
    def setGridAutoColumns(value: Responsive[String]): Self = this.set("gridAutoColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridAutoColumns: Self = this.set("gridAutoColumns", js.undefined)
    @scala.inline
    def setGridAutoFlowVarargs(value: GridAutoFlow*): Self = this.set("gridAutoFlow", js.Array(value :_*))
    @scala.inline
    def setGridAutoFlow(value: Responsive[GridAutoFlow]): Self = this.set("gridAutoFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridAutoFlow: Self = this.set("gridAutoFlow", js.undefined)
    @scala.inline
    def setGridAutoRowsVarargs(value: String*): Self = this.set("gridAutoRows", js.Array(value :_*))
    @scala.inline
    def setGridAutoRows(value: Responsive[String]): Self = this.set("gridAutoRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridAutoRows: Self = this.set("gridAutoRows", js.undefined)
    @scala.inline
    def setGridColumnVarargs(value: String*): Self = this.set("gridColumn", js.Array(value :_*))
    @scala.inline
    def setGridColumn(value: Responsive[String]): Self = this.set("gridColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumn: Self = this.set("gridColumn", js.undefined)
    @scala.inline
    def setGridColumnEndVarargs(value: String*): Self = this.set("gridColumnEnd", js.Array(value :_*))
    @scala.inline
    def setGridColumnEnd(value: Responsive[String]): Self = this.set("gridColumnEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumnEnd: Self = this.set("gridColumnEnd", js.undefined)
    @scala.inline
    def setGridColumnGapVarargs(value: Scale*): Self = this.set("gridColumnGap", js.Array(value :_*))
    @scala.inline
    def setGridColumnGap(value: Responsive[Scale]): Self = this.set("gridColumnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumnGap: Self = this.set("gridColumnGap", js.undefined)
    @scala.inline
    def setGridColumnStartVarargs(value: String*): Self = this.set("gridColumnStart", js.Array(value :_*))
    @scala.inline
    def setGridColumnStart(value: Responsive[String]): Self = this.set("gridColumnStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumnStart: Self = this.set("gridColumnStart", js.undefined)
    @scala.inline
    def setGridGapVarargs(value: Scale*): Self = this.set("gridGap", js.Array(value :_*))
    @scala.inline
    def setGridGap(value: Responsive[Scale]): Self = this.set("gridGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridGap: Self = this.set("gridGap", js.undefined)
    @scala.inline
    def setGridRowVarargs(value: String*): Self = this.set("gridRow", js.Array(value :_*))
    @scala.inline
    def setGridRow(value: Responsive[String]): Self = this.set("gridRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRow: Self = this.set("gridRow", js.undefined)
    @scala.inline
    def setGridRowEndVarargs(value: String*): Self = this.set("gridRowEnd", js.Array(value :_*))
    @scala.inline
    def setGridRowEnd(value: Responsive[String]): Self = this.set("gridRowEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRowEnd: Self = this.set("gridRowEnd", js.undefined)
    @scala.inline
    def setGridRowGapVarargs(value: Scale*): Self = this.set("gridRowGap", js.Array(value :_*))
    @scala.inline
    def setGridRowGap(value: Responsive[Scale]): Self = this.set("gridRowGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRowGap: Self = this.set("gridRowGap", js.undefined)
    @scala.inline
    def setGridRowStartVarargs(value: String*): Self = this.set("gridRowStart", js.Array(value :_*))
    @scala.inline
    def setGridRowStart(value: Responsive[String]): Self = this.set("gridRowStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRowStart: Self = this.set("gridRowStart", js.undefined)
    @scala.inline
    def setGridTemplateVarargs(value: String*): Self = this.set("gridTemplate", js.Array(value :_*))
    @scala.inline
    def setGridTemplate(value: Responsive[String]): Self = this.set("gridTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplate: Self = this.set("gridTemplate", js.undefined)
    @scala.inline
    def setGridTemplateAreasVarargs(value: String*): Self = this.set("gridTemplateAreas", js.Array(value :_*))
    @scala.inline
    def setGridTemplateAreas(value: Responsive[String]): Self = this.set("gridTemplateAreas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplateAreas: Self = this.set("gridTemplateAreas", js.undefined)
    @scala.inline
    def setGridTemplateColumnsVarargs(value: String*): Self = this.set("gridTemplateColumns", js.Array(value :_*))
    @scala.inline
    def setGridTemplateColumns(value: Responsive[String]): Self = this.set("gridTemplateColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplateColumns: Self = this.set("gridTemplateColumns", js.undefined)
    @scala.inline
    def setGridTemplateRowsVarargs(value: String*): Self = this.set("gridTemplateRows", js.Array(value :_*))
    @scala.inline
    def setGridTemplateRows(value: Responsive[String]): Self = this.set("gridTemplateRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplateRows: Self = this.set("gridTemplateRows", js.undefined)
    @scala.inline
    def setHeightVarargs(value: Scale*): Self = this.set("height", js.Array(value :_*))
    @scala.inline
    def setHeight(value: Responsive[Scale]): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setJustifyContentVarargs(value: JustifyContent*): Self = this.set("justifyContent", js.Array(value :_*))
    @scala.inline
    def setJustifyContent(value: Responsive[JustifyContent]): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    @scala.inline
    def setJustifyItemsVarargs(value: JustifyItems*): Self = this.set("justifyItems", js.Array(value :_*))
    @scala.inline
    def setJustifyItems(value: Responsive[JustifyItems]): Self = this.set("justifyItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifyItems: Self = this.set("justifyItems", js.undefined)
    @scala.inline
    def setJustifySelfVarargs(value: JustifySelf*): Self = this.set("justifySelf", js.Array(value :_*))
    @scala.inline
    def setJustifySelf(value: Responsive[JustifySelf]): Self = this.set("justifySelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifySelf: Self = this.set("justifySelf", js.undefined)
    @scala.inline
    def setLeftVarargs(value: Scale*): Self = this.set("left", js.Array(value :_*))
    @scala.inline
    def setLeft(value: Responsive[Scale]): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setMarginVarargs(value: Scale*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: Responsive[Scale]): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMarginBottomVarargs(value: Scale*): Self = this.set("marginBottom", js.Array(value :_*))
    @scala.inline
    def setMarginBottom(value: Responsive[Scale]): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginLeftVarargs(value: Scale*): Self = this.set("marginLeft", js.Array(value :_*))
    @scala.inline
    def setMarginLeft(value: Responsive[Scale]): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    @scala.inline
    def setMarginRightVarargs(value: Scale*): Self = this.set("marginRight", js.Array(value :_*))
    @scala.inline
    def setMarginRight(value: Responsive[Scale]): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMarginTopVarargs(value: Scale*): Self = this.set("marginTop", js.Array(value :_*))
    @scala.inline
    def setMarginTop(value: Responsive[Scale]): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setMaxHeightVarargs(value: Scale*): Self = this.set("maxHeight", js.Array(value :_*))
    @scala.inline
    def setMaxHeight(value: Responsive[Scale]): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidthVarargs(value: Scale*): Self = this.set("maxWidth", js.Array(value :_*))
    @scala.inline
    def setMaxWidth(value: Responsive[Scale]): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeightVarargs(value: Scale*): Self = this.set("minHeight", js.Array(value :_*))
    @scala.inline
    def setMinHeight(value: Responsive[Scale]): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidthVarargs(value: Scale*): Self = this.set("minWidth", js.Array(value :_*))
    @scala.inline
    def setMinWidth(value: Responsive[Scale]): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOverflowVarargs(value: Overflow*): Self = this.set("overflow", js.Array(value :_*))
    @scala.inline
    def setOverflow(value: Responsive[Overflow]): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setOverrides(value: BlockOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setPaddingVarargs(value: Scale*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: Responsive[Scale]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingBottomVarargs(value: Scale*): Self = this.set("paddingBottom", js.Array(value :_*))
    @scala.inline
    def setPaddingBottom(value: Responsive[Scale]): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingLeftVarargs(value: Scale*): Self = this.set("paddingLeft", js.Array(value :_*))
    @scala.inline
    def setPaddingLeft(value: Responsive[Scale]): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingRightVarargs(value: Scale*): Self = this.set("paddingRight", js.Array(value :_*))
    @scala.inline
    def setPaddingRight(value: Responsive[Scale]): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingTopVarargs(value: Scale*): Self = this.set("paddingTop", js.Array(value :_*))
    @scala.inline
    def setPaddingTop(value: Responsive[Scale]): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setPlaceContentVarargs(value: String*): Self = this.set("placeContent", js.Array(value :_*))
    @scala.inline
    def setPlaceContent(value: Responsive[String]): Self = this.set("placeContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceContent: Self = this.set("placeContent", js.undefined)
    @scala.inline
    def setPlaceItemsVarargs(value: String*): Self = this.set("placeItems", js.Array(value :_*))
    @scala.inline
    def setPlaceItems(value: Responsive[String]): Self = this.set("placeItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceItems: Self = this.set("placeItems", js.undefined)
    @scala.inline
    def setPlaceSelfVarargs(value: String*): Self = this.set("placeSelf", js.Array(value :_*))
    @scala.inline
    def setPlaceSelf(value: Responsive[String]): Self = this.set("placeSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceSelf: Self = this.set("placeSelf", js.undefined)
    @scala.inline
    def setPositionVarargs(value: Position*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(value: Responsive[Position]): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setRightVarargs(value: Scale*): Self = this.set("right", js.Array(value :_*))
    @scala.inline
    def setRight(value: Responsive[Scale]): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStyleLevel(value: Double): Self = this.set("styleLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleLevel: Self = this.set("styleLevel", js.undefined)
    @scala.inline
    def setTopVarargs(value: Scale*): Self = this.set("top", js.Array(value :_*))
    @scala.inline
    def setTop(value: Responsive[Scale]): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidthVarargs(value: Scale*): Self = this.set("width", js.Array(value :_*))
    @scala.inline
    def setWidth(value: Responsive[Scale]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

