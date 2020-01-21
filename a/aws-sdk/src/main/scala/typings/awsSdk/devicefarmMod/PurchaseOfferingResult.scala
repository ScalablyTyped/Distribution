package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseOfferingResult extends js.Object {
  /**
    * Represents the offering transaction for the purchase result.
    */
  var offeringTransaction: js.UndefOr[OfferingTransaction] = js.native
}

object PurchaseOfferingResult {
  @scala.inline
  def apply(offeringTransaction: OfferingTransaction = null): PurchaseOfferingResult = {
    val __obj = js.Dynamic.literal()
    if (offeringTransaction != null) __obj.updateDynamic("offeringTransaction")(offeringTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseOfferingResult]
  }
}

