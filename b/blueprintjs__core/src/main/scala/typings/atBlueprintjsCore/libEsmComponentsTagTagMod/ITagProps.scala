package typings.atBlueprintjsCore.libEsmComponentsTagTagMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.atBlueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typings.atBlueprintjsIcons.libEsmIconNameMod.IconName
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait ITagProps
  extends HTMLAttributes[HTMLSpanElement]
     with IIntentProps {
  /**
    * Whether the tag should appear in an active state.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the tag should take up the full width of its container.
    * @default false
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render before the children. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /**
    * Whether the tag should visually respond to user interactions. If set
    * to `true`, hovering over the tag will change its color and mouse cursor.
    *
    * Recommended when `onClick` is also defined.
    *
    * @default false
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this tag should use large styles.
    * @default false
    */
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this tag should use minimal styles.
    * @default false
    */
  var minimal: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether tag content should be allowed to occupy multiple lines.
    * If false, a single line of text will be truncated with an ellipsis if
    * it overflows. Note that icons will be vertically centered relative to
    * multiline text.
    * @default false
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback invoked when the tag is clicked.
    * Recommended when `interactive` is `true`.
    */
  @JSName("onClick")
  var onClick_ITagProps: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
  /**
    * Click handler for remove button.
    * The remove button will only be rendered if this prop is defined.
    */
  var onRemove: js.UndefOr[
    js.Function2[
      /* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent], 
      /* tagProps */ ITagProps, 
      Unit
    ]
  ] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render after the children. */
  var rightIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /**
    * Whether this tag should have rounded ends.
    * @default false
    */
  var round: js.UndefOr[Boolean] = js.undefined
}

object ITagProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLSpanElement] = null,
    IIntentProps: IIntentProps = null,
    active: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    icon: IconName | MaybeElement = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    large: js.UndefOr[Boolean] = js.undefined,
    minimal: js.UndefOr[Boolean] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    onClick: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onRemove: (/* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent], /* tagProps */ ITagProps) => Unit = null,
    rightIcon: IconName | MaybeElement = null,
    round: js.UndefOr[Boolean] = js.undefined
  ): ITagProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IIntentProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal)
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction2(onRemove))
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    __obj.asInstanceOf[ITagProps]
  }
}

