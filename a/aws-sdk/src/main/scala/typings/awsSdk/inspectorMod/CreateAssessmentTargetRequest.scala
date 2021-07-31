package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentTargetRequest extends StObject {
  
  /**
    * The user-defined name that identifies the assessment target that you want to create. The name must be unique within the AWS account.
    */
  var assessmentTargetName: AssessmentTargetName
  
  /**
    * The ARN that specifies the resource group that is used to create the assessment target. If resourceGroupArn is not specified, all EC2 instances in the current AWS account and region are included in the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.undefined
}
object CreateAssessmentTargetRequest {
  
  @scala.inline
  def apply(assessmentTargetName: AssessmentTargetName): CreateAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetName = assessmentTargetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentTargetRequest]
  }
  
  @scala.inline
  implicit class CreateAssessmentTargetRequestMutableBuilder[Self <: CreateAssessmentTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssessmentTargetName(value: AssessmentTargetName): Self = StObject.set(x, "assessmentTargetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupArn(value: Arn): Self = StObject.set(x, "resourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupArnUndefined: Self = StObject.set(x, "resourceGroupArn", js.undefined)
  }
}
