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
  def apply(
    TotalCommitment: GenericString = null,
    UnusedCommitment: GenericString = null,
    UsedCommitment: GenericString = null,
    UtilizationPercentage: GenericString = null
  ): SavingsPlansUtilization = {
    val __obj = js.Dynamic.literal()
    if (TotalCommitment != null) __obj.updateDynamic("TotalCommitment")(TotalCommitment.asInstanceOf[js.Any])
    if (UnusedCommitment != null) __obj.updateDynamic("UnusedCommitment")(UnusedCommitment.asInstanceOf[js.Any])
    if (UsedCommitment != null) __obj.updateDynamic("UsedCommitment")(UsedCommitment.asInstanceOf[js.Any])
    if (UtilizationPercentage != null) __obj.updateDynamic("UtilizationPercentage")(UtilizationPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansUtilization]
  }
}

