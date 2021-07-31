package typings.baseui

import typings.baseui.baseuiNumbers.`0`
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.styletronReact.mod.StyleProp
import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockMod {
  
  @JSImport("baseui/block", "Block")
  @js.native
  val Block: FC[BlockProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end
    - typings.baseui.baseuiStrings.`flex-start`
    - typings.baseui.baseuiStrings.`flex-end`
    - typings.baseui.baseuiStrings.normal
    - typings.baseui.baseuiStrings.baseline
    - typings.baseui.baseuiStrings.`first baseline`
    - typings.baseui.baseuiStrings.`last baseline`
    - typings.baseui.baseuiStrings.`space-between`
    - typings.baseui.baseuiStrings.`space-around`
    - typings.baseui.baseuiStrings.`space-evenly`
    - typings.baseui.baseuiStrings.stretch
    - typings.baseui.baseuiStrings.`safe center`
    - typings.baseui.baseuiStrings.`unsafe center`
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait AlignContent extends StObject
  object AlignContent {
    
    @scala.inline
    def baseline: typings.baseui.baseuiStrings.baseline = "baseline".asInstanceOf[typings.baseui.baseuiStrings.baseline]
    
    @scala.inline
    def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    @scala.inline
    def end: typings.baseui.baseuiStrings.end = "end".asInstanceOf[typings.baseui.baseuiStrings.end]
    
    @scala.inline
    def `first baseline`: typings.baseui.baseuiStrings.`first baseline` = ("first baseline").asInstanceOf[typings.baseui.baseuiStrings.`first baseline`]
    
    @scala.inline
    def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    @scala.inline
    def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    @scala.inline
    def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    @scala.inline
    def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    @scala.inline
    def `last baseline`: typings.baseui.baseuiStrings.`last baseline` = ("last baseline").asInstanceOf[typings.baseui.baseuiStrings.`last baseline`]
    
    @scala.inline
    def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    @scala.inline
    def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    @scala.inline
    def `space-around`: typings.baseui.baseuiStrings.`space-around` = "space-around".asInstanceOf[typings.baseui.baseuiStrings.`space-around`]
    
    @scala.inline
    def `space-between`: typings.baseui.baseuiStrings.`space-between` = "space-between".asInstanceOf[typings.baseui.baseuiStrings.`space-between`]
    
    @scala.inline
    def `space-evenly`: typings.baseui.baseuiStrings.`space-evenly` = "space-evenly".asInstanceOf[typings.baseui.baseuiStrings.`space-evenly`]
    
    @scala.inline
    def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    @scala.inline
    def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    @scala.inline
    def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    @scala.inline
    def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.normal
    - typings.baseui.baseuiStrings.stretch
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end
    - typings.baseui.baseuiStrings.`flex-start`
    - typings.baseui.baseuiStrings.`flex-end`
    - typings.baseui.baseuiStrings.`self-start`
    - typings.baseui.baseuiStrings.`self-end`
    - typings.baseui.baseuiStrings.baseline
    - typings.baseui.baseuiStrings.`first baseline`
    - typings.baseui.baseuiStrings.`last baseline`
    - typings.baseui.baseuiStrings.`safe center`
    - typings.baseui.baseuiStrings.`unsafe center`
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait AlignItems extends StObject
  object AlignItems {
    
    @scala.inline
    def baseline: typings.baseui.baseuiStrings.baseline = "baseline".asInstanceOf[typings.baseui.baseuiStrings.baseline]
    
    @scala.inline
    def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    @scala.inline
    def end: typings.baseui.baseuiStrings.end = "end".asInstanceOf[typings.baseui.baseuiStrings.end]
    
    @scala.inline
    def `first baseline`: typings.baseui.baseuiStrings.`first baseline` = ("first baseline").asInstanceOf[typings.baseui.baseuiStrings.`first baseline`]
    
    @scala.inline
    def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    @scala.inline
    def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    @scala.inline
    def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    @scala.inline
    def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    @scala.inline
    def `last baseline`: typings.baseui.baseuiStrings.`last baseline` = ("last baseline").asInstanceOf[typings.baseui.baseuiStrings.`last baseline`]
    
    @scala.inline
    def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    @scala.inline
    def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    @scala.inline
    def `self-end`: typings.baseui.baseuiStrings.`self-end` = "self-end".asInstanceOf[typings.baseui.baseuiStrings.`self-end`]
    
    @scala.inline
    def `self-start`: typings.baseui.baseuiStrings.`self-start` = "self-start".asInstanceOf[typings.baseui.baseuiStrings.`self-start`]
    
    @scala.inline
    def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    @scala.inline
    def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    @scala.inline
    def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    @scala.inline
    def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.auto
    - typings.baseui.baseuiStrings.normal
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end
    - typings.baseui.baseuiStrings.`self-start`
    - typings.baseui.baseuiStrings.`self-end`
    - typings.baseui.baseuiStrings.`flex-start`
    - typings.baseui.baseuiStrings.`flex-end`
    - typings.baseui.baseuiStrings.baseline
    - typings.baseui.baseuiStrings.`first baseline`
    - typings.baseui.baseuiStrings.`last baseline`
    - typings.baseui.baseuiStrings.stretch
    - typings.baseui.baseuiStrings.`safe center`
    - typings.baseui.baseuiStrings.`unsafe center`
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait AlignSelf extends StObject
  object AlignSelf {
    
    @scala.inline
    def auto: typings.baseui.baseuiStrings.auto = "auto".asInstanceOf[typings.baseui.baseuiStrings.auto]
    
    @scala.inline
    def baseline: typings.baseui.baseuiStrings.baseline = "baseline".asInstanceOf[typings.baseui.baseuiStrings.baseline]
    
    @scala.inline
    def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    @scala.inline
    def end: typings.baseui.baseuiStrings.end = "end".asInstanceOf[typings.baseui.baseuiStrings.end]
    
    @scala.inline
    def `first baseline`: typings.baseui.baseuiStrings.`first baseline` = ("first baseline").asInstanceOf[typings.baseui.baseuiStrings.`first baseline`]
    
    @scala.inline
    def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    @scala.inline
    def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    @scala.inline
    def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    @scala.inline
    def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    @scala.inline
    def `last baseline`: typings.baseui.baseuiStrings.`last baseline` = ("last baseline").asInstanceOf[typings.baseui.baseuiStrings.`last baseline`]
    
    @scala.inline
    def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    @scala.inline
    def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    @scala.inline
    def `self-end`: typings.baseui.baseuiStrings.`self-end` = "self-end".asInstanceOf[typings.baseui.baseuiStrings.`self-end`]
    
    @scala.inline
    def `self-start`: typings.baseui.baseuiStrings.`self-start` = "self-start".asInstanceOf[typings.baseui.baseuiStrings.`self-start`]
    
    @scala.inline
    def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    @scala.inline
    def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    @scala.inline
    def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    @scala.inline
    def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  trait BlockOverrides extends StObject {
    
    var Block: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object BlockOverrides {
    
    @scala.inline
    def apply(): BlockOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockOverrides]
    }
    
    @scala.inline
    implicit class BlockOverridesMutableBuilder[Self <: BlockOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "Block", js.undefined)
    }
  }
  
  trait BlockProps extends StObject {
    
    @JSName("$style")
    var $style: js.UndefOr[StyleProp[BlockProps]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-content */
    var alignContent: js.UndefOr[Responsive[AlignContent]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-items */
    var alignItems: js.UndefOr[Responsive[AlignItems]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-self */
    var alignSelf: js.UndefOr[Responsive[AlignSelf]] = js.undefined
    
    var as: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    var backgroundColor: js.UndefOr[Responsive[String]] = js.undefined
    
    var bottom: js.UndefOr[Responsive[Scale]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
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
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var right: js.UndefOr[Responsive[Scale]] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[Responsive[Scale]] = js.undefined
    
    var width: js.UndefOr[Responsive[Scale]] = js.undefined
  }
  object BlockProps {
    
    @scala.inline
    def apply(): BlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockProps]
    }
    
    @scala.inline
    implicit class BlockPropsMutableBuilder[Self <: BlockProps] (val x: Self) extends AnyVal {
      
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
      def setAs(value: ElementType[js.Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
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
      def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.block
    - typings.baseui.baseuiStrings.`inline`
    - typings.baseui.baseuiStrings.`run-in`
    - typings.baseui.baseuiStrings.flow
    - typings.baseui.baseuiStrings.`flow-root`
    - typings.baseui.baseuiStrings.table
    - typings.baseui.baseuiStrings.flex
    - typings.baseui.baseuiStrings.grid
    - typings.baseui.baseuiStrings.ruby
    - typings.baseui.baseuiStrings.`block flow`
    - typings.baseui.baseuiStrings.`inline table`
    - typings.baseui.baseuiStrings.`flex run-in`
    - typings.baseui.baseuiStrings.`list-item`
    - typings.baseui.baseuiStrings.`list-item block`
    - typings.baseui.baseuiStrings.`list-item inline`
    - typings.baseui.baseuiStrings.`list-item flow`
    - typings.baseui.baseuiStrings.`list-item flow-root`
    - typings.baseui.baseuiStrings.`list-item block flow`
    - typings.baseui.baseuiStrings.`list-item block flow-root`
    - typings.baseui.baseuiStrings.`flow list-item block`
    - typings.baseui.baseuiStrings.`table-row-group`
    - typings.baseui.baseuiStrings.`table-header-group`
    - typings.baseui.baseuiStrings.`table-footer-group`
    - typings.baseui.baseuiStrings.`table-row`
    - typings.baseui.baseuiStrings.`table-cell`
    - typings.baseui.baseuiStrings.`table-column-group`
    - typings.baseui.baseuiStrings.`table-column`
    - typings.baseui.baseuiStrings.`table-caption`
    - typings.baseui.baseuiStrings.`ruby-base`
    - typings.baseui.baseuiStrings.`ruby-text`
    - typings.baseui.baseuiStrings.`ruby-base-container`
    - typings.baseui.baseuiStrings.`ruby-text-container`
    - typings.baseui.baseuiStrings.contents
    - typings.baseui.baseuiStrings.none
    - typings.baseui.baseuiStrings.`inline-block`
    - typings.baseui.baseuiStrings.`inline-table`
    - typings.baseui.baseuiStrings.`inline-flex`
    - typings.baseui.baseuiStrings.`inline-grid`
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait Display extends StObject
  object Display {
    
    @scala.inline
    def block: typings.baseui.baseuiStrings.block = "block".asInstanceOf[typings.baseui.baseuiStrings.block]
    
    @scala.inline
    def `block flow`: typings.baseui.baseuiStrings.`block flow` = ("block flow").asInstanceOf[typings.baseui.baseuiStrings.`block flow`]
    
    @scala.inline
    def contents: typings.baseui.baseuiStrings.contents = "contents".asInstanceOf[typings.baseui.baseuiStrings.contents]
    
    @scala.inline
    def flex: typings.baseui.baseuiStrings.flex = "flex".asInstanceOf[typings.baseui.baseuiStrings.flex]
    
    @scala.inline
    def `flex run-in`: typings.baseui.baseuiStrings.`flex run-in` = ("flex run-in").asInstanceOf[typings.baseui.baseuiStrings.`flex run-in`]
    
    @scala.inline
    def flow: typings.baseui.baseuiStrings.flow = "flow".asInstanceOf[typings.baseui.baseuiStrings.flow]
    
    @scala.inline
    def `flow list-item block`: typings.baseui.baseuiStrings.`flow list-item block` = ("flow list-item block").asInstanceOf[typings.baseui.baseuiStrings.`flow list-item block`]
    
    @scala.inline
    def `flow-root`: typings.baseui.baseuiStrings.`flow-root` = "flow-root".asInstanceOf[typings.baseui.baseuiStrings.`flow-root`]
    
    @scala.inline
    def grid: typings.baseui.baseuiStrings.grid = "grid".asInstanceOf[typings.baseui.baseuiStrings.grid]
    
    @scala.inline
    def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    @scala.inline
    def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    @scala.inline
    def `inline`: typings.baseui.baseuiStrings.`inline` = "inline".asInstanceOf[typings.baseui.baseuiStrings.`inline`]
    
    @scala.inline
    def `inline table`: typings.baseui.baseuiStrings.`inline table` = ("inline table").asInstanceOf[typings.baseui.baseuiStrings.`inline table`]
    
    @scala.inline
    def `inline-block`: typings.baseui.baseuiStrings.`inline-block` = "inline-block".asInstanceOf[typings.baseui.baseuiStrings.`inline-block`]
    
    @scala.inline
    def `inline-flex`: typings.baseui.baseuiStrings.`inline-flex` = "inline-flex".asInstanceOf[typings.baseui.baseuiStrings.`inline-flex`]
    
    @scala.inline
    def `inline-grid`: typings.baseui.baseuiStrings.`inline-grid` = "inline-grid".asInstanceOf[typings.baseui.baseuiStrings.`inline-grid`]
    
    @scala.inline
    def `inline-table`: typings.baseui.baseuiStrings.`inline-table` = "inline-table".asInstanceOf[typings.baseui.baseuiStrings.`inline-table`]
    
    @scala.inline
    def `list-item`: typings.baseui.baseuiStrings.`list-item` = "list-item".asInstanceOf[typings.baseui.baseuiStrings.`list-item`]
    
    @scala.inline
    def `list-item block`: typings.baseui.baseuiStrings.`list-item block` = ("list-item block").asInstanceOf[typings.baseui.baseuiStrings.`list-item block`]
    
    @scala.inline
    def `list-item block flow`: typings.baseui.baseuiStrings.`list-item block flow` = ("list-item block flow").asInstanceOf[typings.baseui.baseuiStrings.`list-item block flow`]
    
    @scala.inline
    def `list-item block flow-root`: typings.baseui.baseuiStrings.`list-item block flow-root` = ("list-item block flow-root").asInstanceOf[typings.baseui.baseuiStrings.`list-item block flow-root`]
    
    @scala.inline
    def `list-item flow`: typings.baseui.baseuiStrings.`list-item flow` = ("list-item flow").asInstanceOf[typings.baseui.baseuiStrings.`list-item flow`]
    
    @scala.inline
    def `list-item flow-root`: typings.baseui.baseuiStrings.`list-item flow-root` = ("list-item flow-root").asInstanceOf[typings.baseui.baseuiStrings.`list-item flow-root`]
    
    @scala.inline
    def `list-item inline`: typings.baseui.baseuiStrings.`list-item inline` = ("list-item inline").asInstanceOf[typings.baseui.baseuiStrings.`list-item inline`]
    
    @scala.inline
    def none: typings.baseui.baseuiStrings.none = "none".asInstanceOf[typings.baseui.baseuiStrings.none]
    
    @scala.inline
    def ruby: typings.baseui.baseuiStrings.ruby = "ruby".asInstanceOf[typings.baseui.baseuiStrings.ruby]
    
    @scala.inline
    def `ruby-base`: typings.baseui.baseuiStrings.`ruby-base` = "ruby-base".asInstanceOf[typings.baseui.baseuiStrings.`ruby-base`]
    
    @scala.inline
    def `ruby-base-container`: typings.baseui.baseuiStrings.`ruby-base-container` = "ruby-base-container".asInstanceOf[typings.baseui.baseuiStrings.`ruby-base-container`]
    
    @scala.inline
    def `ruby-text`: typings.baseui.baseuiStrings.`ruby-text` = "ruby-text".asInstanceOf[typings.baseui.baseuiStrings.`ruby-text`]
    
    @scala.inline
    def `ruby-text-container`: typings.baseui.baseuiStrings.`ruby-text-container` = "ruby-text-container".asInstanceOf[typings.baseui.baseuiStrings.`ruby-text-container`]
    
    @scala.inline
    def `run-in`: typings.baseui.baseuiStrings.`run-in` = "run-in".asInstanceOf[typings.baseui.baseuiStrings.`run-in`]
    
    @scala.inline
    def table: typings.baseui.baseuiStrings.table = "table".asInstanceOf[typings.baseui.baseuiStrings.table]
    
    @scala.inline
    def `table-caption`: typings.baseui.baseuiStrings.`table-caption` = "table-caption".asInstanceOf[typings.baseui.baseuiStrings.`table-caption`]
    
    @scala.inline
    def `table-cell`: typings.baseui.baseuiStrings.`table-cell` = "table-cell".asInstanceOf[typings.baseui.baseuiStrings.`table-cell`]
    
    @scala.inline
    def `table-column`: typings.baseui.baseuiStrings.`table-column` = "table-column".asInstanceOf[typings.baseui.baseuiStrings.`table-column`]
    
    @scala.inline
    def `table-column-group`: typings.baseui.baseuiStrings.`table-column-group` = "table-column-group".asInstanceOf[typings.baseui.baseuiStrings.`table-column-group`]
    
    @scala.inline
    def `table-footer-group`: typings.baseui.baseuiStrings.`table-footer-group` = "table-footer-group".asInstanceOf[typings.baseui.baseuiStrings.`table-footer-group`]
    
    @scala.inline
    def `table-header-group`: typings.baseui.baseuiStrings.`table-header-group` = "table-header-group".asInstanceOf[typings.baseui.baseuiStrings.`table-header-group`]
    
    @scala.inline
    def `table-row`: typings.baseui.baseuiStrings.`table-row` = "table-row".asInstanceOf[typings.baseui.baseuiStrings.`table-row`]
    
    @scala.inline
    def `table-row-group`: typings.baseui.baseuiStrings.`table-row-group` = "table-row-group".asInstanceOf[typings.baseui.baseuiStrings.`table-row-group`]
    
    @scala.inline
    def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  type Flex = Double | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.row
    - typings.baseui.baseuiStrings.`row-reverse`
    - typings.baseui.baseuiStrings.column
    - typings.baseui.baseuiStrings.`column-reverse`
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait FlexDirection extends StObject
  object FlexDirection {
    
    @scala.inline
    def column: typings.baseui.baseuiStrings.column = "column".asInstanceOf[typings.baseui.baseuiStrings.column]
    
    @scala.inline
    def `column-reverse`: typings.baseui.baseuiStrings.`column-reverse` = "column-reverse".asInstanceOf[typings.baseui.baseuiStrings.`column-reverse`]
    
    @scala.inline
    def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    @scala.inline
    def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    @scala.inline
    def row: typings.baseui.baseuiStrings.row = "row".asInstanceOf[typings.baseui.baseuiStrings.row]
    
    @scala.inline
    def `row-reverse`: typings.baseui.baseuiStrings.`row-reverse` = "row-reverse".asInstanceOf[typings.baseui.baseuiStrings.`row-reverse`]
    
    @scala.inline
    def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.row
    - typings.baseui.baseuiStrings.column
    - typings.baseui.baseuiStrings.dense
    - typings.baseui.baseuiStrings.`row dense`
    - typings.baseui.baseuiStrings.`column dense`
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait GridAutoFlow extends StObject
  object GridAutoFlow {
    
    @scala.inline
    def column: typings.baseui.baseuiStrings.column = "column".asInstanceOf[typings.baseui.baseuiStrings.column]
    
    @scala.inline
    def `column dense`: typings.baseui.baseuiStrings.`column dense` = ("column dense").asInstanceOf[typings.baseui.baseuiStrings.`column dense`]
    
    @scala.inline
    def dense: typings.baseui.baseuiStrings.dense = "dense".asInstanceOf[typings.baseui.baseuiStrings.dense]
    
    @scala.inline
    def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    @scala.inline
    def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    @scala.inline
    def row: typings.baseui.baseuiStrings.row = "row".asInstanceOf[typings.baseui.baseuiStrings.row]
    
    @scala.inline
    def `row dense`: typings.baseui.baseuiStrings.`row dense` = ("row dense").asInstanceOf[typings.baseui.baseuiStrings.`row dense`]
    
    @scala.inline
    def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end
    - typings.baseui.baseuiStrings.`flex-start`
    - typings.baseui.baseuiStrings.`flex-end`
    - typings.baseui.baseuiStrings.left
    - typings.baseui.baseuiStrings.right
    - typings.baseui.baseuiStrings.`space-between`
    - typings.baseui.baseuiStrings.`space-around`
    - typings.baseui.baseuiStrings.`space-evenly`
    - typings.baseui.baseuiStrings.stretch
    - typings.baseui.baseuiStrings.`safe center`
    - typings.baseui.baseuiStrings.`unsafe center`
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait JustifyContent extends StObject
  object JustifyContent {
    
    @scala.inline
    def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    @scala.inline
    def end: typings.baseui.baseuiStrings.end = "end".asInstanceOf[typings.baseui.baseuiStrings.end]
    
    @scala.inline
    def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    @scala.inline
    def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    @scala.inline
    def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    @scala.inline
    def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    @scala.inline
    def left: typings.baseui.baseuiStrings.left = "left".asInstanceOf[typings.baseui.baseuiStrings.left]
    
    @scala.inline
    def right: typings.baseui.baseuiStrings.right = "right".asInstanceOf[typings.baseui.baseuiStrings.right]
    
    @scala.inline
    def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    @scala.inline
    def `space-around`: typings.baseui.baseuiStrings.`space-around` = "space-around".asInstanceOf[typings.baseui.baseuiStrings.`space-around`]
    
    @scala.inline
    def `space-between`: typings.baseui.baseuiStrings.`space-between` = "space-between".asInstanceOf[typings.baseui.baseuiStrings.`space-between`]
    
    @scala.inline
    def `space-evenly`: typings.baseui.baseuiStrings.`space-evenly` = "space-evenly".asInstanceOf[typings.baseui.baseuiStrings.`space-evenly`]
    
    @scala.inline
    def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    @scala.inline
    def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    @scala.inline
    def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    @scala.inline
    def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.auto
    - typings.baseui.baseuiStrings.normal
    - typings.baseui.baseuiStrings.stretch
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end
    - typings.baseui.baseuiStrings.`flex-start`
    - typings.baseui.baseuiStrings.`flex-end`
    - typings.baseui.baseuiStrings.`self-start`
    - typings.baseui.baseuiStrings.`self-end`
    - typings.baseui.baseuiStrings.left
    - typings.baseui.baseuiStrings.right
    - typings.baseui.baseuiStrings.baseline
    - typings.baseui.baseuiStrings.`first baseline`
    - typings.baseui.baseuiStrings.`last baseline`
    - typings.baseui.baseuiStrings.`safe center`
    - typings.baseui.baseuiStrings.`unsafe center`
    - typings.baseui.baseuiStrings.`legacy right`
    - typings.baseui.baseuiStrings.`legacy left`
    - typings.baseui.baseuiStrings.`legacy center`
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait JustifyItems extends StObject
  object JustifyItems {
    
    @scala.inline
    def auto: typings.baseui.baseuiStrings.auto = "auto".asInstanceOf[typings.baseui.baseuiStrings.auto]
    
    @scala.inline
    def baseline: typings.baseui.baseuiStrings.baseline = "baseline".asInstanceOf[typings.baseui.baseuiStrings.baseline]
    
    @scala.inline
    def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    @scala.inline
    def end: typings.baseui.baseuiStrings.end = "end".asInstanceOf[typings.baseui.baseuiStrings.end]
    
    @scala.inline
    def `first baseline`: typings.baseui.baseuiStrings.`first baseline` = ("first baseline").asInstanceOf[typings.baseui.baseuiStrings.`first baseline`]
    
    @scala.inline
    def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    @scala.inline
    def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    @scala.inline
    def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    @scala.inline
    def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    @scala.inline
    def `last baseline`: typings.baseui.baseuiStrings.`last baseline` = ("last baseline").asInstanceOf[typings.baseui.baseuiStrings.`last baseline`]
    
    @scala.inline
    def left: typings.baseui.baseuiStrings.left = "left".asInstanceOf[typings.baseui.baseuiStrings.left]
    
    @scala.inline
    def `legacy center`: typings.baseui.baseuiStrings.`legacy center` = ("legacy center").asInstanceOf[typings.baseui.baseuiStrings.`legacy center`]
    
    @scala.inline
    def `legacy left`: typings.baseui.baseuiStrings.`legacy left` = ("legacy left").asInstanceOf[typings.baseui.baseuiStrings.`legacy left`]
    
    @scala.inline
    def `legacy right`: typings.baseui.baseuiStrings.`legacy right` = ("legacy right").asInstanceOf[typings.baseui.baseuiStrings.`legacy right`]
    
    @scala.inline
    def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    @scala.inline
    def right: typings.baseui.baseuiStrings.right = "right".asInstanceOf[typings.baseui.baseuiStrings.right]
    
    @scala.inline
    def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    @scala.inline
    def `self-end`: typings.baseui.baseuiStrings.`self-end` = "self-end".asInstanceOf[typings.baseui.baseuiStrings.`self-end`]
    
    @scala.inline
    def `self-start`: typings.baseui.baseuiStrings.`self-start` = "self-start".asInstanceOf[typings.baseui.baseuiStrings.`self-start`]
    
    @scala.inline
    def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    @scala.inline
    def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    @scala.inline
    def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    @scala.inline
    def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.auto
    - typings.baseui.baseuiStrings.normal
    - typings.baseui.baseuiStrings.stretch
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end
    - typings.baseui.baseuiStrings.`flex-start`
    - typings.baseui.baseuiStrings.`flex-end`
    - typings.baseui.baseuiStrings.`self-start`
    - typings.baseui.baseuiStrings.`self-end`
    - typings.baseui.baseuiStrings.left
    - typings.baseui.baseuiStrings.right
    - typings.baseui.baseuiStrings.baseline
    - typings.baseui.baseuiStrings.`first baseline`
    - typings.baseui.baseuiStrings.`last baseline`
    - typings.baseui.baseuiStrings.`safe center`
    - typings.baseui.baseuiStrings.`unsafe center`
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait JustifySelf extends StObject
  object JustifySelf {
    
    @scala.inline
    def auto: typings.baseui.baseuiStrings.auto = "auto".asInstanceOf[typings.baseui.baseuiStrings.auto]
    
    @scala.inline
    def baseline: typings.baseui.baseuiStrings.baseline = "baseline".asInstanceOf[typings.baseui.baseuiStrings.baseline]
    
    @scala.inline
    def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    @scala.inline
    def end: typings.baseui.baseuiStrings.end = "end".asInstanceOf[typings.baseui.baseuiStrings.end]
    
    @scala.inline
    def `first baseline`: typings.baseui.baseuiStrings.`first baseline` = ("first baseline").asInstanceOf[typings.baseui.baseuiStrings.`first baseline`]
    
    @scala.inline
    def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    @scala.inline
    def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    @scala.inline
    def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    @scala.inline
    def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    @scala.inline
    def `last baseline`: typings.baseui.baseuiStrings.`last baseline` = ("last baseline").asInstanceOf[typings.baseui.baseuiStrings.`last baseline`]
    
    @scala.inline
    def left: typings.baseui.baseuiStrings.left = "left".asInstanceOf[typings.baseui.baseuiStrings.left]
    
    @scala.inline
    def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    @scala.inline
    def right: typings.baseui.baseuiStrings.right = "right".asInstanceOf[typings.baseui.baseuiStrings.right]
    
    @scala.inline
    def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    @scala.inline
    def `self-end`: typings.baseui.baseuiStrings.`self-end` = "self-end".asInstanceOf[typings.baseui.baseuiStrings.`self-end`]
    
    @scala.inline
    def `self-start`: typings.baseui.baseuiStrings.`self-start` = "self-start".asInstanceOf[typings.baseui.baseuiStrings.`self-start`]
    
    @scala.inline
    def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    @scala.inline
    def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    @scala.inline
    def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    @scala.inline
    def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.visible
    - typings.baseui.baseuiStrings.hidden
    - typings.baseui.baseuiStrings.scroll
    - typings.baseui.baseuiStrings.scrollX
    - typings.baseui.baseuiStrings.scrollY
    - typings.baseui.baseuiStrings.auto
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait Overflow extends StObject
  object Overflow {
    
    @scala.inline
    def auto: typings.baseui.baseuiStrings.auto = "auto".asInstanceOf[typings.baseui.baseuiStrings.auto]
    
    @scala.inline
    def hidden: typings.baseui.baseuiStrings.hidden = "hidden".asInstanceOf[typings.baseui.baseuiStrings.hidden]
    
    @scala.inline
    def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    @scala.inline
    def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    @scala.inline
    def scroll: typings.baseui.baseuiStrings.scroll = "scroll".asInstanceOf[typings.baseui.baseuiStrings.scroll]
    
    @scala.inline
    def scrollX: typings.baseui.baseuiStrings.scrollX = "scrollX".asInstanceOf[typings.baseui.baseuiStrings.scrollX]
    
    @scala.inline
    def scrollY: typings.baseui.baseuiStrings.scrollY = "scrollY".asInstanceOf[typings.baseui.baseuiStrings.scrollY]
    
    @scala.inline
    def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
    
    @scala.inline
    def visible: typings.baseui.baseuiStrings.visible = "visible".asInstanceOf[typings.baseui.baseuiStrings.visible]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.static
    - typings.baseui.baseuiStrings.absolute
    - typings.baseui.baseuiStrings.relative
    - typings.baseui.baseuiStrings.fixed
    - typings.baseui.baseuiStrings.sticky
  */
  trait Position extends StObject
  object Position {
    
    @scala.inline
    def absolute: typings.baseui.baseuiStrings.absolute = "absolute".asInstanceOf[typings.baseui.baseuiStrings.absolute]
    
    @scala.inline
    def fixed: typings.baseui.baseuiStrings.fixed = "fixed".asInstanceOf[typings.baseui.baseuiStrings.fixed]
    
    @scala.inline
    def relative: typings.baseui.baseuiStrings.relative = "relative".asInstanceOf[typings.baseui.baseuiStrings.relative]
    
    @scala.inline
    def static: typings.baseui.baseuiStrings.static = "static".asInstanceOf[typings.baseui.baseuiStrings.static]
    
    @scala.inline
    def sticky: typings.baseui.baseuiStrings.sticky = "sticky".asInstanceOf[typings.baseui.baseuiStrings.sticky]
  }
  
  type Responsive[T] = T | js.Array[T]
  
  type Scale = `0` | String
}
