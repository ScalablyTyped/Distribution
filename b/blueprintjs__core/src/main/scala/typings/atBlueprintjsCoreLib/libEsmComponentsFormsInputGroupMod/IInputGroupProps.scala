package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsInputGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IInputGroupProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IControlledProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
       * Whether the input is non-interactive.
       * Note that `rightElement` must be disabled separately; this prop will not affect it.
       * @default false
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Ref handler that receives HTML `<input>` element backing this component. */
  var inputRef: js.UndefOr[js.Function1[/* ref */ reactLib.HTMLInputElement | scala.Null, _]] = js.undefined
  /** Whether this input should use large styles. */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Name of a Blueprint UI icon (or an icon element) to render on the left side of the input group,
       * before the user's cursor.
       */
  var leftIcon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  /** Placeholder text in the absence of any value. */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Element to render on right side of input.
       * For best results, use a minimal button, tag, or small spinner.
       */
  var rightElement: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /** Whether the input (and any buttons) should appear with rounded caps. */
  var round: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this input should use small styles. */
  var small: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * HTML `input` type attribute.
       * @default "text"
       */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

