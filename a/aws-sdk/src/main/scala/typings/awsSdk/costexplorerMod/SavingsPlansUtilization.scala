package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansUtilization extends js.Object {
  /**
    * The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
    */
  var TotalCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a specific period.
    */
  var UnusedCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a specific period.
    */
  var UsedCommitment: js.UndefOr[GenericString] = js.native
  /**
    * The amount of UsedCommitment divided by the TotalCommitment for your Savings Plans.
    */
  var UtilizationPercentage: js.UndefOr[GenericString] = js.native
}

object SavingsPlansUtilization {
  @scala.inline
  def apply(): SavingsPlansUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansUtilization]
  }
  @scala.inline
  implicit class SavingsPlansUtilizationOps[Self <: SavingsPlansUtilization] (val x: Self) extends AnyVal {
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
    def setTotalCommitment(value: GenericString): Self = this.set("TotalCommitment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCommitment: Self = this.set("TotalCommitment", js.undefined)
    @scala.inline
    def setUnusedCommitment(value: GenericString): Self = this.set("UnusedCommitment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnusedCommitment: Self = this.set("UnusedCommitment", js.undefined)
    @scala.inline
    def setUsedCommitment(value: GenericString): Self = this.set("UsedCommitment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsedCommitment: Self = this.set("UsedCommitment", js.undefined)
    @scala.inline
    def setUtilizationPercentage(value: GenericString): Self = this.set("UtilizationPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtilizationPercentage: Self = this.set("UtilizationPercentage", js.undefined)
  }
  
}

