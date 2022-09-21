package typings.baseui

import typings.baseui.anon.OmitPopoverPropschildren
import typings.baseui.anon.PartialBasePopoverProps
import typings.baseui.anon.PopoverPropsinnerRefRefHT
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.click
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.menu
import typings.baseui.layerTypesMod.TetherPlacement
import typings.baseui.popoverStatefulContainerMod.default
import typings.baseui.popoverTypesMod.AccessibilityType
import typings.baseui.popoverTypesMod.ArrowStylePropsArg
import typings.baseui.popoverTypesMod.BodyStylePropsArg
import typings.baseui.popoverTypesMod.InnerStylePropsArg
import typings.baseui.popoverTypesMod.PopoverOverrides
import typings.baseui.popoverTypesMod.State
import typings.baseui.popoverTypesMod.StateReducer
import typings.baseui.popoverTypesMod.StatefulContentRenderProp
import typings.baseui.popoverTypesMod.StatefulPopoverProps
import typings.baseui.popoverTypesMod.TriggerType
import typings.react.mod.FocusEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.FocusOptions
import typings.std.HTMLElement
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod {
  
  object ACCESSIBILITY_TYPE {
    
    @JSImport("baseui/popover", "ACCESSIBILITY_TYPE.menu")
    @js.native
    val menu: typings.baseui.baseuiStrings.menu = js.native
    
    @JSImport("baseui/popover", "ACCESSIBILITY_TYPE.none")
    @js.native
    val none: typings.baseui.baseuiStrings.none = js.native
    
    @JSImport("baseui/popover", "ACCESSIBILITY_TYPE.tooltip")
    @js.native
    val tooltip: typings.baseui.baseuiStrings.tooltip = js.native
  }
  
  @JSImport("baseui/popover", "ANIMATE_IN_TIME")
  @js.native
  val ANIMATE_IN_TIME: /* 20 */ Double = js.native
  
  @JSImport("baseui/popover", "ANIMATE_OUT_TIME")
  @js.native
  val ANIMATE_OUT_TIME: /* 0 */ Double = js.native
  
  object PLACEMENT {
    
    @JSImport("baseui/popover", "PLACEMENT.auto")
    @js.native
    val auto: typings.baseui.baseuiStrings.auto = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.bottom")
    @js.native
    val bottom: typings.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.bottomLeft")
    @js.native
    val bottomLeft: typings.baseui.baseuiStrings.bottomLeft = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.bottomRight")
    @js.native
    val bottomRight: typings.baseui.baseuiStrings.bottomRight = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.left")
    @js.native
    val left: typings.baseui.baseuiStrings.left = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.leftBottom")
    @js.native
    val leftBottom: typings.baseui.baseuiStrings.leftBottom = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.leftTop")
    @js.native
    val leftTop: typings.baseui.baseuiStrings.leftTop = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.right")
    @js.native
    val right: typings.baseui.baseuiStrings.right = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.rightBottom")
    @js.native
    val rightBottom: typings.baseui.baseuiStrings.rightBottom = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.rightTop")
    @js.native
    val rightTop: typings.baseui.baseuiStrings.rightTop = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.top")
    @js.native
    val top: typings.baseui.baseuiStrings.top = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.topLeft")
    @js.native
    val topLeft: typings.baseui.baseuiStrings.topLeft = js.native
    
    @JSImport("baseui/popover", "PLACEMENT.topRight")
    @js.native
    val topRight: typings.baseui.baseuiStrings.topRight = js.native
  }
  
  object Popover {
    
    inline def apply(props: PopoverPropsinnerRefRefHT): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/popover", "Popover")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/popover", "Popover.defaultProps")
    @js.native
    def defaultProps: PartialBasePopoverProps = js.native
    inline def defaultProps_=(x: PartialBasePopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/popover", "STATE_CHANGE_TYPE.close")
    @js.native
    val close: typings.baseui.baseuiStrings.close = js.native
    
    @JSImport("baseui/popover", "STATE_CHANGE_TYPE.open")
    @js.native
    val open: typings.baseui.baseuiStrings.open = js.native
  }
  
  @JSImport("baseui/popover", "StatefulContainer")
  @js.native
  open class StatefulContainer () extends default
  object StatefulContainer {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/popover/types.StatefulPopoverContainerProps> */
    object defaultProps {
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.accessibilityType")
      @js.native
      def accessibilityType: js.UndefOr[AccessibilityType] = js.native
      inline def accessibilityType_=(x: js.UndefOr[AccessibilityType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.animateOutTime")
      @js.native
      def animateOutTime: js.UndefOr[Double] = js.native
      inline def animateOutTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateOutTime")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.children")
      @js.native
      def children: js.UndefOr[js.Function1[/* props */ OmitPopoverPropschildren, ReactNode]] = js.native
      inline def children_=(x: js.UndefOr[js.Function1[/* props */ OmitPopoverPropschildren, ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.content")
      @js.native
      def content: js.UndefOr[ReactNode | StatefulContentRenderProp] = js.native
      inline def content_=(x: js.UndefOr[ReactNode | StatefulContentRenderProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.data-baseweb")
      @js.native
      def dataBaseweb: js.UndefOr[String] = js.native
      
      inline def dataBaseweb_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.dismissOnClickOutside")
      @js.native
      def dismissOnClickOutside: js.UndefOr[Boolean] = js.native
      inline def dismissOnClickOutside_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnClickOutside")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.dismissOnEsc")
      @js.native
      def dismissOnEsc: js.UndefOr[Boolean] = js.native
      inline def dismissOnEsc_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnEsc")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.focusLock")
      @js.native
      def focusLock: js.UndefOr[Boolean] = js.native
      inline def focusLock_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.focusOptions")
      @js.native
      def focusOptions: js.UndefOr[FocusOptions] = js.native
      inline def focusOptions_=(x: js.UndefOr[FocusOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.id")
      @js.native
      def id: js.UndefOr[String] = js.native
      inline def id_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.ignoreBoundary")
      @js.native
      def ignoreBoundary: js.UndefOr[Boolean] = js.native
      inline def ignoreBoundary_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.initialState")
      @js.native
      def initialState: js.UndefOr[State] = js.native
      inline def initialState_=(x: js.UndefOr[State]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.onBlur")
      @js.native
      def onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[typings.std.Element, typings.std.Element], Any]] = js.native
      inline def onBlur_=(x: js.UndefOr[js.Function1[/* e */ FocusEvent[typings.std.Element, typings.std.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.onClick")
      @js.native
      def onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[typings.std.Element, Event], Any]] = js.native
      inline def onClick_=(x: js.UndefOr[js.Function1[/* e */ SyntheticEvent[typings.std.Element, Event], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.onClose")
      @js.native
      def onClose: js.UndefOr[js.Function0[Any]] = js.native
      inline def onClose_=(x: js.UndefOr[js.Function0[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.onFocus")
      @js.native
      def onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[typings.std.Element, typings.std.Element], Any]] = js.native
      inline def onFocus_=(x: js.UndefOr[js.Function1[/* e */ FocusEvent[typings.std.Element, typings.std.Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.onMouseEnter")
      @js.native
      def onMouseEnter: js.UndefOr[js.Function1[/* e */ MouseEvent[typings.std.Element, NativeMouseEvent], Any]] = js.native
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.onMouseEnterDelay")
      @js.native
      def onMouseEnterDelay: js.UndefOr[Double] = js.native
      inline def onMouseEnterDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseEnter_=(x: js.UndefOr[js.Function1[/* e */ MouseEvent[typings.std.Element, NativeMouseEvent], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.onMouseLeave")
      @js.native
      def onMouseLeave: js.UndefOr[js.Function1[/* e */ MouseEvent[typings.std.Element, NativeMouseEvent], Any]] = js.native
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.onMouseLeaveDelay")
      @js.native
      def onMouseLeaveDelay: js.UndefOr[Double] = js.native
      inline def onMouseLeaveDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseLeave_=(x: js.UndefOr[js.Function1[/* e */ MouseEvent[typings.std.Element, NativeMouseEvent], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.onOpen")
      @js.native
      def onOpen: js.UndefOr[js.Function0[Any]] = js.native
      inline def onOpen_=(x: js.UndefOr[js.Function0[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[PopoverOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[PopoverOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.placement")
      @js.native
      def placement: js.UndefOr[TetherPlacement] = js.native
      inline def placement_=(x: js.UndefOr[TetherPlacement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.popoverMargin")
      @js.native
      def popoverMargin: js.UndefOr[Double] = js.native
      inline def popoverMargin_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.popperOptions")
      @js.native
      def popperOptions: js.UndefOr[Any] = js.native
      inline def popperOptions_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.renderAll")
      @js.native
      def renderAll: js.UndefOr[Boolean] = js.native
      inline def renderAll_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.returnFocus")
      @js.native
      def returnFocus: js.UndefOr[
            Boolean | FocusOptions | (js.Function1[/* returnTo */ typings.std.Element, Boolean | FocusOptions])
          ] = js.native
      inline def returnFocus_=(
        x: js.UndefOr[
              Boolean | FocusOptions | (js.Function1[/* returnTo */ typings.std.Element, Boolean | FocusOptions])
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.showArrow")
      @js.native
      def showArrow: js.UndefOr[Boolean] = js.native
      inline def showArrow_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: js.UndefOr[StateReducer] = js.native
      inline def stateReducer_=(x: js.UndefOr[StateReducer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulContainer.defaultProps.triggerType")
      @js.native
      def triggerType: js.UndefOr[TriggerType] = js.native
      inline def triggerType_=(x: js.UndefOr[TriggerType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
    }
  }
  
  object StatefulPopover {
    
    inline def apply(props: StatefulPopoverProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/popover", "StatefulPopover")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps.accessibilityType")
      @js.native
      def accessibilityType: menu = js.native
      inline def accessibilityType_=(x: menu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps.dismissOnClickOutside")
      @js.native
      def dismissOnClickOutside: Boolean = js.native
      inline def dismissOnClickOutside_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnClickOutside")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps.dismissOnEsc")
      @js.native
      def dismissOnEsc: Boolean = js.native
      inline def dismissOnEsc_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dismissOnEsc")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps.ignoreBoundary")
      @js.native
      def ignoreBoundary: Boolean = js.native
      inline def ignoreBoundary_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps.onMouseEnterDelay")
      @js.native
      def onMouseEnterDelay: Double = js.native
      inline def onMouseEnterDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps.onMouseLeaveDelay")
      @js.native
      def onMouseLeaveDelay: Double = js.native
      inline def onMouseLeaveDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps.placement")
      @js.native
      def placement: auto = js.native
      inline def placement_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps.popoverMargin")
      @js.native
      def popoverMargin: Double = js.native
      inline def popoverMargin_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps.showArrow")
      @js.native
      def showArrow: Boolean = js.native
      inline def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      inline def stateReducer(_underscore: Any, nextState: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stateReducer")(_underscore.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("baseui/popover", "StatefulPopover.defaultProps.triggerType")
      @js.native
      def triggerType: click = js.native
      inline def triggerType_=(x: click): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/popover", "StyledArrow")
  @js.native
  val StyledArrow: StyletronComponent[div, ArrowStylePropsArg] = js.native
  
  @JSImport("baseui/popover", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[div, BodyStylePropsArg] = js.native
  
  @JSImport("baseui/popover", "StyledInner")
  @js.native
  val StyledInner: StyletronComponent[div, InnerStylePropsArg] = js.native
  
  @JSImport("baseui/popover", "StyledPadding")
  @js.native
  val StyledPadding: StyletronComponent[div, js.Object] = js.native
  
  object TRIGGER_TYPE {
    
    @JSImport("baseui/popover", "TRIGGER_TYPE.click")
    @js.native
    val click: typings.baseui.baseuiStrings.click = js.native
    
    @JSImport("baseui/popover", "TRIGGER_TYPE.hover")
    @js.native
    val hover: typings.baseui.baseuiStrings.hover = js.native
  }
}
