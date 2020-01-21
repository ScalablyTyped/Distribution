package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBonusPaymentsResponse extends js.Object {
  /**
    * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects. 
    */
  var BonusPayments: js.UndefOr[BonusPaymentList] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus payments being returned by this call. 
    */
  var NumResults: js.UndefOr[Integer] = js.native
}

object ListBonusPaymentsResponse {
  @scala.inline
  def apply(
    BonusPayments: BonusPaymentList = null,
    NextToken: PaginationToken = null,
    NumResults: Int | Double = null
  ): ListBonusPaymentsResponse = {
    val __obj = js.Dynamic.literal()
    if (BonusPayments != null) __obj.updateDynamic("BonusPayments")(BonusPayments.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (NumResults != null) __obj.updateDynamic("NumResults")(NumResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBonusPaymentsResponse]
  }
}

