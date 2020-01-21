package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferingTransaction extends js.Object {
  /**
    * The cost of an offering transaction.
    */
  var cost: js.UndefOr[MonetaryAmount] = js.native
  /**
    * The date on which an offering transaction was created.
    */
  var createdOn: js.UndefOr[DateTime] = js.native
  /**
    * The ID that corresponds to a device offering promotion.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.native
  /**
    * The status of an offering transaction.
    */
  var offeringStatus: js.UndefOr[OfferingStatus] = js.native
  /**
    * The transaction ID of the offering transaction.
    */
  var transactionId: js.UndefOr[TransactionIdentifier] = js.native
}

object OfferingTransaction {
  @scala.inline
  def apply(
    cost: MonetaryAmount = null,
    createdOn: DateTime = null,
    offeringPromotionId: OfferingPromotionIdentifier = null,
    offeringStatus: OfferingStatus = null,
    transactionId: TransactionIdentifier = null
  ): OfferingTransaction = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(cost.asInstanceOf[js.Any])
    if (createdOn != null) __obj.updateDynamic("createdOn")(createdOn.asInstanceOf[js.Any])
    if (offeringPromotionId != null) __obj.updateDynamic("offeringPromotionId")(offeringPromotionId.asInstanceOf[js.Any])
    if (offeringStatus != null) __obj.updateDynamic("offeringStatus")(offeringStatus.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferingTransaction]
  }
}

