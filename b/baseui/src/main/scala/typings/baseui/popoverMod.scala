package typings.baseui

import typings.baseui.anon.ArrowOffset
import typings.baseui.anon.Close
import typings.baseui.anon.PopoverPropschildrennever
import typings.baseui.anon.SharedStylePropsArgchildrArrowOffset
import typings.baseui.baseuiNumbers.`0`
import typings.baseui.baseuiNumbers.`20`
import typings.baseui.baseuiNumbers.`6`
import typings.baseui.baseuiNumbers.`8`
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.close
import typings.baseui.baseuiStrings.hover
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.menu
import typings.baseui.baseuiStrings.none
import typings.baseui.baseuiStrings.open
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.rightBottom
import typings.baseui.baseuiStrings.rightTop
import typings.baseui.baseuiStrings.tooltip
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.baseui.layerMod.NormalizedOffsets
import typings.baseui.layerMod.PopperDataObject
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  trait ACCESSIBILITY_TYPE extends StObject {
    
    var menu: typings.baseui.baseuiStrings.menu
    
    var none: typings.baseui.baseuiStrings.none
    
    var tooltip: typings.baseui.baseuiStrings.tooltip
  }
  object ACCESSIBILITY_TYPE {
    
    @JSImport("baseui/popover", "ACCESSIBILITY_TYPE")
    @js.native
    val ^ : ACCESSIBILITY_TYPE = js.native
    
    extension [Self <: ACCESSIBILITY_TYPE](x: Self) {
      
      inline def setMenu(value: menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/popover", "ANIMATE_IN_TIME")
  @js.native
  val ANIMATE_IN_TIME: typings.baseui.popoverMod.ANIMATE_IN_TIME = js.native
  type ANIMATE_IN_TIME = `20`
  
  @JSImport("baseui/popover", "ANIMATE_OUT_TIME")
  @js.native
  val ANIMATE_OUT_TIME: typings.baseui.popoverMod.ANIMATE_OUT_TIME = js.native
  type ANIMATE_OUT_TIME = `0`
  
  @JSImport("baseui/popover", "ARROW_SIZE")
  @js.native
  val ARROW_SIZE: `6` = js.native
  
  @JSImport("baseui/popover", "ARROW_WIDTH")
  @js.native
  val ARROW_WIDTH: Double = js.native
  
  trait PLACEMENT extends StObject {
    
    var auto: typings.baseui.baseuiStrings.auto
    
    var bottom: typings.baseui.baseuiStrings.bottom
    
    var bottomLeft: typings.baseui.baseuiStrings.bottomLeft
    
    var bottomRight: typings.baseui.baseuiStrings.bottomRight
    
    var left: typings.baseui.baseuiStrings.left
    
    var leftBottom: typings.baseui.baseuiStrings.leftBottom
    
    var leftTop: typings.baseui.baseuiStrings.leftTop
    
    var right: typings.baseui.baseuiStrings.right
    
    var rightBottom: typings.baseui.baseuiStrings.rightBottom
    
    var rightTop: typings.baseui.baseuiStrings.rightTop
    
    var top: typings.baseui.baseuiStrings.top
    
    var topLeft: typings.baseui.baseuiStrings.topLeft
    
    var topRight: typings.baseui.baseuiStrings.topRight
  }
  object PLACEMENT {
    
    @JSImport("baseui/popover", "PLACEMENT")
    @js.native
    val ^ : PLACEMENT = js.native
    
    extension [Self <: PLACEMENT](x: Self) {
      
      inline def setAuto(value: auto): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomLeft(value: bottomLeft): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomRight(value: bottomRight): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftBottom(value: leftBottom): Self = StObject.set(x, "leftBottom", value.asInstanceOf[js.Any])
      
      inline def setLeftTop(value: leftTop): Self = StObject.set(x, "leftTop", value.asInstanceOf[js.Any])
      
      inline def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightBottom(value: rightBottom): Self = StObject.set(x, "rightBottom", value.asInstanceOf[js.Any])
      
      inline def setRightTop(value: rightTop): Self = StObject.set(x, "rightTop", value.asInstanceOf[js.Any])
      
      inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: topLeft): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopRight(value: topRight): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/popover", "POPOVER_MARGIN")
  @js.native
  val POPOVER_MARGIN: `8` = js.native
  
  @JSImport("baseui/popover", "Popover")
  @js.native
  class Popover protected ()
    extends Component[PopoverProps, PopoverPrivateState, js.Any] {
    def this(props: PopoverProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PopoverProps, context: js.Any) = this()
    
    def addDomEvents(): Unit = js.native
    
    def animateIn(): Unit = js.native
    
    def animateOut(): Unit = js.native
    
    def clearTimers(): Unit = js.native
    
    def getAnchorFromChildren(): ReactNode = js.native
    
    def getAnchorIdAttr(): String | Null = js.native
    
    def getAnchorProps(): js.Object = js.native
    
    def getDefaultState(props: PopoverProps): ArrowOffset = js.native
    
    def getPopoverBodyProps(): js.Object = js.native
    
    def getPopoverIdAttr(): String | Null = js.native
    
    def getSharedProps(): SharedStylePropsArgchildrArrowOffset = js.native
    
    def init(prevProps: PopoverProps, prevState: PopoverPrivateState): Unit = js.native
    
    def isAccessibilityTypeMenu(): Boolean = js.native
    
    def isAccessibilityTypeTooltip(): Boolean = js.native
    
    def isClickTrigger(): Boolean = js.native
    
    def isHoverTrigger(): Boolean = js.native
    
    def onAnchorClick(e: Event): Unit = js.native
    
    def onAnchorMouseEnter(): Unit = js.native
    
    def onAnchorMouseLeave(): Unit = js.native
    
    def onDocumentClick(evt: MouseEvent): Unit = js.native
    
    def onKeyPress(evt: KeyboardEvent): Unit = js.native
    
    def onPopoverMouseEnter(): Unit = js.native
    
    def onPopoverMouseLeave(): Unit = js.native
    
    def onPopperUpdate(normalizedOffsets: NormalizedOffsets, data: PopperDataObject): Unit = js.native
    
    def removeDomEvents(): Unit = js.native
    
    def renderAnchor(): ReactNode = js.native
    
    def renderPopover(): ReactNode = js.native
    
    def triggerOnMouseEnter(): Unit = js.native
    
    def triggerOnMouseEnterWithDelay(): Unit = js.native
    
    def triggerOnMouseLeave(): Unit = js.native
    
    def triggerOnMouseLeaveWithDelay(): Unit = js.native
  }
  
  trait STATE_CHANGE_TYPE extends StObject {
    
    var close: typings.baseui.baseuiStrings.close
    
    var open: typings.baseui.baseuiStrings.open
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/popover", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    extension [Self <: STATE_CHANGE_TYPE](x: Self) {
      
      inline def setClose(value: close): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: open): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/popover", "StatefulContainer")
  @js.native
  class StatefulContainer protected ()
    extends Component[StatefulPopoverContainerProps, State, js.Any] {
    def this(props: StatefulPopoverContainerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatefulPopoverContainerProps, context: js.Any) = this()
    
    def close(): Unit = js.native
    
    @JSName("internalSetState")
    def internalSetState_close(`type`: close, changes: State): Unit = js.native
    @JSName("internalSetState")
    def internalSetState_open(`type`: open, changes: State): Unit = js.native
    
    def onBlur(): Unit = js.native
    
    def onClick(): Unit = js.native
    
    def onClickOutside(): Unit = js.native
    
    def onContentClose(): Unit = js.native
    
    def onEsc(): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onMouseEnter(): Unit = js.native
    
    def onMouseLeave(): Unit = js.native
    
    def open(): Unit = js.native
  }
  
  @JSImport("baseui/popover", "StatefulPopover")
  @js.native
  val StatefulPopover: FC[StatefulPopoverProps] = js.native
  
  @JSImport("baseui/popover", "StyledArrow")
  @js.native
  val StyledArrow: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/popover", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/popover", "StyledInner")
  @js.native
  val StyledInner: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/popover", "StyledPadding")
  @js.native
  val StyledPadding: StyletronComponent[js.Any] = js.native
  
  trait TRIGGER_TYPE extends StObject {
    
    var click: typings.baseui.baseuiStrings.click
    
    var hover: typings.baseui.baseuiStrings.hover
  }
  object TRIGGER_TYPE {
    
    @JSImport("baseui/popover", "TRIGGER_TYPE")
    @js.native
    val ^ : TRIGGER_TYPE = js.native
    
    extension [Self <: TRIGGER_TYPE](x: Self) {
      
      inline def setClick(value: click): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setHover(value: hover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    }
  }
  
  trait BasePopoverProps extends StObject {
    
    var accessibilityType: js.UndefOr[none | menu | tooltip] = js.undefined
    
    var animateOutTime: js.UndefOr[Double] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var `data-baseweb`: js.UndefOr[String] = js.undefined
    
    var focusLock: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var ignoreBoundary: js.UndefOr[Boolean] = js.undefined
    
    var mountNode: js.UndefOr[HTMLElement] = js.undefined
    
    var onMouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    var onMouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    var overrides: js.UndefOr[PopoverOverrides] = js.undefined
    
    var placement: js.UndefOr[
        topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ] = js.undefined
    
    var popoverMargin: js.UndefOr[Double] = js.undefined
    
    var popperOptions: js.UndefOr[js.Any] = js.undefined
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    var returnFocus: js.UndefOr[Boolean] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var triggerType: js.UndefOr[click | hover] = js.undefined
  }
  object BasePopoverProps {
    
    inline def apply(): BasePopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasePopoverProps]
    }
    
    extension [Self <: BasePopoverProps](x: Self) {
      
      inline def setAccessibilityType(value: none | menu | tooltip): Self = StObject.set(x, "accessibilityType", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityTypeUndefined: Self = StObject.set(x, "accessibilityType", js.undefined)
      
      inline def setAnimateOutTime(value: Double): Self = StObject.set(x, "animateOutTime", value.asInstanceOf[js.Any])
      
      inline def setAnimateOutTimeUndefined: Self = StObject.set(x, "animateOutTime", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
      
      inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
      
      inline def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
      
      inline def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIgnoreBoundary(value: Boolean): Self = StObject.set(x, "ignoreBoundary", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBoundaryUndefined: Self = StObject.set(x, "ignoreBoundary", js.undefined)
      
      inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      inline def setOnMouseEnterDelay(value: Double): Self = StObject.set(x, "onMouseEnterDelay", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnterDelayUndefined: Self = StObject.set(x, "onMouseEnterDelay", js.undefined)
      
      inline def setOnMouseLeaveDelay(value: Double): Self = StObject.set(x, "onMouseLeaveDelay", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeaveDelayUndefined: Self = StObject.set(x, "onMouseLeaveDelay", js.undefined)
      
      inline def setOverrides(value: PopoverOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPlacement(
        value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopoverMargin(value: Double): Self = StObject.set(x, "popoverMargin", value.asInstanceOf[js.Any])
      
      inline def setPopoverMarginUndefined: Self = StObject.set(x, "popoverMargin", js.undefined)
      
      inline def setPopperOptions(value: js.Any): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
      
      inline def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setReturnFocus(value: Boolean): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setTriggerType(value: click | hover): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
    }
  }
  
  trait Offset extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Offset {
    
    inline def apply(left: Double, top: Double): Offset = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopoverOverrides extends StObject {
    
    var Arrow: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.undefined
    
    var Body: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.undefined
    
    var Inner: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ] = js.undefined
  }
  object PopoverOverrides {
    
    inline def apply(): PopoverOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverOverrides]
    }
    
    extension [Self <: PopoverOverrides](x: Self) {
      
      inline def setArrow(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "Arrow", js.undefined)
      
      inline def setBody(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setInner(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArg> */ js.Any
      ): Self = StObject.set(x, "Inner", value.asInstanceOf[js.Any])
      
      inline def setInnerUndefined: Self = StObject.set(x, "Inner", js.undefined)
    }
  }
  
  trait PopoverPrivateState extends StObject {
    
    var arrowOffset: Offset
    
    var isAnimating: Boolean
    
    var isLayerMounted: Boolean
    
    var isMounted: Boolean
    
    var placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    
    var popoverOffset: Offset
  }
  object PopoverPrivateState {
    
    inline def apply(
      arrowOffset: Offset,
      isAnimating: Boolean,
      isLayerMounted: Boolean,
      isMounted: Boolean,
      placement: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top,
      popoverOffset: Offset
    ): PopoverPrivateState = {
      val __obj = js.Dynamic.literal(arrowOffset = arrowOffset.asInstanceOf[js.Any], isAnimating = isAnimating.asInstanceOf[js.Any], isLayerMounted = isLayerMounted.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popoverOffset = popoverOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverPrivateState]
    }
    
    extension [Self <: PopoverPrivateState](x: Self) {
      
      inline def setArrowOffset(value: Offset): Self = StObject.set(x, "arrowOffset", value.asInstanceOf[js.Any])
      
      inline def setIsAnimating(value: Boolean): Self = StObject.set(x, "isAnimating", value.asInstanceOf[js.Any])
      
      inline def setIsLayerMounted(value: Boolean): Self = StObject.set(x, "isLayerMounted", value.asInstanceOf[js.Any])
      
      inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
      
      inline def setPlacement(
        value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPopoverOffset(value: Offset): Self = StObject.set(x, "popoverOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopoverProps
    extends StObject
       with BasePopoverProps {
    
    var children: ReactNode
    
    var content: ReactNode | js.Function0[ReactNode]
    
    var isOpen: Boolean
    
    var onBlur: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ Event, js.Any]] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, js.Any]] = js.undefined
    
    var onEsc: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function0[js.Any]] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(isOpen: Boolean): PopoverProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContent(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction0(value: () => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: () => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: /* e */ Event => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickOutside(value: /* event */ MouseEvent => js.Any): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnEsc(value: () => js.Any): Self = StObject.set(x, "onEsc", js.Any.fromFunction0(value))
      
      inline def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      inline def setOnFocus(value: () => js.Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseEnter(value: () => js.Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: () => js.Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    }
  }
  
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$arrowOffset")
    var $arrowOffset: js.UndefOr[Offset] = js.undefined
    
    @JSName("$isAnimating")
    var $isAnimating: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isOpen")
    var $isOpen: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$placement")
    var $placement: js.UndefOr[
        topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ] = js.undefined
    
    @JSName("$popoverMargin")
    var $popoverMargin: js.UndefOr[Double] = js.undefined
    
    @JSName("$popoverOffset")
    var $popoverOffset: js.UndefOr[Offset] = js.undefined
    
    @JSName("$showArrow")
    var $showArrow: js.UndefOr[Boolean] = js.undefined
  }
  object SharedStylePropsArg {
    
    inline def apply(): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    extension [Self <: SharedStylePropsArg](x: Self) {
      
      inline def set$arrowOffset(value: Offset): Self = StObject.set(x, "$arrowOffset", value.asInstanceOf[js.Any])
      
      inline def set$arrowOffsetUndefined: Self = StObject.set(x, "$arrowOffset", js.undefined)
      
      inline def set$isAnimating(value: Boolean): Self = StObject.set(x, "$isAnimating", value.asInstanceOf[js.Any])
      
      inline def set$isAnimatingUndefined: Self = StObject.set(x, "$isAnimating", js.undefined)
      
      inline def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
      
      inline def set$isOpenUndefined: Self = StObject.set(x, "$isOpen", js.undefined)
      
      inline def set$placement(
        value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
      
      inline def set$placementUndefined: Self = StObject.set(x, "$placement", js.undefined)
      
      inline def set$popoverMargin(value: Double): Self = StObject.set(x, "$popoverMargin", value.asInstanceOf[js.Any])
      
      inline def set$popoverMarginUndefined: Self = StObject.set(x, "$popoverMargin", js.undefined)
      
      inline def set$popoverOffset(value: Offset): Self = StObject.set(x, "$popoverOffset", value.asInstanceOf[js.Any])
      
      inline def set$popoverOffsetUndefined: Self = StObject.set(x, "$popoverOffset", js.undefined)
      
      inline def set$showArrow(value: Boolean): Self = StObject.set(x, "$showArrow", value.asInstanceOf[js.Any])
      
      inline def set$showArrowUndefined: Self = StObject.set(x, "$showArrow", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var isOpen: Boolean
  }
  object State {
    
    inline def apply(isOpen: Boolean): State = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
  
  type StateReducer = js.Function3[
    /* stateChangeType */ open | close, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
  
  /* Inlined baseui.baseui/popover.StatefulPopoverProps & {children (props : baseui.baseui/popover.PopoverProps & {  children :never}): react.react.ReactNode} */
  @js.native
  trait StatefulPopoverContainerProps extends StObject {
    
    var accessibilityType: js.UndefOr[none | menu | tooltip] = js.native
    
    var animateOutTime: js.UndefOr[Double] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    def children(props: PopoverPropschildrennever): ReactNode = js.native
    
    var content: js.UndefOr[ReactNode | (js.Function1[/* args */ Close, ReactNode])] = js.native
    
    var `data-baseweb`: js.UndefOr[String] = js.native
    
    var dismissOnClickOutside: js.UndefOr[Boolean] = js.native
    
    var dismissOnEsc: js.UndefOr[Boolean] = js.native
    
    var focusLock: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var ignoreBoundary: js.UndefOr[Boolean] = js.native
    
    var initialState: js.UndefOr[State] = js.native
    
    var mountNode: js.UndefOr[HTMLElement] = js.native
    
    var onClose: js.UndefOr[js.Function0[js.Any]] = js.native
    
    var onMouseEnterDelay: js.UndefOr[Double] = js.native
    
    var onMouseLeaveDelay: js.UndefOr[Double] = js.native
    
    var onOpen: js.UndefOr[js.Function0[js.Any]] = js.native
    
    var overrides: js.UndefOr[PopoverOverrides] = js.native
    
    var placement: js.UndefOr[
        topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ] = js.native
    
    var popoverMargin: js.UndefOr[Double] = js.native
    
    var popperOptions: js.UndefOr[js.Any] = js.native
    
    var renderAll: js.UndefOr[Boolean] = js.native
    
    var returnFocus: js.UndefOr[Boolean] = js.native
    
    var showArrow: js.UndefOr[Boolean] = js.native
    
    var stateReducer: js.UndefOr[StateReducer] = js.native
    
    var triggerType: js.UndefOr[click | hover] = js.native
  }
  
  trait StatefulPopoverProps
    extends StObject
       with BasePopoverProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var content: js.UndefOr[ReactNode | (js.Function1[/* args */ Close, ReactNode])] = js.undefined
    
    var dismissOnClickOutside: js.UndefOr[Boolean] = js.undefined
    
    var dismissOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulPopoverProps {
    
    inline def apply(): StatefulPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulPopoverProps]
    }
    
    extension [Self <: StatefulPopoverProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContent(value: ReactNode | (js.Function1[/* args */ Close, ReactNode])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction1(value: /* args */ Close => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDismissOnClickOutside(value: Boolean): Self = StObject.set(x, "dismissOnClickOutside", value.asInstanceOf[js.Any])
      
      inline def setDismissOnClickOutsideUndefined: Self = StObject.set(x, "dismissOnClickOutside", js.undefined)
      
      inline def setDismissOnEsc(value: Boolean): Self = StObject.set(x, "dismissOnEsc", value.asInstanceOf[js.Any])
      
      inline def setDismissOnEscUndefined: Self = StObject.set(x, "dismissOnEsc", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnClose(value: () => js.Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: () => js.Any): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateChangeType */ open | close, /* nextState */ State, /* currentState */ State) => State
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
