package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordHandlerProgressInput extends js.Object {
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var BearerToken: ClientToken = js.native
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.cloudformationMod.ClientRequestToken] = js.native
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var CurrentOperationStatus: js.UndefOr[OperationStatus] = js.native
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ErrorCode: js.UndefOr[HandlerErrorCode] = js.native
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var OperationStatus: typings.awsSdk.cloudformationMod.OperationStatus = js.native
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var ResourceModel: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceModel] = js.native
  
  /**
    * Reserved for use by the CloudFormation CLI.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.cloudformationMod.StatusMessage] = js.native
}
object RecordHandlerProgressInput {
  
  @scala.inline
  def apply(BearerToken: ClientToken, OperationStatus: OperationStatus): RecordHandlerProgressInput = {
    val __obj = js.Dynamic.literal(BearerToken = BearerToken.asInstanceOf[js.Any], OperationStatus = OperationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordHandlerProgressInput]
  }
  
  @scala.inline
  implicit class RecordHandlerProgressInputOps[Self <: RecordHandlerProgressInput] (val x: Self) extends AnyVal {
    
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
    def setBearerToken(value: ClientToken): Self = this.set("BearerToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStatus(value: OperationStatus): Self = this.set("OperationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    
    @scala.inline
    def setCurrentOperationStatus(value: OperationStatus): Self = this.set("CurrentOperationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentOperationStatus: Self = this.set("CurrentOperationStatus", js.undefined)
    
    @scala.inline
    def setErrorCode(value: HandlerErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setResourceModel(value: ResourceModel): Self = this.set("ResourceModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceModel: Self = this.set("ResourceModel", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
  }
}
