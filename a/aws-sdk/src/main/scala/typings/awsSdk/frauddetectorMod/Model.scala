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
  
  inline def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventTypeName(value: String): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    inline def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    inline def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
  }
}
