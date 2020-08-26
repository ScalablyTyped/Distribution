package typings.blueprintjsCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.blueprintjsCore.alignmentMod.Alignment
import typings.blueprintjsCore.anon.Key
import typings.blueprintjsCore.blueprintjsCoreNumbers.`0`
import typings.blueprintjsCore.blueprintjsCoreNumbers.`1`
import typings.blueprintjsCore.blueprintjsCoreNumbers.`2`
import typings.blueprintjsCore.blueprintjsCoreNumbers.`3`
import typings.blueprintjsCore.blueprintjsCoreNumbers.`4`
import typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
import typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
import typings.blueprintjsCore.blueprintjsCoreStrings.`left-bottom`
import typings.blueprintjsCore.blueprintjsCoreStrings.`left-top`
import typings.blueprintjsCore.blueprintjsCoreStrings.`right-bottom`
import typings.blueprintjsCore.blueprintjsCoreStrings.`right-top`
import typings.blueprintjsCore.blueprintjsCoreStrings.`top-left`
import typings.blueprintjsCore.blueprintjsCoreStrings.`top-right`
import typings.blueprintjsCore.blueprintjsCoreStrings.bottom
import typings.blueprintjsCore.blueprintjsCoreStrings.center
import typings.blueprintjsCore.blueprintjsCoreStrings.danger
import typings.blueprintjsCore.blueprintjsCoreStrings.end
import typings.blueprintjsCore.blueprintjsCoreStrings.left
import typings.blueprintjsCore.blueprintjsCoreStrings.none
import typings.blueprintjsCore.blueprintjsCoreStrings.primary
import typings.blueprintjsCore.blueprintjsCoreStrings.right
import typings.blueprintjsCore.blueprintjsCoreStrings.start
import typings.blueprintjsCore.blueprintjsCoreStrings.success
import typings.blueprintjsCore.blueprintjsCoreStrings.top
import typings.blueprintjsCore.blueprintjsCoreStrings.warning
import typings.blueprintjsCore.compareUtilsMod.IKeyAllowlist
import typings.blueprintjsCore.compareUtilsMod.IKeyDenylist
import typings.blueprintjsCore.domUtilsMod.IThrottledReactEventOptions
import typings.blueprintjsCore.elevationMod.Elevation
import typings.blueprintjsCore.intentMod.Intent
import typings.blueprintjsCore.positionMod.Position
import typings.blueprintjsCore.reactUtilsMod.INamed
import typings.blueprintjsCore.refsMod.IRef
import typings.blueprintjsCore.refsMod.IRefObject
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  @js.native
  abstract class AbstractComponent[P, S] ()
    extends typings.blueprintjsCore.abstractComponentMod.AbstractComponent[P, S] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
  }
  
  @js.native
  abstract class AbstractComponent2[P, S, SS] ()
    extends typings.blueprintjsCore.abstractComponent2Mod.AbstractComponent2[P, S, SS] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
  }
  
  @js.native
  abstract class AbstractPureComponent[P, S] ()
    extends typings.blueprintjsCore.abstractPureComponentMod.AbstractPureComponent[P, S] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
  }
  
  @js.native
  abstract class AbstractPureComponent2[P, S, SS] ()
    extends typings.blueprintjsCore.abstractPureComponent2Mod.AbstractPureComponent2[P, S, SS] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
  }
  
  val DISPLAYNAME_PREFIX: /* "Blueprint3" */ String = js.native
  def getPositionIgnoreAngles(position: Position): left | right | bottom | top = js.native
  def getRef[T](ref: T): T = js.native
  def getRef[T](ref: IRefObject[T]): T = js.native
  def isPositionHorizontal(position: Position): Boolean = js.native
  def isPositionVertical(position: Position): Boolean = js.native
  def isRefCallback[T /* <: HTMLElement */](): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefCallback<T> */ Boolean = js.native
  def isRefCallback[T /* <: HTMLElement */](value: IRef[T]): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefCallback<T> */ Boolean = js.native
  def isRefObject[T /* <: HTMLElement */](): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefObject<T> */ Boolean = js.native
  def isRefObject[T /* <: HTMLElement */](value: IRef[T]): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefObject<T> */ Boolean = js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.UndefOr[scala.Nothing], shouldMerge: Boolean): StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.Array[String]): StringDictionary[js.Any] = js.native
  def removeNonHTMLProps(props: StringDictionary[js.Any], invalidProps: js.Array[String], shouldMerge: Boolean): StringDictionary[js.Any] = js.native
  @js.native
  object Alignment extends js.Object {
    var CENTER: center = js.native
    var LEFT: left = js.native
    var RIGHT: right = js.native
  }
  
  @js.native
  object Boundary extends js.Object {
    var END: end = js.native
    var START: start = js.native
  }
  
  @js.native
  object Classes extends js.Object {
    val ACTIVE: String = js.native
    val ALERT: String = js.native
    val ALERT_BODY: String = js.native
    val ALERT_CONTENTS: String = js.native
    val ALERT_FOOTER: String = js.native
    val ALIGN_LEFT: String = js.native
    val ALIGN_RIGHT: String = js.native
    val BLOCKQUOTE: String = js.native
    val BREADCRUMB: String = js.native
    val BREADCRUMBS: String = js.native
    val BREADCRUMBS_COLLAPSED: String = js.native
    val BREADCRUMB_CURRENT: String = js.native
    val BUTTON: String = js.native
    val BUTTON_GROUP: String = js.native
    val BUTTON_SPINNER: String = js.native
    val BUTTON_TEXT: String = js.native
    val CALLOUT: String = js.native
    val CALLOUT_ICON: String = js.native
    val CARD: String = js.native
    val CHECKBOX: String = js.native
    val CODE: String = js.native
    val CODE_BLOCK: String = js.native
    val COLLAPSE: String = js.native
    val COLLAPSE_BODY: String = js.native
    val COLLAPSIBLE_LIST: String = js.native
    val CONTEXT_MENU: String = js.native
    val CONTEXT_MENU_POPOVER_TARGET: String = js.native
    val CONTROL: String = js.native
    val CONTROL_GROUP: String = js.native
    val CONTROL_INDICATOR: String = js.native
    val CONTROL_INDICATOR_CHILD: String = js.native
    val DARK: String = js.native
    val DIALOG: String = js.native
    val DIALOG_BODY: String = js.native
    val DIALOG_CLOSE_BUTTON: String = js.native
    val DIALOG_CONTAINER: String = js.native
    val DIALOG_FOOTER: String = js.native
    val DIALOG_FOOTER_ACTIONS: String = js.native
    val DIALOG_HEADER: String = js.native
    val DISABLED: String = js.native
    val DIVIDER: String = js.native
    val DRAWER: String = js.native
    val DRAWER_BODY: String = js.native
    val DRAWER_FOOTER: String = js.native
    val DRAWER_HEADER: String = js.native
    val EDITABLE_TEXT: String = js.native
    val EDITABLE_TEXT_CONTENT: String = js.native
    val EDITABLE_TEXT_EDITING: String = js.native
    val EDITABLE_TEXT_INPUT: String = js.native
    val EDITABLE_TEXT_PLACEHOLDER: String = js.native
    val ELEVATION_0: String = js.native
    val ELEVATION_1: String = js.native
    val ELEVATION_2: String = js.native
    val ELEVATION_3: String = js.native
    val ELEVATION_4: String = js.native
    val END: String = js.native
    val FILE_INPUT: String = js.native
    val FILE_INPUT_HAS_SELECTION: String = js.native
    val FILE_UPLOAD_INPUT: String = js.native
    val FILE_UPLOAD_INPUT_CUSTOM_TEXT: String = js.native
    val FILL: String = js.native
    val FIXED: String = js.native
    val FIXED_TOP: String = js.native
    val FLEX_EXPANDER: String = js.native
    val FOCUS_DISABLED: String = js.native
    val FORM_CONTENT: String = js.native
    val FORM_GROUP: String = js.native
    val FORM_HELPER_TEXT: String = js.native
    val HEADING: String = js.native
    val HOTKEY: String = js.native
    val HOTKEY_COLUMN: String = js.native
    val HOTKEY_DIALOG: String = js.native
    val HOTKEY_LABEL: String = js.native
    val HTML_SELECT: String = js.native
    val HTML_TABLE: String = js.native
    val HTML_TABLE_BORDERED: String = js.native
    val HTML_TABLE_CONDENSED: String = js.native
    val HTML_TABLE_STRIPED: String = js.native
    val ICON: String = js.native
    val ICON_LARGE: String = js.native
    val ICON_STANDARD: String = js.native
    val INLINE: String = js.native
    val INPUT: String = js.native
    val INPUT_ACTION: String = js.native
    val INPUT_GHOST: String = js.native
    val INPUT_GROUP: String = js.native
    val INPUT_LEFT_CONTAINER: String = js.native
    val INTENT_DANGER: String = js.native
    val INTENT_PRIMARY: String = js.native
    val INTENT_SUCCESS: String = js.native
    val INTENT_WARNING: String = js.native
    val INTERACTIVE: String = js.native
    val KEY: String = js.native
    val KEY_COMBO: String = js.native
    val LABEL: String = js.native
    val LARGE: String = js.native
    val LIST: String = js.native
    val LIST_UNSTYLED: String = js.native
    val LOADING: String = js.native
    val MENU: String = js.native
    val MENU_DIVIDER: String = js.native
    val MENU_HEADER: String = js.native
    val MENU_ITEM: String = js.native
    val MENU_ITEM_LABEL: String = js.native
    val MENU_SUBMENU: String = js.native
    val MINIMAL: String = js.native
    val MODIFIER_KEY: String = js.native
    val MONOSPACE_TEXT: String = js.native
    val MULTILINE: String = js.native
    val NAVBAR: String = js.native
    val NAVBAR_DIVIDER: String = js.native
    val NAVBAR_GROUP: String = js.native
    val NAVBAR_HEADING: String = js.native
    val NON_IDEAL_STATE: String = js.native
    val NON_IDEAL_STATE_VISUAL: String = js.native
    val NUMERIC_INPUT: String = js.native
    val OUTLINED: String = js.native
    val OVERFLOW_LIST: String = js.native
    val OVERFLOW_LIST_SPACER: String = js.native
    val OVERLAY: String = js.native
    val OVERLAY_BACKDROP: String = js.native
    val OVERLAY_CONTAINER: String = js.native
    val OVERLAY_CONTENT: String = js.native
    val OVERLAY_INLINE: String = js.native
    val OVERLAY_OPEN: String = js.native
    val OVERLAY_SCROLL_CONTAINER: String = js.native
    val PANEL_STACK: String = js.native
    val PANEL_STACK_HEADER: String = js.native
    val PANEL_STACK_HEADER_BACK: String = js.native
    val PANEL_STACK_VIEW: String = js.native
    val POPOVER: String = js.native
    val POPOVER_ARROW: String = js.native
    val POPOVER_BACKDROP: String = js.native
    val POPOVER_CONTENT: String = js.native
    val POPOVER_CONTENT_SIZING: String = js.native
    val POPOVER_DISMISS: String = js.native
    val POPOVER_DISMISS_OVERRIDE: String = js.native
    val POPOVER_OPEN: String = js.native
    val POPOVER_TARGET: String = js.native
    val POPOVER_WRAPPER: String = js.native
    val PORTAL: String = js.native
    val POSITION_BOTTOM: String = js.native
    val POSITION_LEFT: String = js.native
    val POSITION_RIGHT: String = js.native
    val POSITION_TOP: String = js.native
    val PROGRESS_BAR: String = js.native
    val PROGRESS_METER: String = js.native
    val PROGRESS_NO_ANIMATION: String = js.native
    val PROGRESS_NO_STRIPES: String = js.native
    val RADIO: String = js.native
    val ROUND: String = js.native
    val RTL: String = js.native
    val RUNNING_TEXT: String = js.native
    val SELECT: String = js.native
    val SKELETON: String = js.native
    val SLIDER: String = js.native
    val SLIDER_AXIS: String = js.native
    val SLIDER_HANDLE: String = js.native
    val SLIDER_LABEL: String = js.native
    val SLIDER_PROGRESS: String = js.native
    val SLIDER_TRACK: String = js.native
    val SMALL: String = js.native
    val SPINNER: String = js.native
    val SPINNER_ANIMATION: String = js.native
    val SPINNER_HEAD: String = js.native
    val SPINNER_NO_SPIN: String = js.native
    val SPINNER_TRACK: String = js.native
    val START: String = js.native
    val SWITCH: String = js.native
    val SWITCH_INNER_TEXT: String = js.native
    val TAB: String = js.native
    val TABS: String = js.native
    val TAB_INDICATOR: String = js.native
    val TAB_INDICATOR_WRAPPER: String = js.native
    val TAB_LIST: String = js.native
    val TAB_PANEL: String = js.native
    val TAG: String = js.native
    val TAG_INPUT: String = js.native
    val TAG_INPUT_ICON: String = js.native
    val TAG_INPUT_VALUES: String = js.native
    val TAG_REMOVE: String = js.native
    val TEXT_DISABLED: String = js.native
    val TEXT_LARGE: String = js.native
    val TEXT_MUTED: String = js.native
    val TEXT_OVERFLOW_ELLIPSIS: String = js.native
    val TEXT_SMALL: String = js.native
    val TOAST: String = js.native
    val TOAST_CONTAINER: String = js.native
    val TOAST_MESSAGE: String = js.native
    val TOOLTIP: String = js.native
    val TOOLTIP_INDICATOR: String = js.native
    val TRANSITION_CONTAINER: String = js.native
    val TREE: String = js.native
    val TREE_NODE: String = js.native
    val TREE_NODE_CARET: String = js.native
    val TREE_NODE_CARET_CLOSED: String = js.native
    val TREE_NODE_CARET_NONE: String = js.native
    val TREE_NODE_CARET_OPEN: String = js.native
    val TREE_NODE_CONTENT: String = js.native
    val TREE_NODE_EXPANDED: String = js.native
    val TREE_NODE_ICON: String = js.native
    val TREE_NODE_LABEL: String = js.native
    val TREE_NODE_LIST: String = js.native
    val TREE_NODE_SECONDARY_LABEL: String = js.native
    val TREE_NODE_SELECTED: String = js.native
    val TREE_ROOT: String = js.native
    val UI_TEXT: String = js.native
    val VERTICAL: String = js.native
    def alignmentClass(alignment: Alignment): String = js.native
    def elevationClass(elevation: Elevation): String = js.native
    def getClassNamespace(): String = js.native
    def iconClass(): String = js.native
    def iconClass(iconName: String): String = js.native
    def intentClass(): String = js.native
    def intentClass(intent: Intent): String = js.native
    def positionClass(position: Position): String = js.native
  }
  
  @js.native
  object Colors extends js.Object {
    var BLACK: String = js.native
    var BLUE1: String = js.native
    var BLUE2: String = js.native
    var BLUE3: String = js.native
    var BLUE4: String = js.native
    var BLUE5: String = js.native
    var COBALT1: String = js.native
    var COBALT2: String = js.native
    var COBALT3: String = js.native
    var COBALT4: String = js.native
    var COBALT5: String = js.native
    var DARK_GRAY1: String = js.native
    var DARK_GRAY2: String = js.native
    var DARK_GRAY3: String = js.native
    var DARK_GRAY4: String = js.native
    var DARK_GRAY5: String = js.native
    var FOREST1: String = js.native
    var FOREST2: String = js.native
    var FOREST3: String = js.native
    var FOREST4: String = js.native
    var FOREST5: String = js.native
    var GOLD1: String = js.native
    var GOLD2: String = js.native
    var GOLD3: String = js.native
    var GOLD4: String = js.native
    var GOLD5: String = js.native
    var GRAY1: String = js.native
    var GRAY2: String = js.native
    var GRAY3: String = js.native
    var GRAY4: String = js.native
    var GRAY5: String = js.native
    var GREEN1: String = js.native
    var GREEN2: String = js.native
    var GREEN3: String = js.native
    var GREEN4: String = js.native
    var GREEN5: String = js.native
    var INDIGO1: String = js.native
    var INDIGO2: String = js.native
    var INDIGO3: String = js.native
    var INDIGO4: String = js.native
    var INDIGO5: String = js.native
    var LIGHT_GRAY1: String = js.native
    var LIGHT_GRAY2: String = js.native
    var LIGHT_GRAY3: String = js.native
    var LIGHT_GRAY4: String = js.native
    var LIGHT_GRAY5: String = js.native
    var LIME1: String = js.native
    var LIME2: String = js.native
    var LIME3: String = js.native
    var LIME4: String = js.native
    var LIME5: String = js.native
    var ORANGE1: String = js.native
    var ORANGE2: String = js.native
    var ORANGE3: String = js.native
    var ORANGE4: String = js.native
    var ORANGE5: String = js.native
    var RED1: String = js.native
    var RED2: String = js.native
    var RED3: String = js.native
    var RED4: String = js.native
    var RED5: String = js.native
    var ROSE1: String = js.native
    var ROSE2: String = js.native
    var ROSE3: String = js.native
    var ROSE4: String = js.native
    var ROSE5: String = js.native
    var SEPIA1: String = js.native
    var SEPIA2: String = js.native
    var SEPIA3: String = js.native
    var SEPIA4: String = js.native
    var SEPIA5: String = js.native
    var TURQUOISE1: String = js.native
    var TURQUOISE2: String = js.native
    var TURQUOISE3: String = js.native
    var TURQUOISE4: String = js.native
    var TURQUOISE5: String = js.native
    var VERMILION1: String = js.native
    var VERMILION2: String = js.native
    var VERMILION3: String = js.native
    var VERMILION4: String = js.native
    var VERMILION5: String = js.native
    var VIOLET1: String = js.native
    var VIOLET2: String = js.native
    var VIOLET3: String = js.native
    var VIOLET4: String = js.native
    var VIOLET5: String = js.native
    var WHITE: String = js.native
  }
  
  @js.native
  object Elevation extends js.Object {
    var FOUR: `4` = js.native
    var ONE: `1` = js.native
    var THREE: `3` = js.native
    var TWO: `2` = js.native
    var ZERO: `0` = js.native
  }
  
  @js.native
  object Intent extends js.Object {
    var DANGER: danger = js.native
    var NONE: none = js.native
    var PRIMARY: primary = js.native
    var SUCCESS: success = js.native
    var WARNING: warning = js.native
  }
  
  @js.native
  object Keys extends js.Object {
    val ARROW_DOWN: /* 40 */ Double = js.native
    val ARROW_LEFT: /* 37 */ Double = js.native
    val ARROW_RIGHT: /* 39 */ Double = js.native
    val ARROW_UP: /* 38 */ Double = js.native
    val BACKSPACE: /* 8 */ Double = js.native
    val DELETE: /* 46 */ Double = js.native
    val ENTER: /* 13 */ Double = js.native
    val ESCAPE: /* 27 */ Double = js.native
    val SHIFT: /* 16 */ Double = js.native
    val SPACE: /* 32 */ Double = js.native
    val TAB: /* 9 */ Double = js.native
    def isKeyboardClick(keyCode: Double): Boolean = js.native
  }
  
  @js.native
  object Position extends js.Object {
    var BOTTOM: bottom = js.native
    var BOTTOM_LEFT: `bottom-left` = js.native
    var BOTTOM_RIGHT: `bottom-right` = js.native
    var LEFT: left = js.native
    var LEFT_BOTTOM: `left-bottom` = js.native
    var LEFT_TOP: `left-top` = js.native
    var RIGHT: right = js.native
    var RIGHT_BOTTOM: `right-bottom` = js.native
    var RIGHT_TOP: `right-top` = js.native
    var TOP: top = js.native
    var TOP_LEFT: `top-left` = js.native
    var TOP_RIGHT: `top-right` = js.native
  }
  
  @js.native
  object Utils extends js.Object {
    def approxEqual(a: Double, b: Double): Boolean = js.native
    def approxEqual(a: Double, b: Double, tolerance: Double): Boolean = js.native
    def arrayLengthCompare(): Double = js.native
    def arrayLengthCompare(a: js.UndefOr[scala.Nothing], b: js.Array[_]): Double = js.native
    def arrayLengthCompare(a: js.Array[_]): Double = js.native
    def arrayLengthCompare(a: js.Array[_], b: js.Array[_]): Double = js.native
    def arraysEqual(arrA: js.Array[_], arrB: js.Array[_]): Boolean = js.native
    def arraysEqual(
      arrA: js.Array[_],
      arrB: js.Array[_],
      compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
    ): Boolean = js.native
    def clamp(`val`: Double, min: Double, max: Double): Double = js.native
    def countDecimalPlaces(num: Double): Double = js.native
    def deepCompareKeys(objA: js.Any, objB: js.Any): Boolean = js.native
    def deepCompareKeys(objA: js.Any, objB: js.Any, keys: js.Array[String | Double | js.Symbol]): Boolean = js.native
    def elementIsOrContains(element: HTMLElement, testElement: HTMLElement): Boolean = js.native
    def ensureElement(): ReactElement = js.native
    def ensureElement(
      child: js.UndefOr[ReactNode],
      tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
    ): ReactElement = js.native
    def ensureElement(child: ReactNode): ReactElement = js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[Key[T]] = js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[Key[T]] = js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[Key[T]] = js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: js.UndefOr[scala.Nothing], keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: js.UndefOr[scala.Nothing], objB: T): js.Array[Key[T]] = js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](objA: js.UndefOr[scala.Nothing], objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
    def getDeepUnequalKeyValues[T /* <: js.Object */](
      objA: js.UndefOr[scala.Nothing],
      objB: js.UndefOr[scala.Nothing],
      keys: js.Array[/* keyof T */ String]
    ): js.Array[Key[T]] = js.native
    def getDisplayName(ComponentClass: INamed): String = js.native
    def getDisplayName(ComponentClass: ComponentType[js.Object]): String = js.native
    def getRef[T](ref: T): T = js.native
    def getRef[T](ref: IRefObject[T]): T = js.native
    def isElementOfType[P](element: js.Any, ComponentType: ComponentType[P]): /* is react.react.ReactElement */ Boolean = js.native
    def isFunction(value: js.Any): /* is std.Function */ Boolean = js.native
    def isNodeEnv(env: String): Boolean = js.native
    def isReactElement[T](child: ReactNode): /* is react.react.ReactElement */ Boolean = js.native
    def isReactNodeEmpty(): Boolean = js.native
    def isReactNodeEmpty(node: js.UndefOr[ReactNode], skipArray: Boolean): Boolean = js.native
    def isReactNodeEmpty(node: ReactNode): Boolean = js.native
    def safeInvoke[R](): js.UndefOr[R] = js.native
    def safeInvoke[R](func: js.Function0[R]): js.UndefOr[R] = js.native
    def safeInvoke[A, R](func: js.UndefOr[scala.Nothing], arg1: A): js.UndefOr[R] = js.native
    def safeInvoke[A, R](func: js.Function1[/* arg1 */ A, R], arg1: A): js.UndefOr[R] = js.native
    def safeInvoke[A, B, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B): js.UndefOr[R] = js.native
    def safeInvoke[A, B, R](func: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): js.UndefOr[R] = js.native
    def safeInvoke[A, B, C, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
    def safeInvoke[A, B, C, R](func: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
    def safeInvoke[A, B, C, D, R](func: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C, arg4: D): js.UndefOr[R] = js.native
    def safeInvoke[A, B, C, D, R](
      func: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
      arg1: A,
      arg2: B,
      arg3: C,
      arg4: D
    ): js.UndefOr[R] = js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (): R}
      */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, R](obj: T, key: K): js.UndefOr[R] = js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (): R}
      */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, R](obj: js.UndefOr[scala.Nothing], key: K): js.UndefOr[R] = js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A): R}
      */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, R](obj: T, key: K, arg1: A): js.UndefOr[R] = js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A): R}
      */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, R](obj: js.UndefOr[scala.Nothing], key: K, arg1: A): js.UndefOr[R] = js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A, b : B): R}
      */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, R](obj: T, key: K, arg1: A, arg2: B): js.UndefOr[R] = js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A, b : B): R}
      */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, R](obj: js.UndefOr[scala.Nothing], key: K, arg1: A, arg2: B): js.UndefOr[R] = js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A, b : B, c : C): R}
      */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, C, R](obj: T, key: K, arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
    def safeInvokeMember[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in K ]:? (a : A, b : B, c : C): R}
      */ typings.blueprintjsCore.blueprintjsCoreStrings.safeInvokeMember with TopLevel[js.Any] */, K /* <: /* keyof T */ String */, A, B, C, R](obj: js.UndefOr[scala.Nothing], key: K, arg1: A, arg2: B, arg3: C): js.UndefOr[R] = js.native
    def safeInvokeOrValue[R](): R = js.native
    def safeInvokeOrValue[R](funcOrValue: R): R = js.native
    def safeInvokeOrValue[R](funcOrValue: js.Function0[R]): R = js.native
    def safeInvokeOrValue[A, R](funcOrValue: R, arg1: A): R = js.native
    def safeInvokeOrValue[A, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A): R = js.native
    def safeInvokeOrValue[A, R](funcOrValue: js.Function1[/* arg1 */ A, R], arg1: A): R = js.native
    def safeInvokeOrValue[A, B, R](funcOrValue: R, arg1: A, arg2: B): R = js.native
    def safeInvokeOrValue[A, B, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B): R = js.native
    def safeInvokeOrValue[A, B, R](funcOrValue: js.Function2[/* arg1 */ A, /* arg2 */ B, R], arg1: A, arg2: B): R = js.native
    def safeInvokeOrValue[A, B, C, R](funcOrValue: R, arg1: A, arg2: B, arg3: C): R = js.native
    def safeInvokeOrValue[A, B, C, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C): R = js.native
    def safeInvokeOrValue[A, B, C, R](funcOrValue: js.Function3[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, R], arg1: A, arg2: B, arg3: C): R = js.native
    def safeInvokeOrValue[A, B, C, D, R](funcOrValue: R, arg1: A, arg2: B, arg3: C, arg4: D): R = js.native
    def safeInvokeOrValue[A, B, C, D, R](funcOrValue: js.UndefOr[scala.Nothing], arg1: A, arg2: B, arg3: C, arg4: D): R = js.native
    def safeInvokeOrValue[A, B, C, D, R](
      funcOrValue: js.Function4[/* arg1 */ A, /* arg2 */ B, /* arg3 */ C, /* arg4 */ D, R],
      arg1: A,
      arg2: B,
      arg3: C,
      arg4: D
    ): R = js.native
    def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): Boolean = js.native
    def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyAllowlist[T]): Boolean = js.native
    def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyDenylist[T]): Boolean = js.native
    def throttle[T /* <: js.Function */](method: T): T = js.native
    def throttleEvent(target: EventTarget, eventName: String, newEventName: String): js.Function1[/* event */ Event, Unit] = js.native
    def throttleReactEventCallback(callback: js.Function2[/* event */ SyntheticEvent[_, Event], /* repeated */ js.Any, _]): js.Function1[/* event2 */ SyntheticEvent[_, Event], Unit] = js.native
    def throttleReactEventCallback(
      callback: js.Function2[/* event */ SyntheticEvent[_, Event], /* repeated */ js.Any, _],
      options: IThrottledReactEventOptions
    ): js.Function1[/* event2 */ SyntheticEvent[_, Event], Unit] = js.native
  }
  
}

