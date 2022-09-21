package typings.baseui

import typings.baseui.layerTypesMod.TetherPlacement
import typings.baseui.popoverTypesMod.AccessibilityType
import typings.baseui.popoverTypesMod.ContentRenderProp
import typings.baseui.popoverTypesMod.PopoverOverrides
import typings.baseui.popoverTypesMod.TriggerType
import typings.baseui.tooltipTypesMod.TooltipProps
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.FocusOptions
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipMod {
  
  @JSImport("baseui/tooltip/tooltip", JSImport.Default)
  @js.native
  open class default () extends Tooltip
  object default {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/tooltip/types.TooltipProps> */
    object defaultProps {
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.accessibilityType")
      @js.native
      def accessibilityType: js.UndefOr[AccessibilityType] = js.native
      inline def accessibilityType_=(x: js.UndefOr[AccessibilityType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityType")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.animateOutTime")
      @js.native
      def animateOutTime: js.UndefOr[Double] = js.native
      inline def animateOutTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateOutTime")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.autoFocus")
      @js.native
      def autoFocus: js.UndefOr[Boolean] = js.native
      inline def autoFocus_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.children")
      @js.native
      def children: js.UndefOr[ReactNode] = js.native
      inline def children_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.content")
      @js.native
      def content: js.UndefOr[ReactNode | ContentRenderProp] = js.native
      inline def content_=(x: js.UndefOr[ReactNode | ContentRenderProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.data-baseweb")
      @js.native
      def dataBaseweb: js.UndefOr[String] = js.native
      
      inline def dataBaseweb_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-baseweb")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.focusLock")
      @js.native
      def focusLock: js.UndefOr[Boolean] = js.native
      inline def focusLock_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusLock")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.focusOptions")
      @js.native
      def focusOptions: js.UndefOr[FocusOptions] = js.native
      inline def focusOptions_=(x: js.UndefOr[FocusOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.id")
      @js.native
      def id: js.UndefOr[String] = js.native
      inline def id_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.ignoreBoundary")
      @js.native
      def ignoreBoundary: js.UndefOr[Boolean] = js.native
      inline def ignoreBoundary_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreBoundary")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.isOpen")
      @js.native
      def isOpen: js.UndefOr[Boolean] = js.native
      inline def isOpen_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.mountNode")
      @js.native
      def mountNode: js.UndefOr[HTMLElement] = js.native
      inline def mountNode_=(x: js.UndefOr[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mountNode")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.onBlur")
      @js.native
      def onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]] = js.native
      inline def onBlur_=(x: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.onClick")
      @js.native
      def onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Any]] = js.native
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.onClickOutside")
      @js.native
      def onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, Any]] = js.native
      inline def onClickOutside_=(x: js.UndefOr[js.Function1[/* event */ MouseEvent, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClickOutside")(x.asInstanceOf[js.Any])
      
      inline def onClick_=(x: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.onEsc")
      @js.native
      def onEsc: js.UndefOr[js.Function0[Any]] = js.native
      inline def onEsc_=(x: js.UndefOr[js.Function0[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEsc")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.onFocus")
      @js.native
      def onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]] = js.native
      inline def onFocus_=(x: js.UndefOr[js.Function1[/* e */ FocusEvent[Element, Element], Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.onMouseEnter")
      @js.native
      def onMouseEnter: js.UndefOr[
            js.Function1[/* e */ typings.react.mod.MouseEvent[Element, NativeMouseEvent], Any]
          ] = js.native
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.onMouseEnterDelay")
      @js.native
      def onMouseEnterDelay: js.UndefOr[Double] = js.native
      inline def onMouseEnterDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseEnter_=(
        x: js.UndefOr[
              js.Function1[/* e */ typings.react.mod.MouseEvent[Element, NativeMouseEvent], Any]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.onMouseLeave")
      @js.native
      def onMouseLeave: js.UndefOr[
            js.Function1[/* e */ typings.react.mod.MouseEvent[Element, NativeMouseEvent], Any]
          ] = js.native
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.onMouseLeaveDelay")
      @js.native
      def onMouseLeaveDelay: js.UndefOr[Double] = js.native
      inline def onMouseLeaveDelay_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveDelay")(x.asInstanceOf[js.Any])
      
      inline def onMouseLeave_=(
        x: js.UndefOr[
              js.Function1[/* e */ typings.react.mod.MouseEvent[Element, NativeMouseEvent], Any]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[PopoverOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[PopoverOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.placement")
      @js.native
      def placement: js.UndefOr[TetherPlacement] = js.native
      inline def placement_=(x: js.UndefOr[TetherPlacement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.popoverMargin")
      @js.native
      def popoverMargin: js.UndefOr[Double] = js.native
      inline def popoverMargin_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.popperOptions")
      @js.native
      def popperOptions: js.UndefOr[Any] = js.native
      inline def popperOptions_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperOptions")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.renderAll")
      @js.native
      def renderAll: js.UndefOr[Boolean] = js.native
      inline def renderAll_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderAll")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.returnFocus")
      @js.native
      def returnFocus: js.UndefOr[
            Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
          ] = js.native
      inline def returnFocus_=(
        x: js.UndefOr[
              Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.showArrow")
      @js.native
      def showArrow: js.UndefOr[Boolean] = js.native
      inline def showArrow_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tooltip/tooltip", "default.defaultProps.triggerType")
      @js.native
      def triggerType: js.UndefOr[TriggerType] = js.native
      inline def triggerType_=(x: js.UndefOr[TriggerType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tooltip
    extends Component[TooltipProps, js.Object, Any]
}
