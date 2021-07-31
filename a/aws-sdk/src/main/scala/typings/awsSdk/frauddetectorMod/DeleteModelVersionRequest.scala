package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelVersionRequest extends StObject {
  
  /**
    * The model ID of the model version to delete.
    */
  var modelId: modelIdentifier
  
  /**
    * The model type of the model version to delete.
    */
  var modelType: ModelTypeEnum
  
  /**
    * The model version number of the model version to delete.
    */
  var modelVersionNumber: floatVersionString
}
object DeleteModelVersionRequest {
  
  @scala.inline
  def apply(modelId: modelIdentifier, modelType: ModelTypeEnum, modelVersionNumber: floatVersionString): DeleteModelVersionRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteModelVersionRequestMutableBuilder[Self <: DeleteModelVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionNumber(value: floatVersionString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
  }
}
