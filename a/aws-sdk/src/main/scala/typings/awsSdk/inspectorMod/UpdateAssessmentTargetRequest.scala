package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAssessmentTargetRequest extends StObject {
  
  /**
    * The ARN of the assessment target that you want to update.
    */
  var assessmentTargetArn: Arn = js.native
  
  /**
    * The name of the assessment target that you want to update.
    */
  var assessmentTargetName: AssessmentTargetName = js.native
  
  /**
    * The ARN of the resource group that is used to specify the new resource group to associate with the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.native
}
object UpdateAssessmentTargetRequest {
  
  @scala.inline
  def apply(assessmentTargetArn: Arn, assessmentTargetName: AssessmentTargetName): UpdateAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any], assessmentTargetName = assessmentTargetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentTargetRequest]
  }
  
  @scala.inline
  implicit class UpdateAssessmentTargetRequestMutableBuilder[Self <: UpdateAssessmentTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTargetArn(value: Arn): Self = StObject.set(x, "assessmentTargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssessmentTargetName(value: AssessmentTargetName): Self = StObject.set(x, "assessmentTargetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupArn(value: Arn): Self = StObject.set(x, "resourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupArnUndefined: Self = StObject.set(x, "resourceGroupArn", js.undefined)
  }
}
