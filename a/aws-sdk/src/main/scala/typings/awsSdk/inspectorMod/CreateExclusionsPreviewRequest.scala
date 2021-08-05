package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExclusionsPreviewRequest extends StObject {
  
  /**
    * The ARN that specifies the assessment template for which you want to create an exclusions preview.
    */
  var assessmentTemplateArn: Arn
}
object CreateExclusionsPreviewRequest {
  
  inline def apply(assessmentTemplateArn: Arn): CreateExclusionsPreviewRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExclusionsPreviewRequest]
  }
  
  extension [Self <: CreateExclusionsPreviewRequest](x: Self) {
    
    inline def setAssessmentTemplateArn(value: Arn): Self = StObject.set(x, "assessmentTemplateArn", value.asInstanceOf[js.Any])
  }
}
