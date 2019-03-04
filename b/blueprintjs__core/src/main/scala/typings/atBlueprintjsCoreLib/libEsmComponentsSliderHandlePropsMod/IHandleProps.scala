package typings
package atBlueprintjsCoreLib.libEsmComponentsSliderHandlePropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandleProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /** Intent for the track segment immediately after this handle, taking priority over `intentBefore`. */
  var intentAfter: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent] = js.undefined
  /** Intent for the track segment immediately before this handle. */
  var intentBefore: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent] = js.undefined
  /**
    * How this handle interacts with other handles.
    * @default "lock"
    */
  var interactionKind: js.UndefOr[HandleInteractionKind] = js.undefined
  /**
    * Callback invoked when this handle's value is changed due to a drag
    * interaction. Note that "push" interactions can cause multiple handles to
    * update at the same time.
    */
  var onChange: js.UndefOr[js.Function1[/* newValue */ scala.Double, scala.Unit]] = js.undefined
  /** Callback invoked when this handle is released (the end of a drag interaction). */
  var onRelease: js.UndefOr[js.Function1[/* newValue */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Handle appearance type.
    * @default "full"
    */
  var `type`: js.UndefOr[HandleType] = js.undefined
  /** Numeric value of this handle. */
  var value: scala.Double
}

object IHandleProps {
  @scala.inline
  def apply(
    value: scala.Double,
    className: java.lang.String = null,
    intentAfter: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    intentBefore: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    interactionKind: HandleInteractionKind = null,
    onChange: js.Function1[/* newValue */ scala.Double, scala.Unit] = null,
    onRelease: js.Function1[/* newValue */ scala.Double, scala.Unit] = null,
    `type`: HandleType = null
  ): IHandleProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (className != null) __obj.updateDynamic("className")(className)
    if (intentAfter != null) __obj.updateDynamic("intentAfter")(intentAfter)
    if (intentBefore != null) __obj.updateDynamic("intentBefore")(intentBefore)
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onRelease != null) __obj.updateDynamic("onRelease")(onRelease)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IHandleProps]
  }
}

