package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateModelRequest extends StObject {
  
  /**
    * The new model description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The model ID.
    */
  var modelId: modelIdentifier = js.native
  
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum = js.native
}
object UpdateModelRequest {
  
  @scala.inline
  def apply(modelId: modelIdentifier, modelType: ModelTypeEnum): UpdateModelRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelRequest]
  }
  
  @scala.inline
  implicit class UpdateModelRequestMutableBuilder[Self <: UpdateModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
  }
}
