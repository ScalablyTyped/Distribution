package typings.cathoQuantum.circularLoaderMod

import typings.cathoQuantum.AnonGutter
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.secondary
import typings.cathoQuantum.cathoQuantumStrings.xlarge
import typings.cathoQuantum.cathoQuantumStrings.xxlarge
import typings.cathoQuantum.cathoQuantumStrings.xxxlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularLoaderProps extends js.Object {
  var size: js.UndefOr[medium | large | xlarge | xxlarge | xxxlarge] = js.undefined
  var skin: js.UndefOr[primary | secondary] = js.undefined
  var theme: js.UndefOr[AnonGutter] = js.undefined
}

object CircularLoaderProps {
  @scala.inline
  def apply(
    size: medium | large | xlarge | xxlarge | xxxlarge = null,
    skin: primary | secondary = null,
    theme: AnonGutter = null
  ): CircularLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularLoaderProps]
  }
}

