package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelVersionRequest extends StObject {
  
  /**
    * The model ID.
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
}
object GetModelVersionRequest {
  
  @scala.inline
  def apply(modelId: modelIdentifier, modelType: ModelTypeEnum, modelVersionNumber: floatVersionString): GetModelVersionRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any], modelVersionNumber = modelVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelVersionRequest]
  }
  
  @scala.inline
  implicit class GetModelVersionRequestMutableBuilder[Self <: GetModelVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionNumber(value: floatVersionString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
  }
}
