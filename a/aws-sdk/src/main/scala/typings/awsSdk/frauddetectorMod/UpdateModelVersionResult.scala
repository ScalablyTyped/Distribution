package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateModelVersionResult extends StObject {
  
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[modelIdentifier] = js.native
  
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.native
  
  /**
    * The model version number of the model version updated.
    */
  var modelVersionNumber: js.UndefOr[floatVersionString] = js.native
  
  /**
    * The status of the updated model version.
    */
  var status: js.UndefOr[String] = js.native
}
object UpdateModelVersionResult {
  
  @scala.inline
  def apply(): UpdateModelVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModelVersionResult]
  }
  
  @scala.inline
  implicit class UpdateModelVersionResultMutableBuilder[Self <: UpdateModelVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
    
    @scala.inline
    def setModelVersionNumber(value: floatVersionString): Self = StObject.set(x, "modelVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionNumberUndefined: Self = StObject.set(x, "modelVersionNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
