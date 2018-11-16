package typings
package atBlueprintjsCoreLib.libEsmComponentsTagTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because Would inherit conflicting mutable fields List(className))*/

trait ITagProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLSpanElement]
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps {
  /**
       * Whether the tag should appear in an active state.
       * @default false
       */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render before the children. */
  var icon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  /**
       * Whether the tag should visually respond to user interactions. If set
       * to `true`, hovering over the tag will change its color and mouse cursor.
       *
       * Recommended when `onClick` is also defined.
       *
       * @default false
       */
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether this tag should use large styles.
       * @default false
       */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether this tag should use minimal styles.
       * @default false
       */
  var minimal: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether tag content should be allowed to occupy multiple lines.
       * If false, a single line of text will be truncated with an ellipsis if
       * it overflows. Note that icons will be vertically centered relative to
       * multiline text.
       * @default false
       */
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Callback invoked when the tag is clicked.
       * Recommended when `interactive` is `true`.
       */
  @JSName("onClick")
  var onClick_ITagProps: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement], scala.Unit]
  ] = js.undefined
  /**
       * Click handler for remove button.
       * The remove button will only be rendered if this prop is defined.
       */
  var onRemove: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement], 
      /* tagProps */ ITagProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render after the children. */
  var rightIcon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  /**
       * Whether this tag should have rounded ends.
       * @default false
       */
  var round: js.UndefOr[scala.Boolean] = js.undefined
}

