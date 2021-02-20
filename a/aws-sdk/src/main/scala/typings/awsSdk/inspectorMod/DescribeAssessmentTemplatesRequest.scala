package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAssessmentTemplatesRequest extends StObject {
  
  var assessmentTemplateArns: BatchDescribeArnList = js.native
}
object DescribeAssessmentTemplatesRequest {
  
  @scala.inline
  def apply(assessmentTemplateArns: BatchDescribeArnList): DescribeAssessmentTemplatesRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArns = assessmentTemplateArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentTemplatesRequest]
  }
  
  @scala.inline
  implicit class DescribeAssessmentTemplatesRequestMutableBuilder[Self <: DescribeAssessmentTemplatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTemplateArns(value: BatchDescribeArnList): Self = StObject.set(x, "assessmentTemplateArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentTemplateArnsVarargs(value: Arn*): Self = StObject.set(x, "assessmentTemplateArns", js.Array(value :_*))
  }
}
