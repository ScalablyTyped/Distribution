package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppAssessmentResponse extends StObject {
  
  /**
    * The assessment for an AWS Resilience Hub application, returned as an object. This object includes Amazon Resource Names (ARNs), compliance information, compliance status, cost, messages, resiliency scores, and more.
    */
  var assessment: AppAssessment
}
object DescribeAppAssessmentResponse {
  
  inline def apply(assessment: AppAssessment): DescribeAppAssessmentResponse = {
    val __obj = js.Dynamic.literal(assessment = assessment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppAssessmentResponse]
  }
  
  extension [Self <: DescribeAppAssessmentResponse](x: Self) {
    
    inline def setAssessment(value: AppAssessment): Self = StObject.set(x, "assessment", value.asInstanceOf[js.Any])
  }
}
