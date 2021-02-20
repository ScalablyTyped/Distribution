package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDetectorModelRequest extends StObject {
  
  /**
    * Information that defines how a detector operates.
    */
  var detectorModelDefinition: DetectorModelDefinition = js.native
  
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.native
  
  /**
    * The name of the detector model that is updated.
    */
  var detectorModelName: DetectorModelName = js.native
  
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: AmazonResourceName = js.native
}
object UpdateDetectorModelRequest {
  
  @scala.inline
  def apply(
    detectorModelDefinition: DetectorModelDefinition,
    detectorModelName: DetectorModelName,
    roleArn: AmazonResourceName
  ): UpdateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition.asInstanceOf[js.Any], detectorModelName = detectorModelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorModelRequest]
  }
  
  @scala.inline
  implicit class UpdateDetectorModelRequestMutableBuilder[Self <: UpdateDetectorModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorModelDefinition(value: DetectorModelDefinition): Self = StObject.set(x, "detectorModelDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelDescription(value: DetectorModelDescription): Self = StObject.set(x, "detectorModelDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelDescriptionUndefined: Self = StObject.set(x, "detectorModelDescription", js.undefined)
    
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMethod(value: EvaluationMethod): Self = StObject.set(x, "evaluationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMethodUndefined: Self = StObject.set(x, "evaluationMethod", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
