package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelVersionStatusRequest extends StObject {
  
  /**
    * The model ID of the model version to update.
    */
  var modelId: modelIdentifier
  
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum
  
  /**
    * The model version number.
    */
  var modelVersionNumber: floatVersionString
  
  /**
    * The model version status.
    */
  var status: ModelVersionStatus
}
object UpdateModelVersionStatusRequest {
  
  @scala.inline
  def apply(
    modelId: modelIdentifier,
    modelType: ModelTypeEnum,
    modelVersionNumber: floatVersionString,
    status: ModelVersionStatus
  ): UpdateModelVersionStatusRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelVersionStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateModelVersionStatusRequestMutableBuilder[Self <: UpdateModelVersionStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionNumber(value: floatVersionString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ModelVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
