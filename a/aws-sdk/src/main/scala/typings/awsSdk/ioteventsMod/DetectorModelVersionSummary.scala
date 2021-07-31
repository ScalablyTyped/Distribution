package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorModelVersionSummary extends StObject {
  
  /**
    * The time the detector model version was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ARN of the detector model version.
    */
  var detectorModelArn: js.UndefOr[DetectorModelArn] = js.undefined
  
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.undefined
  
  /**
    * The ID of the detector model version.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined
  
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.undefined
  
  /**
    * The last time the detector model version was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ARN of the role that grants the detector model permission to perform its tasks.
    */
  var roleArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The status of the detector model version.
    */
  var status: js.UndefOr[DetectorModelVersionStatus] = js.undefined
}
object DetectorModelVersionSummary {
  
  @scala.inline
  def apply(): DetectorModelVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorModelVersionSummary]
  }
  
  @scala.inline
  implicit class DetectorModelVersionSummaryMutableBuilder[Self <: DetectorModelVersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDetectorModelArn(value: DetectorModelArn): Self = StObject.set(x, "detectorModelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelArnUndefined: Self = StObject.set(x, "detectorModelArn", js.undefined)
    
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelNameUndefined: Self = StObject.set(x, "detectorModelName", js.undefined)
    
    @scala.inline
    def setDetectorModelVersion(value: DetectorModelVersion): Self = StObject.set(x, "detectorModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelVersionUndefined: Self = StObject.set(x, "detectorModelVersion", js.undefined)
    
    @scala.inline
    def setEvaluationMethod(value: EvaluationMethod): Self = StObject.set(x, "evaluationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMethodUndefined: Self = StObject.set(x, "evaluationMethod", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: DetectorModelVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
