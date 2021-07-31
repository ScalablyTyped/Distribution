package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDetectorRequest extends StObject {
  
  /**
    * The name of the detector model that created the detectors (instances).
    */
  var detectorModelName: DetectorModelName
  
  /**
    * The value of the input key attribute (identifying the device or system) that caused the creation of this detector (instance).
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
  
  /**
    * The ID to assign to the detector update "message". Each "messageId" must be unique within each batch sent.
    */
  var messageId: MessageId
  
  /**
    * The new state, variable values, and timer settings of the detector (instance).
    */
  var state: DetectorStateDefinition
}
object UpdateDetectorRequest {
  
  @scala.inline
  def apply(detectorModelName: DetectorModelName, messageId: MessageId, state: DetectorStateDefinition): UpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorRequest]
  }
  
  @scala.inline
  implicit class UpdateDetectorRequestMutableBuilder[Self <: UpdateDetectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: DetectorStateDefinition): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
