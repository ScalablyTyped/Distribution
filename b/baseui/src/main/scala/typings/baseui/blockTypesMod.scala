package typings.baseui

import typings.baseui.anon.ClassName
import typings.baseui.anon.RefAny
import typings.baseui.anon.`2`
import typings.baseui.baseuiInts.`0`
import typings.baseui.baseuiStrings.$style
import typings.baseui.baseuiStrings.className
import typings.baseui.baseuiStrings.end_
import typings.baseui.overridesMod.Override
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockTypesMod {
  
  type AddStyletronRef[P /* <: RefAny */] = P | (P & `2`)
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end_
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
    
    inline def baseline: typings.baseui.baseuiStrings.baseline = "baseline".asInstanceOf[typings.baseui.baseuiStrings.baseline]
    
    inline def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    inline def end: end_ = "end".asInstanceOf[end_]
    
    inline def `first baseline`: typings.baseui.baseuiStrings.`first baseline` = ("first baseline").asInstanceOf[typings.baseui.baseuiStrings.`first baseline`]
    
    inline def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    inline def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def `last baseline`: typings.baseui.baseuiStrings.`last baseline` = ("last baseline").asInstanceOf[typings.baseui.baseuiStrings.`last baseline`]
    
    inline def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    inline def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    inline def `space-around`: typings.baseui.baseuiStrings.`space-around` = "space-around".asInstanceOf[typings.baseui.baseuiStrings.`space-around`]
    
    inline def `space-between`: typings.baseui.baseuiStrings.`space-between` = "space-between".asInstanceOf[typings.baseui.baseuiStrings.`space-between`]
    
    inline def `space-evenly`: typings.baseui.baseuiStrings.`space-evenly` = "space-evenly".asInstanceOf[typings.baseui.baseuiStrings.`space-evenly`]
    
    inline def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    inline def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    inline def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.normal
    - typings.baseui.baseuiStrings.stretch
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end_
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
    
    inline def baseline: typings.baseui.baseuiStrings.baseline = "baseline".asInstanceOf[typings.baseui.baseuiStrings.baseline]
    
    inline def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    inline def end: end_ = "end".asInstanceOf[end_]
    
    inline def `first baseline`: typings.baseui.baseuiStrings.`first baseline` = ("first baseline").asInstanceOf[typings.baseui.baseuiStrings.`first baseline`]
    
    inline def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    inline def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def `last baseline`: typings.baseui.baseuiStrings.`last baseline` = ("last baseline").asInstanceOf[typings.baseui.baseuiStrings.`last baseline`]
    
    inline def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    inline def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    inline def `self-end`: typings.baseui.baseuiStrings.`self-end` = "self-end".asInstanceOf[typings.baseui.baseuiStrings.`self-end`]
    
    inline def `self-start`: typings.baseui.baseuiStrings.`self-start` = "self-start".asInstanceOf[typings.baseui.baseuiStrings.`self-start`]
    
    inline def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    inline def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    inline def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.auto
    - typings.baseui.baseuiStrings.normal
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end_
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
    
    inline def auto: typings.baseui.baseuiStrings.auto = "auto".asInstanceOf[typings.baseui.baseuiStrings.auto]
    
    inline def baseline: typings.baseui.baseuiStrings.baseline = "baseline".asInstanceOf[typings.baseui.baseuiStrings.baseline]
    
    inline def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    inline def end: end_ = "end".asInstanceOf[end_]
    
    inline def `first baseline`: typings.baseui.baseuiStrings.`first baseline` = ("first baseline").asInstanceOf[typings.baseui.baseuiStrings.`first baseline`]
    
    inline def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    inline def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def `last baseline`: typings.baseui.baseuiStrings.`last baseline` = ("last baseline").asInstanceOf[typings.baseui.baseuiStrings.`last baseline`]
    
    inline def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    inline def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    inline def `self-end`: typings.baseui.baseuiStrings.`self-end` = "self-end".asInstanceOf[typings.baseui.baseuiStrings.`self-end`]
    
    inline def `self-start`: typings.baseui.baseuiStrings.`self-start` = "self-start".asInstanceOf[typings.baseui.baseuiStrings.`self-start`]
    
    inline def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    inline def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    inline def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  type BaseProps[P /* <: js.Object */] = P & ClassName[P]
  
  @js.native
  trait BlockComponentType[D /* <: ElementType[Any] */] extends StObject {
    
    def apply[C /* <: ElementType[Any] */](props: OverrideProps[C, BlockProps[C]]): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  trait BlockOverrides extends StObject {
    
    var Block: js.UndefOr[Override[Any]] = js.undefined
  }
  object BlockOverrides {
    
    inline def apply(): BlockOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockOverrides]
    }
    
    extension [Self <: BlockOverrides](x: Self) {
      
      inline def setBlock(value: Override[Any]): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "Block", js.undefined)
    }
  }
  
  trait BlockProps[T /* <: ElementType[Any] */] extends StObject {
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-content */
    var alignContent: js.UndefOr[Responsive[AlignContent]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-items */
    var alignItems: js.UndefOr[Responsive[AlignItems]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/align-self */
    var alignSelf: js.UndefOr[Responsive[AlignSelf]] = js.undefined
    
    /** Modifies the base element used to render the block. */
    var as: js.UndefOr[T] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/background-attachment */
    var backgroundAttachment: js.UndefOr[Responsive[String]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/background-clip */
    var backgroundClip: js.UndefOr[Responsive[String]] = js.undefined
    
    /** Accepts all themeable color properties (`primary200`, etc.). */
    var backgroundColor: js.UndefOr[Responsive[String]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/background-image */
    var backgroundImage: js.UndefOr[Responsive[String]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/background-origin */
    var backgroundOrigin: js.UndefOr[Responsive[String]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/background-position */
    var backgroundPosition: js.UndefOr[Responsive[String]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat */
    var backgroundRepeat: js.UndefOr[Responsive[String]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/background-size */
    var backgroundSize: js.UndefOr[Responsive[String]] = js.undefined
    
    var bottom: js.UndefOr[Responsive[Scale]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Accepts all themeable color properties (`primary200`, etc.). */
    var color: js.UndefOr[Responsive[String]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/display */
    var display: js.UndefOr[Responsive[Display]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/flex */
    var flex: js.UndefOr[Responsive[Flex]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction */
    var flexDirection: js.UndefOr[Responsive[FlexDirection]] = js.undefined
    
    var flexWrap: js.UndefOr[Responsive[Boolean]] = js.undefined
    
    /** Accepts all themeable font properties (`font200`, etc.). */
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
    
    var right: js.UndefOr[Responsive[Scale]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/text-overflow */
    var textOverflow: js.UndefOr[Responsive[String]] = js.undefined
    
    var top: js.UndefOr[Responsive[Scale]] = js.undefined
    
    /** available values: https://developer.mozilla.org/en-US/docs/Web/CSS/white-space */
    var whiteSpace: js.UndefOr[Responsive[WhiteSpace]] = js.undefined
    
    var width: js.UndefOr[Responsive[Scale]] = js.undefined
  }
  object BlockProps {
    
    inline def apply[T /* <: ElementType[Any] */](): BlockProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockProps[T]]
    }
    
    extension [Self <: BlockProps[?], T /* <: ElementType[Any] */](x: Self & BlockProps[T]) {
      
      inline def setAlignContent(value: Responsive[AlignContent]): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignContentVarargs(value: AlignContent*): Self = StObject.set(x, "alignContent", js.Array(value*))
      
      inline def setAlignItems(value: Responsive[AlignItems]): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignItemsVarargs(value: AlignItems*): Self = StObject.set(x, "alignItems", js.Array(value*))
      
      inline def setAlignSelf(value: Responsive[AlignSelf]): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignSelfVarargs(value: AlignSelf*): Self = StObject.set(x, "alignSelf", js.Array(value*))
      
      inline def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBackgroundAttachment(value: Responsive[String]): Self = StObject.set(x, "backgroundAttachment", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAttachmentUndefined: Self = StObject.set(x, "backgroundAttachment", js.undefined)
      
      inline def setBackgroundAttachmentVarargs(value: String*): Self = StObject.set(x, "backgroundAttachment", js.Array(value*))
      
      inline def setBackgroundClip(value: Responsive[String]): Self = StObject.set(x, "backgroundClip", value.asInstanceOf[js.Any])
      
      inline def setBackgroundClipUndefined: Self = StObject.set(x, "backgroundClip", js.undefined)
      
      inline def setBackgroundClipVarargs(value: String*): Self = StObject.set(x, "backgroundClip", js.Array(value*))
      
      inline def setBackgroundColor(value: Responsive[String]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundColorVarargs(value: String*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
      
      inline def setBackgroundImage(value: Responsive[String]): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundImageVarargs(value: String*): Self = StObject.set(x, "backgroundImage", js.Array(value*))
      
      inline def setBackgroundOrigin(value: Responsive[String]): Self = StObject.set(x, "backgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOriginUndefined: Self = StObject.set(x, "backgroundOrigin", js.undefined)
      
      inline def setBackgroundOriginVarargs(value: String*): Self = StObject.set(x, "backgroundOrigin", js.Array(value*))
      
      inline def setBackgroundPosition(value: Responsive[String]): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      inline def setBackgroundPositionVarargs(value: String*): Self = StObject.set(x, "backgroundPosition", js.Array(value*))
      
      inline def setBackgroundRepeat(value: Responsive[String]): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setBackgroundRepeatVarargs(value: String*): Self = StObject.set(x, "backgroundRepeat", js.Array(value*))
      
      inline def setBackgroundSize(value: Responsive[String]): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      inline def setBackgroundSizeVarargs(value: String*): Self = StObject.set(x, "backgroundSize", js.Array(value*))
      
      inline def setBottom(value: Responsive[Scale]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setBottomVarargs(value: Scale*): Self = StObject.set(x, "bottom", js.Array(value*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: Responsive[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setDisplay(value: Responsive[Display]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDisplayVarargs(value: Display*): Self = StObject.set(x, "display", js.Array(value*))
      
      inline def setFlex(value: Responsive[Flex]): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexDirection(value: Responsive[FlexDirection]): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexDirectionVarargs(value: FlexDirection*): Self = StObject.set(x, "flexDirection", js.Array(value*))
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexVarargs(value: Flex*): Self = StObject.set(x, "flex", js.Array(value*))
      
      inline def setFlexWrap(value: Responsive[Boolean]): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setFlexWrapVarargs(value: Boolean*): Self = StObject.set(x, "flexWrap", js.Array(value*))
      
      inline def setFont(value: String | js.Array[String]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontVarargs(value: String*): Self = StObject.set(x, "font", js.Array(value*))
      
      inline def setGrid(value: Responsive[String]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridArea(value: Responsive[String]): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGridAreaVarargs(value: String*): Self = StObject.set(x, "gridArea", js.Array(value*))
      
      inline def setGridAutoColumns(value: Responsive[String]): Self = StObject.set(x, "gridAutoColumns", value.asInstanceOf[js.Any])
      
      inline def setGridAutoColumnsUndefined: Self = StObject.set(x, "gridAutoColumns", js.undefined)
      
      inline def setGridAutoColumnsVarargs(value: String*): Self = StObject.set(x, "gridAutoColumns", js.Array(value*))
      
      inline def setGridAutoFlow(value: Responsive[GridAutoFlow]): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
      
      inline def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
      
      inline def setGridAutoFlowVarargs(value: GridAutoFlow*): Self = StObject.set(x, "gridAutoFlow", js.Array(value*))
      
      inline def setGridAutoRows(value: Responsive[String]): Self = StObject.set(x, "gridAutoRows", value.asInstanceOf[js.Any])
      
      inline def setGridAutoRowsUndefined: Self = StObject.set(x, "gridAutoRows", js.undefined)
      
      inline def setGridAutoRowsVarargs(value: String*): Self = StObject.set(x, "gridAutoRows", js.Array(value*))
      
      inline def setGridColumn(value: Responsive[String]): Self = StObject.set(x, "gridColumn", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEnd(value: Responsive[String]): Self = StObject.set(x, "gridColumnEnd", value.asInstanceOf[js.Any])
      
      inline def setGridColumnEndUndefined: Self = StObject.set(x, "gridColumnEnd", js.undefined)
      
      inline def setGridColumnEndVarargs(value: String*): Self = StObject.set(x, "gridColumnEnd", js.Array(value*))
      
      inline def setGridColumnGap(value: Responsive[Scale]): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      inline def setGridColumnGapVarargs(value: Scale*): Self = StObject.set(x, "gridColumnGap", js.Array(value*))
      
      inline def setGridColumnStart(value: Responsive[String]): Self = StObject.set(x, "gridColumnStart", value.asInstanceOf[js.Any])
      
      inline def setGridColumnStartUndefined: Self = StObject.set(x, "gridColumnStart", js.undefined)
      
      inline def setGridColumnStartVarargs(value: String*): Self = StObject.set(x, "gridColumnStart", js.Array(value*))
      
      inline def setGridColumnUndefined: Self = StObject.set(x, "gridColumn", js.undefined)
      
      inline def setGridColumnVarargs(value: String*): Self = StObject.set(x, "gridColumn", js.Array(value*))
      
      inline def setGridGap(value: Responsive[Scale]): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      inline def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      inline def setGridGapVarargs(value: Scale*): Self = StObject.set(x, "gridGap", js.Array(value*))
      
      inline def setGridRow(value: Responsive[String]): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
      
      inline def setGridRowEnd(value: Responsive[String]): Self = StObject.set(x, "gridRowEnd", value.asInstanceOf[js.Any])
      
      inline def setGridRowEndUndefined: Self = StObject.set(x, "gridRowEnd", js.undefined)
      
      inline def setGridRowEndVarargs(value: String*): Self = StObject.set(x, "gridRowEnd", js.Array(value*))
      
      inline def setGridRowGap(value: Responsive[Scale]): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      inline def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      inline def setGridRowGapVarargs(value: Scale*): Self = StObject.set(x, "gridRowGap", js.Array(value*))
      
      inline def setGridRowStart(value: Responsive[String]): Self = StObject.set(x, "gridRowStart", value.asInstanceOf[js.Any])
      
      inline def setGridRowStartUndefined: Self = StObject.set(x, "gridRowStart", js.undefined)
      
      inline def setGridRowStartVarargs(value: String*): Self = StObject.set(x, "gridRowStart", js.Array(value*))
      
      inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
      
      inline def setGridRowVarargs(value: String*): Self = StObject.set(x, "gridRow", js.Array(value*))
      
      inline def setGridTemplate(value: Responsive[String]): Self = StObject.set(x, "gridTemplate", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateAreas(value: Responsive[String]): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
      
      inline def setGridTemplateAreasVarargs(value: String*): Self = StObject.set(x, "gridTemplateAreas", js.Array(value*))
      
      inline def setGridTemplateColumns(value: Responsive[String]): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
      
      inline def setGridTemplateColumnsVarargs(value: String*): Self = StObject.set(x, "gridTemplateColumns", js.Array(value*))
      
      inline def setGridTemplateRows(value: Responsive[String]): Self = StObject.set(x, "gridTemplateRows", value.asInstanceOf[js.Any])
      
      inline def setGridTemplateRowsUndefined: Self = StObject.set(x, "gridTemplateRows", js.undefined)
      
      inline def setGridTemplateRowsVarargs(value: String*): Self = StObject.set(x, "gridTemplateRows", js.Array(value*))
      
      inline def setGridTemplateUndefined: Self = StObject.set(x, "gridTemplate", js.undefined)
      
      inline def setGridTemplateVarargs(value: String*): Self = StObject.set(x, "gridTemplate", js.Array(value*))
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setGridVarargs(value: String*): Self = StObject.set(x, "grid", js.Array(value*))
      
      inline def setHeight(value: Responsive[Scale]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightVarargs(value: Scale*): Self = StObject.set(x, "height", js.Array(value*))
      
      inline def setJustifyContent(value: Responsive[JustifyContent]): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setJustifyContentVarargs(value: JustifyContent*): Self = StObject.set(x, "justifyContent", js.Array(value*))
      
      inline def setJustifyItems(value: Responsive[JustifyItems]): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      inline def setJustifyItemsVarargs(value: JustifyItems*): Self = StObject.set(x, "justifyItems", js.Array(value*))
      
      inline def setJustifySelf(value: Responsive[JustifySelf]): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
      
      inline def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
      
      inline def setJustifySelfVarargs(value: JustifySelf*): Self = StObject.set(x, "justifySelf", js.Array(value*))
      
      inline def setLeft(value: Responsive[Scale]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: Scale*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setMargin(value: Responsive[Scale]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: Responsive[Scale]): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginBottomVarargs(value: Scale*): Self = StObject.set(x, "marginBottom", js.Array(value*))
      
      inline def setMarginLeft(value: Responsive[Scale]): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginLeftVarargs(value: Scale*): Self = StObject.set(x, "marginLeft", js.Array(value*))
      
      inline def setMarginRight(value: Responsive[Scale]): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginRightVarargs(value: Scale*): Self = StObject.set(x, "marginRight", js.Array(value*))
      
      inline def setMarginTop(value: Responsive[Scale]): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginTopVarargs(value: Scale*): Self = StObject.set(x, "marginTop", js.Array(value*))
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginVarargs(value: Scale*): Self = StObject.set(x, "margin", js.Array(value*))
      
      inline def setMaxHeight(value: Responsive[Scale]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxHeightVarargs(value: Scale*): Self = StObject.set(x, "maxHeight", js.Array(value*))
      
      inline def setMaxWidth(value: Responsive[Scale]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMaxWidthVarargs(value: Scale*): Self = StObject.set(x, "maxWidth", js.Array(value*))
      
      inline def setMinHeight(value: Responsive[Scale]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinHeightVarargs(value: Scale*): Self = StObject.set(x, "minHeight", js.Array(value*))
      
      inline def setMinWidth(value: Responsive[Scale]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMinWidthVarargs(value: Scale*): Self = StObject.set(x, "minWidth", js.Array(value*))
      
      inline def setOverflow(value: Responsive[Overflow]): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowVarargs(value: Overflow*): Self = StObject.set(x, "overflow", js.Array(value*))
      
      inline def setOverrides(value: BlockOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPadding(value: Responsive[Scale]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: Responsive[Scale]): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingBottomVarargs(value: Scale*): Self = StObject.set(x, "paddingBottom", js.Array(value*))
      
      inline def setPaddingLeft(value: Responsive[Scale]): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingLeftVarargs(value: Scale*): Self = StObject.set(x, "paddingLeft", js.Array(value*))
      
      inline def setPaddingRight(value: Responsive[Scale]): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingRightVarargs(value: Scale*): Self = StObject.set(x, "paddingRight", js.Array(value*))
      
      inline def setPaddingTop(value: Responsive[Scale]): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingTopVarargs(value: Scale*): Self = StObject.set(x, "paddingTop", js.Array(value*))
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Scale*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPlaceContent(value: Responsive[String]): Self = StObject.set(x, "placeContent", value.asInstanceOf[js.Any])
      
      inline def setPlaceContentUndefined: Self = StObject.set(x, "placeContent", js.undefined)
      
      inline def setPlaceContentVarargs(value: String*): Self = StObject.set(x, "placeContent", js.Array(value*))
      
      inline def setPlaceItems(value: Responsive[String]): Self = StObject.set(x, "placeItems", value.asInstanceOf[js.Any])
      
      inline def setPlaceItemsUndefined: Self = StObject.set(x, "placeItems", js.undefined)
      
      inline def setPlaceItemsVarargs(value: String*): Self = StObject.set(x, "placeItems", js.Array(value*))
      
      inline def setPlaceSelf(value: Responsive[String]): Self = StObject.set(x, "placeSelf", value.asInstanceOf[js.Any])
      
      inline def setPlaceSelfUndefined: Self = StObject.set(x, "placeSelf", js.undefined)
      
      inline def setPlaceSelfVarargs(value: String*): Self = StObject.set(x, "placeSelf", js.Array(value*))
      
      inline def setPosition(value: Responsive[Position]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPositionVarargs(value: Position*): Self = StObject.set(x, "position", js.Array(value*))
      
      inline def setRight(value: Responsive[Scale]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: Scale*): Self = StObject.set(x, "right", js.Array(value*))
      
      inline def setTextOverflow(value: Responsive[String]): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextOverflowVarargs(value: String*): Self = StObject.set(x, "textOverflow", js.Array(value*))
      
      inline def setTop(value: Responsive[Scale]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setTopVarargs(value: Scale*): Self = StObject.set(x, "top", js.Array(value*))
      
      inline def setWhiteSpace(value: Responsive[WhiteSpace]): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
      
      inline def setWhiteSpaceVarargs(value: WhiteSpace*): Self = StObject.set(x, "whiteSpace", js.Array(value*))
      
      inline def setWidth(value: Responsive[Scale]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(value: Scale*): Self = StObject.set(x, "width", js.Array(value*))
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
    
    inline def block: typings.baseui.baseuiStrings.block = "block".asInstanceOf[typings.baseui.baseuiStrings.block]
    
    inline def `block flow`: typings.baseui.baseuiStrings.`block flow` = ("block flow").asInstanceOf[typings.baseui.baseuiStrings.`block flow`]
    
    inline def contents: typings.baseui.baseuiStrings.contents = "contents".asInstanceOf[typings.baseui.baseuiStrings.contents]
    
    inline def flex: typings.baseui.baseuiStrings.flex = "flex".asInstanceOf[typings.baseui.baseuiStrings.flex]
    
    inline def `flex run-in`: typings.baseui.baseuiStrings.`flex run-in` = ("flex run-in").asInstanceOf[typings.baseui.baseuiStrings.`flex run-in`]
    
    inline def flow: typings.baseui.baseuiStrings.flow = "flow".asInstanceOf[typings.baseui.baseuiStrings.flow]
    
    inline def `flow list-item block`: typings.baseui.baseuiStrings.`flow list-item block` = ("flow list-item block").asInstanceOf[typings.baseui.baseuiStrings.`flow list-item block`]
    
    inline def `flow-root`: typings.baseui.baseuiStrings.`flow-root` = "flow-root".asInstanceOf[typings.baseui.baseuiStrings.`flow-root`]
    
    inline def grid: typings.baseui.baseuiStrings.grid = "grid".asInstanceOf[typings.baseui.baseuiStrings.grid]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def `inline`: typings.baseui.baseuiStrings.`inline` = "inline".asInstanceOf[typings.baseui.baseuiStrings.`inline`]
    
    inline def `inline table`: typings.baseui.baseuiStrings.`inline table` = ("inline table").asInstanceOf[typings.baseui.baseuiStrings.`inline table`]
    
    inline def `inline-block`: typings.baseui.baseuiStrings.`inline-block` = "inline-block".asInstanceOf[typings.baseui.baseuiStrings.`inline-block`]
    
    inline def `inline-flex`: typings.baseui.baseuiStrings.`inline-flex` = "inline-flex".asInstanceOf[typings.baseui.baseuiStrings.`inline-flex`]
    
    inline def `inline-grid`: typings.baseui.baseuiStrings.`inline-grid` = "inline-grid".asInstanceOf[typings.baseui.baseuiStrings.`inline-grid`]
    
    inline def `inline-table`: typings.baseui.baseuiStrings.`inline-table` = "inline-table".asInstanceOf[typings.baseui.baseuiStrings.`inline-table`]
    
    inline def `list-item`: typings.baseui.baseuiStrings.`list-item` = "list-item".asInstanceOf[typings.baseui.baseuiStrings.`list-item`]
    
    inline def `list-item block`: typings.baseui.baseuiStrings.`list-item block` = ("list-item block").asInstanceOf[typings.baseui.baseuiStrings.`list-item block`]
    
    inline def `list-item block flow`: typings.baseui.baseuiStrings.`list-item block flow` = ("list-item block flow").asInstanceOf[typings.baseui.baseuiStrings.`list-item block flow`]
    
    inline def `list-item block flow-root`: typings.baseui.baseuiStrings.`list-item block flow-root` = ("list-item block flow-root").asInstanceOf[typings.baseui.baseuiStrings.`list-item block flow-root`]
    
    inline def `list-item flow`: typings.baseui.baseuiStrings.`list-item flow` = ("list-item flow").asInstanceOf[typings.baseui.baseuiStrings.`list-item flow`]
    
    inline def `list-item flow-root`: typings.baseui.baseuiStrings.`list-item flow-root` = ("list-item flow-root").asInstanceOf[typings.baseui.baseuiStrings.`list-item flow-root`]
    
    inline def `list-item inline`: typings.baseui.baseuiStrings.`list-item inline` = ("list-item inline").asInstanceOf[typings.baseui.baseuiStrings.`list-item inline`]
    
    inline def none: typings.baseui.baseuiStrings.none = "none".asInstanceOf[typings.baseui.baseuiStrings.none]
    
    inline def ruby: typings.baseui.baseuiStrings.ruby = "ruby".asInstanceOf[typings.baseui.baseuiStrings.ruby]
    
    inline def `ruby-base`: typings.baseui.baseuiStrings.`ruby-base` = "ruby-base".asInstanceOf[typings.baseui.baseuiStrings.`ruby-base`]
    
    inline def `ruby-base-container`: typings.baseui.baseuiStrings.`ruby-base-container` = "ruby-base-container".asInstanceOf[typings.baseui.baseuiStrings.`ruby-base-container`]
    
    inline def `ruby-text`: typings.baseui.baseuiStrings.`ruby-text` = "ruby-text".asInstanceOf[typings.baseui.baseuiStrings.`ruby-text`]
    
    inline def `ruby-text-container`: typings.baseui.baseuiStrings.`ruby-text-container` = "ruby-text-container".asInstanceOf[typings.baseui.baseuiStrings.`ruby-text-container`]
    
    inline def `run-in`: typings.baseui.baseuiStrings.`run-in` = "run-in".asInstanceOf[typings.baseui.baseuiStrings.`run-in`]
    
    inline def table: typings.baseui.baseuiStrings.table = "table".asInstanceOf[typings.baseui.baseuiStrings.table]
    
    inline def `table-caption`: typings.baseui.baseuiStrings.`table-caption` = "table-caption".asInstanceOf[typings.baseui.baseuiStrings.`table-caption`]
    
    inline def `table-cell`: typings.baseui.baseuiStrings.`table-cell` = "table-cell".asInstanceOf[typings.baseui.baseuiStrings.`table-cell`]
    
    inline def `table-column`: typings.baseui.baseuiStrings.`table-column` = "table-column".asInstanceOf[typings.baseui.baseuiStrings.`table-column`]
    
    inline def `table-column-group`: typings.baseui.baseuiStrings.`table-column-group` = "table-column-group".asInstanceOf[typings.baseui.baseuiStrings.`table-column-group`]
    
    inline def `table-footer-group`: typings.baseui.baseuiStrings.`table-footer-group` = "table-footer-group".asInstanceOf[typings.baseui.baseuiStrings.`table-footer-group`]
    
    inline def `table-header-group`: typings.baseui.baseuiStrings.`table-header-group` = "table-header-group".asInstanceOf[typings.baseui.baseuiStrings.`table-header-group`]
    
    inline def `table-row`: typings.baseui.baseuiStrings.`table-row` = "table-row".asInstanceOf[typings.baseui.baseuiStrings.`table-row`]
    
    inline def `table-row-group`: typings.baseui.baseuiStrings.`table-row-group` = "table-row-group".asInstanceOf[typings.baseui.baseuiStrings.`table-row-group`]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
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
    
    inline def column: typings.baseui.baseuiStrings.column = "column".asInstanceOf[typings.baseui.baseuiStrings.column]
    
    inline def `column-reverse`: typings.baseui.baseuiStrings.`column-reverse` = "column-reverse".asInstanceOf[typings.baseui.baseuiStrings.`column-reverse`]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def row: typings.baseui.baseuiStrings.row = "row".asInstanceOf[typings.baseui.baseuiStrings.row]
    
    inline def `row-reverse`: typings.baseui.baseuiStrings.`row-reverse` = "row-reverse".asInstanceOf[typings.baseui.baseuiStrings.`row-reverse`]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
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
    
    inline def column: typings.baseui.baseuiStrings.column = "column".asInstanceOf[typings.baseui.baseuiStrings.column]
    
    inline def `column dense`: typings.baseui.baseuiStrings.`column dense` = ("column dense").asInstanceOf[typings.baseui.baseuiStrings.`column dense`]
    
    inline def dense: typings.baseui.baseuiStrings.dense = "dense".asInstanceOf[typings.baseui.baseuiStrings.dense]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def row: typings.baseui.baseuiStrings.row = "row".asInstanceOf[typings.baseui.baseuiStrings.row]
    
    inline def `row dense`: typings.baseui.baseuiStrings.`row dense` = ("row dense").asInstanceOf[typings.baseui.baseuiStrings.`row dense`]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end_
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
    
    inline def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    inline def end: end_ = "end".asInstanceOf[end_]
    
    inline def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    inline def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def left: typings.baseui.baseuiStrings.left = "left".asInstanceOf[typings.baseui.baseuiStrings.left]
    
    inline def right: typings.baseui.baseuiStrings.right = "right".asInstanceOf[typings.baseui.baseuiStrings.right]
    
    inline def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    inline def `space-around`: typings.baseui.baseuiStrings.`space-around` = "space-around".asInstanceOf[typings.baseui.baseuiStrings.`space-around`]
    
    inline def `space-between`: typings.baseui.baseuiStrings.`space-between` = "space-between".asInstanceOf[typings.baseui.baseuiStrings.`space-between`]
    
    inline def `space-evenly`: typings.baseui.baseuiStrings.`space-evenly` = "space-evenly".asInstanceOf[typings.baseui.baseuiStrings.`space-evenly`]
    
    inline def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    inline def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    inline def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.auto
    - typings.baseui.baseuiStrings.normal
    - typings.baseui.baseuiStrings.stretch
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end_
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
    
    inline def auto: typings.baseui.baseuiStrings.auto = "auto".asInstanceOf[typings.baseui.baseuiStrings.auto]
    
    inline def baseline: typings.baseui.baseuiStrings.baseline = "baseline".asInstanceOf[typings.baseui.baseuiStrings.baseline]
    
    inline def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    inline def end: end_ = "end".asInstanceOf[end_]
    
    inline def `first baseline`: typings.baseui.baseuiStrings.`first baseline` = ("first baseline").asInstanceOf[typings.baseui.baseuiStrings.`first baseline`]
    
    inline def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    inline def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def `last baseline`: typings.baseui.baseuiStrings.`last baseline` = ("last baseline").asInstanceOf[typings.baseui.baseuiStrings.`last baseline`]
    
    inline def left: typings.baseui.baseuiStrings.left = "left".asInstanceOf[typings.baseui.baseuiStrings.left]
    
    inline def `legacy center`: typings.baseui.baseuiStrings.`legacy center` = ("legacy center").asInstanceOf[typings.baseui.baseuiStrings.`legacy center`]
    
    inline def `legacy left`: typings.baseui.baseuiStrings.`legacy left` = ("legacy left").asInstanceOf[typings.baseui.baseuiStrings.`legacy left`]
    
    inline def `legacy right`: typings.baseui.baseuiStrings.`legacy right` = ("legacy right").asInstanceOf[typings.baseui.baseuiStrings.`legacy right`]
    
    inline def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    inline def right: typings.baseui.baseuiStrings.right = "right".asInstanceOf[typings.baseui.baseuiStrings.right]
    
    inline def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    inline def `self-end`: typings.baseui.baseuiStrings.`self-end` = "self-end".asInstanceOf[typings.baseui.baseuiStrings.`self-end`]
    
    inline def `self-start`: typings.baseui.baseuiStrings.`self-start` = "self-start".asInstanceOf[typings.baseui.baseuiStrings.`self-start`]
    
    inline def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    inline def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    inline def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.auto
    - typings.baseui.baseuiStrings.normal
    - typings.baseui.baseuiStrings.stretch
    - typings.baseui.baseuiStrings.center
    - typings.baseui.baseuiStrings.start
    - typings.baseui.baseuiStrings.end_
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
    
    inline def auto: typings.baseui.baseuiStrings.auto = "auto".asInstanceOf[typings.baseui.baseuiStrings.auto]
    
    inline def baseline: typings.baseui.baseuiStrings.baseline = "baseline".asInstanceOf[typings.baseui.baseuiStrings.baseline]
    
    inline def center: typings.baseui.baseuiStrings.center = "center".asInstanceOf[typings.baseui.baseuiStrings.center]
    
    inline def end: end_ = "end".asInstanceOf[end_]
    
    inline def `first baseline`: typings.baseui.baseuiStrings.`first baseline` = ("first baseline").asInstanceOf[typings.baseui.baseuiStrings.`first baseline`]
    
    inline def `flex-end`: typings.baseui.baseuiStrings.`flex-end` = "flex-end".asInstanceOf[typings.baseui.baseuiStrings.`flex-end`]
    
    inline def `flex-start`: typings.baseui.baseuiStrings.`flex-start` = "flex-start".asInstanceOf[typings.baseui.baseuiStrings.`flex-start`]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def `last baseline`: typings.baseui.baseuiStrings.`last baseline` = ("last baseline").asInstanceOf[typings.baseui.baseuiStrings.`last baseline`]
    
    inline def left: typings.baseui.baseuiStrings.left = "left".asInstanceOf[typings.baseui.baseuiStrings.left]
    
    inline def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    inline def right: typings.baseui.baseuiStrings.right = "right".asInstanceOf[typings.baseui.baseuiStrings.right]
    
    inline def `safe center`: typings.baseui.baseuiStrings.`safe center` = ("safe center").asInstanceOf[typings.baseui.baseuiStrings.`safe center`]
    
    inline def `self-end`: typings.baseui.baseuiStrings.`self-end` = "self-end".asInstanceOf[typings.baseui.baseuiStrings.`self-end`]
    
    inline def `self-start`: typings.baseui.baseuiStrings.`self-start` = "self-start".asInstanceOf[typings.baseui.baseuiStrings.`self-start`]
    
    inline def start: typings.baseui.baseuiStrings.start = "start".asInstanceOf[typings.baseui.baseuiStrings.start]
    
    inline def stretch: typings.baseui.baseuiStrings.stretch = "stretch".asInstanceOf[typings.baseui.baseuiStrings.stretch]
    
    inline def `unsafe center`: typings.baseui.baseuiStrings.`unsafe center` = ("unsafe center").asInstanceOf[typings.baseui.baseuiStrings.`unsafe center`]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
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
    
    inline def auto: typings.baseui.baseuiStrings.auto = "auto".asInstanceOf[typings.baseui.baseuiStrings.auto]
    
    inline def hidden: typings.baseui.baseuiStrings.hidden = "hidden".asInstanceOf[typings.baseui.baseuiStrings.hidden]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def scroll: typings.baseui.baseuiStrings.scroll = "scroll".asInstanceOf[typings.baseui.baseuiStrings.scroll]
    
    inline def scrollX: typings.baseui.baseuiStrings.scrollX = "scrollX".asInstanceOf[typings.baseui.baseuiStrings.scrollX]
    
    inline def scrollY: typings.baseui.baseuiStrings.scrollY = "scrollY".asInstanceOf[typings.baseui.baseuiStrings.scrollY]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
    
    inline def visible: typings.baseui.baseuiStrings.visible = "visible".asInstanceOf[typings.baseui.baseuiStrings.visible]
  }
  
  type OverrideProps[D /* <: ElementType[Any] */, P /* <: js.Object */] = BaseProps[P] & (Omit[
    AddStyletronRef[ComponentProps[D]], 
    /* keyof baseui.baseui/block/types.BaseProps<P> */ $style | className
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.static
    - typings.baseui.baseuiStrings.absolute
    - typings.baseui.baseuiStrings.relative
    - typings.baseui.baseuiStrings.fixed
    - typings.baseui.baseuiStrings.sticky
  */
  trait Position extends StObject
  object Position {
    
    inline def absolute: typings.baseui.baseuiStrings.absolute = "absolute".asInstanceOf[typings.baseui.baseuiStrings.absolute]
    
    inline def fixed: typings.baseui.baseuiStrings.fixed = "fixed".asInstanceOf[typings.baseui.baseuiStrings.fixed]
    
    inline def relative: typings.baseui.baseuiStrings.relative = "relative".asInstanceOf[typings.baseui.baseuiStrings.relative]
    
    inline def static: typings.baseui.baseuiStrings.static = "static".asInstanceOf[typings.baseui.baseuiStrings.static]
    
    inline def sticky: typings.baseui.baseuiStrings.sticky = "sticky".asInstanceOf[typings.baseui.baseuiStrings.sticky]
  }
  
  type Responsive[T] = T | js.Array[T]
  
  type Scale = `0` | String
  
  trait StyledBlockProps extends StObject {
    
    @JSName("$alignContent")
    var $alignContent: js.UndefOr[Responsive[AlignContent]] = js.undefined
    
    @JSName("$alignItems")
    var $alignItems: js.UndefOr[Responsive[AlignItems]] = js.undefined
    
    @JSName("$alignSelf")
    var $alignSelf: js.UndefOr[Responsive[AlignSelf]] = js.undefined
    
    @JSName("$backgroundAttachment")
    var $backgroundAttachment: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$backgroundClip")
    var $backgroundClip: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$backgroundColor")
    var $backgroundColor: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$backgroundImage")
    var $backgroundImage: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$backgroundOrigin")
    var $backgroundOrigin: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$backgroundPosition")
    var $backgroundPosition: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$backgroundRepeat")
    var $backgroundRepeat: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$backgroundSize")
    var $backgroundSize: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$bottom")
    var $bottom: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$color")
    var $color: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$display")
    var $display: js.UndefOr[Responsive[Display]] = js.undefined
    
    @JSName("$flex")
    var $flex: js.UndefOr[Responsive[Flex]] = js.undefined
    
    @JSName("$flexDirection")
    var $flexDirection: js.UndefOr[Responsive[FlexDirection]] = js.undefined
    
    @JSName("$flexWrap")
    var $flexWrap: js.UndefOr[Responsive[Boolean]] = js.undefined
    
    @JSName("$font")
    var $font: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$grid")
    var $grid: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridArea")
    var $gridArea: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridAutoColumns")
    var $gridAutoColumns: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridAutoFlow")
    var $gridAutoFlow: js.UndefOr[Responsive[GridAutoFlow]] = js.undefined
    
    @JSName("$gridAutoRows")
    var $gridAutoRows: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridColumn")
    var $gridColumn: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridColumnEnd")
    var $gridColumnEnd: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridColumnGap")
    var $gridColumnGap: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$gridColumnStart")
    var $gridColumnStart: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridGap")
    var $gridGap: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$gridRow")
    var $gridRow: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridRowEnd")
    var $gridRowEnd: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridRowGap")
    var $gridRowGap: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$gridRowStart")
    var $gridRowStart: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridTemplate")
    var $gridTemplate: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridTemplateAreas")
    var $gridTemplateAreas: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridTemplateColumns")
    var $gridTemplateColumns: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$gridTemplateRows")
    var $gridTemplateRows: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$height")
    var $height: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$justifyContent")
    var $justifyContent: js.UndefOr[Responsive[JustifyContent]] = js.undefined
    
    @JSName("$justifyItems")
    var $justifyItems: js.UndefOr[Responsive[JustifyItems]] = js.undefined
    
    @JSName("$justifySelf")
    var $justifySelf: js.UndefOr[Responsive[JustifySelf]] = js.undefined
    
    @JSName("$left")
    var $left: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$margin")
    var $margin: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$marginBottom")
    var $marginBottom: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$marginLeft")
    var $marginLeft: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$marginRight")
    var $marginRight: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$marginTop")
    var $marginTop: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$maxHeight")
    var $maxHeight: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$maxWidth")
    var $maxWidth: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$minHeight")
    var $minHeight: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$minWidth")
    var $minWidth: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$overflow")
    var $overflow: js.UndefOr[Responsive[Overflow]] = js.undefined
    
    @JSName("$padding")
    var $padding: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$paddingBottom")
    var $paddingBottom: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$paddingLeft")
    var $paddingLeft: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$paddingRight")
    var $paddingRight: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$paddingTop")
    var $paddingTop: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$placeContent")
    var $placeContent: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$placeItems")
    var $placeItems: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$placeSelf")
    var $placeSelf: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$position")
    var $position: js.UndefOr[Responsive[Position]] = js.undefined
    
    @JSName("$right")
    var $right: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$textOverflow")
    var $textOverflow: js.UndefOr[Responsive[String]] = js.undefined
    
    @JSName("$top")
    var $top: js.UndefOr[Responsive[Scale]] = js.undefined
    
    @JSName("$whiteSpace")
    var $whiteSpace: js.UndefOr[Responsive[WhiteSpace]] = js.undefined
    
    @JSName("$width")
    var $width: js.UndefOr[Responsive[Scale]] = js.undefined
  }
  object StyledBlockProps {
    
    inline def apply(): StyledBlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledBlockProps]
    }
    
    extension [Self <: StyledBlockProps](x: Self) {
      
      inline def set$alignContent(value: Responsive[AlignContent]): Self = StObject.set(x, "$alignContent", value.asInstanceOf[js.Any])
      
      inline def set$alignContentUndefined: Self = StObject.set(x, "$alignContent", js.undefined)
      
      inline def set$alignContentVarargs(value: AlignContent*): Self = StObject.set(x, "$alignContent", js.Array(value*))
      
      inline def set$alignItems(value: Responsive[AlignItems]): Self = StObject.set(x, "$alignItems", value.asInstanceOf[js.Any])
      
      inline def set$alignItemsUndefined: Self = StObject.set(x, "$alignItems", js.undefined)
      
      inline def set$alignItemsVarargs(value: AlignItems*): Self = StObject.set(x, "$alignItems", js.Array(value*))
      
      inline def set$alignSelf(value: Responsive[AlignSelf]): Self = StObject.set(x, "$alignSelf", value.asInstanceOf[js.Any])
      
      inline def set$alignSelfUndefined: Self = StObject.set(x, "$alignSelf", js.undefined)
      
      inline def set$alignSelfVarargs(value: AlignSelf*): Self = StObject.set(x, "$alignSelf", js.Array(value*))
      
      inline def set$backgroundAttachment(value: Responsive[String]): Self = StObject.set(x, "$backgroundAttachment", value.asInstanceOf[js.Any])
      
      inline def set$backgroundAttachmentUndefined: Self = StObject.set(x, "$backgroundAttachment", js.undefined)
      
      inline def set$backgroundAttachmentVarargs(value: String*): Self = StObject.set(x, "$backgroundAttachment", js.Array(value*))
      
      inline def set$backgroundClip(value: Responsive[String]): Self = StObject.set(x, "$backgroundClip", value.asInstanceOf[js.Any])
      
      inline def set$backgroundClipUndefined: Self = StObject.set(x, "$backgroundClip", js.undefined)
      
      inline def set$backgroundClipVarargs(value: String*): Self = StObject.set(x, "$backgroundClip", js.Array(value*))
      
      inline def set$backgroundColor(value: Responsive[String]): Self = StObject.set(x, "$backgroundColor", value.asInstanceOf[js.Any])
      
      inline def set$backgroundColorUndefined: Self = StObject.set(x, "$backgroundColor", js.undefined)
      
      inline def set$backgroundColorVarargs(value: String*): Self = StObject.set(x, "$backgroundColor", js.Array(value*))
      
      inline def set$backgroundImage(value: Responsive[String]): Self = StObject.set(x, "$backgroundImage", value.asInstanceOf[js.Any])
      
      inline def set$backgroundImageUndefined: Self = StObject.set(x, "$backgroundImage", js.undefined)
      
      inline def set$backgroundImageVarargs(value: String*): Self = StObject.set(x, "$backgroundImage", js.Array(value*))
      
      inline def set$backgroundOrigin(value: Responsive[String]): Self = StObject.set(x, "$backgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def set$backgroundOriginUndefined: Self = StObject.set(x, "$backgroundOrigin", js.undefined)
      
      inline def set$backgroundOriginVarargs(value: String*): Self = StObject.set(x, "$backgroundOrigin", js.Array(value*))
      
      inline def set$backgroundPosition(value: Responsive[String]): Self = StObject.set(x, "$backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def set$backgroundPositionUndefined: Self = StObject.set(x, "$backgroundPosition", js.undefined)
      
      inline def set$backgroundPositionVarargs(value: String*): Self = StObject.set(x, "$backgroundPosition", js.Array(value*))
      
      inline def set$backgroundRepeat(value: Responsive[String]): Self = StObject.set(x, "$backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def set$backgroundRepeatUndefined: Self = StObject.set(x, "$backgroundRepeat", js.undefined)
      
      inline def set$backgroundRepeatVarargs(value: String*): Self = StObject.set(x, "$backgroundRepeat", js.Array(value*))
      
      inline def set$backgroundSize(value: Responsive[String]): Self = StObject.set(x, "$backgroundSize", value.asInstanceOf[js.Any])
      
      inline def set$backgroundSizeUndefined: Self = StObject.set(x, "$backgroundSize", js.undefined)
      
      inline def set$backgroundSizeVarargs(value: String*): Self = StObject.set(x, "$backgroundSize", js.Array(value*))
      
      inline def set$bottom(value: Responsive[Scale]): Self = StObject.set(x, "$bottom", value.asInstanceOf[js.Any])
      
      inline def set$bottomUndefined: Self = StObject.set(x, "$bottom", js.undefined)
      
      inline def set$bottomVarargs(value: Scale*): Self = StObject.set(x, "$bottom", js.Array(value*))
      
      inline def set$color(value: Responsive[String]): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
      
      inline def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
      
      inline def set$colorVarargs(value: String*): Self = StObject.set(x, "$color", js.Array(value*))
      
      inline def set$display(value: Responsive[Display]): Self = StObject.set(x, "$display", value.asInstanceOf[js.Any])
      
      inline def set$displayUndefined: Self = StObject.set(x, "$display", js.undefined)
      
      inline def set$displayVarargs(value: Display*): Self = StObject.set(x, "$display", js.Array(value*))
      
      inline def set$flex(value: Responsive[Flex]): Self = StObject.set(x, "$flex", value.asInstanceOf[js.Any])
      
      inline def set$flexDirection(value: Responsive[FlexDirection]): Self = StObject.set(x, "$flexDirection", value.asInstanceOf[js.Any])
      
      inline def set$flexDirectionUndefined: Self = StObject.set(x, "$flexDirection", js.undefined)
      
      inline def set$flexDirectionVarargs(value: FlexDirection*): Self = StObject.set(x, "$flexDirection", js.Array(value*))
      
      inline def set$flexUndefined: Self = StObject.set(x, "$flex", js.undefined)
      
      inline def set$flexVarargs(value: Flex*): Self = StObject.set(x, "$flex", js.Array(value*))
      
      inline def set$flexWrap(value: Responsive[Boolean]): Self = StObject.set(x, "$flexWrap", value.asInstanceOf[js.Any])
      
      inline def set$flexWrapUndefined: Self = StObject.set(x, "$flexWrap", js.undefined)
      
      inline def set$flexWrapVarargs(value: Boolean*): Self = StObject.set(x, "$flexWrap", js.Array(value*))
      
      inline def set$font(value: Responsive[String]): Self = StObject.set(x, "$font", value.asInstanceOf[js.Any])
      
      inline def set$fontUndefined: Self = StObject.set(x, "$font", js.undefined)
      
      inline def set$fontVarargs(value: String*): Self = StObject.set(x, "$font", js.Array(value*))
      
      inline def set$grid(value: Responsive[String]): Self = StObject.set(x, "$grid", value.asInstanceOf[js.Any])
      
      inline def set$gridArea(value: Responsive[String]): Self = StObject.set(x, "$gridArea", value.asInstanceOf[js.Any])
      
      inline def set$gridAreaUndefined: Self = StObject.set(x, "$gridArea", js.undefined)
      
      inline def set$gridAreaVarargs(value: String*): Self = StObject.set(x, "$gridArea", js.Array(value*))
      
      inline def set$gridAutoColumns(value: Responsive[String]): Self = StObject.set(x, "$gridAutoColumns", value.asInstanceOf[js.Any])
      
      inline def set$gridAutoColumnsUndefined: Self = StObject.set(x, "$gridAutoColumns", js.undefined)
      
      inline def set$gridAutoColumnsVarargs(value: String*): Self = StObject.set(x, "$gridAutoColumns", js.Array(value*))
      
      inline def set$gridAutoFlow(value: Responsive[GridAutoFlow]): Self = StObject.set(x, "$gridAutoFlow", value.asInstanceOf[js.Any])
      
      inline def set$gridAutoFlowUndefined: Self = StObject.set(x, "$gridAutoFlow", js.undefined)
      
      inline def set$gridAutoFlowVarargs(value: GridAutoFlow*): Self = StObject.set(x, "$gridAutoFlow", js.Array(value*))
      
      inline def set$gridAutoRows(value: Responsive[String]): Self = StObject.set(x, "$gridAutoRows", value.asInstanceOf[js.Any])
      
      inline def set$gridAutoRowsUndefined: Self = StObject.set(x, "$gridAutoRows", js.undefined)
      
      inline def set$gridAutoRowsVarargs(value: String*): Self = StObject.set(x, "$gridAutoRows", js.Array(value*))
      
      inline def set$gridColumn(value: Responsive[String]): Self = StObject.set(x, "$gridColumn", value.asInstanceOf[js.Any])
      
      inline def set$gridColumnEnd(value: Responsive[String]): Self = StObject.set(x, "$gridColumnEnd", value.asInstanceOf[js.Any])
      
      inline def set$gridColumnEndUndefined: Self = StObject.set(x, "$gridColumnEnd", js.undefined)
      
      inline def set$gridColumnEndVarargs(value: String*): Self = StObject.set(x, "$gridColumnEnd", js.Array(value*))
      
      inline def set$gridColumnGap(value: Responsive[Scale]): Self = StObject.set(x, "$gridColumnGap", value.asInstanceOf[js.Any])
      
      inline def set$gridColumnGapUndefined: Self = StObject.set(x, "$gridColumnGap", js.undefined)
      
      inline def set$gridColumnGapVarargs(value: Scale*): Self = StObject.set(x, "$gridColumnGap", js.Array(value*))
      
      inline def set$gridColumnStart(value: Responsive[String]): Self = StObject.set(x, "$gridColumnStart", value.asInstanceOf[js.Any])
      
      inline def set$gridColumnStartUndefined: Self = StObject.set(x, "$gridColumnStart", js.undefined)
      
      inline def set$gridColumnStartVarargs(value: String*): Self = StObject.set(x, "$gridColumnStart", js.Array(value*))
      
      inline def set$gridColumnUndefined: Self = StObject.set(x, "$gridColumn", js.undefined)
      
      inline def set$gridColumnVarargs(value: String*): Self = StObject.set(x, "$gridColumn", js.Array(value*))
      
      inline def set$gridGap(value: Responsive[Scale]): Self = StObject.set(x, "$gridGap", value.asInstanceOf[js.Any])
      
      inline def set$gridGapUndefined: Self = StObject.set(x, "$gridGap", js.undefined)
      
      inline def set$gridGapVarargs(value: Scale*): Self = StObject.set(x, "$gridGap", js.Array(value*))
      
      inline def set$gridRow(value: Responsive[String]): Self = StObject.set(x, "$gridRow", value.asInstanceOf[js.Any])
      
      inline def set$gridRowEnd(value: Responsive[String]): Self = StObject.set(x, "$gridRowEnd", value.asInstanceOf[js.Any])
      
      inline def set$gridRowEndUndefined: Self = StObject.set(x, "$gridRowEnd", js.undefined)
      
      inline def set$gridRowEndVarargs(value: String*): Self = StObject.set(x, "$gridRowEnd", js.Array(value*))
      
      inline def set$gridRowGap(value: Responsive[Scale]): Self = StObject.set(x, "$gridRowGap", value.asInstanceOf[js.Any])
      
      inline def set$gridRowGapUndefined: Self = StObject.set(x, "$gridRowGap", js.undefined)
      
      inline def set$gridRowGapVarargs(value: Scale*): Self = StObject.set(x, "$gridRowGap", js.Array(value*))
      
      inline def set$gridRowStart(value: Responsive[String]): Self = StObject.set(x, "$gridRowStart", value.asInstanceOf[js.Any])
      
      inline def set$gridRowStartUndefined: Self = StObject.set(x, "$gridRowStart", js.undefined)
      
      inline def set$gridRowStartVarargs(value: String*): Self = StObject.set(x, "$gridRowStart", js.Array(value*))
      
      inline def set$gridRowUndefined: Self = StObject.set(x, "$gridRow", js.undefined)
      
      inline def set$gridRowVarargs(value: String*): Self = StObject.set(x, "$gridRow", js.Array(value*))
      
      inline def set$gridTemplate(value: Responsive[String]): Self = StObject.set(x, "$gridTemplate", value.asInstanceOf[js.Any])
      
      inline def set$gridTemplateAreas(value: Responsive[String]): Self = StObject.set(x, "$gridTemplateAreas", value.asInstanceOf[js.Any])
      
      inline def set$gridTemplateAreasUndefined: Self = StObject.set(x, "$gridTemplateAreas", js.undefined)
      
      inline def set$gridTemplateAreasVarargs(value: String*): Self = StObject.set(x, "$gridTemplateAreas", js.Array(value*))
      
      inline def set$gridTemplateColumns(value: Responsive[String]): Self = StObject.set(x, "$gridTemplateColumns", value.asInstanceOf[js.Any])
      
      inline def set$gridTemplateColumnsUndefined: Self = StObject.set(x, "$gridTemplateColumns", js.undefined)
      
      inline def set$gridTemplateColumnsVarargs(value: String*): Self = StObject.set(x, "$gridTemplateColumns", js.Array(value*))
      
      inline def set$gridTemplateRows(value: Responsive[String]): Self = StObject.set(x, "$gridTemplateRows", value.asInstanceOf[js.Any])
      
      inline def set$gridTemplateRowsUndefined: Self = StObject.set(x, "$gridTemplateRows", js.undefined)
      
      inline def set$gridTemplateRowsVarargs(value: String*): Self = StObject.set(x, "$gridTemplateRows", js.Array(value*))
      
      inline def set$gridTemplateUndefined: Self = StObject.set(x, "$gridTemplate", js.undefined)
      
      inline def set$gridTemplateVarargs(value: String*): Self = StObject.set(x, "$gridTemplate", js.Array(value*))
      
      inline def set$gridUndefined: Self = StObject.set(x, "$grid", js.undefined)
      
      inline def set$gridVarargs(value: String*): Self = StObject.set(x, "$grid", js.Array(value*))
      
      inline def set$height(value: Responsive[Scale]): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
      
      inline def set$heightUndefined: Self = StObject.set(x, "$height", js.undefined)
      
      inline def set$heightVarargs(value: Scale*): Self = StObject.set(x, "$height", js.Array(value*))
      
      inline def set$justifyContent(value: Responsive[JustifyContent]): Self = StObject.set(x, "$justifyContent", value.asInstanceOf[js.Any])
      
      inline def set$justifyContentUndefined: Self = StObject.set(x, "$justifyContent", js.undefined)
      
      inline def set$justifyContentVarargs(value: JustifyContent*): Self = StObject.set(x, "$justifyContent", js.Array(value*))
      
      inline def set$justifyItems(value: Responsive[JustifyItems]): Self = StObject.set(x, "$justifyItems", value.asInstanceOf[js.Any])
      
      inline def set$justifyItemsUndefined: Self = StObject.set(x, "$justifyItems", js.undefined)
      
      inline def set$justifyItemsVarargs(value: JustifyItems*): Self = StObject.set(x, "$justifyItems", js.Array(value*))
      
      inline def set$justifySelf(value: Responsive[JustifySelf]): Self = StObject.set(x, "$justifySelf", value.asInstanceOf[js.Any])
      
      inline def set$justifySelfUndefined: Self = StObject.set(x, "$justifySelf", js.undefined)
      
      inline def set$justifySelfVarargs(value: JustifySelf*): Self = StObject.set(x, "$justifySelf", js.Array(value*))
      
      inline def set$left(value: Responsive[Scale]): Self = StObject.set(x, "$left", value.asInstanceOf[js.Any])
      
      inline def set$leftUndefined: Self = StObject.set(x, "$left", js.undefined)
      
      inline def set$leftVarargs(value: Scale*): Self = StObject.set(x, "$left", js.Array(value*))
      
      inline def set$margin(value: Responsive[Scale]): Self = StObject.set(x, "$margin", value.asInstanceOf[js.Any])
      
      inline def set$marginBottom(value: Responsive[Scale]): Self = StObject.set(x, "$marginBottom", value.asInstanceOf[js.Any])
      
      inline def set$marginBottomUndefined: Self = StObject.set(x, "$marginBottom", js.undefined)
      
      inline def set$marginBottomVarargs(value: Scale*): Self = StObject.set(x, "$marginBottom", js.Array(value*))
      
      inline def set$marginLeft(value: Responsive[Scale]): Self = StObject.set(x, "$marginLeft", value.asInstanceOf[js.Any])
      
      inline def set$marginLeftUndefined: Self = StObject.set(x, "$marginLeft", js.undefined)
      
      inline def set$marginLeftVarargs(value: Scale*): Self = StObject.set(x, "$marginLeft", js.Array(value*))
      
      inline def set$marginRight(value: Responsive[Scale]): Self = StObject.set(x, "$marginRight", value.asInstanceOf[js.Any])
      
      inline def set$marginRightUndefined: Self = StObject.set(x, "$marginRight", js.undefined)
      
      inline def set$marginRightVarargs(value: Scale*): Self = StObject.set(x, "$marginRight", js.Array(value*))
      
      inline def set$marginTop(value: Responsive[Scale]): Self = StObject.set(x, "$marginTop", value.asInstanceOf[js.Any])
      
      inline def set$marginTopUndefined: Self = StObject.set(x, "$marginTop", js.undefined)
      
      inline def set$marginTopVarargs(value: Scale*): Self = StObject.set(x, "$marginTop", js.Array(value*))
      
      inline def set$marginUndefined: Self = StObject.set(x, "$margin", js.undefined)
      
      inline def set$marginVarargs(value: Scale*): Self = StObject.set(x, "$margin", js.Array(value*))
      
      inline def set$maxHeight(value: Responsive[Scale]): Self = StObject.set(x, "$maxHeight", value.asInstanceOf[js.Any])
      
      inline def set$maxHeightUndefined: Self = StObject.set(x, "$maxHeight", js.undefined)
      
      inline def set$maxHeightVarargs(value: Scale*): Self = StObject.set(x, "$maxHeight", js.Array(value*))
      
      inline def set$maxWidth(value: Responsive[Scale]): Self = StObject.set(x, "$maxWidth", value.asInstanceOf[js.Any])
      
      inline def set$maxWidthUndefined: Self = StObject.set(x, "$maxWidth", js.undefined)
      
      inline def set$maxWidthVarargs(value: Scale*): Self = StObject.set(x, "$maxWidth", js.Array(value*))
      
      inline def set$minHeight(value: Responsive[Scale]): Self = StObject.set(x, "$minHeight", value.asInstanceOf[js.Any])
      
      inline def set$minHeightUndefined: Self = StObject.set(x, "$minHeight", js.undefined)
      
      inline def set$minHeightVarargs(value: Scale*): Self = StObject.set(x, "$minHeight", js.Array(value*))
      
      inline def set$minWidth(value: Responsive[Scale]): Self = StObject.set(x, "$minWidth", value.asInstanceOf[js.Any])
      
      inline def set$minWidthUndefined: Self = StObject.set(x, "$minWidth", js.undefined)
      
      inline def set$minWidthVarargs(value: Scale*): Self = StObject.set(x, "$minWidth", js.Array(value*))
      
      inline def set$overflow(value: Responsive[Overflow]): Self = StObject.set(x, "$overflow", value.asInstanceOf[js.Any])
      
      inline def set$overflowUndefined: Self = StObject.set(x, "$overflow", js.undefined)
      
      inline def set$overflowVarargs(value: Overflow*): Self = StObject.set(x, "$overflow", js.Array(value*))
      
      inline def set$padding(value: Responsive[Scale]): Self = StObject.set(x, "$padding", value.asInstanceOf[js.Any])
      
      inline def set$paddingBottom(value: Responsive[Scale]): Self = StObject.set(x, "$paddingBottom", value.asInstanceOf[js.Any])
      
      inline def set$paddingBottomUndefined: Self = StObject.set(x, "$paddingBottom", js.undefined)
      
      inline def set$paddingBottomVarargs(value: Scale*): Self = StObject.set(x, "$paddingBottom", js.Array(value*))
      
      inline def set$paddingLeft(value: Responsive[Scale]): Self = StObject.set(x, "$paddingLeft", value.asInstanceOf[js.Any])
      
      inline def set$paddingLeftUndefined: Self = StObject.set(x, "$paddingLeft", js.undefined)
      
      inline def set$paddingLeftVarargs(value: Scale*): Self = StObject.set(x, "$paddingLeft", js.Array(value*))
      
      inline def set$paddingRight(value: Responsive[Scale]): Self = StObject.set(x, "$paddingRight", value.asInstanceOf[js.Any])
      
      inline def set$paddingRightUndefined: Self = StObject.set(x, "$paddingRight", js.undefined)
      
      inline def set$paddingRightVarargs(value: Scale*): Self = StObject.set(x, "$paddingRight", js.Array(value*))
      
      inline def set$paddingTop(value: Responsive[Scale]): Self = StObject.set(x, "$paddingTop", value.asInstanceOf[js.Any])
      
      inline def set$paddingTopUndefined: Self = StObject.set(x, "$paddingTop", js.undefined)
      
      inline def set$paddingTopVarargs(value: Scale*): Self = StObject.set(x, "$paddingTop", js.Array(value*))
      
      inline def set$paddingUndefined: Self = StObject.set(x, "$padding", js.undefined)
      
      inline def set$paddingVarargs(value: Scale*): Self = StObject.set(x, "$padding", js.Array(value*))
      
      inline def set$placeContent(value: Responsive[String]): Self = StObject.set(x, "$placeContent", value.asInstanceOf[js.Any])
      
      inline def set$placeContentUndefined: Self = StObject.set(x, "$placeContent", js.undefined)
      
      inline def set$placeContentVarargs(value: String*): Self = StObject.set(x, "$placeContent", js.Array(value*))
      
      inline def set$placeItems(value: Responsive[String]): Self = StObject.set(x, "$placeItems", value.asInstanceOf[js.Any])
      
      inline def set$placeItemsUndefined: Self = StObject.set(x, "$placeItems", js.undefined)
      
      inline def set$placeItemsVarargs(value: String*): Self = StObject.set(x, "$placeItems", js.Array(value*))
      
      inline def set$placeSelf(value: Responsive[String]): Self = StObject.set(x, "$placeSelf", value.asInstanceOf[js.Any])
      
      inline def set$placeSelfUndefined: Self = StObject.set(x, "$placeSelf", js.undefined)
      
      inline def set$placeSelfVarargs(value: String*): Self = StObject.set(x, "$placeSelf", js.Array(value*))
      
      inline def set$position(value: Responsive[Position]): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
      
      inline def set$positionUndefined: Self = StObject.set(x, "$position", js.undefined)
      
      inline def set$positionVarargs(value: Position*): Self = StObject.set(x, "$position", js.Array(value*))
      
      inline def set$right(value: Responsive[Scale]): Self = StObject.set(x, "$right", value.asInstanceOf[js.Any])
      
      inline def set$rightUndefined: Self = StObject.set(x, "$right", js.undefined)
      
      inline def set$rightVarargs(value: Scale*): Self = StObject.set(x, "$right", js.Array(value*))
      
      inline def set$textOverflow(value: Responsive[String]): Self = StObject.set(x, "$textOverflow", value.asInstanceOf[js.Any])
      
      inline def set$textOverflowUndefined: Self = StObject.set(x, "$textOverflow", js.undefined)
      
      inline def set$textOverflowVarargs(value: String*): Self = StObject.set(x, "$textOverflow", js.Array(value*))
      
      inline def set$top(value: Responsive[Scale]): Self = StObject.set(x, "$top", value.asInstanceOf[js.Any])
      
      inline def set$topUndefined: Self = StObject.set(x, "$top", js.undefined)
      
      inline def set$topVarargs(value: Scale*): Self = StObject.set(x, "$top", js.Array(value*))
      
      inline def set$whiteSpace(value: Responsive[WhiteSpace]): Self = StObject.set(x, "$whiteSpace", value.asInstanceOf[js.Any])
      
      inline def set$whiteSpaceUndefined: Self = StObject.set(x, "$whiteSpace", js.undefined)
      
      inline def set$whiteSpaceVarargs(value: WhiteSpace*): Self = StObject.set(x, "$whiteSpace", js.Array(value*))
      
      inline def set$width(value: Responsive[Scale]): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
      
      inline def set$widthUndefined: Self = StObject.set(x, "$width", js.undefined)
      
      inline def set$widthVarargs(value: Scale*): Self = StObject.set(x, "$width", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.normal
    - typings.baseui.baseuiStrings.nowrap
    - typings.baseui.baseuiStrings.pre
    - typings.baseui.baseuiStrings.`pre-wrap`
    - typings.baseui.baseuiStrings.`pre-line`
    - typings.baseui.baseuiStrings.`break-spaces`
    - typings.baseui.baseuiStrings.inherit
    - typings.baseui.baseuiStrings.initial
    - typings.baseui.baseuiStrings.unset
  */
  trait WhiteSpace extends StObject
  object WhiteSpace {
    
    inline def `break-spaces`: typings.baseui.baseuiStrings.`break-spaces` = "break-spaces".asInstanceOf[typings.baseui.baseuiStrings.`break-spaces`]
    
    inline def inherit: typings.baseui.baseuiStrings.inherit = "inherit".asInstanceOf[typings.baseui.baseuiStrings.inherit]
    
    inline def initial: typings.baseui.baseuiStrings.initial = "initial".asInstanceOf[typings.baseui.baseuiStrings.initial]
    
    inline def normal: typings.baseui.baseuiStrings.normal = "normal".asInstanceOf[typings.baseui.baseuiStrings.normal]
    
    inline def nowrap: typings.baseui.baseuiStrings.nowrap = "nowrap".asInstanceOf[typings.baseui.baseuiStrings.nowrap]
    
    inline def pre: typings.baseui.baseuiStrings.pre = "pre".asInstanceOf[typings.baseui.baseuiStrings.pre]
    
    inline def `pre-line`: typings.baseui.baseuiStrings.`pre-line` = "pre-line".asInstanceOf[typings.baseui.baseuiStrings.`pre-line`]
    
    inline def `pre-wrap`: typings.baseui.baseuiStrings.`pre-wrap` = "pre-wrap".asInstanceOf[typings.baseui.baseuiStrings.`pre-wrap`]
    
    inline def unset: typings.baseui.baseuiStrings.unset = "unset".asInstanceOf[typings.baseui.baseuiStrings.unset]
  }
}
