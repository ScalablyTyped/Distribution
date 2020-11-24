package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateModelVersionStatusRequest extends js.Object {
  
  /**
    * The model ID of the model version to update.
    */
  var modelId: modelIdentifier = js.native
  
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum = js.native
  
  /**
    * The model version number.
    */
  var modelVersionNumber: floatVersionString = js.native
  
  /**
    * The model version status.
    */
  var status: ModelVersionStatus = js.native
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
  implicit class UpdateModelVersionStatusRequestOps[Self <: UpdateModelVersionStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModelId(value: modelIdentifier): Self = this.set("modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = this.set("modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionNumber(value: floatVersionString): Self = this.set("modelVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ModelVersionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
