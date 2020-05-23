package typings.cathoQuantum.popoverMod

import typings.cathoQuantum.cathoQuantumStrings.bottom
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.left
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.right
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.top
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends js.Object {
  var children: js.Array[ReactNode] | ReactNode
  var inverted: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placement: js.UndefOr[top | right | bottom | left] = js.undefined
  var skin: js.UndefOr[neutral | primary | success | warning | error] = js.undefined
  var trigger: ReactNode
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    children: js.Array[ReactNode] | ReactNode = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    onClose: () => Unit = null,
    placement: top | right | bottom | left = null,
    skin: neutral | primary | success | warning | error = null,
    trigger: ReactNode = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

