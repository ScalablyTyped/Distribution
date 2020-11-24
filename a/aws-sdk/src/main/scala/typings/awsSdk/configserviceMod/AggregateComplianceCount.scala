package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateComplianceCount extends js.Object {
  
  /**
    * The number of compliant and noncompliant AWS Config rules.
    */
  var ComplianceSummary: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceSummary] = js.native
  
  /**
    * The 12-digit account ID or region based on the GroupByKey value.
    */
  var GroupName: js.UndefOr[StringWithCharLimit256] = js.native
}
object AggregateComplianceCount {
  
  @scala.inline
  def apply(): AggregateComplianceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateComplianceCount]
  }
  
  @scala.inline
  implicit class AggregateComplianceCountOps[Self <: AggregateComplianceCount] (val x: Self) extends AnyVal {
    
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
    def setComplianceSummary(value: ComplianceSummary): Self = this.set("ComplianceSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceSummary: Self = this.set("ComplianceSummary", js.undefined)
    
    @scala.inline
    def setGroupName(value: StringWithCharLimit256): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
  }
}
