package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region
trait ChooseInvoiceTitleOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_ChooseInvoiceTitleOptions: js.UndefOr[js.Function1[/* res */ baiduDashAppLib.Anon_BankAccount, scala.Unit]] = js.undefined
}

object ChooseInvoiceTitleOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ baiduDashAppLib.Anon_BankAccount, scala.Unit] = null
  ): ChooseInvoiceTitleOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ChooseInvoiceTitleOptions]
  }
}

