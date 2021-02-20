package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreAnalysisRequest extends StObject {
  
  /**
    * The ID of the analysis that you're restoring.
    */
  var AnalysisId: RestrictiveResourceId = js.native
  
  /**
    * The ID of the AWS account that contains the analysis.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
}
object RestoreAnalysisRequest {
  
  @scala.inline
  def apply(AnalysisId: RestrictiveResourceId, AwsAccountId: AwsAccountId): RestoreAnalysisRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreAnalysisRequest]
  }
  
  @scala.inline
  implicit class RestoreAnalysisRequestMutableBuilder[Self <: RestoreAnalysisRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
