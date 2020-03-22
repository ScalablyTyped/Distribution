package typings.cathoQuantum.iconButtonMod

import typings.cathoQuantum.AnonSpacing
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.cathoQuantum.cathoQuantumStrings.xlarge
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonProps extends js.Object {
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
  var skin: js.UndefOr[neutral | primary | secondary | success | warning | error] = js.undefined
  var theme: js.UndefOr[AnonSpacing] = js.undefined
}

object IconButtonProps {
  @scala.inline
  def apply(
    size: xsmall | small | medium | large | xlarge = null,
    skin: neutral | primary | secondary | success | warning | error = null,
    theme: AnonSpacing = null
  ): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonProps]
  }
}

