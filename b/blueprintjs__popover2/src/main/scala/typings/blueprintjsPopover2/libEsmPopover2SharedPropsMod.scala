package typings.blueprintjsPopover2

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmComponentsOverlayOverlayMod.IOverlayableProps
import typings.blueprintjsCore.libEsmComponentsPopoverPopoverSharedPropsMod.PopoverPosition
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.applyStyles
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.arrow
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.computeStyles
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.dialog
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.eventListeners
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.flip
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.grid
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.hide
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.listbox
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.menu
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.offset
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.popperOffsets
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.preventOverflow
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.tree
import typings.popperjsCore.libEnumsMod.Boundary
import typings.popperjsCore.libEnumsMod.ModifierPhases_
import typings.popperjsCore.libEnumsMod.Placement
import typings.popperjsCore.libEnumsMod.RootBoundary
import typings.popperjsCore.libTypesMod.ModifierArguments
import typings.popperjsCore.libTypesMod.Obj
import typings.popperjsCore.libTypesMod.State
import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.NonNullable
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPopover2SharedPropsMod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/popover2SharedProps", "PlacementOptions")
  @js.native
  val PlacementOptions: js.Array[Placement] = js.native
  
  type DefaultPopover2TargetHTMLProps = HTMLProps[HTMLElement]
  
  trait IPopover2SharedProps[TProps /* <: DefaultPopover2TargetHTMLProps */]
    extends StObject
       with IOverlayableProps
       with IProps {
    
    /**
      * A boundary element supplied to the "flip" and "preventOverflow" modifiers.
      * This is a shorthand for overriding Popper.js modifier options with the `modifiers` prop.
      *
      * @see https://popper.js.org/docs/v2/utils/detect-overflow/#boundary
      */
    var boundary: js.UndefOr[Boundary] = js.undefined
    
    /**
      * When enabled, clicks inside a `Classes.POPOVER_DISMISS` element
      * will only close the current popover and not outer popovers.
      * When disabled, the current popover and any ancestor popovers will be closed.
      *
      * @see http://blueprintjs.com/docs/#core/components/popover.closing-on-click
      * @default false
      */
    var captureDismiss: js.UndefOr[Boolean] = js.undefined
    
    /** Interactive element which will trigger the popover. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Initial opened state when uncontrolled.
      *
      * @default false
      */
    var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevents the popover from appearing when `true`.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the wrapper and target should take up the full width of their container.
      * Note that supplying `true` for this prop will force  `targetTagName="div"`.
      */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The amount of time in milliseconds the popover should remain open after
      * the user hovers off the trigger. The timer is canceled if the user mouses
      * over the target before it expires.
      *
      * @default 300
      */
    var hoverCloseDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time in milliseconds the popover should wait before opening
      * after the user hovers over the trigger. The timer is canceled if the user
      * mouses away from the target before it expires.
      *
      * @default 150
      */
    var hoverOpenDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether a popover that uses a `Portal` should automatically inherit the
      * dark theme from its parent.
      *
      * @default true
      */
    var inheritDarkTheme: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the popover is visible. Passing this prop puts the popover in
      * controlled mode, where the only way to change visibility is by updating
      * this property. If `disabled={true}`, this prop will be ignored, and the
      * popover will remain closed.
      *
      * @default undefined
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the popover content should be sized to match the width of the target.
      * This is sometimes useful for dropdown menus. This prop is implemented using
      * a Popper.js custom modifier.
      *
      * @default false
      */
    var matchTargetWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to apply minimal styling to this popover or tooltip. Minimal popovers
      * do not have an arrow pointing to their target and use a subtler animation.
      *
      * @default false
      */
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overrides for Popper.js built-in modifiers.
      * Each override is is a full modifier object (omitting its name), keyed by its modifier name.
      *
      * For example, the arrow modifier can be disabled by providing `{ arrow: { enabled: false } }`.
      *
      * Some of Popover2's default modifiers may get disabled under certain circumstances, but you may
      * choose to re-enable and customize them. For example, "offset" is disabled when `minimal={true}`,
      * but you can re-enable it with `{ offset: { enabled: true } }`.
      *
      * @see https://popper.js.org/docs/v2/modifiers/
      */
    var modifiers: js.UndefOr[PopperModifierOverrides] = js.undefined
    
    /**
      * Custom modifiers to add to the popper instance.
      *
      * @see https://popper.js.org/docs/v2/modifiers/#custom-modifiers
      */
    var modifiersCustom: js.UndefOr[js.Array[PopperCustomModifer]] = js.undefined
    
    /**
      * Callback invoked in controlled mode when the popover open state *would*
      * change due to user interaction.
      */
    var onInteraction: js.UndefOr[
        js.Function2[
          /* nextOpenState */ Boolean, 
          /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Whether the popover should open when its target is focused. If `true`,
      * target will render with `tabindex="0"` to make it focusable via keyboard
      * navigation.
      *
      * Note that this functionality is only enabled for hover interaction
      * popovers/tooltips.
      *
      * @default true
      */
    var openOnTargetFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The placement (relative to the target) at which the popover should appear.
      * Mutually exclusive with `position` prop. Prefer using this over `position`,
      * as it more closely aligns with Popper.js semantics.
      *
      * The default value of `"auto"` will choose the best placement when opened
      * and will allow the popover to reposition itself to remain onscreen as the
      * user scrolls around.
      *
      * @default "auto"
      */
    var placement: js.UndefOr[Placement] = js.undefined
    
    /**
      * A space-delimited string of class names applied to the popover element.
      */
    var popoverClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Ref supplied to the `Classes.POPOVER` element.
      */
    var popoverRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    /**
      * The position (relative to the target) at which the popover should appear.
      * Mutually exclusive with `placement` prop.
      *
      * The default value of `"auto"` will choose the best position when opened
      * and will allow the popover to reposition itself to remain onscreen as the
      * user scrolls around.
      *
      * @default "auto"
      */
    var position: js.UndefOr[PopoverPosition] = js.undefined
    
    /**
      * Target renderer which receives props injected by Popover2 which should be spread onto
      * the rendered element. This function should return a single React node.
      *
      * Mutually exclusive with `children` and `targetTagName` props.
      */
    var renderTarget: js.UndefOr[
        js.Function1[
          /* props */ Popover2TargetProps & Popover2HoverTargetHandlers[TProps] & Popover2ClickTargetHandlers[TProps], 
          Element
        ]
      ] = js.undefined
    
    /**
      * A root boundary element supplied to the "flip" and "preventOverflow" modifiers.
      * This is a shorthand for overriding Popper.js modifier options with the `modifiers` prop.
      *
      * @see https://popper.js.org/docs/v2/utils/detect-overflow/#rootboundary
      */
    var rootBoundary: js.UndefOr[RootBoundary] = js.undefined
    
    /**
      * HTML props for the target element. This is useful in some cases where you
      * need to render some simple attributes on the generated target element.
      *
      * For more complex use cases, consider using the `renderTarget` API instead.
      * This prop will be ignored if `renderTarget` is used.
      */
    var targetProps: js.UndefOr[TProps] = js.undefined
    
    /**
      * HTML tag name for the target element. This must be an HTML element to
      * ensure that it supports the necessary DOM event handlers.
      *
      * By default, a `<span>` tag is used so popovers appear as inline-block
      * elements and can be nested in text. Use `<div>` tag for a block element.
      *
      * If `fill` is set to `true`, this prop's default value will become `"div"`
      * instead of `"span"`.
      *
      * Note that _not all HTML tags are supported_; you will need to make sure
      * the tag you choose supports the HTML attributes Popover2 applies to the
      * target element.
      *
      * This prop is mutually exclusive with the `renderTarget` API.
      *
      * @default "span" ("div" if `fill={true}`)
      */
    var targetTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.blueprintjsPopover2.blueprintjsPopover2Strings.a, typings.blueprintjsPopover2.blueprintjsPopover2Strings.abbr, typings.blueprintjsPopover2.blueprintjsPopover2Strings.address */ Any
      ] = js.undefined
  }
  object IPopover2SharedProps {
    
    inline def apply[TProps /* <: DefaultPopover2TargetHTMLProps */](): IPopover2SharedProps[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopover2SharedProps[TProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPopover2SharedProps[?], TProps /* <: DefaultPopover2TargetHTMLProps */] (val x: Self & IPopover2SharedProps[TProps]) extends AnyVal {
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setBoundaryVarargs(value: typings.std.Element*): Self = StObject.set(x, "boundary", js.Array(value*))
      
      inline def setCaptureDismiss(value: Boolean): Self = StObject.set(x, "captureDismiss", value.asInstanceOf[js.Any])
      
      inline def setCaptureDismissUndefined: Self = StObject.set(x, "captureDismiss", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      inline def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      inline def setInheritDarkTheme(value: Boolean): Self = StObject.set(x, "inheritDarkTheme", value.asInstanceOf[js.Any])
      
      inline def setInheritDarkThemeUndefined: Self = StObject.set(x, "inheritDarkTheme", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setMatchTargetWidth(value: Boolean): Self = StObject.set(x, "matchTargetWidth", value.asInstanceOf[js.Any])
      
      inline def setMatchTargetWidthUndefined: Self = StObject.set(x, "matchTargetWidth", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setModifiers(value: PopperModifierOverrides): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersCustom(value: js.Array[PopperCustomModifer]): Self = StObject.set(x, "modifiersCustom", value.asInstanceOf[js.Any])
      
      inline def setModifiersCustomUndefined: Self = StObject.set(x, "modifiersCustom", js.undefined)
      
      inline def setModifiersCustomVarargs(value: PopperCustomModifer*): Self = StObject.set(x, "modifiersCustom", js.Array(value*))
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setOnInteraction(
        value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit
      ): Self = StObject.set(x, "onInteraction", js.Any.fromFunction2(value))
      
      inline def setOnInteractionUndefined: Self = StObject.set(x, "onInteraction", js.undefined)
      
      inline def setOpenOnTargetFocus(value: Boolean): Self = StObject.set(x, "openOnTargetFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnTargetFocusUndefined: Self = StObject.set(x, "openOnTargetFocus", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopoverClassName(value: String): Self = StObject.set(x, "popoverClassName", value.asInstanceOf[js.Any])
      
      inline def setPopoverClassNameUndefined: Self = StObject.set(x, "popoverClassName", js.undefined)
      
      inline def setPopoverRef(value: Ref[HTMLElement]): Self = StObject.set(x, "popoverRef", value.asInstanceOf[js.Any])
      
      inline def setPopoverRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "popoverRef", js.Any.fromFunction1(value))
      
      inline def setPopoverRefNull: Self = StObject.set(x, "popoverRef", null)
      
      inline def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
      
      inline def setPosition(value: PopoverPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRenderTarget(
        value: /* props */ Popover2TargetProps & Popover2HoverTargetHandlers[TProps] & Popover2ClickTargetHandlers[TProps] => Element
      ): Self = StObject.set(x, "renderTarget", js.Any.fromFunction1(value))
      
      inline def setRenderTargetUndefined: Self = StObject.set(x, "renderTarget", js.undefined)
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
      
      inline def setRootBoundaryUndefined: Self = StObject.set(x, "rootBoundary", js.undefined)
      
      inline def setTargetProps(value: TProps): Self = StObject.set(x, "targetProps", value.asInstanceOf[js.Any])
      
      inline def setTargetPropsUndefined: Self = StObject.set(x, "targetProps", js.undefined)
      
      inline def setTargetTagName(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.blueprintjsPopover2.blueprintjsPopover2Strings.a, typings.blueprintjsPopover2.blueprintjsPopover2Strings.abbr, typings.blueprintjsPopover2.blueprintjsPopover2Strings.address */ Any
      ): Self = StObject.set(x, "targetTagName", value.asInstanceOf[js.Any])
      
      inline def setTargetTagNameUndefined: Self = StObject.set(x, "targetTagName", js.undefined)
    }
  }
  
  /* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLElement>, 'aria-haspopup' | 'className' | 'tabIndex'> */
  trait IPopover2TargetProps extends StObject {
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** Whether the popover or tooltip is currently open. */
    var isOpen: Boolean
    
    /** Target ref. */
    var ref: Ref[Any]
    
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object IPopover2TargetProps {
    
    inline def apply(isOpen: Boolean): IPopover2TargetProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[IPopover2TargetProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPopover2TargetProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  /* Inlined std.Pick<TProps, 'onClick' | 'onKeyDown'> */
  trait Popover2ClickTargetHandlers[TProps /* <: DefaultPopover2TargetHTMLProps */] extends StObject {
    
    var onClick: js.UndefOr[Any] = js.undefined
    
    var onKeyDown: js.UndefOr[Any] = js.undefined
  }
  object Popover2ClickTargetHandlers {
    
    inline def apply[TProps /* <: DefaultPopover2TargetHTMLProps */](): Popover2ClickTargetHandlers[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Popover2ClickTargetHandlers[TProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Popover2ClickTargetHandlers[?], TProps /* <: DefaultPopover2TargetHTMLProps */] (val x: Self & Popover2ClickTargetHandlers[TProps]) extends AnyVal {
      
      inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: Any): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  /* Inlined std.Pick<TProps, 'onBlur' | 'onContextMenu' | 'onFocus' | 'onMouseEnter' | 'onMouseLeave'> */
  trait Popover2HoverTargetHandlers[TProps /* <: DefaultPopover2TargetHTMLProps */] extends StObject {
    
    var onBlur: js.UndefOr[Any] = js.undefined
    
    var onContextMenu: js.UndefOr[Any] = js.undefined
    
    var onFocus: js.UndefOr[Any] = js.undefined
    
    var onMouseEnter: js.UndefOr[Any] = js.undefined
    
    var onMouseLeave: js.UndefOr[Any] = js.undefined
  }
  object Popover2HoverTargetHandlers {
    
    inline def apply[TProps /* <: DefaultPopover2TargetHTMLProps */](): Popover2HoverTargetHandlers[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Popover2HoverTargetHandlers[TProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Popover2HoverTargetHandlers[?], TProps /* <: DefaultPopover2TargetHTMLProps */] (val x: Self & Popover2HoverTargetHandlers[TProps]) extends AnyVal {
      
      inline def setOnBlur(value: Any): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnContextMenu(value: Any): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: Any): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnMouseEnter(value: Any): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: Any): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    }
  }
  
  type Popover2SharedProps[T /* <: DefaultPopover2TargetHTMLProps */] = IPopover2SharedProps[T]
  
  type Popover2TargetProps = IPopover2TargetProps
  
  /* Inlined std.Partial<@popperjs/core.@popperjs/core.Modifier<any, object>> */
  trait PopperCustomModifer extends StObject {
    
    var data: js.UndefOr[Obj] = js.undefined
    
    var effect: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[js.Object], js.Function0[Unit] | Unit]] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var fn: js.UndefOr[js.Function1[/* arg0 */ ModifierArguments[js.Object], State | Unit]] = js.undefined
    
    var name: js.UndefOr[Any] = js.undefined
    
    var options: js.UndefOr[Partial[js.Object]] = js.undefined
    
    var phase: js.UndefOr[ModifierPhases_] = js.undefined
    
    var requires: js.UndefOr[js.Array[String]] = js.undefined
    
    var requiresIfExists: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PopperCustomModifer {
    
    inline def apply(): PopperCustomModifer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopperCustomModifer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopperCustomModifer] (val x: Self) extends AnyVal {
      
      inline def setData(value: Obj): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEffect(value: /* arg0 */ ModifierArguments[js.Object] => js.Function0[Unit] | Unit): Self = StObject.set(x, "effect", js.Any.fromFunction1(value))
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFn(value: /* arg0 */ ModifierArguments[js.Object] => State | Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: Partial[js.Object]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPhase(value: ModifierPhases_): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
      
      inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
      
      inline def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      inline def setRequiresIfExists(value: js.Array[String]): Self = StObject.set(x, "requiresIfExists", value.asInstanceOf[js.Any])
      
      inline def setRequiresIfExistsUndefined: Self = StObject.set(x, "requiresIfExists", js.undefined)
      
      inline def setRequiresIfExistsVarargs(value: String*): Self = StObject.set(x, "requiresIfExists", js.Array(value*))
      
      inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
      
      inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value*))
    }
  }
  
  type PopperModifierOverrides = Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ M in @blueprintjs/popover2.@blueprintjs/popover2/lib/esm/popover2SharedProps.StrictModifierNames ]: std.Partial<std.Omit<react-popper.react-popper.StrictModifier<M>, 'name'>>} */ js.Any
  ]
  
  type StrictModifierNames = NonNullable[
    js.UndefOr[
      offset | applyStyles | arrow | hide | computeStyles | eventListeners | flip | preventOverflow | popperOffsets
    ]
  ]
}
