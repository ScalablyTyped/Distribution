package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  /**
    * The ARN of the model.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * Timestamp of when the model was created.
    */
  var createdTime: js.UndefOr[time] = js.undefined
  
  /**
    * The model description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.undefined
  
  /**
    * The name of the event type.
    */
  var eventTypeName: js.UndefOr[String] = js.undefined
  
  /**
    * Timestamp of last time the model was updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.undefined
  
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[modelIdentifier] = js.undefined
  
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.undefined
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEventTypeName(value: String): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
  }
}
