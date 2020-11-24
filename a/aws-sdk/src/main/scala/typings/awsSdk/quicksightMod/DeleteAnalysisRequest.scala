package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAnalysisRequest extends js.Object {
  
  /**
    * The ID of the analysis that you're deleting.
    */
  var AnalysisId: RestrictiveResourceId = js.native
  
  /**
    * The ID of the AWS account where you want to delete an analysis.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * This option defaults to the value NoForceDeleteWithoutRecovery. To immediately delete the analysis, add the ForceDeleteWithoutRecovery option. You can't restore an analysis after it's deleted. 
    */
  var ForceDeleteWithoutRecovery: js.UndefOr[scala.Boolean] = js.native
  
  /**
    * A value that specifies the number of days that QuickSight waits before it deletes the analysis. You can't use this parameter with the ForceDeleteWithoutRecovery option in the same API call. The default value is 30.
    */
  var RecoveryWindowInDays: js.UndefOr[typings.awsSdk.quicksightMod.RecoveryWindowInDays] = js.native
}
object DeleteAnalysisRequest {
  
  @scala.inline
  def apply(AnalysisId: RestrictiveResourceId, AwsAccountId: AwsAccountId): DeleteAnalysisRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalysisRequest]
  }
  
  @scala.inline
  implicit class DeleteAnalysisRequestOps[Self <: DeleteAnalysisRequest] (val x: Self) extends AnyVal {
    
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
    def setAnalysisId(value: RestrictiveResourceId): Self = this.set("AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteWithoutRecovery(value: scala.Boolean): Self = this.set("ForceDeleteWithoutRecovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDeleteWithoutRecovery: Self = this.set("ForceDeleteWithoutRecovery", js.undefined)
    
    @scala.inline
    def setRecoveryWindowInDays(value: RecoveryWindowInDays): Self = this.set("RecoveryWindowInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecoveryWindowInDays: Self = this.set("RecoveryWindowInDays", js.undefined)
  }
}
