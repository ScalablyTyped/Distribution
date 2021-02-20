package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAnalysisRequest extends StObject {
  
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
  implicit class DeleteAnalysisRequestMutableBuilder[Self <: DeleteAnalysisRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteWithoutRecovery(value: scala.Boolean): Self = StObject.set(x, "ForceDeleteWithoutRecovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteWithoutRecoveryUndefined: Self = StObject.set(x, "ForceDeleteWithoutRecovery", js.undefined)
    
    @scala.inline
    def setRecoveryWindowInDays(value: RecoveryWindowInDays): Self = StObject.set(x, "RecoveryWindowInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryWindowInDaysUndefined: Self = StObject.set(x, "RecoveryWindowInDays", js.undefined)
  }
}
