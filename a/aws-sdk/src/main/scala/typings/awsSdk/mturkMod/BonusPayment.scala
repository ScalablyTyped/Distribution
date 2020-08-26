package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BonusPayment extends js.Object {
  /**
    * The ID of the assignment associated with this bonus payment.
    */
  var AssignmentId: js.UndefOr[EntityId] = js.native
  var BonusAmount: js.UndefOr[CurrencyAmount] = js.native
  /**
    * The date and time of when the bonus was granted.
    */
  var GrantTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Reason text given when the bonus was granted, if any.
    */
  var Reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Worker to whom the bonus was paid.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}

object BonusPayment {
  @scala.inline
  def apply(): BonusPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BonusPayment]
  }
  @scala.inline
  implicit class BonusPaymentOps[Self <: BonusPayment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssignmentId(value: EntityId): Self = this.set("AssignmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentId: Self = this.set("AssignmentId", js.undefined)
    @scala.inline
    def setBonusAmount(value: CurrencyAmount): Self = this.set("BonusAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBonusAmount: Self = this.set("BonusAmount", js.undefined)
    @scala.inline
    def setGrantTime(value: Timestamp): Self = this.set("GrantTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantTime: Self = this.set("GrantTime", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("Reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
    @scala.inline
    def setWorkerId(value: CustomerId): Self = this.set("WorkerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerId: Self = this.set("WorkerId", js.undefined)
  }
  
}

