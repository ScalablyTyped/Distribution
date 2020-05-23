package typings.blueprintjsCore.handleMod

import typings.blueprintjsCore.handlePropsMod.HandleInteractionKind
import typings.blueprintjsCore.handlePropsMod.HandleType
import typings.blueprintjsCore.handlePropsMod.IHandleProps
import typings.blueprintjsCore.intentMod.Intent
import typings.react.mod.CSSProperties
import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInternalHandleProps extends IHandleProps {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: ReactChild
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var stepSize: js.UndefOr[Double] = js.undefined
  var tickSize: js.UndefOr[Double] = js.undefined
  var tickSizeRatio: js.UndefOr[Double] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object IInternalHandleProps {
  @scala.inline
  def apply(
    label: ReactChild,
    value: Double,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    intentAfter: Intent = null,
    intentBefore: Intent = null,
    interactionKind: HandleInteractionKind = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onChange: /* newValue */ Double => Unit = null,
    onRelease: /* newValue */ Double => Unit = null,
    stepSize: js.UndefOr[Double] = js.undefined,
    tickSize: js.UndefOr[Double] = js.undefined,
    tickSizeRatio: js.UndefOr[Double] = js.undefined,
    trackStyleAfter: CSSProperties = null,
    trackStyleBefore: CSSProperties = null,
    `type`: HandleType = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): IInternalHandleProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (intentAfter != null) __obj.updateDynamic("intentAfter")(intentAfter.asInstanceOf[js.Any])
    if (intentBefore != null) __obj.updateDynamic("intentBefore")(intentBefore.asInstanceOf[js.Any])
    if (interactionKind != null) __obj.updateDynamic("interactionKind")(interactionKind.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1(onRelease))
    if (!js.isUndefined(stepSize)) __obj.updateDynamic("stepSize")(stepSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickSize)) __obj.updateDynamic("tickSize")(tickSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickSizeRatio)) __obj.updateDynamic("tickSizeRatio")(tickSizeRatio.get.asInstanceOf[js.Any])
    if (trackStyleAfter != null) __obj.updateDynamic("trackStyleAfter")(trackStyleAfter.asInstanceOf[js.Any])
    if (trackStyleBefore != null) __obj.updateDynamic("trackStyleBefore")(trackStyleBefore.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInternalHandleProps]
  }
}

