package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAnalysisPermissionsRequest extends StObject {
  
  /**
    * The ID of the analysis whose permissions you're describing. The ID is part of the analysis URL.
    */
  var AnalysisId: RestrictiveResourceId = js.native
  
  /**
    * The ID of the AWS account that contains the analysis whose permissions you're describing. You must be using the AWS account that the analysis is in.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
}
object DescribeAnalysisPermissionsRequest {
  
  @scala.inline
  def apply(AnalysisId: RestrictiveResourceId, AwsAccountId: AwsAccountId): DescribeAnalysisPermissionsRequest = {
    val __obj = js.Dynamic.literal(AnalysisId = AnalysisId.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnalysisPermissionsRequest]
  }
  
  @scala.inline
  implicit class DescribeAnalysisPermissionsRequestMutableBuilder[Self <: DescribeAnalysisPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisId(value: RestrictiveResourceId): Self = StObject.set(x, "AnalysisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
