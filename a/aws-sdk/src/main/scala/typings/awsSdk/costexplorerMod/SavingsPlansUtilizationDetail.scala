package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansUtilizationDetail extends js.Object {
  
  /**
    * The total amortized commitment for a Savings Plans. Includes the sum of the upfront and recurring Savings Plans fees.
    */
  var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.native
  
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typings.awsSdk.costexplorerMod.Attributes] = js.native
  
  /**
    * The amount saved by using existing Savings Plans. Savings returns both net savings from savings plans as well as the onDemandCostEquivalent of the Savings Plans when considering the utilization rate.
    */
  var Savings: js.UndefOr[SavingsPlansSavings] = js.native
  
  /**
    * The unique Amazon Resource Name (ARN) for a particular Savings Plan.
    */
  var SavingsPlanArn: js.UndefOr[typings.awsSdk.costexplorerMod.SavingsPlanArn] = js.native
  
  /**
    * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans eligible.
    */
  var Utilization: js.UndefOr[SavingsPlansUtilization] = js.native
}
object SavingsPlansUtilizationDetail {
  
  @scala.inline
  def apply(): SavingsPlansUtilizationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansUtilizationDetail]
  }
  
  @scala.inline
  implicit class SavingsPlansUtilizationDetailOps[Self <: SavingsPlansUtilizationDetail] (val x: Self) extends AnyVal {
    
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
    def setAmortizedCommitment(value: SavingsPlansAmortizedCommitment): Self = this.set("AmortizedCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmortizedCommitment: Self = this.set("AmortizedCommitment", js.undefined)
    
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setSavings(value: SavingsPlansSavings): Self = this.set("Savings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavings: Self = this.set("Savings", js.undefined)
    
    @scala.inline
    def setSavingsPlanArn(value: SavingsPlanArn): Self = this.set("SavingsPlanArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlanArn: Self = this.set("SavingsPlanArn", js.undefined)
    
    @scala.inline
    def setUtilization(value: SavingsPlansUtilization): Self = this.set("Utilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtilization: Self = this.set("Utilization", js.undefined)
  }
}
