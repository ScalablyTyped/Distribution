package typings.atBlueprintjsCore.libEsmComponentsSliderHandlePropsMod

import typings.atBlueprintjsCore.libEsmCommonIntentMod.Intent
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandleProps extends IProps {
  /** Intent for the track segment immediately after this handle, taking priority over `intentBefore`. */
  var intentAfter: js.UndefOr[Intent] = js.undefined
  /** Intent for the track segment immediately before this handle. */
  var intentBefore: js.UndefOr[Intent] = js.undefined
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
  var onChange: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
  /** Callback invoked when this handle is released (the end of a drag interaction). */
  var onRelease: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
  /**
    * Handle appearance type.
    * @default "full"
    */
  var `type`: js.UndefOr[HandleType] = js.undefined
  /** Numeric value of this handle. */
  var value: Double
}

object IHandleProps {
  @scala.inline
  def apply(
    value: Double,
    className: String = null,
    intentAfter: Intent = null,
    intentBefore: Intent = null,
    interactionKind: HandleInteractionKind = null,
    onChange: /* newValue */ Double => Unit = null,
    onRelease: /* newValue */ Double => Unit = null,
    `type`: HandleType = null
  ): IHandleProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (className != null) __obj.updateDynamic("className")(className)
    if (intentAfter != null) __obj.updateDynamic("intentAfter")(intentAfter)
    if (intentBefore != null) __obj.updateDynamic("intentBefore")(intentBefore)
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IHandleProps]
  }
}

