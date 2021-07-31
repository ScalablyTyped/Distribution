package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnalysisRequest extends StObject {
  
  /**
    * The ID of the analysis that you're describing. The ID is part of the URL of the analysis.
    */
  var AnalysisId: RestrictiveResourceId
  
  /**
    * The ID of the AWS account that contains the analysis. You must be using the AWS account that the analysis is in.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
}
object DescribeAnalysisRequest {
  
  @scala.inline
  def apply(AnalysisId: RestrictiveResourceId, AwsAccountId: AwsAccountId): DescribeAnalysisRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnalysisRequest]
  }
  
  @scala.inline
  implicit class DescribeAnalysisRequestMutableBuilder[Self <: DescribeAnalysisRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
