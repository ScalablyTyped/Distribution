package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelVersionResult extends StObject {
  
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[modelIdentifier] = js.undefined
  
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.undefined
  
  /**
    * The model version number of the model version created.
    */
  var modelVersionNumber: js.UndefOr[nonEmptyString] = js.undefined
  
  /**
    * The model version status. 
    */
  var status: js.UndefOr[String] = js.undefined
}
object CreateModelVersionResult {
  
  @scala.inline
  def apply(): CreateModelVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateModelVersionResult]
  }
  
  @scala.inline
  implicit class CreateModelVersionResultMutableBuilder[Self <: CreateModelVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
    
    @scala.inline
    def setModelVersionNumber(value: nonEmptyString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionNumberUndefined: Self = StObject.set(x, "modelVersionNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
