package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPlan extends js.Object {
  /**
    * The length of the term of your reserved queue pricing plan commitment.
    */
  var Commitment: js.UndefOr[typings.awsSdk.mediaconvertMod.Commitment] = js.native
  /**
    * The timestamp in epoch seconds for when the current pricing plan term for this reserved queue expires.
    */
  var ExpiresAt: js.UndefOr[timestampUnix] = js.native
  /**
    * The timestamp in epoch seconds for when you set up the current pricing plan for this reserved queue.
    */
  var PurchasedAt: js.UndefOr[timestampUnix] = js.native
  /**
    * Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term.
    */
  var RenewalType: js.UndefOr[typings.awsSdk.mediaconvertMod.RenewalType] = js.native
  /**
    * Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how many jobs the queue can process in parallel; each RTS can process one job at a time. When you increase this number, you extend your existing commitment with a new 12-month commitment for a larger number of RTS. The new commitment begins when you purchase the additional capacity. You can't decrease the number of RTS in your reserved queue.
    */
  var ReservedSlots: js.UndefOr[integer] = js.native
  /**
    * Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
    */
  var Status: js.UndefOr[ReservationPlanStatus] = js.native
}

object ReservationPlan {
  @scala.inline
  def apply(
    Commitment: Commitment = null,
    ExpiresAt: timestampUnix = null,
    PurchasedAt: timestampUnix = null,
    RenewalType: RenewalType = null,
    ReservedSlots: js.UndefOr[integer] = js.undefined,
    Status: ReservationPlanStatus = null
  ): ReservationPlan = {
    val __obj = js.Dynamic.literal()
    if (Commitment != null) __obj.updateDynamic("Commitment")(Commitment.asInstanceOf[js.Any])
    if (ExpiresAt != null) __obj.updateDynamic("ExpiresAt")(ExpiresAt.asInstanceOf[js.Any])
    if (PurchasedAt != null) __obj.updateDynamic("PurchasedAt")(PurchasedAt.asInstanceOf[js.Any])
    if (RenewalType != null) __obj.updateDynamic("RenewalType")(RenewalType.asInstanceOf[js.Any])
    if (!js.isUndefined(ReservedSlots)) __obj.updateDynamic("ReservedSlots")(ReservedSlots.get.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationPlan]
  }
}

