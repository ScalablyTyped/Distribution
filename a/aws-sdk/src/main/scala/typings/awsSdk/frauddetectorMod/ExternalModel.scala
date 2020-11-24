package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalModel extends js.Object {
  
  /**
    * The model ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  
  /**
    * Timestamp of when the model was last created.
    */
  var createdTime: js.UndefOr[time] = js.native
  
  /**
    * The input configuration.
    */
  var inputConfiguration: js.UndefOr[ModelInputConfiguration] = js.native
  
  /**
    * The role used to invoke the model. 
    */
  var invokeModelEndpointRoleArn: js.UndefOr[String] = js.native
  
  /**
    * Timestamp of when the model was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  
  /**
    * The Amazon SageMaker model endpoints.
    */
  var modelEndpoint: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Fraud Detector status for the external model endpoint
    */
  var modelEndpointStatus: js.UndefOr[ModelEndpointStatus] = js.native
  
  /**
    * The source of the model.
    */
  var modelSource: js.UndefOr[ModelSource] = js.native
  
  /**
    * The output configuration.
    */
  var outputConfiguration: js.UndefOr[ModelOutputConfiguration] = js.native
}
object ExternalModel {
  
  @scala.inline
  def apply(): ExternalModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalModel]
  }
  
  @scala.inline
  implicit class ExternalModelOps[Self <: ExternalModel] (val x: Self) extends AnyVal {
    
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
    def setArn(value: fraudDetectorArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: time): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    
    @scala.inline
    def setInputConfiguration(value: ModelInputConfiguration): Self = this.set("inputConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfiguration: Self = this.set("inputConfiguration", js.undefined)
    
    @scala.inline
    def setInvokeModelEndpointRoleArn(value: String): Self = this.set("invokeModelEndpointRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvokeModelEndpointRoleArn: Self = this.set("invokeModelEndpointRoleArn", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: time): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setModelEndpoint(value: String): Self = this.set("modelEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelEndpoint: Self = this.set("modelEndpoint", js.undefined)
    
    @scala.inline
    def setModelEndpointStatus(value: ModelEndpointStatus): Self = this.set("modelEndpointStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelEndpointStatus: Self = this.set("modelEndpointStatus", js.undefined)
    
    @scala.inline
    def setModelSource(value: ModelSource): Self = this.set("modelSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelSource: Self = this.set("modelSource", js.undefined)
    
    @scala.inline
    def setOutputConfiguration(value: ModelOutputConfiguration): Self = this.set("outputConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfiguration: Self = this.set("outputConfiguration", js.undefined)
  }
}
