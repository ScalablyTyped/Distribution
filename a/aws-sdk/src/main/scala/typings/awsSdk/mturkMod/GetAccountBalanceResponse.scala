package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountBalanceResponse extends js.Object {
  var AvailableBalance: js.UndefOr[CurrencyAmount] = js.native
  var OnHoldBalance: js.UndefOr[CurrencyAmount] = js.native
}

object GetAccountBalanceResponse {
  @scala.inline
  def apply(AvailableBalance: CurrencyAmount = null, OnHoldBalance: CurrencyAmount = null): GetAccountBalanceResponse = {
    val __obj = js.Dynamic.literal()
    if (AvailableBalance != null) __obj.updateDynamic("AvailableBalance")(AvailableBalance.asInstanceOf[js.Any])
    if (OnHoldBalance != null) __obj.updateDynamic("OnHoldBalance")(OnHoldBalance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountBalanceResponse]
  }
}

