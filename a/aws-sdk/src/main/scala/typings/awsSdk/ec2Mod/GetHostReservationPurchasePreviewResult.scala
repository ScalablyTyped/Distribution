package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostReservationPurchasePreviewResult extends js.Object {
  /**
    * The currency in which the totalUpfrontPrice and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  /**
    * The purchase information of the Dedicated Host reservation and the Dedicated Hosts associated with it.
    */
  var Purchase: js.UndefOr[PurchaseSet] = js.native
  /**
    * The potential total hourly price of the reservation per hour.
    */
  var TotalHourlyPrice: js.UndefOr[String] = js.native
  /**
    * The potential total upfront price. This is billed immediately.
    */
  var TotalUpfrontPrice: js.UndefOr[String] = js.native
}

object GetHostReservationPurchasePreviewResult {
  @scala.inline
  def apply(
    CurrencyCode: CurrencyCodeValues = null,
    Purchase: PurchaseSet = null,
    TotalHourlyPrice: String = null,
    TotalUpfrontPrice: String = null
  ): GetHostReservationPurchasePreviewResult = {
    val __obj = js.Dynamic.literal()
    if (CurrencyCode != null) __obj.updateDynamic("CurrencyCode")(CurrencyCode.asInstanceOf[js.Any])
    if (Purchase != null) __obj.updateDynamic("Purchase")(Purchase.asInstanceOf[js.Any])
    if (TotalHourlyPrice != null) __obj.updateDynamic("TotalHourlyPrice")(TotalHourlyPrice.asInstanceOf[js.Any])
    if (TotalUpfrontPrice != null) __obj.updateDynamic("TotalUpfrontPrice")(TotalUpfrontPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostReservationPurchasePreviewResult]
  }
}

