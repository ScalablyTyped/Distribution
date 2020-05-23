package typings.baseui.anon

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.baseui.toastMod.ToasterOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/toast.ToasterProps> */
trait ReadonlyToasterProps extends js.Object {
  val autoHideDuration: js.UndefOr[Double] = js.undefined
  val overrides: js.UndefOr[ToasterOverrides] = js.undefined
  val placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.undefined
  val usePortal: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyToasterProps {
  @scala.inline
  def apply(
    autoHideDuration: js.UndefOr[Double] = js.undefined,
    overrides: ToasterOverrides = null,
    placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top = null,
    usePortal: js.UndefOr[Boolean] = js.undefined
  ): ReadonlyToasterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideDuration)) __obj.updateDynamic("autoHideDuration")(autoHideDuration.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyToasterProps]
  }
}

