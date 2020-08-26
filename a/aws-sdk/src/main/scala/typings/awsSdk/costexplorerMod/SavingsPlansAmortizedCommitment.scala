package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansAmortizedCommitment extends js.Object {
  /**
    * The amortized amount of your Savings Plans commitment that was purchased with either a Partial or a NoUpfront.
    */
  var AmortizedRecurringCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The amortized amount of your Savings Plans commitment that was purchased with an Upfront or PartialUpfront Savings Plans.
    */
  var AmortizedUpfrontCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase method. 
    */
  var TotalAmortizedCommitment: js.UndefOr[GenericString] = js.native
}

object SavingsPlansAmortizedCommitment {
  @scala.inline
  def apply(): SavingsPlansAmortizedCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansAmortizedCommitment]
  }
  @scala.inline
  implicit class SavingsPlansAmortizedCommitmentOps[Self <: SavingsPlansAmortizedCommitment] (val x: Self) extends AnyVal {
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
    def setAmortizedRecurringCommitment(value: GenericString): Self = this.set("AmortizedRecurringCommitment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmortizedRecurringCommitment: Self = this.set("AmortizedRecurringCommitment", js.undefined)
    @scala.inline
    def setAmortizedUpfrontCommitment(value: GenericString): Self = this.set("AmortizedUpfrontCommitment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmortizedUpfrontCommitment: Self = this.set("AmortizedUpfrontCommitment", js.undefined)
    @scala.inline
    def setTotalAmortizedCommitment(value: GenericString): Self = this.set("TotalAmortizedCommitment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalAmortizedCommitment: Self = this.set("TotalAmortizedCommitment", js.undefined)
  }
  
}

