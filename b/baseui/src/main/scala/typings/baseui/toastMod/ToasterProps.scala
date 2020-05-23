package typings.baseui.toastMod

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToasterProps extends js.Object {
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  var overrides: js.UndefOr[ToasterOverrides] = js.undefined
  var placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.undefined
  var usePortal: js.UndefOr[Boolean] = js.undefined
}

object ToasterProps {
  @scala.inline
  def apply(
    autoHideDuration: js.UndefOr[Double] = js.undefined,
    overrides: ToasterOverrides = null,
    placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top = null,
    usePortal: js.UndefOr[Boolean] = js.undefined
  ): ToasterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideDuration)) __obj.updateDynamic("autoHideDuration")(autoHideDuration.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToasterProps]
  }
}

