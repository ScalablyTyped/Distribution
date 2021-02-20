package typings.baseui

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
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.styletronReact.mod.StyleProp
import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingMod {
  
  @JSImport("baseui/heading", "Heading")
  @js.native
  val Heading: FC[HeadingProps] = js.native
  
  @JSImport("baseui/heading", "HeadingLevel")
  @js.native
  val HeadingLevel: FC[HeadingLevelProps] = js.native
  
  @js.native
  trait HeadingLevelProps extends StObject {
    
    var children: ReactNode = js.native
  }
  object HeadingLevelProps {
    
    @scala.inline
    def apply(): HeadingLevelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingLevelProps]
    }
    
    @scala.inline
    implicit class HeadingLevelPropsMutableBuilder[Self <: HeadingLevelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Inlined {  styleLevel :number | undefined} & baseui.baseui/block.BlockProps */
  @js.native
  trait HeadingProps extends StObject {
    
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
    
    var className: js.UndefOr[String] = js.native
    
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
    implicit class HeadingPropsMutableBuilder[Self <: HeadingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$style(value: StyleProp[BlockProps]): Self = StObject.set(x, "$style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$styleFunction1(value: BlockProps => StyleObject): Self = StObject.set(x, "$style", js.Any.fromFunction1(value))
      
      @scala.inline
      def set$styleUndefined: Self = StObject.set(x, "$style", js.undefined)
      
      @scala.inline
      def setAlignContent(value: Responsive[AlignContent]): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setAlignContentVarargs(value: AlignContent*): Self = StObject.set(x, "alignContent", js.Array(value :_*))
      
      @scala.inline
      def setAlignItems(value: Responsive[AlignItems]): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      @scala.inline
      def setAlignItemsVarargs(value: AlignItems*): Self = StObject.set(x, "alignItems", js.Array(value :_*))
      
      @scala.inline
      def setAlignSelf(value: Responsive[AlignSelf]): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAlignSelfVarargs(value: AlignSelf*): Self = StObject.set(x, "alignSelf", js.Array(value :_*))
      
      @scala.inline
      def setAs(value: ElementType[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: Responsive[String]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value :_*))
      
      @scala.inline
      def setBottom(value: Responsive[Scale]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setBottomVarargs(value: Scale*): Self = StObject.set(x, "bottom", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: Responsive[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setDisplay(value: Responsive[Display]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setDisplayVarargs(value: Display*): Self = StObject.set(x, "display", js.Array(value :_*))
      
      @scala.inline
      def setFlex(value: Responsive[Flex]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexDirection(value: Responsive[FlexDirection]): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      @scala.inline
      def setFlexDirectionVarargs(value: FlexDirection*): Self = StObject.set(x, "flexDirection", js.Array(value :_*))
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setFlexVarargs(value: Flex*): Self = StObject.set(x, "flex", js.Array(value :_*))
      
      @scala.inline
      def setFlexWrap(value: Responsive[Boolean]): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      @scala.inline
      def setFlexWrapVarargs(value: Boolean*): Self = StObject.set(x, "flexWrap", js.Array(value :_*))
      
      @scala.inline
      def setFont(value: String | js.Array[String]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontVarargs(value: String*): Self = StObject.set(x, "font", js.Array(value :_*))
      
      @scala.inline
      def setGrid(value: Responsive[String]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridArea(value: Responsive[String]): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setGridAreaVarargs(value: String*): Self = StObject.set(x, "gridArea", js.Array(value :_*))
      
      @scala.inline
      def setGridAutoColumns(value: Responsive[String]): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      @scala.inline
      def setGridAutoColumnsVarargs(value: String*): Self = StObject.set(x, "gridAutoColumns", js.Array(value :_*))
      
      @scala.inline
      def setGridAutoFlow(value: Responsive[GridAutoFlow]): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      @scala.inline
      def setGridAutoFlowVarargs(value: GridAutoFlow*): Self = StObject.set(x, "gridAutoFlow", js.Array(value :_*))
      
      @scala.inline
      def setGridAutoRows(value: Responsive[String]): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      @scala.inline
      def setGridAutoRowsVarargs(value: String*): Self = StObject.set(x, "gridAutoRows", js.Array(value :_*))
      
      @scala.inline
      def setGridColumn(value: Responsive[String]): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnEnd(value: Responsive[String]): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnEndUndefined: Self = StObject.set(x, "gridColumnEnd", js.undefined)
      
      @scala.inline
      def setGridColumnEndVarargs(value: String*): Self = StObject.set(x, "gridColumnEnd", js.Array(value :_*))
      
      @scala.inline
      def setGridColumnGap(value: Responsive[Scale]): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      @scala.inline
      def setGridColumnGapVarargs(value: Scale*): Self = StObject.set(x, "gridColumnGap", js.Array(value :_*))
      
      @scala.inline
      def setGridColumnStart(value: Responsive[String]): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnStartUndefined: Self = StObject.set(x, "gridColumnStart", js.undefined)
      
      @scala.inline
      def setGridColumnStartVarargs(value: String*): Self = StObject.set(x, "gridColumnStart", js.Array(value :_*))
      
      @scala.inline
      def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      @scala.inline
      def setGridColumnVarargs(value: String*): Self = StObject.set(x, "gridColumn", js.Array(value :_*))
      
      @scala.inline
      def setGridGap(value: Responsive[Scale]): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      @scala.inline
      def setGridGapVarargs(value: Scale*): Self = StObject.set(x, "gridGap", js.Array(value :_*))
      
      @scala.inline
      def setGridRow(value: Responsive[String]): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowEnd(value: Responsive[String]): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowEndUndefined: Self = StObject.set(x, "gridRowEnd", js.undefined)
      
      @scala.inline
      def setGridRowEndVarargs(value: String*): Self = StObject.set(x, "gridRowEnd", js.Array(value :_*))
      
      @scala.inline
      def setGridRowGap(value: Responsive[Scale]): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      @scala.inline
      def setGridRowGapVarargs(value: Scale*): Self = StObject.set(x, "gridRowGap", js.Array(value :_*))
      
      @scala.inline
      def setGridRowStart(value: Responsive[String]): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowStartUndefined: Self = StObject.set(x, "gridRowStart", js.undefined)
      
      @scala.inline
      def setGridRowStartVarargs(value: String*): Self = StObject.set(x, "gridRowStart", js.Array(value :_*))
      
      @scala.inline
      def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      @scala.inline
      def setGridRowVarargs(value: String*): Self = StObject.set(x, "gridRow", js.Array(value :_*))
      
      @scala.inline
      def setGridTemplate(value: Responsive[String]): Self = StObject.set(x, "gridTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateAreas(value: Responsive[String]): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
      
      @scala.inline
      def setGridTemplateAreasVarargs(value: String*): Self = StObject.set(x, "gridTemplateAreas", js.Array(value :_*))
      
      @scala.inline
      def setGridTemplateColumns(value: Responsive[String]): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      @scala.inline
      def setGridTemplateColumnsVarargs(value: String*): Self = StObject.set(x, "gridTemplateColumns", js.Array(value :_*))
      
      @scala.inline
      def setGridTemplateRows(value: Responsive[String]): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
      
      @scala.inline
      def setGridTemplateRowsVarargs(value: String*): Self = StObject.set(x, "gridTemplateRows", js.Array(value :_*))
      
      @scala.inline
      def setGridTemplateUndefined: Self = StObject.set(x, "gridTemplate", js.undefined)
      
      @scala.inline
      def setGridTemplateVarargs(value: String*): Self = StObject.set(x, "gridTemplate", js.Array(value :_*))
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setGridVarargs(value: String*): Self = StObject.set(x, "grid", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Responsive[Scale]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHeightVarargs(value: Scale*): Self = StObject.set(x, "height", js.Array(value :_*))
      
      @scala.inline
      def setJustifyContent(value: Responsive[JustifyContent]): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      @scala.inline
      def setJustifyContentVarargs(value: JustifyContent*): Self = StObject.set(x, "justifyContent", js.Array(value :_*))
      
      @scala.inline
      def setJustifyItems(value: Responsive[JustifyItems]): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      @scala.inline
      def setJustifyItemsVarargs(value: JustifyItems*): Self = StObject.set(x, "justifyItems", js.Array(value :_*))
      
      @scala.inline
      def setJustifySelf(value: Responsive[JustifySelf]): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      @scala.inline
      def setJustifySelfVarargs(value: JustifySelf*): Self = StObject.set(x, "justifySelf", js.Array(value :_*))
      
      @scala.inline
      def setLeft(value: Responsive[Scale]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLeftVarargs(value: Scale*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      @scala.inline
      def setMargin(value: Responsive[Scale]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: Responsive[Scale]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginBottomVarargs(value: Scale*): Self = StObject.set(x, "marginBottom", js.Array(value :_*))
      
      @scala.inline
      def setMarginLeft(value: Responsive[Scale]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginLeftVarargs(value: Scale*): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
      
      @scala.inline
      def setMarginRight(value: Responsive[Scale]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginRightVarargs(value: Scale*): Self = StObject.set(x, "marginRight", js.Array(value :_*))
      
      @scala.inline
      def setMarginTop(value: Responsive[Scale]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginTopVarargs(value: Scale*): Self = StObject.set(x, "marginTop", js.Array(value :_*))
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMarginVarargs(value: Scale*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      @scala.inline
      def setMaxHeight(value: Responsive[Scale]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxHeightVarargs(value: Scale*): Self = StObject.set(x, "maxHeight", js.Array(value :_*))
      
      @scala.inline
      def setMaxWidth(value: Responsive[Scale]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMaxWidthVarargs(value: Scale*): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
      
      @scala.inline
      def setMinHeight(value: Responsive[Scale]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinHeightVarargs(value: Scale*): Self = StObject.set(x, "minHeight", js.Array(value :_*))
      
      @scala.inline
      def setMinWidth(value: Responsive[Scale]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMinWidthVarargs(value: Scale*): Self = StObject.set(x, "minWidth", js.Array(value :_*))
      
      @scala.inline
      def setOverflow(value: Responsive[Overflow]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setOverflowVarargs(value: Overflow*): Self = StObject.set(x, "overflow", js.Array(value :_*))
      
      @scala.inline
      def setOverrides(value: BlockOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setPadding(value: Responsive[Scale]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottom(value: Responsive[Scale]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingBottomVarargs(value: Scale*): Self = StObject.set(x, "paddingBottom", js.Array(value :_*))
      
      @scala.inline
      def setPaddingLeft(value: Responsive[Scale]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingLeftVarargs(value: Scale*): Self = StObject.set(x, "paddingLeft", js.Array(value :_*))
      
      @scala.inline
      def setPaddingRight(value: Responsive[Scale]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingRightVarargs(value: Scale*): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
      
      @scala.inline
      def setPaddingTop(value: Responsive[Scale]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaddingTopVarargs(value: Scale*): Self = StObject.set(x, "paddingTop", js.Array(value :_*))
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: Scale*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setPlaceContent(value: Responsive[String]): Self = StObject.set(x, "placeContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceContentUndefined: Self = StObject.set(x, "placeContent", js.undefined)
      
      @scala.inline
      def setPlaceContentVarargs(value: String*): Self = StObject.set(x, "placeContent", js.Array(value :_*))
      
      @scala.inline
      def setPlaceItems(value: Responsive[String]): Self = StObject.set(x, "placeItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceItemsUndefined: Self = StObject.set(x, "placeItems", js.undefined)
      
      @scala.inline
      def setPlaceItemsVarargs(value: String*): Self = StObject.set(x, "placeItems", js.Array(value :_*))
      
      @scala.inline
      def setPlaceSelf(value: Responsive[String]): Self = StObject.set(x, "placeSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceSelfUndefined: Self = StObject.set(x, "placeSelf", js.undefined)
      
      @scala.inline
      def setPlaceSelfVarargs(value: String*): Self = StObject.set(x, "placeSelf", js.Array(value :_*))
      
      @scala.inline
      def setPosition(value: Responsive[Position]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPositionVarargs(value: Position*): Self = StObject.set(x, "position", js.Array(value :_*))
      
      @scala.inline
      def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRight(value: Responsive[Scale]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setRightVarargs(value: Scale*): Self = StObject.set(x, "right", js.Array(value :_*))
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStyleLevel(value: Double): Self = StObject.set(x, "styleLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleLevelUndefined: Self = StObject.set(x, "styleLevel", js.undefined)
      
      @scala.inline
      def setTop(value: Responsive[Scale]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTopVarargs(value: Scale*): Self = StObject.set(x, "top", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Responsive[Scale]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidthVarargs(value: Scale*): Self = StObject.set(x, "width", js.Array(value :_*))
    }
  }
}
