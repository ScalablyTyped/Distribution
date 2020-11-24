package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateModelVersionResult extends js.Object {
  
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
  implicit class UpdateModelVersionResultOps[Self <: UpdateModelVersionResult] (val x: Self) extends AnyVal {
    
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
    def deleteModelId: Self = this.set("modelId", js.undefined)
    
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = this.set("modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelType: Self = this.set("modelType", js.undefined)
    
    @scala.inline
    def setModelVersionNumber(value: floatVersionString): Self = this.set("modelVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelVersionNumber: Self = this.set("modelVersionNumber", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
