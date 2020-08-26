package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPlanSettings extends js.Object {
  /**
    * The length of the term of your reserved queue pricing plan commitment.
    */
  var Commitment: typings.awsSdk.mediaconvertMod.Commitment = js.native
  /**
    * Specifies whether the term of your reserved queue pricing plan is automatically extended (AUTO_RENEW) or expires (EXPIRE) at the end of the term. When your term is auto renewed, you extend your commitment by 12 months from the auto renew date. You can cancel this commitment.
    */
  var RenewalType: typings.awsSdk.mediaconvertMod.RenewalType = js.native
  /**
    * Specifies the number of reserved transcode slots (RTS) for this queue. The number of RTS determines how many jobs the queue can process in parallel; each RTS can process one job at a time. You can't decrease the number of RTS in your reserved queue. You can increase the number of RTS by extending your existing commitment with a new 12-month commitment for the larger number. The new commitment begins when you purchase the additional capacity. You can't cancel your commitment or revert to your original commitment after you increase the capacity.
    */
  var ReservedSlots: integer = js.native
}

object ReservationPlanSettings {
  @scala.inline
  def apply(Commitment: Commitment, RenewalType: RenewalType, ReservedSlots: integer): ReservationPlanSettings = {
    val __obj = js.Dynamic.literal(Commitment = Commitment.asInstanceOf[js.Any], RenewalType = RenewalType.asInstanceOf[js.Any], ReservedSlots = ReservedSlots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservationPlanSettings]
  }
  @scala.inline
  implicit class ReservationPlanSettingsOps[Self <: ReservationPlanSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommitment(value: Commitment): Self = this.set("Commitment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenewalType(value: RenewalType): Self = this.set("RenewalType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReservedSlots(value: integer): Self = this.set("ReservedSlots", value.asInstanceOf[js.Any])
  }
  
}

