package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToasterProps extends js.Object {
  var autoHideDuration: js.UndefOr[scala.Double] = js.undefined
  var overrides: js.UndefOr[ToasterOverrides] = js.undefined
  var placement: js.UndefOr[
    baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top
  ] = js.undefined
  var usePortal: js.UndefOr[scala.Boolean] = js.undefined
}

object ToasterProps {
  @scala.inline
  def apply(
    autoHideDuration: scala.Int | scala.Double = null,
    overrides: ToasterOverrides = null,
    placement: baseuiLib.baseuiLibStrings.bottomRight | baseuiLib.baseuiLibStrings.bottom | baseuiLib.baseuiLibStrings.topRight | baseuiLib.baseuiLibStrings.bottomLeft | baseuiLib.baseuiLibStrings.topLeft | baseuiLib.baseuiLibStrings.top = null,
    usePortal: js.UndefOr[scala.Boolean] = js.undefined
  ): ToasterProps = {
    val __obj = js.Dynamic.literal()
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal)
    __obj.asInstanceOf[ToasterProps]
  }
}

