package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorModelConfiguration extends StObject {
  
  /**
    * The time the detector model was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of the detector model.
    */
  var detectorModelArn: js.UndefOr[DetectorModelArn] = js.native
  
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.native
  
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.native
  
  /**
    * The version of the detector model.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.native
  
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  
  /**
    * The value used to identify a detector instance. When a device or system sends input, a new detector instance with a unique key value is created. AWS IoT Events can continue to route input to its corresponding detector instance based on this identifying information.  This parameter uses a JSON-path expression to select the attribute-value pair in the message payload that is used for identification. To route the message to the correct detector instance, the device must send a message payload that contains the same attribute-value.
    */
  var key: js.UndefOr[AttributeJsonPath] = js.native
  
  /**
    * The time the detector model was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The status of the detector model.
    */
  var status: js.UndefOr[DetectorModelVersionStatus] = js.native
}
object DetectorModelConfiguration {
  
  @scala.inline
  def apply(): DetectorModelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorModelConfiguration]
  }
  
  @scala.inline
  implicit class DetectorModelConfigurationMutableBuilder[Self <: DetectorModelConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDetectorModelArn(value: DetectorModelArn): Self = StObject.set(x, "detectorModelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelArnUndefined: Self = StObject.set(x, "detectorModelArn", js.undefined)
    
    @scala.inline
    def setDetectorModelDescription(value: DetectorModelDescription): Self = StObject.set(x, "detectorModelDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelDescriptionUndefined: Self = StObject.set(x, "detectorModelDescription", js.undefined)
    
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
    def setKey(value: AttributeJsonPath): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
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
