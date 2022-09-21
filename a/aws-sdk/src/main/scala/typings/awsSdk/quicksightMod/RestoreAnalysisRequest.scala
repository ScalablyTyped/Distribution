package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreAnalysisRequest extends StObject {
  
  /**
    * The ID of the analysis that you're restoring.
    */
  var AnalysisId: RestrictiveResourceId
  
  /**
    * The ID of the Amazon Web Services account that contains the analysis.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
}
object RestoreAnalysisRequest {
  
  inline def apply(AnalysisId: RestrictiveResourceId, AwsAccountId: AwsAccountId): RestoreAnalysisRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreAnalysisRequest]
  }
  
  extension [Self <: RestoreAnalysisRequest](x: Self) {
    
    inline def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
