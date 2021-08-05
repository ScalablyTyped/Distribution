package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAssessmentTemplatesRequest extends StObject {
  
  var assessmentTemplateArns: BatchDescribeArnList
}
object DescribeAssessmentTemplatesRequest {
  
  inline def apply(assessmentTemplateArns: BatchDescribeArnList): DescribeAssessmentTemplatesRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArns = assessmentTemplateArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentTemplatesRequest]
  }
  
  extension [Self <: DescribeAssessmentTemplatesRequest](x: Self) {
    
    inline def setAssessmentTemplateArns(value: BatchDescribeArnList): Self = StObject.set(x, "assessmentTemplateArns", value.asInstanceOf[js.Any])
    
    inline def setAssessmentTemplateArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentTemplateArns", js.Array(value :_*))
  }
}
