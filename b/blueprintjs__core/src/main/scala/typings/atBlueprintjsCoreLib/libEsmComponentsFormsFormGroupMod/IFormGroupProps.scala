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
  var helperText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Whether to render the label and children on a single line. */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /** Label of this form group. */
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * `id` attribute of the labelable form element that this `FormGroup` controls,
    * used as `<label for>` attribute.
    */
  var labelFor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional secondary text that appears after the label.
    */
  var labelInfo: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** CSS properties to apply to the root element. */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object IFormGroupProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    contentClassName: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    helperText: reactLib.reactMod.ReactNode = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    label: reactLib.reactMod.ReactNode = null,
    labelFor: java.lang.String = null,
    labelInfo: reactLib.reactMod.ReactNode = null,
    style: reactLib.reactMod.CSSProperties = null
  ): IFormGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFor != null) __obj.updateDynamic("labelFor")(labelFor)
    if (labelInfo != null) __obj.updateDynamic("labelInfo")(labelInfo.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IFormGroupProps]
  }
}

