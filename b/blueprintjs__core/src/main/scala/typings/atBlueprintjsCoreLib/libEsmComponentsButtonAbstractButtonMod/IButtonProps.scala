package typings
package atBlueprintjsCoreLib.libEsmComponentsButtonAbstractButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IActionProps {
  /**
    * If set to `true`, the button will display in an active state.
    * This is equivalent to setting `className={Classes.ACTIVE}`.
    * @default false
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text alignment within button. By default, icons and text will be centered
    * within the button. Passing `"left"` or `"right"` will align the button
    * text to that side and push `icon` and `rightIcon` to either edge. Passing
    * `"center"` will center the text and icons together.
    * @default Alignment.CENTER
    */
  var alignText: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonAlignmentMod.Alignment] = js.undefined
  /** A ref handler that receives the native HTML element backing this component. */
  var elementRef: js.UndefOr[js.Function1[/* ref */ reactLib.HTMLElement | scala.Null, _]] = js.undefined
  /** Whether this button should expand to fill its container. */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this button should use large styles. */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to `true`, the button will display a centered loading spinner instead of its contents.
    * The width of the button is not affected by the value of this prop.
    * @default false
    */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether this button should use minimal styles. */
  var minimal: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to render after the text. */
  var rightIcon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement
  ] = js.undefined
  /** Whether this button should use small styles. */
  var small: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * HTML `type` attribute of button. Common values are `"button"` and `"submit"`.
    * Note that this prop has no effect on `AnchorButton`; it only affects `Button`.
    * @default "button"
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

