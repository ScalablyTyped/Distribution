package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchRule extends StObject {
  
  /**
    * The number of days after the release date of each patch matched by the rule that the patch is marked as approved in the patch baseline. For example, a value of 7 means that patches are approved seven days after they are released. Not supported on Ubuntu Server.
    */
  var ApproveAfterDays: js.UndefOr[typings.awsSdk.ssmMod.ApproveAfterDays] = js.native
  
  /**
    * The cutoff date for auto approval of released patches. Any patches released on or before this date are installed automatically. Not supported on Ubuntu Server. Enter dates in the format YYYY-MM-DD. For example, 2020-12-31.
    */
  var ApproveUntilDate: js.UndefOr[PatchStringDateTime] = js.native
  
  /**
    * A compliance severity level for all approved patches in a patch baseline.
    */
  var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  
  /**
    * For instances identified by the approval rule filters, enables a patch baseline to apply non-security updates available in the specified repository. The default value is 'false'. Applies to Linux instances only.
    */
  var EnableNonSecurity: js.UndefOr[Boolean] = js.native
  
  /**
    * The patch filter group that defines the criteria for the rule.
    */
  var PatchFilterGroup: typings.awsSdk.ssmMod.PatchFilterGroup = js.native
}
object PatchRule {
  
  @scala.inline
  def apply(PatchFilterGroup: PatchFilterGroup): PatchRule = {
    val __obj = js.Dynamic.literal(PatchFilterGroup = PatchFilterGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRule]
  }
  
  @scala.inline
  implicit class PatchRuleMutableBuilder[Self <: PatchRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproveAfterDays(value: ApproveAfterDays): Self = StObject.set(x, "ApproveAfterDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproveAfterDaysUndefined: Self = StObject.set(x, "ApproveAfterDays", js.undefined)
    
    @scala.inline
    def setApproveUntilDate(value: PatchStringDateTime): Self = StObject.set(x, "ApproveUntilDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproveUntilDateUndefined: Self = StObject.set(x, "ApproveUntilDate", js.undefined)
    
    @scala.inline
    def setComplianceLevel(value: PatchComplianceLevel): Self = StObject.set(x, "ComplianceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceLevelUndefined: Self = StObject.set(x, "ComplianceLevel", js.undefined)
    
    @scala.inline
    def setEnableNonSecurity(value: Boolean): Self = StObject.set(x, "EnableNonSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNonSecurityUndefined: Self = StObject.set(x, "EnableNonSecurity", js.undefined)
    
    @scala.inline
    def setPatchFilterGroup(value: PatchFilterGroup): Self = StObject.set(x, "PatchFilterGroup", value.asInstanceOf[js.Any])
  }
}
