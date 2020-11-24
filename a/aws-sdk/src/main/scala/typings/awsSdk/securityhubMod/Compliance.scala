package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compliance extends js.Object {
  
  /**
    * For a control, the industry or regulatory framework requirements that are related to the control. The check for that control is aligned with these requirements.
    */
  var RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.native
  
  /**
    * The result of a standards check. The valid values for Status are as follows.      PASSED - Standards check passed for all evaluated resources.    WARNING - Some information is missing or this check is not supported for your configuration.    FAILED - Standards check failed for at least one evaluated resource.    NOT_AVAILABLE - Check could not be performed due to a service outage, API error, or because the result of the AWS Config evaluation was NOT_APPLICABLE. If the AWS Config evaluation result was NOT_APPLICABLE, then after 3 days, Security Hub automatically archives the finding.    
    */
  var Status: js.UndefOr[ComplianceStatus] = js.native
  
  /**
    * For findings generated from controls, a list of reasons behind the value of Status. For the list of status reason codes and their meanings, see Standards-related information in the ASFF in the AWS Security Hub User Guide. 
    */
  var StatusReasons: js.UndefOr[StatusReasonsList] = js.native
}
object Compliance {
  
  @scala.inline
  def apply(): Compliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compliance]
  }
  
  @scala.inline
  implicit class ComplianceOps[Self <: Compliance] (val x: Self) extends AnyVal {
    
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
    def setRelatedRequirementsVarargs(value: NonEmptyString*): Self = this.set("RelatedRequirements", js.Array(value :_*))
    
    @scala.inline
    def setRelatedRequirements(value: RelatedRequirementsList): Self = this.set("RelatedRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedRequirements: Self = this.set("RelatedRequirements", js.undefined)
    
    @scala.inline
    def setStatus(value: ComplianceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusReasonsVarargs(value: StatusReason*): Self = this.set("StatusReasons", js.Array(value :_*))
    
    @scala.inline
    def setStatusReasons(value: StatusReasonsList): Self = this.set("StatusReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReasons: Self = this.set("StatusReasons", js.undefined)
  }
}
