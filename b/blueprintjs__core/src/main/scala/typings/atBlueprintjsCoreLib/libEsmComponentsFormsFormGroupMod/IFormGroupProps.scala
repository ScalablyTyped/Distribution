package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsFormGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFormGroupProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
       * A space-delimited list of class names to pass along to the
       * `Classes.FORM_CONTENT` element that contains `children`.
       */
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether form group should appear as non-interactive.
       * Remember that `input` elements must be disabled separately.
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional helper text. The given content will be wrapped in
       * `Classes.FORM_HELPER_TEXT` and displayed beneath `children`.
       * Helper text color is determined by the `intent`.
       */
  var helperText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Whether to render the label and children on a single line. */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /** Label of this form group. */
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
       * `id` attribute of the labelable form element that this `FormGroup` controls,
       * used as `<label for>` attribute.
       */
  var labelFor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional secondary text that appears after the label.
       */
  var labelInfo: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** CSS properties to apply to the root element. */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

